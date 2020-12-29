package com.lec.ex2_swing;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;

public class Ex02Frame extends JFrame implements ActionListener {
	// private JPanel jpanel;//컨테이너 얻어와서 받는 역할 저번에 이것으로 했음 이번에는 컨테이너로!
	private Container container;// 컨테이너 얻어와서 받는 역할

	private JLabel jl;// 왼쪽부터 라벨!
	private ImageIcon icon;
	private JButton jBtn;
	private JTextField jtxtField;
	private Vector<String> item;// 컴보박스에 들어갈 리스트! 컴보박스에는 오라클회사에서 스트링배열혹은 vector만가능
	private String[] items = { "A", "B", "C" };// 컴보박스에 들어갈 리스트를 배열로 쓰기도
	private JComboBox<String> jcombo;
	private JCheckBox jcheck;
	private JLabel jlBlank;
	private JButton jBtnExit;

	public Ex02Frame(String title) {
		super(title);
		// 객체생성
		setDefaultCloseOperation(EXIT_ON_CLOSE);// x버튼 누르면 삭제되는것!
		container = getContentPane();// 컨테이너 얻어오기 //저번에는 패널에 가지고왔음
		container.setLayout(new FlowLayout());
		// jPanel = (JPanel)getContentPane(); 12-21일날했던것!
		// jpanel.setLayout(new FlowLayout());
		jl = new JLabel("Label");
		icon = new ImageIcon("icon/write.gif");
		jBtn = new JButton("Button", icon);// 이미지 버튼
		jtxtField = new JTextField(20);// 20글자정도 넣을 수 있는 필드!
		item = new Vector<String>();// 컴보박스안에 들어갈 리스트들~!
		item.add("A");
		item.add("B");
		item.add("C");// 데이터박스 가지고온다 헐~!
		jcombo = new JComboBox<String>(item);// Vector로 생성
		// jcombo=new JComboBox<String>(items);//배열로 생성
		jcheck = new JCheckBox("checkBox");// 체크박스 이름
		jlBlank = new JLabel();// 빈라벨을 만든다음에 크기확보
		jBtnExit = new JButton("Exit");

		//////////////////////////////////////////////
		// 사이즈 조정
		jl.setPreferredSize(new Dimension(50, 50));
		jBtn.setPreferredSize(new Dimension(200, 50));
		jtxtField.setPreferredSize(new Dimension(300, 50));
		jcombo.setPreferredSize(new Dimension(100, 50));
		jcheck.setPreferredSize(new Dimension(100, 50));
		jlBlank.setPreferredSize(new Dimension(200, 50));
		jBtnExit.setPreferredSize(new Dimension(100, 50));

		/////////////////////////////////////////////////
		// add추가
		container.add(jl);
		container.add(jBtn);
		container.add(jtxtField);
		container.add(jcombo);
		container.add(jcheck);
		container.add(jlBlank);
		container.add(jBtnExit);

		///////////////////////////////////////////////
		// 시각화
		setVisible(true);
		pack();// 컴포넌트들이 배치될 수 있는 최소한의 화면 사이즈

		////////////////////////////////////////////////
		// 이벤트 리스너 추가!//사용법 익숙!
		jBtn.addActionListener(this);
		jcombo.addActionListener(this);
		jcheck.addActionListener(this);
		jBtnExit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jBtn) {
			String temp = jtxtField.getText().trim();
			if (!temp.equals("")) {
				jlBlank.setText(temp);
				jcombo.addItem(temp);
				System.out.println(item);// 컴보박스에 추가하면 item도 추가
				jtxtField.setText("");
				String name = JOptionPane.showInputDialog("이름은?");// 뭐지?
				if (name != null) {
					jcheck.setText(name);
				}

			}
		} else if (e.getSource() == jcombo) {
			jlBlank.setText(jcombo.getSelectedItem().toString());

		} else if (e.getSource() == jcheck) {
			if (jcheck.isSelected()) {// 체크박스를 체크했는지 여부
				jlBlank.setText(jcheck.getText());
			} else {
				System.out.println("체크박스를 언체크함");
			}

		} else if (e.getSource() == jBtnExit) {
			setVisible(false);
			dispose();
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new Ex02Frame("");
	}

}
