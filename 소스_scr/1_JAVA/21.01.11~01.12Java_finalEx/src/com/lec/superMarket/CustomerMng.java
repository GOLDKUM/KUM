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
		btnCIdSearch = new JButton("아이디 검색");
		jbtnTelSearch = new JButton("폰4자리(FULL) 검색");
		jbtnNameSearch = new JButton("고객 이름 검색");
		jbtnPoint = new JButton("포인트로만 구매");
		jpup.add(new JLabel(" 아 이 디 ", (int) CENTER_ALIGNMENT));
		jpup.add(jtxtCId);
		jpup.add(btnCIdSearch);
		jpup.add(jcomLevel);
		jpup.add(new JLabel("고 객 전 화", (int) CENTER_ALIGNMENT));
		jpup.add(jtxtTel);
		jpup.add(jbtnTelSearch);
		jpup.add(new JLabel("고 객 이 름", (int) CENTER_ALIGNMENT));
		jpup.add(jtxtName);
		jpup.add(jbtnNameSearch);
		jpup.add(new JLabel("포  인  트", (int) CENTER_ALIGNMENT));
		jpup.add(jtxtPoint);
		jpup.add(jbtnPoint);
		jpup.add(new JLabel("구 매 금 액", (int) CENTER_ALIGNMENT));
		jpup.add(jtxtAmount);
		jpup.add(new JLabel(""));// 빈 라벨 추가하는 부분
		jpup.add(new JLabel("고 객 등 급", (int) CENTER_ALIGNMENT));
		jpup.add(jcomLevel);
		jbtnBuy = new JButton("물품 구매");
		jbtnLevelOutput = new JButton("등급별출력");
		jbtnAllOutput = new JButton("전체출력");
		jbtnInsert = new JButton("회원가입");
		jbtnTelUpdate = new JButton("번호수정");
		jbtnDelete = new JButton("회원탈퇴");
		jbtnExit = new JButton("나가기");
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
		jtxtPool.setText("------환영합니다-------------");
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
		new CustomerMng("고객관리");
	}

	@Override
	// 아이디 검색!
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
				jtxtPool.setText("★아이디를 입력 후 검색하시오★");
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
				jtxtPool.setText("아이디" + cId);
			} else {
				jtxtPool.setText(cId + "이러한 아이디는 없습니다 다시 입력하시오");
			} // if
			
		// 폰4자리(full)검색
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
				jtxtPool.setText("★핸드본 4자리를 입력 후 검색하시오★");
				return;
			} else {
				ArrayList<CustomerDto> customers = dao.cTelGetCustomers(cTel);
				if (customers.size() > 1) {
					jtxtPool.setText("\tID\t전화\t이름\t포인트\t구매누적액\t고객레벨\t 레벨업까지 남은 추가구매액수");
					jtxtPool.setText("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					for (CustomerDto customer : customers) {
						jtxtPool.append("\t" + customer.toString() + "\t");
						jtxtCId.setText(customer.getcId());
						jtxtName.setText(customer.getcName());
						jtxtPoint.setText("" + customer.getcPoint());
						jtxtAmount.setText("" + customer.getcAmount());
						jcomLevel.setSelectedItem(customer.getLevelName());
					} // for문
				} else if (customers.size() == 1) {
					jtxtCId.setText(customers.get(0).getcId());
					jtxtName.setText(customers.get(0).getcName());
					jtxtPoint.setText("" + customers.get(0).getcPoint());
					jtxtAmount.setText("" + customers.get(0).getcAmount());
					jcomLevel.setSelectedItem(customers.get(0).getLevelName());
				} else {
					jtxtPool.setText("해당 번호는 없습니다 신규가입을 하시오!");
				} // if
			}
			
		// 고객이름검색
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
				jtxtPool.setText("★이름을 입력 후 검색하시오★");
				return;
			}
			ArrayList<CustomerDto> customers = dao.cNameGetCustomers(cName);
			if (customers.size() > 1) {
				jtxtPool.setText("\tID\t전화\t이름\t포인트\t구매누적액\t고객레벨\t 레벨업까지 남은 추가구매액수");
				jtxtPool.setText("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
				for (CustomerDto customer : customers) {
					jtxtPool.append("\t" + customer.toString() + "\t");
					jtxtCId.setText(customer.getcId());
					jtxtName.setText(customer.getcName());
					jtxtPoint.setText("" + customer.getcPoint());
					jtxtAmount.setText("" + customer.getcAmount());
					jcomLevel.setSelectedItem(customer.getLevelName());
				} // for문
			} else if (customers.size() == 1) {
				jtxtCId.setText(customers.get(0).getcId());
				jtxtName.setText(customers.get(0).getcName());
				jtxtPoint.setText("" + customers.get(0).getcPoint());
				jtxtAmount.setText("" + customers.get(0).getcAmount());
				jcomLevel.setSelectedItem(customers.get(0).getLevelName());
			} else {
				jtxtPool.setText("해당 이름는 없습니다 신규가입을 하시오!");
			} // if
			
		//포인트로 결재
		} else if (e.getSource() == jbtnPoint) {
			int cAmount = 0, cPoint = 0;
			String cId = jtxtCId.getText().trim();
			cAmount = Integer.parseInt(jtxtAmount.getText().trim());
			cPoint = Integer.parseInt(jtxtPoint.getText().trim());
			if (cPoint < cAmount) {
				jtxtPool.setText("포인트가 부족하여 포인트로 구매 불가");
				return;
			}
			int result = dao.buyWithPoint(cAmount, cId);
			if (result == CustomerDao.SUCCESS) {
				jtxtPool.setText("포인트로 결재하였습니다");
				jtxtPoint.setText(String.valueOf(cPoint - cAmount));
				jtxtAmount.setText("");
			} else {
				jtxtPool.setText("아이디가 존재하지 않습니다");
			}
		//물품구매	
		}else if(e.getSource()==jbtnBuy) {

			int cAmount=Integer.parseInt(jtxtAmount.getText().trim());
			String cId = jtxtCId.getText().trim();
			int result =dao.buy(cAmount, cId);
			if(result==CustomerDao.SUCCESS) {
				jtxtPool.setText("물품구매 레벨 조정 성공");
			}else {
				jtxtPool.setText("실패하였습니다");
			}
			
		//등급별 출력
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
				jtxtPool.setText("★없는 등급입니다.★");
				return;
			}
				ArrayList<CustomerDto> customers = dao.levelNameGetCustomers(levelName);
				if(customers.size()!=0) {
					jtxtPool.setText("ID\t전화\t이름\t포인트\t구매누적액\t고객레벨\t레벨업을 위한 추가 구매할 금액\n");
					jtxtPool.append("────────────────────────────────────────────────────────\n");
					for(CustomerDto customer : customers) {
						jtxtPool.append(customer.toString()+"\n");
					}//for
					jtxtPool.append("총 "+customers.size()+"명");
				}else {
					jtxtPool.setText("해당 레벨의 고객이 검색되지 않습니다. 회원가입 해 주세요");
				}
				
		}else if(e.getSource()==jbtnAllOutput) {//전체출력
			ArrayList<CustomerDto> customers = dao.getCustomers();
			if(customers.size()!=0) {
				jtxtPool.setText("ID\t전화\t이름\t포인트\t구매누적액\t고객레벨\t레벨업을 위한 추가 구매할 금액\n");
				jtxtPool.append("────────────────────────────────────────────────────────\n");
				for(CustomerDto customer : customers) {
					jtxtPool.append(customer.toString()+"\n");
				}//for
				jtxtPool.append("총 "+customers.size()+"명");
			}else {
				jtxtPool.setText("해당 레벨의 고객이 검색되지 않습니다. 회원가입 해 주세요");
			}
			
		}else if(e.getSource()==jbtnInsert) {//회원가입
			/* String cTel, String cName */
			String cTel=jtxtTel.getText().trim();
			String cName=jtxtName.getText().trim();
			if(cTel.equals("")||cName.equals("")) {
				jtxtPool.setText("핸드폰번호와 이름을 입력하시오");
				return;
			}
			int result = dao.insertCustomer(cTel, cName);
			if(result==1) {
				jtxtPoint.setText("1000");
				jcomLevel.setSelectedIndex(1);
			}
			
		}else if(e.getSource()==jbtnTelUpdate) {//번호수정
			String cTel,cId;
			cId =  jtxtCId.getText().trim();
			cTel = jtxtTel.getText().trim();
			if(cTel.equals("")) {
				jtxtPool.setText("변경할 전화번호를 입력하시오");
				return;
			}
			int result = dao.updateCustomer(cTel, cId);
			if(result==CustomerDao.SUCCESS) {
				jtxtPool.setText("아이디:"+cId+"님의 전화번호가 수정되었습니다.");
			}else {
				jtxtPool.setText("유효한 고객ID를 검색 후 변호변경을 하세요");
			}
			
		}else if(e.getSource()==jbtnDelete) {//회원탈퇴
			String cId=jtxtCId.getText().trim();
			if(cId.length()==0) {
				jtxtPool.setText("아이디를 입력하시고 삭제하시오");
				return;
			}
			int result = dao.deleteCustomer(cId);
			if(result==CustomerDao.SUCCESS) {
				jtxtPool.setText("삭제 완료");
			}//if
		}else if(e.getSource()==jbtnExit) {//종료
			setVisible(false);
			dispose();
			System.exit(0);
		}

	}// actionPerformed
}// class
