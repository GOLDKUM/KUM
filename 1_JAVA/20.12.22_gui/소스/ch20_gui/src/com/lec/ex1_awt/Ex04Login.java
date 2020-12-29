package com.lec.ex1_awt;

import java.awt.*;
//패널안에 txtfield label 들어가서 무조건 행렬로 구상
//무조건 아래에 만들게 하는 법! 
public class Ex04Login extends Frame{
	private Panel panel;
	private TextField txtId,txtPw;
	private Button btnLogin;
	public Ex04Login(String title) {
		super(title);
//		setLayout(new BorderLayout());쓰지않으면 이렇게 기본값으로 세팅함 
		panel=new Panel(new GridLayout(2, 2));//
//		panel.setLayout(new GridLayout(2, 2));
		txtId = new TextField("ID",20);
		txtPw = new TextField(20);
		txtPw.setEchoChar('*');
		btnLogin = new Button("로그인");
		
		//이제 gridLayout에 집어넣자 
		panel.add(new Label("아 이 디"));
		panel.add(txtId);
		panel.add(new Label("비밀번호"/*(int)CENTER_ALIGNMENT*/));
		panel.add(txtPw);
		
		//완성된 패널을 프레임 위에 올려두자 
		add(panel,BorderLayout.NORTH);
		add(btnLogin,BorderLayout.SOUTH);
		
		
		//눈에 보이게 시각화하자
		setSize(new Dimension(400,200));
		setLocation(100, 100);//나오게 하는위치
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex04Login("로그인 예제");
	}

}
