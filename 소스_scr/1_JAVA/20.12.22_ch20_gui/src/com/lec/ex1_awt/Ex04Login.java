package com.lec.ex1_awt;

import java.awt.*;
//�гξȿ� txtfield label ���� ������ ��ķ� ����
//������ �Ʒ��� ����� �ϴ� ��! 
public class Ex04Login extends Frame{
	private Panel panel;
	private TextField txtId,txtPw;
	private Button btnLogin;
	public Ex04Login(String title) {
		super(title);
//		setLayout(new BorderLayout());���������� �̷��� �⺻������ ������ 
		panel=new Panel(new GridLayout(2, 2));//
//		panel.setLayout(new GridLayout(2, 2));
		txtId = new TextField("ID",20);
		txtPw = new TextField(20);
		txtPw.setEchoChar('*');
		btnLogin = new Button("�α���");
		
		//���� gridLayout�� ������� 
		panel.add(new Label("�� �� ��"));
		panel.add(txtId);
		panel.add(new Label("��й�ȣ"/*(int)CENTER_ALIGNMENT*/));
		panel.add(txtPw);
		
		//�ϼ��� �г��� ������ ���� �÷����� 
		add(panel,BorderLayout.NORTH);
		add(btnLogin,BorderLayout.SOUTH);
		
		
		//���� ���̰� �ð�ȭ����
		setSize(new Dimension(400,200));
		setLocation(100, 100);//������ �ϴ���ġ
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex04Login("�α��� ����");
	}

}
