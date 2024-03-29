package sec04.exam02_flowlayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FlowLayoutExample extends JFrame{
	private JButton btnOk;
	private JButton btnCancel;
	
	public FlowLayoutExample() {
		this.setTitle("FlowLayoutExample");
		this.setSize(300, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		this.getContentPane().add(getBtnOk());
		this.getContentPane().add(getBtnCancel());
	}
	
	private JButton getBtnOk() {
		if(btnOk == null) {
			btnOk = new JButton();
			btnOk.setText("확인");
		}
		return btnOk;
	}
	
	private JButton getBtnCancel() {
		if(btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setText("취소");
		}
		return btnCancel;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FlowLayoutExample jFrame = new FlowLayoutExample();
				jFrame.setVisible(true);
			}
		});
	}
}
