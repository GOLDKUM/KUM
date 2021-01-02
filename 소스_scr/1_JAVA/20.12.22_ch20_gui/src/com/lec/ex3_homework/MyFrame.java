package com.lec.ex3_homework;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	private Container container;
	private JPanel jp;
	private JPanel jp2;
	private JTextField jtxtName, jtxtTel, jtxtAge;
	private ImageIcon icon;
	private JButton btnPut;
	private JButton btnOut;
	private ArrayList<Person> persons = new ArrayList<Person>();

	public MyFrame(String title) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		container = getContentPane();
		// container.setLayout(new BorderLayout());//기본값
		jp = new JPanel(new GridLayout(3, 2));
		jp2 = new JPanel(new GridLayout(1, 2));
		jtxtName = new JTextField();
		jtxtTel = new JTextField();
		jtxtAge = new JTextField();

		icon = new ImageIcon("icon/search.png");
		btnPut = new JButton("입력", icon);
		btnOut = new JButton("출력", icon);

		jp.add(new JLabel("이 름", (int) CENTER_ALIGNMENT));
		jp.add(jtxtName);
		jp.add(new JLabel("전 화", (int) CENTER_ALIGNMENT));
		jp.add(jtxtTel);
		jp.add(new JLabel("나 이", (int) CENTER_ALIGNMENT));
		jp.add(jtxtAge);

		jp2.add(btnPut);
		jp2.add(btnOut);

		container.add(jp, BorderLayout.CENTER);
		container.add(jp2, BorderLayout.SOUTH);

		setVisible(true);
		setSize(new Dimension(400, 300));
		setLocation(200, 200);

		btnPut.addActionListener(this);
		btnOut.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPut) {
			String name = jtxtName.getText().trim();
			String tel = jtxtTel.getText().trim();
			int age;
			try {
				age = Integer.parseInt(jtxtAge.getText().trim());
			} catch (Exception ex) {
				age = -1;
			}
			persons.add(new Person(name, tel, age));
			jtxtName.setText("");
			jtxtTel.setText("");
			jtxtAge.setText("");

		} else if (e.getSource() == btnOut) {

			OutputStream os = null;
			try {
				os = new FileOutputStream("icon/person.txt", true);
				for (Person person : persons) {
					os.write(person.toString().getBytes());// getBytes을 통해서 스트링을 한번에 보내는것!
					System.out.print(person);
				}

			} catch (FileNotFoundException e1) {
				System.out.println(e1.getMessage());
			} catch (IOException e1) {
				System.out.println(e1.getMessage());

			} finally {
				try {
					if (os != null)
						os.close();
				} catch (Exception e2) {
				}
			}

		}

	}

	public static void main(String[] args) {
		new MyFrame("금경용");

	}

}
