package com.lec.ex4_homework;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.swing.*;

import com.lec.ex4_homework.Customer;

public class Homework extends JFrame implements ActionListener {
	private Container container;
	private JPanel jpup;
	private JPanel jpcenter;
	private JTextField jtxtTel, jtxtName, jtxtPoint;
	private JButton btnExit;
	private JButton btnOut;
	private JButton btnJoin;
	private JButton btnCheck;
	private JTextArea jta;
	private JScrollPane sbar;
	private ArrayList<Customer> customers;

	public Homework(String title) {
		super(title);
		customers = new ArrayList<Customer>();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		container = getContentPane();
		container.setLayout(new FlowLayout());
		jpup = new JPanel(new GridLayout(3, 2));
		jpcenter = new JPanel(new GridLayout(1, 4));
		jtxtTel = new JTextField(15);
		jtxtName = new JTextField(15);
		jtxtPoint = new JTextField("1000",15);
		jta = new JTextArea(15, 30);
		sbar = new JScrollPane(jta);

		btnJoin = new JButton("가입");
		btnCheck = new JButton("폰조회");
		btnOut = new JButton("출력");
		btnExit = new JButton("종료");

		jpup.add(new JLabel("핸드폰 번호", (int) CENTER_ALIGNMENT));
		jpup.add(jtxtTel);
		jpup.add(new JLabel("이름", (int) CENTER_ALIGNMENT));
		jpup.add(jtxtName);
		jpup.add(new JLabel("포인트", (int) CENTER_ALIGNMENT));// (int)CENTER_ALIGNMENT)의미를 알자
		jpup.add(jtxtPoint);

		jpcenter.add(btnJoin);
		jpcenter.add(btnCheck);
		jpcenter.add(btnOut);
		jpcenter.add(btnExit);

		container.add(jpup);
		container.add(jpcenter);
		container.add(sbar);

		setVisible(true);
		setResizable(false);
		setSize(new Dimension(400, 450));
		setLocation(300, 300);

		btnJoin.addActionListener(this);
		btnCheck.addActionListener(this);
		btnOut.addActionListener(this);
		btnExit.addActionListener(this);
	}
	//전화번호를 뒷자리만 입력! 
	//전화번호를 뒷자리를 비교해서 앞뒤 조절한다! 
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnJoin) {
			int point=1000;
			String tel = jtxtTel.getText().trim();
			String name = jtxtName.getText().trim();
			try {
				point = Integer.parseInt(jtxtPoint.getText().trim());
			} catch (Exception ex) {}
			int preIdx = tel.indexOf("-");
			int postIdx= tel.lastIndexOf("-");
			if(!tel.trim().equals("") && !name.trim().equals("") &&
					preIdx<postIdx) {
				//가입시작
				Customer customer= new Customer(tel,name,point);
				customers.add(customer);
				System.out.println(customer+"가입성공");
			
				//jta.append(customer.toString()+"\r\n");
				jta.setText(jta.getText()+customer.toString()+"\r\n"); 
				jtxtTel.setText("");
				jtxtName.setText("");
				jtxtPoint.setText("1000");
				
			}

			
		} else if (e.getSource() == btnCheck) {
			String tel = jtxtTel.getText().trim();
			//9999
			int i=0;
			for( i=0; i<customers.size();i++) {
				String temp =customers.get(i).getTel();//arrayList이렇게 가지고와야함! 
				String post =temp.substring(temp.lastIndexOf("-")+1);//어래리스트에서 가지고 온 핸드폰 뒷자리번호 
				if(post.equals(tel)) {
					jtxtTel.setText(customers.get(i).getTel());
					jtxtName.setText(customers.get(i).getName());
					jtxtPoint.setText(String.valueOf(customers.get(i).getTel()));//이거 기억하기!
					break;
				}
				
			}
			if(i == customers.size()) {
				jtxtTel.setText("없는 회원님");
				jtxtName.setText("");
				jtxtPoint.setText("1000");
				
			}
			
			
			

		} else if (e.getSource() == btnOut) {
			OutputStream os = null;
			try {
				os = new FileOutputStream("icon/customer.txt", true);
				for (Customer customer : customers) {
					os.write((customer.toString() + "\r\n").getBytes());
					System.out.println(customer);
				}
			} catch (FileNotFoundException e1) {
				System.out.println(e1.getMessage());
			} catch (IOException e2) {
				System.out.println(e2.getMessage());
			}

		} else if (e.getSource() == btnExit) {
			setVisible(false);
			dispose();
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new Homework("회원관리");
	}

}
