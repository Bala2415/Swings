import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;


public class CheckboxDemo extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JCheckBox chckbxTamil, chckbxEnglish, chckbxHindi, chckbxFrench;
	private JLabel lbl;
	Integer cnt;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckboxDemo frame = new CheckboxDemo();
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
	public CheckboxDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		chckbxTamil = new JCheckBox("Tamil");
		chckbxTamil.setBounds(49, 54, 97, 23);
		contentPane.add(chckbxTamil);
		chckbxTamil.addActionListener(this);
		
		
		chckbxEnglish = new JCheckBox("English");
		chckbxEnglish.setBounds(49, 106, 97, 23);
		contentPane.add(chckbxEnglish);
		chckbxEnglish.addActionListener(this);
		chckbxHindi = new JCheckBox("Hindi");
		chckbxHindi.setBounds(49, 153, 97, 23);
		contentPane.add(chckbxHindi);
		chckbxHindi.addActionListener(this);
		
		chckbxFrench = new JCheckBox("French");
		chckbxFrench.setBounds(49, 207, 97, 23);
		contentPane.add(chckbxFrench);
		chckbxFrench.addActionListener(this);
		
		lbl = new JLabel("");
		lbl.setBounds(243, 211, 46, 14);
		contentPane.add(lbl);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		cnt=0;
		if(chckbxEnglish.getModel().isSelected())
		{
			cnt++;
		}
		if(chckbxTamil.getModel().isSelected())
		{
			cnt++;
		}
		if(chckbxHindi.getModel().isSelected())
		{
			cnt++;
		}
		if(chckbxFrench.getModel().isSelected())
		{
			cnt++;
		}
		lbl.setText(cnt.toString());
	}
}
