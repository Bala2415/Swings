import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JToggleButton;


public class ToggleDemo extends JFrame implements ActionListener {

	private JPanel contentPane;
	JToggleButton tglbtnB, tglbtnI;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToggleDemo frame = new ToggleDemo();
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
	public ToggleDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		lbl = new JLabel("All the best!!!");
		lbl.setBounds(183, 45, 151, 14);
		contentPane.add(lbl);
		
		tglbtnB = new JToggleButton("BOLD");
		tglbtnB.setBounds(64, 97, 121, 23);
		contentPane.add(tglbtnB);
		tglbtnB.addActionListener(this);
		
		tglbtnI = new JToggleButton("ITALIC");
		tglbtnI.setBounds(245, 97, 121, 23);
		contentPane.add(tglbtnI);
		tglbtnI.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(tglbtnB.getModel().isSelected() && tglbtnI.getModel().isSelected())
			lbl.setFont(new Font(lbl.getFont().getName(), Font.BOLD+Font.ITALIC, lbl.getFont().getSize()));
		else if(tglbtnB.getModel().isSelected())
			lbl.setFont(new Font(lbl.getFont().getName(), Font.BOLD, lbl.getFont().getSize()));
		else if(tglbtnI.getModel().isSelected())
			lbl.setFont(new Font(lbl.getFont().getName(), Font.ITALIC, lbl.getFont().getSize()));
		else
			lbl.setFont(new Font(lbl.getFont().getName(), Font.PLAIN, lbl.getFont().getSize()));
	}
}
