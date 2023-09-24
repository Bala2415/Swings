import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JButton;


public class BordersDemo extends JFrame implements ActionListener{

	private JPanel contentPane;
	JLabel lblNewLabel;
	JButton btnBevell, btnBevelr, btnEtchedl, btnEtchedr, btnLine, btnMatte;
	ImageIcon ii;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BordersDemo frame = new BordersDemo();
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
	public BordersDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(48, 53, 449, 233);
		contentPane.add(lblNewLabel);
		
		btnEtchedl = new JButton("Etched Lowered");
		btnEtchedl.setBounds(42, 319, 89, 23);
		contentPane.add(btnEtchedl);
		btnEtchedl.addActionListener(this);
		
		btnEtchedr = new JButton("Etched Raised");
		btnEtchedr.setBounds(184, 319, 89, 23);
		contentPane.add(btnEtchedr);
		btnEtchedr.addActionListener(this);
		
		btnBevell = new JButton("Bevel Lowered");
		btnBevell.setBounds(316, 319, 89, 23);
		contentPane.add(btnBevell);
		btnBevell.addActionListener(this);
		
		btnBevelr = new JButton("Bevel Raised");
		btnBevelr.setBounds(435, 319, 89, 23);
		contentPane.add(btnBevelr);
		btnBevelr.addActionListener(this);
		
		btnLine = new JButton("Line");
		btnLine.setBounds(48, 386, 89, 23);
		contentPane.add(btnLine);
		btnLine.addActionListener(this);
		
		btnMatte = new JButton("Matte");
		btnMatte.setBounds(184, 386, 89, 23);
		contentPane.add(btnMatte);
		btnMatte.addActionListener(this);
		
		ii = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Hydrangeas.jpg");
		lblNewLabel.setIcon(ii);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnLine)
		{
			lblNewLabel.setBorder(BorderFactory.createLineBorder(Color.blue));
		}
		if(e.getSource()==btnEtchedl)
		{
			lblNewLabel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED,Color.red, Color.green));
		}
		if(e.getSource()==btnEtchedr)
		{
			lblNewLabel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED,Color.red, Color.gray));
		}
		if(e.getSource()==btnMatte)
		{
			lblNewLabel.setBorder(BorderFactory.createMatteBorder(3,4,5,6,Color.blue));
		}
	}
}
