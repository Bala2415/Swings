import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


class Add extends JPanel implements ActionListener
{
	private JButton btnAdd;
	private JTextField txtA, txtB;
	private JLabel lbl;
	
	Add()
	{
		setLayout(null);
		txtA = new JTextField();
		txtB = new JTextField();
		txtA.setBounds(50, 50, 100, 50);
		txtB.setBounds(200,  50, 100, 50);
		add(txtA);
		add(txtB);
		btnAdd = new JButton("Add");
		btnAdd.setBounds(50, 300, 100, 50);
		btnAdd.addActionListener(this);
		add(btnAdd);
		lbl = new JLabel();
		lbl.setBounds(50, 400, 100, 50);
		add(lbl);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Integer x = Integer.parseInt(txtA.getText());
		Integer y = Integer.parseInt(txtB.getText());
		Integer z = x+y;
		lbl.setText(z.toString());
	}
	
	
}
public class TabbedPaneDemo extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tab;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabbedPaneDemo frame = new TabbedPaneDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TabbedPaneDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tab = new JTabbedPane();
		tab.add(new Add(),"Addition");
		
		contentPane.add(tab, "Center");
	}

}
