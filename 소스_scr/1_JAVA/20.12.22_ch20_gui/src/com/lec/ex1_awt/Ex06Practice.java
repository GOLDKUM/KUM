package com.lec.ex1_awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex06Practice extends Frame implements ActionListener {
	private Panel panel;
	private Button btnPaper;// 가위
	private Button btnRock;// 바위
	private Button btnScissors;// 보
	private Button btnExit;
	private List list;

	public Ex06Practice(String title) {
		super(title);

		panel = new Panel();
		btnPaper = new Button("가위");
		btnRock = new Button("바위");
		btnScissors = new Button("보");
		btnExit = new Button("종료");
		// btnExit.setPreferredSize(new Dimension(100,100));//사이즈 설정을 메소드!
		list = new List(5);
		panel.add(btnPaper);
		panel.add(btnRock);
		panel.add(btnScissors);
		add(panel, BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		add(btnExit, BorderLayout.SOUTH);
		setSize(new Dimension(300, 200));
		setResizable(false);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});

		btnPaper.addActionListener(this);
		btnRock.addActionListener(this);
		btnScissors.addActionListener(this);
		btnExit.addActionListener(this);

	}

	public static void main(String[] args) {
		new Ex06Practice("첫...");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int computer = (int) (Math.random() * 3);
		if (e.getSource() == btnPaper) {
			switch (computer) {
			case 0:
				list.add("비김. 우리 다 가위");
			case 1:
				list.add("컴퓨터가 이김. 당신은 가위, 컴퓨터는 바위");
				break;
			case 2:
				list.add("당신이 이김. 당신은 가위, 컴퓨터는 보");
				break;
			}

		} else if (e.getSource() == btnRock) {
			switch (computer) {
			case 0:
				list.add("당신이 이김. 당신이 바위, 컴퓨터는 가위");
				break;
			case 1:
				list.add("비김. 당신과 컴퓨터 모두 바위");
				break;
			case 2:
				list.add("컴퓨터가 이김. 당신은 바위, 컴퓨터는 보");
				break;
			}

		} else if (e.getSource() == btnScissors) {
			switch (computer) {
			case 0:
				list.add("컴퓨터가 이김. 당신이 보, 컴퓨터는 가위");
				break;
			case 1:
				list.add("당신이 이김. 당신 보, 컴퓨터는 바위");
				break;
			case 2:
				list.add("비김. 당신과 컴퓨터 모두 보");
				break;
			}
		} else if (e.getSource() == btnExit) {
			setVisible(false);
			dispose();
			System.exit(0);
		}

	}

}
