package sec04.exam06_nulllayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class NullLayoutExample extends JFrame {
	private JButton btnOk;
	
	// 메인 윈도우 설정
	public NullLayoutExample() {
		this.setTitle("NullLayoutExample"); // 윈도우 타이틀을 NullLayoutExample로 설정
		this.setSize(300, 200); // 윈도우 사이즈를 가로 300 세로 200으로 설정
		this.setResizable(false); // 인터페이스에서 해당 창이나 프레임의 크기를 변경할 수 없다.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼을 눌렀을 때 닫아진다.
		
		// NullLayout 설정과 버튼 추가
		this.getContentPane().setLayout(null); // 페널 레이아웃 위치를 지정하지 않아 setBounds를 사용해 좌표값으로 설정
		this.getContentPane().add(getBtnOk()); // 버튼 패널을 추가
	}
	
	// 버튼 생성
	public JButton getBtnOk() {
		if(btnOk == null) { // 버튼이 없을때
			btnOk = new JButton(); // 새로운 버튼 객체 생성
			btnOk.setText("확인"); // 버튼의 이름은 "확인"으로 생성
			// 버튼이 위치할 좌표값과 폭과 높이 설정
			btnOk.setBounds(100, 50, 70, 60);
		}
		return btnOk;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NullLayoutExample jFrame = new NullLayoutExample();
				jFrame.setVisible(true);
			}
		});
	}

}
