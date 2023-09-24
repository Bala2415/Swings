import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;


public class ShowTable extends JFrame {

	private JPanel contentPane;
	Vector<String> cols;
	Vector<Vector> data;
	private JTable tab;
	private JTableHeader head;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowTable frame = new ShowTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}

	/**
	 * Create the frame.
	 */
	public ShowTable(Vector<Vector> root, Vector<String> cols) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		this.data = root;
		this.cols = cols;
		
		tab = new JTable(data, cols);
		tab.setRowHeight(30);
		tab.setGridColor(Color.green);
		
		head = tab.getTableHeader();
		contentPane.add("Center", tab);
		contentPane.add("North", head);
		
		System.out.println(data);
	}

}
