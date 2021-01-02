package com.lec.ex2_swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//swing은 처음에 무조건 패널로 감싸야한다
public class Ex01Frame extends JFrame implements ActionListener {
	private JPanel panel;
	private JLabel jlbl;
	private JButton btn;

	public Ex01Frame(String title) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// x버튼 누르면 종료
		panel = (JPanel) getContentPane(); // 컨테이너(=프레임)를 얻어옴//꼭필요 JPanel이거 꼭필요!
		panel.setLayout(new FlowLayout()); // 기본값은 borderlayout //기본적인세팅

		jlbl = new JLabel("즐거운 일요일", (int) CENTER_ALIGNMENT);// 가운데 정렬(int)CENTER_ALIGNMENT
		jlbl.setPreferredSize(new Dimension(150, 200));
		btn = new JButton("종료");
		btn.setPreferredSize(new Dimension(200, 200));
		panel.add(jlbl);
		panel.add(btn);
		setVisible(true);
//		pack();// 최소한의 사이즈 셋팅으로해줌
		setSize(new Dimension(500, 300));
		setVisible(true);

		// btn에 이벤트 리스너 추가!
		// 리스너 반드시 필요! 이벤트하려면
		btn.addActionListener(this);// this은 ActionListenner
	}

	public static void main(String[] args) {
		new Ex01Frame("첫 스윙예제");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			setVisible(false);
			dispose();
			System.exit(0);
		}

	}

}
