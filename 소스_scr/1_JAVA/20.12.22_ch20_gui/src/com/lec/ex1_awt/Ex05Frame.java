package com.lec.ex1_awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//followLayout
public class Ex05Frame extends Frame /* �̺�Ʈ������ */ implements ActionListener{
	private Panel panel;
	private TextField txtField;
	private Button btnOk;
	private Button btnExit;
	private List list;

	public Ex05Frame(String title) {
		// layOut����, ������Ʈ ������ add, setVisble,SetSize
		//	this();
		//	setTiltle(title);
			super(title);
		//	setLayout(new BorderLayout());//�⺻���̹Ƿ� �������� 
		panel = new Panel();//panel�� FlowLayout�� �⺻�� 
		txtField = new TextField(20);
		btnOk= new Button("OK");
		btnExit= new Button("Exit");
		list = new List();
		panel.add(new Label("write"));
		panel.add(txtField);
		panel.add(btnOk);
		panel.add(btnExit);//�гοϼ� 
		add(panel,BorderLayout.NORTH);
		add(list,BorderLayout.CENTER);
		setVisible(true);
		setSize(new Dimension(400,200));
		
		//1. implement ActionListener �޴´�
		//2.�̺�Ʈ �������߰� (�̺�Ʈ���� �߰��մϴ�)
		//3.�����߰�
		btnOk.addActionListener(this);//���⼭ this�� actionPerformed //this.actionPerformed();
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
			//txtField�� �׽�Ʈ�� List�� �߰��ϰ� txtField�� ""��
			list.add(txtField.getText());
			txtField.setText("");
			
		}else if(e.getSource()==btnExit) {
			//����
			setVisible(false);
			dispose();
			System.exit(0);
		}

		
		
		
		
		
		
		
		
		
	}

}
//���巹�̾ƿ� south  /�÷ο췹�̾ƿ�  panel���� ������������ �θ�� !
