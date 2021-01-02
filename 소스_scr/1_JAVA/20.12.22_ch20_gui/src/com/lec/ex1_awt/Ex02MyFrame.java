package com.lec.ex1_awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//이벤트
//1.implements ActionListener 받는다
public class Ex02MyFrame extends Frame implements ActionListener {
	private Label lbl1; // 추구할 컴포넌트 변수들 선언
	private Button btnExit;

	public Ex02MyFrame() {
		// 프레임에 라벨과 버튼 추가후 setVislble과 setSize;
		// 프레임의 layout 스타일을 flowLayout()으로 - add순서대로 차곡차곡
		setLayout(new FlowLayout());
		// setLayour(new BorderLayout()); --기본
		// setLayout(new GridLayout(2,2));//--2행 2열 짜리 격차 1ayout
		lbl1 = new Label("즐거운 월요일");
		lbl1.setPreferredSize(new Dimension(150, 200));// 컴포넌트 사이즈
		btnExit = new Button("종료");
		btnExit.setPreferredSize(new Dimension(200, 200));
		add(lbl1);
		add(btnExit);
		setVisible(true);
		setSize(new Dimension(500, 300));
		setLocation(100, 100);
		addWindowFocusListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		
		// btnExit 클릭이벤트 발생되면 this.actionPerformed(btnExit)호출 종료버튼
		btnExit.addActionListener(this);

		// 창닫기소스
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});

	}

	public Ex02MyFrame(String title) {
		this();
		setTitle(title);
	}

	@Override
	public void actionPerformed(ActionEvent e) {// 이벤트 처리 메소드
		// btnExit 클릭이벤트 발생되면 this.actionPerformed(btnExit)호출
		/* if(e.equals(btnExit)) 같은 뜻 종료버튼누르고 종료! */
		if (e.getSource() == btnExit) {
			setVisible(false);
			dispose();
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new Ex02MyFrame("두번쨰 GUI 예제");
	}

}
