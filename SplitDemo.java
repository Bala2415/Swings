import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.EmptyBorder;


public class SplitDemo extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JSplitPane sp; 
	private JButton btn;
	private JLabel lbl;
	private ImageIcon ii1, ii2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SplitDemo frame = new SplitDemo();
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
	public SplitDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		btn = new JButton("Desert");
		btn.addActionListener(this);
		
		ii1 = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\ZA-wp1.jpg");
		ii2 = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\ZA-wp3.jpg");
		
		lbl = new JLabel();
		lbl.setIcon(ii1);
		
		sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, btn, lbl);
		sp.setDividerLocation(200);
		contentPane.add("Center", sp);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equalsIgnoreCase("Desert"))
		{
			lbl.setIcon(ii2);
			btn.setText("Elephant");
		}
		else
		{
			lbl.setIcon(ii1);
			btn.setText("Desert");
		}
	}

}
