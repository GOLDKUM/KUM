package com.lec.ex2_swing;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;

public class Ex02Frame extends JFrame implements ActionListener {
	// private JPanel jpanel;//�����̳� ���ͼ� �޴� ���� ������ �̰����� ���� �̹����� �����̳ʷ�!
	private Container container;// �����̳� ���ͼ� �޴� ����

	private JLabel jl;// ���ʺ��� ��!
	private ImageIcon icon;
	private JButton jBtn;
	private JTextField jtxtField;
	private Vector<String> item;// �ĺ��ڽ��� �� ����Ʈ! �ĺ��ڽ����� ����Ŭȸ�翡�� ��Ʈ���迭Ȥ�� vector������
	private String[] items = { "A", "B", "C" };// �ĺ��ڽ��� �� ����Ʈ�� �迭�� ���⵵
	private JComboBox<String> jcombo;
	private JCheckBox jcheck;
	private JLabel jlBlank;
	private JButton jBtnExit;

	public Ex02Frame(String title) {
		super(title);
		// ��ü����
		setDefaultCloseOperation(EXIT_ON_CLOSE);// x��ư ������ �����Ǵ°�!
		container = getContentPane();// �����̳� ������ //�������� �гο� ���������
		container.setLayout(new FlowLayout());
		// jPanel = (JPanel)getContentPane(); 12-21�ϳ��ߴ���!
		// jpanel.setLayout(new FlowLayout());
		jl = new JLabel("Label");
		icon = new ImageIcon("icon/write.gif");
		jBtn = new JButton("Button", icon);// �̹��� ��ư
		jtxtField = new JTextField(20);// 20�������� ���� �� �ִ� �ʵ�!
		item = new Vector<String>();// �ĺ��ڽ��ȿ� �� ����Ʈ��~!
		item.add("A");
		item.add("B");
		item.add("C");// �����͹ڽ� ������´� ��~!
		jcombo = new JComboBox<String>(item);// Vector�� ����
		// jcombo=new JComboBox<String>(items);//�迭�� ����
		jcheck = new JCheckBox("checkBox");// üũ�ڽ� �̸�
		jlBlank = new JLabel();// ����� ��������� ũ��Ȯ��
		jBtnExit = new JButton("Exit");

		//////////////////////////////////////////////
		// ������ ����
		jl.setPreferredSize(new Dimension(50, 50));
		jBtn.setPreferredSize(new Dimension(200, 50));
		jtxtField.setPreferredSize(new Dimension(300, 50));
		jcombo.setPreferredSize(new Dimension(100, 50));
		jcheck.setPreferredSize(new Dimension(100, 50));
		jlBlank.setPreferredSize(new Dimension(200, 50));
		jBtnExit.setPreferredSize(new Dimension(100, 50));

		/////////////////////////////////////////////////
		// add�߰�
		container.add(jl);
		container.add(jBtn);
		container.add(jtxtField);
		container.add(jcombo);
		container.add(jcheck);
		container.add(jlBlank);
		container.add(jBtnExit);

		///////////////////////////////////////////////
		// �ð�ȭ
		setVisible(true);
		pack();// ������Ʈ���� ��ġ�� �� �ִ� �ּ����� ȭ�� ������

		////////////////////////////////////////////////
		// �̺�Ʈ ������ �߰�!//���� �ͼ�!
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
				System.out.println(item);// �ĺ��ڽ��� �߰��ϸ� item�� �߰�
				jtxtField.setText("");
				String name = JOptionPane.showInputDialog("�̸���?");// ����?
				if (name != null) {
					jcheck.setText(name);
				}

			}
		} else if (e.getSource() == jcombo) {
			jlBlank.setText(jcombo.getSelectedItem().toString());

		} else if (e.getSource() == jcheck) {
			if (jcheck.isSelected()) {// üũ�ڽ��� üũ�ߴ��� ����
				jlBlank.setText(jcheck.getText());
			} else {
				System.out.println("üũ�ڽ��� ��üũ��");
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
