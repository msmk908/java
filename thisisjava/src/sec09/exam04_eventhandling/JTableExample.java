package sec09.exam04_eventhandling;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.TableModel;

public class JTableExample extends JFrame {
	private JTable jTable;
	private JPanel pSouth;
	private JTextField txtInfo;
	private Object[][] rowData;

	public JTableExample() {
		this.setTitle("JTableExample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(new JScrollPane(getJTable()), BorderLayout.CENTER);
		this.getContentPane().add(getPSouth(), BorderLayout.SOUTH);
		this.setSize(200, 230);
	}

	public JTable getJTable() {
		if (jTable == null) {
			String[] columnNames = new String[] { "이름", "나이" };
			rowData = new Object[][] { { "춘삼월", 25 }, { "하여름", 23 }, { "추가을", 22 }, { "동겨울", 27 } };
			jTable = new JTable(rowData, columnNames);

			jTable.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					int rowIndex = jTable.getSelectedRow();
					int columnIndex = jTable.getSelectedColumn();
					if (rowIndex != -1 && columnIndex != -1) {
						TableModel tableModel = jTable.getModel();
						Object selectedValue = tableModel.getValueAt(rowIndex, columnIndex);
						txtInfo.setText(String.valueOf(selectedValue));
					}
				}
			});
		}
		return jTable;
	}

	public JPanel getPSouth() {
		if (pSouth == null) {
			pSouth = new JPanel();
			pSouth.setLayout(new GridLayout(2, 2));
			pSouth.add(new JLabel("[선택한 셀 정보]"));
			pSouth.add(new JLabel(""));
			pSouth.add(new JLabel("셀 값", JLabel.CENTER));
			pSouth.add(getTxtInfo());

		}
		return pSouth;
	}

	public JTextField getTxtInfo() {
		if (txtInfo == null) {
			txtInfo = new JTextField();
			txtInfo.setEditable(false);
		}
		return txtInfo;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JTableExample jFrame = new JTableExample();
				jFrame.setVisible(true);
			}
		});
	}
}
