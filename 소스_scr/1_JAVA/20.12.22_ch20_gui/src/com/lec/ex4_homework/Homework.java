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

		btnJoin = new JButton("����");
		btnCheck = new JButton("����ȸ");
		btnOut = new JButton("���");
		btnExit = new JButton("����");

		jpup.add(new JLabel("�ڵ��� ��ȣ", (int) CENTER_ALIGNMENT));
		jpup.add(jtxtTel);
		jpup.add(new JLabel("�̸�", (int) CENTER_ALIGNMENT));
		jpup.add(jtxtName);
		jpup.add(new JLabel("����Ʈ", (int) CENTER_ALIGNMENT));// (int)CENTER_ALIGNMENT)�ǹ̸� ����
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
	//��ȭ��ȣ�� ���ڸ��� �Է�! 
	//��ȭ��ȣ�� ���ڸ��� ���ؼ� �յ� �����Ѵ�! 
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
				//���Խ���
				Customer customer= new Customer(tel,name,point);
				customers.add(customer);
				System.out.println(customer+"���Լ���");
			
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
				String temp =customers.get(i).getTel();//arrayList�̷��� ������;���! 
				String post =temp.substring(temp.lastIndexOf("-")+1);//�����Ʈ���� ������ �� �ڵ��� ���ڸ���ȣ 
				if(post.equals(tel)) {
					jtxtTel.setText(customers.get(i).getTel());
					jtxtName.setText(customers.get(i).getName());
					jtxtPoint.setText(String.valueOf(customers.get(i).getTel()));//�̰� ����ϱ�!
					break;
				}
				
			}
			if(i == customers.size()) {
				jtxtTel.setText("���� ȸ����");
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
		new Homework("ȸ������");
	}

}
