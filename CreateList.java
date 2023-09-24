import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;


public class CreateList extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnAdd, btnShow;
	private Vector<String> nm;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateList frame = new CreateList();
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
	public CreateList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setBounds(61, 46, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnAdd = new JButton("Add To List");
		btnAdd.setBounds(188, 45, 89, 23);
		contentPane.add(btnAdd);
		btnAdd.addActionListener(this);
		
		btnShow = new JButton("Show List");
		btnShow.setBounds(305, 45, 89, 23);
		contentPane.add(btnShow);
		btnShow.addActionListener(this);
		
		nm = new Vector<String>();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnAdd)
		{
			nm.add(textField.getText());
		}
		if(e.getSource()==btnShow)
		{
			ShowList f = new ShowList(nm);
			f.setVisible(true);
			f.setTitle("Employee List");
		}
	}

}
