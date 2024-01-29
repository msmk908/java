package sec04.exam07_pack;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PackExample extends JFrame {
	private JButton btnOk;
	private JButton btnCancel;

	// 메인 윈도우 설정
	public PackExample() {
		this.setTitle("FlowLayoutExample"); // 타이틀 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 설정

		this.setLayout(new FlowLayout()); // 레이아웃 설정
		this.getContentPane().add(getBtnOk()); // Ok 버튼패널 추가
		this.getContentPane().add(getBtnCancel()); // Cancel 버튼패널 추가

		this.pack(); // 안에 들어가는 컴포넌트의 크기에 따라 밖에 컨테이너의 크기가 지정된다
	}

	private JButton getBtnOk() { // Ok버튼 메소드
		if (btnOk == null) { // 버튼이 눌일때
			btnOk = new JButton(); // 버튼객체 생성
			btnOk.setText("확인"); // 버튼 텍스트 "확인"
		}
		return btnOk;
	}

	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setText("취소");
		}
		return btnCancel;
	}
	
	public static void main(String[] arg) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				PackExample jFrame = new PackExample();
				jFrame.setVisible(true);
			}
		});
	}
}
