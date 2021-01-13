package com.lec.superMarket;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CustomerMng extends JFrame implements ActionListener   {
//Swing
	private Container container;
	private JPanel jpup, jpbtn;
	private JTextField jtxtCId, jtxtTel, jtxtName, jtxtPoint, jtxtAmount;
	private Vector<String> levels;
	private JComboBox<String> jcomLevel;
	private JButton btnCIdSearch, jbtnTelSearch, jbtnNameSearch, jbtnPoint;
	private JButton jbtnBuy, jbtnLevelOutput, jbtnAllOutput, jbtnInsert, jbtnTelUpdate, jbtnDelete, jbtnExit;
	private JTextArea jtxtPool;
	private JScrollPane scrollPane;
	CustomerDao dao = CustomerDao.getInstace();

	public CustomerMng(String title) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		container = getContentPane();
		container.setLayout(new FlowLayout());
		jpup = new JPanel(new GridLayout(6, 3));
		jpbtn = new JPanel();
		jtxtCId = new JTextField(20);
		jtxtTel = new JTextField(20);
		jtxtName = new JTextField(20);
		jtxtPoint = new JTextField(20);
		jtxtAmount = new JTextField(20);
		levels = dao.getLevelNamelist();
		jcomLevel = new JComboBox<String>(levels);
		btnCIdSearch = new JButton("���̵� �˻�");
		jbtnTelSearch = new JButton("��4�ڸ�(FULL) �˻�");
		jbtnNameSearch = new JButton("�� �̸� �˻�");
		jbtnPoint = new JButton("����Ʈ�θ� ����");
		jpup.add(new JLabel(" �� �� �� ", (int) CENTER_ALIGNMENT));
		jpup.add(jtxtCId);
		jpup.add(btnCIdSearch);
		jpup.add(jcomLevel);
		jpup.add(new JLabel("�� �� �� ȭ", (int) CENTER_ALIGNMENT));
		jpup.add(jtxtTel);
		jpup.add(jbtnTelSearch);
		jpup.add(new JLabel("�� �� �� ��", (int) CENTER_ALIGNMENT));
		jpup.add(jtxtName);
		jpup.add(jbtnNameSearch);
		jpup.add(new JLabel("��  ��  Ʈ", (int) CENTER_ALIGNMENT));
		jpup.add(jtxtPoint);
		jpup.add(jbtnPoint);
		jpup.add(new JLabel("�� �� �� ��", (int) CENTER_ALIGNMENT));
		jpup.add(jtxtAmount);
		jpup.add(new JLabel(""));// �� �� �߰��ϴ� �κ�
		jpup.add(new JLabel("�� �� �� ��", (int) CENTER_ALIGNMENT));
		jpup.add(jcomLevel);
		jbtnBuy = new JButton("��ǰ ����");
		jbtnLevelOutput = new JButton("��޺����");
		jbtnAllOutput = new JButton("��ü���");
		jbtnInsert = new JButton("ȸ������");
		jbtnTelUpdate = new JButton("��ȣ����");
		jbtnDelete = new JButton("ȸ��Ż��");
		jbtnExit = new JButton("������");
		jpbtn.add(jbtnBuy);
		jpbtn.add(jbtnLevelOutput);
		jpbtn.add(jbtnAllOutput);
		jpbtn.add(jbtnInsert);
		jpbtn.add(jbtnTelUpdate);
		jpbtn.add(jbtnDelete);
		jpbtn.add(jbtnExit);
		jtxtPool = new JTextArea(6, 60);
		scrollPane = new JScrollPane(jtxtPool);
		container.add(jpup);
		container.add(jpbtn);
		container.add(scrollPane);
		setSize(new Dimension(750, 370));
		setLocation(200, 200);
		setVisible(true);
		jtxtPool.setText("------ȯ���մϴ�-------------");
		btnCIdSearch.addActionListener(this);
		jbtnTelSearch.addActionListener(this);
		jbtnNameSearch.addActionListener(this);
		jbtnPoint.addActionListener(this);
		jbtnBuy.addActionListener(this);
		jbtnLevelOutput.addActionListener(this);
		jbtnAllOutput.addActionListener(this);
		jbtnInsert.addActionListener(this);
		jbtnTelUpdate.addActionListener(this);
		jbtnDelete.addActionListener(this);
		jbtnExit.addActionListener(this);
	}

	public static void main(String[] args) {
		new CustomerMng("������");
	}

	@Override
	// ���̵� �˻�!
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCIdSearch) {
			String cId = jtxtCId.getText().trim();
			if (cId.equals("")) {
				jtxtCId.setText("");
				jtxtTel.setText("");
				jtxtName.setText("");
				jtxtPoint.setText("");
				jtxtAmount.setText("");
				jcomLevel.setSelectedItem("");
				jcomLevel.setSelectedIndex(0);
				jtxtPool.setText("�ھ��̵� �Է� �� �˻��Ͻÿ���");
				return;
			} // if

			CustomerDto dto = dao.cIdGetCustomer(cId);
			if (dto != null) {
				jtxtCId.setText(dto.getcId());
				jtxtTel.setText(dto.getcTel());
				jtxtName.setText(dto.getcName());
				jtxtPoint.setText(String.valueOf(dto.getcPoint()));
				jtxtAmount.setText("" + dto.getcAmount());
				jcomLevel.setSelectedItem(dto.getLevelName());
				jtxtPool.setText("���̵�" + cId);
			} else {
				jtxtPool.setText(cId + "�̷��� ���̵�� �����ϴ� �ٽ� �Է��Ͻÿ�");
			} // if
			
		// ��4�ڸ�(full)�˻�
		} else if (e.getSource() == jbtnTelSearch) {
			String cTel = jtxtTel.getText().trim();
			if (cTel.isEmpty()) {
				jtxtCId.setText("");
				jtxtTel.setText("");
				jtxtName.setText("");
				jtxtPoint.setText("");
				jtxtAmount.setText("");
				jcomLevel.setSelectedItem("");
				jcomLevel.setSelectedIndex(0);
				jtxtPool.setText("���ڵ庻 4�ڸ��� �Է� �� �˻��Ͻÿ���");
				return;
			} else {
				ArrayList<CustomerDto> customers = dao.cTelGetCustomers(cTel);
				if (customers.size() > 1) {
					jtxtPool.setText("\tID\t��ȭ\t�̸�\t����Ʈ\t���Ŵ�����\t������\t ���������� ���� �߰����ž׼�");
					jtxtPool.setText("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
					for (CustomerDto customer : customers) {
						jtxtPool.append("\t" + customer.toString() + "\t");
						jtxtCId.setText(customer.getcId());
						jtxtName.setText(customer.getcName());
						jtxtPoint.setText("" + customer.getcPoint());
						jtxtAmount.setText("" + customer.getcAmount());
						jcomLevel.setSelectedItem(customer.getLevelName());
					} // for��
				} else if (customers.size() == 1) {
					jtxtCId.setText(customers.get(0).getcId());
					jtxtName.setText(customers.get(0).getcName());
					jtxtPoint.setText("" + customers.get(0).getcPoint());
					jtxtAmount.setText("" + customers.get(0).getcAmount());
					jcomLevel.setSelectedItem(customers.get(0).getLevelName());
				} else {
					jtxtPool.setText("�ش� ��ȣ�� �����ϴ� �ű԰����� �Ͻÿ�!");
				} // if
			}
			
		// ���̸��˻�
		} else if (e.getSource() == jbtnNameSearch) {
			String cName = jtxtName.getText().trim();
			if (cName.isEmpty()) {
				jtxtCId.setText("");
				jtxtTel.setText("");
				jtxtName.setText("");
				jtxtPoint.setText("");
				jtxtAmount.setText("");
				jcomLevel.setSelectedItem("");
				jcomLevel.setSelectedIndex(0);
				jtxtPool.setText("���̸��� �Է� �� �˻��Ͻÿ���");
				return;
			}
			ArrayList<CustomerDto> customers = dao.cNameGetCustomers(cName);
			if (customers.size() > 1) {
				jtxtPool.setText("\tID\t��ȭ\t�̸�\t����Ʈ\t���Ŵ�����\t������\t ���������� ���� �߰����ž׼�");
				jtxtPool.setText("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
				for (CustomerDto customer : customers) {
					jtxtPool.append("\t" + customer.toString() + "\t");
					jtxtCId.setText(customer.getcId());
					jtxtName.setText(customer.getcName());
					jtxtPoint.setText("" + customer.getcPoint());
					jtxtAmount.setText("" + customer.getcAmount());
					jcomLevel.setSelectedItem(customer.getLevelName());
				} // for��
			} else if (customers.size() == 1) {
				jtxtCId.setText(customers.get(0).getcId());
				jtxtName.setText(customers.get(0).getcName());
				jtxtPoint.setText("" + customers.get(0).getcPoint());
				jtxtAmount.setText("" + customers.get(0).getcAmount());
				jcomLevel.setSelectedItem(customers.get(0).getLevelName());
			} else {
				jtxtPool.setText("�ش� �̸��� �����ϴ� �ű԰����� �Ͻÿ�!");
			} // if
			
		//����Ʈ�� ����
		} else if (e.getSource() == jbtnPoint) {
			int cAmount = 0, cPoint = 0;
			String cId = jtxtCId.getText().trim();
			cAmount = Integer.parseInt(jtxtAmount.getText().trim());
			cPoint = Integer.parseInt(jtxtPoint.getText().trim());
			if (cPoint < cAmount) {
				jtxtPool.setText("����Ʈ�� �����Ͽ� ����Ʈ�� ���� �Ұ�");
				return;
			}
			int result = dao.buyWithPoint(cAmount, cId);
			if (result == CustomerDao.SUCCESS) {
				jtxtPool.setText("����Ʈ�� �����Ͽ����ϴ�");
				jtxtPoint.setText(String.valueOf(cPoint - cAmount));
				jtxtAmount.setText("");
			} else {
				jtxtPool.setText("���̵� �������� �ʽ��ϴ�");
			}
		//��ǰ����	
		}else if(e.getSource()==jbtnBuy) {

			int cAmount=Integer.parseInt(jtxtAmount.getText().trim());
			String cId = jtxtCId.getText().trim();
			int result =dao.buy(cAmount, cId);
			if(result==CustomerDao.SUCCESS) {
				jtxtPool.setText("��ǰ���� ���� ���� ����");
			}else {
				jtxtPool.setText("�����Ͽ����ϴ�");
			}
			
		//��޺� ���
		}else if(e.getSource()==jbtnLevelOutput) {
			String levelName = jcomLevel.getSelectedItem().toString();
			if (levelName.isEmpty()) {
				jtxtCId.setText("");
				jtxtTel.setText("");
				jtxtName.setText("");
				jtxtPoint.setText("");
				jtxtAmount.setText("");
				jcomLevel.setSelectedItem("");
				jcomLevel.setSelectedIndex(0);
				jtxtPool.setText("�ھ��� ����Դϴ�.��");
				return;
			}
				ArrayList<CustomerDto> customers = dao.levelNameGetCustomers(levelName);
				if(customers.size()!=0) {
					jtxtPool.setText("ID\t��ȭ\t�̸�\t����Ʈ\t���Ŵ�����\t������\t�������� ���� �߰� ������ �ݾ�\n");
					jtxtPool.append("����������������������������������������������������������������������������������������������������������������\n");
					for(CustomerDto customer : customers) {
						jtxtPool.append(customer.toString()+"\n");
					}//for
					jtxtPool.append("�� "+customers.size()+"��");
				}else {
					jtxtPool.setText("�ش� ������ ���� �˻����� �ʽ��ϴ�. ȸ������ �� �ּ���");
				}
				
		}else if(e.getSource()==jbtnAllOutput) {//��ü���
			ArrayList<CustomerDto> customers = dao.getCustomers();
			if(customers.size()!=0) {
				jtxtPool.setText("ID\t��ȭ\t�̸�\t����Ʈ\t���Ŵ�����\t������\t�������� ���� �߰� ������ �ݾ�\n");
				jtxtPool.append("����������������������������������������������������������������������������������������������������������������\n");
				for(CustomerDto customer : customers) {
					jtxtPool.append(customer.toString()+"\n");
				}//for
				jtxtPool.append("�� "+customers.size()+"��");
			}else {
				jtxtPool.setText("�ش� ������ ���� �˻����� �ʽ��ϴ�. ȸ������ �� �ּ���");
			}
			
		}else if(e.getSource()==jbtnInsert) {//ȸ������
			/* String cTel, String cName */
			String cTel=jtxtTel.getText().trim();
			String cName=jtxtName.getText().trim();
			if(cTel.equals("")||cName.equals("")) {
				jtxtPool.setText("�ڵ�����ȣ�� �̸��� �Է��Ͻÿ�");
				return;
			}
			int result = dao.insertCustomer(cTel, cName);
			if(result==1) {
				jtxtPoint.setText("1000");
				jcomLevel.setSelectedIndex(1);
			}
			
		}else if(e.getSource()==jbtnTelUpdate) {//��ȣ����
			String cTel,cId;
			cId =  jtxtCId.getText().trim();
			cTel = jtxtTel.getText().trim();
			if(cTel.equals("")) {
				jtxtPool.setText("������ ��ȭ��ȣ�� �Է��Ͻÿ�");
				return;
			}
			int result = dao.updateCustomer(cTel, cId);
			if(result==CustomerDao.SUCCESS) {
				jtxtPool.setText("���̵�:"+cId+"���� ��ȭ��ȣ�� �����Ǿ����ϴ�.");
			}else {
				jtxtPool.setText("��ȿ�� ��ID�� �˻� �� ��ȣ������ �ϼ���");
			}
			
		}else if(e.getSource()==jbtnDelete) {//ȸ��Ż��
			String cId=jtxtCId.getText().trim();
			if(cId.length()==0) {
				jtxtPool.setText("���̵� �Է��Ͻð� �����Ͻÿ�");
				return;
			}
			int result = dao.deleteCustomer(cId);
			if(result==CustomerDao.SUCCESS) {
				jtxtPool.setText("���� �Ϸ�");
			}//if
		}else if(e.getSource()==jbtnExit) {//����
			setVisible(false);
			dispose();
			System.exit(0);
		}

	}// actionPerformed
}// class
