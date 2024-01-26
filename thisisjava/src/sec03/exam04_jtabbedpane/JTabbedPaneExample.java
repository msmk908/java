package sec03.exam04_jtabbedpane;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

public class JTabbedPaneExample extends JFrame {
	private JTabbedPane jTabbedPane;
	private JPanel tab1Panel;
	private JPanel tab2Panel;
	
	public JTabbedPaneExample() {
		// JFrame 설정
		this.setTitle("JTabbedPaneExample");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JTabbedPane을 창의 중앙에 추가
		this.getContentPane().add(getJTabbedPane(), BorderLayout.CENTER);
	}
	
	private JTabbedPane getJTabbedPane() {
		if(jTabbedPane == null) {
			// JTabbedPane 생성 및 탭 위치를 왼쪽으로 설정
			jTabbedPane = new JTabbedPane();
			jTabbedPane.setTabPlacement(JTabbedPane.RIGHT);
			
			// '탭1" 탭과 패널 추가
			jTabbedPane.addTab("탭1", getTab1Panel());
			
			// "탭2" 탭과 패널 추가
			jTabbedPane.addTab("탭2", getTab2Panel());
		}
		return jTabbedPane;
	}
	
	private JPanel getTab1Panel() {
		if(tab1Panel == null) {
			// "탭1" 패널 생성
			tab1Panel = new JPanel();
			
			// 이미지를 표시할 JLabel 생성 및 이미지 설정
			JLabel jLabel = new JLabel();
			jLabel.setIcon(new ImageIcon(getClass().getResource("homer1.gif")));
			
			// JLabel을 패널에 추가
			tab1Panel.add(jLabel);
		}
		return tab1Panel;
	}
	
	private JPanel getTab2Panel() {
		if(tab2Panel == null) {
			// "탭2" 패널 생성
			tab2Panel = new JPanel();
			
			// 이미지를 표시할 JLabel 생성 및 이미지 설정
			JLabel jLabel = new JLabel();
			jLabel.setIcon(new ImageIcon(getClass().getResource("homer2.gif")));
			
			// JLabel을 패널에 추가
			tab2Panel.add(jLabel);
		}
		return tab2Panel;
	}
	
	public static void main(String[] args) {
		// GUI 작업을 이벤트 디스패치 스레드에서 실행
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// JTabbedPaneExample 객체 생성 및 창 표시
				JTabbedPaneExample jFrame = new JTabbedPaneExample();
				jFrame.setVisible(true);
			}
		});
	}
}
