package com.lec.ex1_awt;

import java.awt.*;

public class Ex03Login extends Frame {
	private Label lbl1;
	private TextField txtId;
	private Label lbl2;
	private TextField txtPw;
	private Button btnLogin;
	public Ex03Login(String title) {
		super(title);//이게 왜super인지 보자!
		setLayout(new FlowLayout()); //프레임의 레이아웃 셋팅
		lbl1 = new Label("아이디");
		txtId= new TextField("ID",20);
		lbl2 = new Label("비밀번호");
		txtPw= new TextField(20); //20은 가로사이즈
		txtPw.setEchoChar('*');
		btnLogin = new Button("로그인");
		add(lbl1);
		add(txtId);
		add(lbl2);
		add(txtPw);
		add(btnLogin);
		setSize(new Dimension(300,150));//사이즈크기
		setResizable(false);//사용자가 frame 사이즈 조정불가 
		setLocation(100,100);//생겨나는 위치
		setVisible(true);//보이게 실행 
		
	}
	public static void main(String[] args) {
		new Ex03Login("로그인 화면");
	}

}
