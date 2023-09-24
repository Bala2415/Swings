import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;


public class MouseDemo extends JFrame implements MouseMotionListener, MouseListener{

	private JPanel contentPane;
	private JLabel lbl1, lbl2;
	private ImageIcon ii;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseDemo frame = new MouseDemo();
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
	public MouseDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);
		
		ii = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\US-wp5.jpg");
		lbl1 = new JLabel(ii);
		contentPane.add(lbl1, BorderLayout.CENTER);
		lbl1.addMouseMotionListener(this);
		lbl1.addMouseListener(this);
		
		lbl2 = new JLabel();
		contentPane.add(lbl2, "North");
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//lbl2.setText("Roaming in US");
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==lbl1)
		{
		if(arg0.getButton()==1)
		{
			lbl2.setText("Do You Like It??");
		}
		if(arg0.getButton()==3)
		{
			lbl2.setText("Welcome!!");
		}
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		lbl2.setText("Welcome To US");
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		lbl2.setText("Thank You!  Visit Again!!");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
