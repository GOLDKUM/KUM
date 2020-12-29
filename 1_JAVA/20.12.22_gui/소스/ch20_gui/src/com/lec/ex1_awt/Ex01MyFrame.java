package com.lec.ex1_awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex01MyFrame extends Frame {
	private Button btn, btn1;

	public Ex01MyFrame(String title) {
		//버튼 2개 추가된 프레임 생성
		super(title);
		btn = new Button("버튼");
		btn1= new Button("그냥 버튼");
		add(btn,BorderLayout.NORTH);
		add(btn1,BorderLayout.CENTER);
		setVisible(true);
		setSize(new Dimension(300,200));
		setLocation(200,100);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {//window close~!
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
	}
	public Ex01MyFrame() {
		this("");
	}
	public static void main(String[] args) {
		new Ex01MyFrame("첫 GUI 예제");
	}

	// main함수에서 new Ex01MyFrame("title")

//	public Ex01MyFrame(String title) {
//		super(title);
//		
//		
//	}
//	public static void main(String[] args) {
//		new Ex01MyFrame(title);
//		
//	}

}
