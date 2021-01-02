package com.lec.ex1_awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex06Practice extends Frame implements ActionListener {
	private Panel panel;
	private Button btnPaper;// ����
	private Button btnRock;// ����
	private Button btnScissors;// ��
	private Button btnExit;
	private List list;

	public Ex06Practice(String title) {
		super(title);

		panel = new Panel();
		btnPaper = new Button("����");
		btnRock = new Button("����");
		btnScissors = new Button("��");
		btnExit = new Button("����");
		// btnExit.setPreferredSize(new Dimension(100,100));//������ ������ �޼ҵ�!
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
		new Ex06Practice("ù...");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int computer = (int) (Math.random() * 3);
		if (e.getSource() == btnPaper) {
			switch (computer) {
			case 0:
				list.add("���. �츮 �� ����");
			case 1:
				list.add("��ǻ�Ͱ� �̱�. ����� ����, ��ǻ�ʹ� ����");
				break;
			case 2:
				list.add("����� �̱�. ����� ����, ��ǻ�ʹ� ��");
				break;
			}

		} else if (e.getSource() == btnRock) {
			switch (computer) {
			case 0:
				list.add("����� �̱�. ����� ����, ��ǻ�ʹ� ����");
				break;
			case 1:
				list.add("���. ��Ű� ��ǻ�� ��� ����");
				break;
			case 2:
				list.add("��ǻ�Ͱ� �̱�. ����� ����, ��ǻ�ʹ� ��");
				break;
			}

		} else if (e.getSource() == btnScissors) {
			switch (computer) {
			case 0:
				list.add("��ǻ�Ͱ� �̱�. ����� ��, ��ǻ�ʹ� ����");
				break;
			case 1:
				list.add("����� �̱�. ��� ��, ��ǻ�ʹ� ����");
				break;
			case 2:
				list.add("���. ��Ű� ��ǻ�� ��� ��");
				break;
			}
		} else if (e.getSource() == btnExit) {
			setVisible(false);
			dispose();
			System.exit(0);
		}

	}

}
