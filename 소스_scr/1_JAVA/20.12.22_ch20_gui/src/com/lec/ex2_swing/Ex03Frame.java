package com.lec.ex2_swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//�г�
//��ư
//�׽�Ʈ~����! 

public class Ex03Frame extends JFrame implements ActionListener {
	private Container container; // ��ü �����̳ʸ� �޾ƿ� ����!
	private JPanel jp;
	private JTextField jtxtName, jtxtTel, jtxtAge;
	private ImageIcon icon; // ��ư�ȿ� �̹����� �ֱ� ������ �����Ѵ�~!
	private JButton btnOut;
	private JTextArea jta;
	private JScrollPane scrollbar;// �׽�Ʈ ������ ��ũ�� ��ü!

	// ������
	public Ex03Frame(String title) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// x��ư ������ ����
		container = getContentPane();// container�� ������Ծ��~!
		// container.setLayout(new BorderLayout());//�⺻��

		jp = new JPanel(new GridLayout(3, 2));// 3��2�� �г��� ������Ծ��
		jtxtName = new JTextField();// �׽�Ʈ�ʵ� ������� �̸� �����ʿ����°�
		jtxtTel = new JTextField();
		jtxtAge = new JTextField();
		///////////////////////// �̹���
		icon = new ImageIcon("icon/output.png");
		btnOut = new JButton("���", icon);
		jta = new JTextArea(5, 30);// 5��¥�� �׽�Ʈ����
		scrollbar = new JScrollPane(jta);
		jp.add(new JLabel("�� ��", (int) CENTER_ALIGNMENT));// 1��1�� �гο� ��
		jp.add(jtxtName); // 1��2���� �Է�
		jp.add(new JLabel("�� ȭ", (int) CENTER_ALIGNMENT));
		jp.add(jtxtTel);
		jp.add(new JLabel("�� ��", (int) CENTER_ALIGNMENT));
		jp.add(jtxtAge);// 3��2��
		container.add(jp, BorderLayout.NORTH);// ���κٿ���
		container.add(btnOut, BorderLayout.CENTER);// �߾ӿ�
		container.add(scrollbar, BorderLayout.SOUTH);// ������

		// �ð�ȭ
		setVisible(true);
		// setSize(new Dimension(400,300));
		// setLocation(100,100);
		setBounds(100, 100, 400, 300);// Location+Size ���� !

		////////// �������߰�
		btnOut.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOut) {
			String name = jtxtName.getText().trim();// Ʈ�� �յ� ������~
			String tel = jtxtTel.getText().trim();
//			String age  = jtxtAge.getText().trim();
			if (name.equals("") || tel.equals("")) {
				System.out.println("�̸��� ��ȭ��ȣ�� �ݵ�� �Է�");
				return;
			}
			int age;
			try {
				age = Integer.parseInt(jtxtAge.getText());
			} catch (Exception ex) {
				age = -1;
			}
			String result = "[�̸�]"+name+"\t[��ȭ]"+tel;//�ܼ�â�� �ߴ°�
			if(age>=0 && age<130) {
				result +="\t[����]"+age;
			}else {
				result +="\t[����]��ȿ���� �ʴ� ���̸� �Է�";
			}
			System.out.println(result);
			//jta.setText(result);//�̷��� �Է��ϸ� ������ ���� �������� �ѷ��� 
			jta.append(result+"\r\n");//��������� "\r\n"�����ٷ� ����� �� 
			jtxtName.setText("");//���� ���Ӱ� ������ 
			jtxtTel.setText("");
			jtxtAge.setText("");
			
			
//			if (!name.equals("") && !tel.equals("")) {
//				int age;
//				try {
//					age = Integer.parseInt(jtxtAge.getText());
//				} catch (Exception ex) {
//					age=0;
//					System.out.println(ex.getMessage());
//				}
//				
//			} else {
//				System.out.println("�̸��� ��ȭ��ȣ�� �ݵ�� �Է�");
//			}

		}

	}

	public static void main(String[] args) {
		new Ex03Frame("�ݰ��");
	}

}
