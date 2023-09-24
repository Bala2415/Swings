import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;


public class KeyDemo extends JFrame implements KeyListener, ActionListener{

	private JPanel contentPane;
	private JTextField txt;
	private JLabel lbl;
	private JButton btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyDemo frame = new KeyDemo();
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
	public KeyDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		txt = new JTextField();
		txt.setBounds(41, 37, 170, 20);
		contentPane.add(txt);
		txt.setColumns(10);
		txt.addKeyListener(this);
		
		lbl = new JLabel("");
		lbl.setBounds(266, 40, 105, 17);
		contentPane.add(lbl);
		
		btn = new JButton("Refresh");
		btn.setBounds(41, 87, 89, 23);
		contentPane.add(btn);
		btn.addActionListener(this);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		/*
		Character  x = arg0.getKeyChar();
		Integer y = arg0.getKeyCode();
		lbl.setText(x.toString()+ "  " + y.toString());
		*/
		int x=arg0.getKeyCode();
		if(!(x>=60 && x<=90 || x==32 || x==46 || x==8))
		{
			lbl.setText("InvalidInput");
			txt.setEnabled(false);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		txt.setEnabled(true);
		txt.setText("");
		lbl.setText("");
	}
}
