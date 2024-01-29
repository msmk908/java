package sec06.exam03_jradiobutton;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class JRadioButtonExample extends JFrame {
	private JPanel radioPanel;
	private JRadioButton rbBird;
	private JRadioButton rbCat;
	private JRadioButton rbCow;
	private JRadioButton rbDog;
	private JLabel lblPicture;
	
	// 메인 윈도우 설정
	public JRadioButtonExample() {
		setTitle("JRadioButtonExample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getRadioPanel(), BorderLayout.SOUTH);
		this.getContentPane().add(getLblPicture(), BorderLayout.CENTER);
		pack();
	}
	
	// JRadioButton이 배치된 JPanel 생성
	public JPanel getRadioPanel() {
		if(radioPanel == null) {
			radioPanel = new JPanel();
			radioPanel.setLayout(new GridLayout(1, 4));
			radioPanel.add(getRbBird());
			radioPanel.add(getRbCat());
			radioPanel.add(getRbCow());
			radioPanel.add(getRbDog());
			
			// 배타적 선택을 위해 ButtonGroup에 두 개의 JRadioButton 추가
			ButtonGroup group = new ButtonGroup();
			group.add(getRbBird());
			group.add(getRbCat());
			group.add(getRbCow());
			group.add(getRbDog());
		}
		return radioPanel;
	}
	
	// JRadioButton(Bird) 생성
	public JRadioButton getRbBird() {
		if(rbBird == null) {
			rbBird = new JRadioButton();
			rbBird.setText("Bird");
			rbBird.setSelected(true);
			rbBird.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLblPicture().setIcon(new ImageIcon(getClass ().getResource("Bird.gif")));
					System.out.println("새를 선택하셨습니다.");
				}
			});
		}
		return rbBird;
	}
	
	// JRadioButton(Cat) 생성
	public JRadioButton getRbCat() {
		if(rbCat == null) {
			rbCat = new JRadioButton();
			rbCat.setText("Cat");
			rbCat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLblPicture().setIcon(new ImageIcon(getClass().getResource("Cat.gif")));
					System.out.println("고양이를 선택하셨습니다.");
				}
			});
		}
		return rbCat;
	}
	
	public JRadioButton getRbCow() {
		if(rbCow == null) {
			rbCow = new JRadioButton();
			rbCow.setText("Cow");
			rbCow.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLblPicture().setIcon(new ImageIcon(getClass().getResource("Cow.gif")));
					System.out.println("소를 선택하셨습니다.");
				}
			});
		}
		return rbCow;
	}
	
	public JRadioButton getRbDog() {
		if(rbDog == null) {
			rbDog = new JRadioButton();
			rbDog.setText("Dog");
			rbDog.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLblPicture().setIcon(new ImageIcon(getClass().getResource("Dog.gif")));
					System.out.println("개를 선택하셨습니다.");
				}
			});
		}
		return rbDog;
	}
	
	// 이미지를 보여줄 JLabel 생성
	public JLabel getLblPicture() {
		if(lblPicture == null) {
			lblPicture = new JLabel();
			lblPicture.setIcon(new ImageIcon(getClass().getResource("Bird.gif")));
		}
		return lblPicture;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JRadioButtonExample jFrame = new JRadioButtonExample();
				jFrame.setVisible(true);
				System.out.println("새를 선택하셨습니다.");
			}
		});
	}
}
