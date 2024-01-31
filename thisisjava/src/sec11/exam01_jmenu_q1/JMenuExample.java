package sec11.exam01_jmenu_q1;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;

public class JMenuExample extends JFrame {
	private JMenuBar jMenuBar;
	private JMenu menuProject, menu1, menu2, menu3, menuPage, pj3;
	private JMenuItem menuItemNewFolder, pj31;
	private JMenuItem menuItemOpen, menuItemSave, menuItemExit;

	public JMenuExample() {
		this.setTitle("JMenuExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(getJMenuBar());
		this.setSize(300, 200);
	}

	public JMenuBar getJMenuBar() {
		if (jMenuBar == null) {
			jMenuBar = new JMenuBar();

			JMenuItem menu1 = new JMenuItem("편집");
			JMenuItem menu2 = new JMenuItem("정렬");
			JMenuItem menu3 = new JMenuItem("효과");
			
			jMenuBar.add(getMenuProject());
			jMenuBar.add(new JSeparator());
			jMenuBar.add(getMenuPage());
			jMenuBar.add(new JSeparator());
			jMenuBar.add(menu1);
			jMenuBar.add(new JSeparator());
			jMenuBar.add(menu2);
			jMenuBar.add(new JSeparator());
			jMenuBar.add(menu3);
		}
		return jMenuBar;
	}

	public JMenu getMenuProject() {
		if (menuProject == null) {
			menuProject = new JMenu("프로젝트");

			JMenuItem pj1 = new JMenuItem("이름 바꾸기");
			JMenuItem pj2 = new JMenuItem("사본 만들기");
			JMenuItem pj4 = new JMenuItem("프로젝트 정보 설정");
			JMenuItem pj5 = new JMenuItem("기본 화면사이즈");
			JMenuItem pj6 = new JMenuItem("공유 옵션");
			JMenuItem pj7 = new JMenuItem("닫기");
			
			menuProject.add(pj1);
			menuProject.add(pj2);
			menuProject.add(getpj3());
			menuProject.add(new JSeparator());
			menuProject.add(pj4);
			menuProject.add(pj5);
			menuProject.add(pj6);
			menuProject.add(new JSeparator());
			menuProject.add(pj7);
		}
		return menuProject;
	}
	
	public JMenu getMenuPage() {
		if (menuPage == null) {
			menuPage = new JMenu("페이지");
			
			JMenuItem p1 = new JMenuItem("새 페이지 삽입");
			JMenuItem p2 = new JMenuItem("모두 저장하기");
			JMenuItem p3 = new JMenuItem("페이지 복제");
			JMenuItem p4 = new JMenuItem("페이지 삭제");
			JMenuItem p5 = new JMenuItem("페이지 이름 바꾸기");
			JMenuItem p6 = new JMenuItem("페이지 내려받기");
			JMenuItem p7 = new JMenuItem("전체페이지 내려받기");
			JMenuItem p8 = new JMenuItem("웹 테스트");
			
			menuPage.add(p1);
			menuPage.add(new JSeparator());
			menuPage.add(p2);
			menuPage.add(new JSeparator());
			menuPage.add(p3);
			menuPage.add(p4);
			menuPage.add(p5);
			menuPage.add(new JSeparator());
			menuPage.add(p6);
			menuPage.add(new JMenuItem("전체페이지 내려받기"));
			menuPage.add(new JSeparator());
			menuPage.add(new JMenuItem("웹 테스트"));
		}
		return menuPage;
	}

	public JMenu getpj3() {
		if (pj3 == null) {
			pj3 = new JMenu("이 프로젝트를 삭제");
			
			pj3.add(getpj31());
		}
		return pj3;
	}
	public JMenuItem getpj31() {
		if(pj31 == null) {
			pj31 = new JMenuItem("이 프로젝트를 삭제");
		}
		return pj31;
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JMenuExample jFrame = new JMenuExample();
				jFrame.setVisible(true);
			}
		});
	}
}	
