package com.lec.ex2_swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//패널
//버튼
//테스트~공간! 

public class Ex03Frame extends JFrame implements ActionListener {
	private Container container; // 전체 컨테이너를 받아올 변수!
	private JPanel jp;
	private JTextField jtxtName, jtxtTel, jtxtAge;
	private ImageIcon icon; // 버튼안에 이미지가 있기 떄문에 선언한당~!
	private JButton btnOut;
	private JTextArea jta;
	private JScrollPane scrollbar;// 테스트 지역에 스크롤 객체!

	// 생성자
	public Ex03Frame(String title) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// x버튼 누르면 종료
		container = getContentPane();// container에 가지고왔어용~!
		// container.setLayout(new BorderLayout());//기본값

		jp = new JPanel(new GridLayout(3, 2));// 3행2열 패널을 가지고왔어요
		jtxtName = new JTextField();// 테스트필드 만들었따 이름 오른쪽에들어가는거
		jtxtTel = new JTextField();
		jtxtAge = new JTextField();
		///////////////////////// 이미지
		icon = new ImageIcon("icon/output.png");
		btnOut = new JButton("출력", icon);
		jta = new JTextArea(5, 30);// 5줄짜리 테스트지역
		scrollbar = new JScrollPane(jta);
		jp.add(new JLabel("이 름", (int) CENTER_ALIGNMENT));// 1행1열 패널에 들어감
		jp.add(jtxtName); // 1행2열에 입력
		jp.add(new JLabel("전 화", (int) CENTER_ALIGNMENT));
		jp.add(jtxtTel);
		jp.add(new JLabel("나 이", (int) CENTER_ALIGNMENT));
		jp.add(jtxtAge);// 3행2열
		container.add(jp, BorderLayout.NORTH);// 위로붙여라
		container.add(btnOut, BorderLayout.CENTER);// 중앙에
		container.add(scrollbar, BorderLayout.SOUTH);// 밑으로

		// 시각화
		setVisible(true);
		// setSize(new Dimension(400,300));
		// setLocation(100,100);
		setBounds(100, 100, 400, 300);// Location+Size 통합 !

		////////// 리스너추가
		btnOut.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOut) {
			String name = jtxtName.getText().trim();// 트림 앞뒤 삭제요~
			String tel = jtxtTel.getText().trim();
//			String age  = jtxtAge.getText().trim();
			if (name.equals("") || tel.equals("")) {
				System.out.println("이름과 전화번호는 반드시 입력");
				return;
			}
			int age;
			try {
				age = Integer.parseInt(jtxtAge.getText());
			} catch (Exception ex) {
				age = -1;
			}
			String result = "[이름]"+name+"\t[전화]"+tel;//콘솔창에 뜨는것
			if(age>=0 && age<130) {
				result +="\t[나이]"+age;
			}else {
				result +="\t[나이]유효하지 않는 나이를 입력";
			}
			System.out.println(result);
			//jta.setText(result);//이렇게 입력하면 기존의 값이 지워지고 뿌려짐 
			jta.append(result+"\r\n");//결과값에서 "\r\n"다음줄로 가라는 뜻 
			jtxtName.setText("");//쓰고 새롭게 지워줌 
			jtxtTel.setText("");
			jtxtAge.setText("");
			
			
//			if (!name.equals("") && !tel.equals("")) {
//				int age;
//				try {
//					age = Integer.parseInt(jtxtAge.getText());
//				} catch (Exception ex) {
//					age=0;
//					System.out.println(ex.getMessage());
//				}
//				
//			} else {
//				System.out.println("이름과 전화번호는 반드시 입력");
//			}

		}

	}

	public static void main(String[] args) {
		new Ex03Frame("금경용");
	}

}
