package com.lec.ex1_awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//followLayout
public class Ex05Frame extends Frame /* 이벤트를넣자 */ implements ActionListener{
	private Panel panel;
	private TextField txtField;
	private Button btnOk;
	private Button btnExit;
	private List list;

	public Ex05Frame(String title) {
		// layOut셋팅, 컴포넌트 생성후 add, setVisble,SetSize
		//	this();
		//	setTiltle(title);
			super(title);
		//	setLayout(new BorderLayout());//기본값이므로 생략가능 
		panel = new Panel();//panel은 FlowLayout이 기본값 
		txtField = new TextField(20);
		btnOk= new Button("OK");
		btnExit= new Button("Exit");
		list = new List();
		panel.add(new Label("write"));
		panel.add(txtField);
		panel.add(btnOk);
		panel.add(btnExit);//패널완성 
		add(panel,BorderLayout.NORTH);
		add(list,BorderLayout.CENTER);
		setVisible(true);
		setSize(new Dimension(400,200));
		
		//1. implement ActionListener 받는다
		//2.이벤트 리스너추가 (이벤트설정 추가합니다)
		//3.로직추가
		btnOk.addActionListener(this);//여기서 this은 actionPerformed //this.actionPerformed();
		btnExit.addActionListener(this);
		
		
		
	}

	public Ex05Frame() {
		this("");
	}
	public static void main(String[] args) {
		new Ex05Frame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnOk) {
			//txtField의 테스트를 List로 추가하고 txtField는 ""로
			list.add(txtField.getText());
			txtField.setText("");
			
		}else if(e.getSource()==btnExit) {
			//종료
			setVisible(false);
			dispose();
			System.exit(0);
		}

		
		
		
		
		
		
		
		
		
	}

}
//보드레이아웃 south  /플로우레이아웃  panel위에 가위바위보를 두면됨 !
