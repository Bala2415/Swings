import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;


public class RadioDemo extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JRadioButton rdbtnMale, rdbtnFemale;
	private JLabel lbl;
	private ButtonGroup bg;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioDemo frame = new RadioDemo();
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
	public RadioDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(54, 73, 109, 23);
		contentPane.add(rdbtnMale);
		rdbtnMale.addActionListener(this);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(208, 73, 109, 23);
		contentPane.add(rdbtnFemale);
		rdbtnFemale.addActionListener(this);
		
		bg = new ButtonGroup();
		bg.add(rdbtnFemale);
		bg.add(rdbtnMale);
		
		lbl = new JLabel("");
		lbl.setBounds(54, 146, 247, 14);
		contentPane.add(lbl);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equalsIgnoreCase("male"))
		{
			lbl.setText("Welcome Sir!!");
		}
		else
		{
			lbl.setText("Welcome Mam!!");
		}
	}
}
