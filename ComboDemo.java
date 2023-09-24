import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;


public class ComboDemo extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JComboBox comboBox;
	JButton btnAdd, btnRemove;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboDemo frame = new ComboDemo();
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
	public ComboDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		comboBox = new JComboBox();
		comboBox.setBounds(255, 45, 111, 20);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(10, 45, 124, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnAdd = new JButton("Add");
		btnAdd.setBounds(154, 44, 89, 23);
		contentPane.add(btnAdd);
		btnAdd.addActionListener(this);
		
		btnRemove = new JButton("Remove");
		btnRemove.setBounds(154, 92, 89, 23);
		contentPane.add(btnRemove);
		btnRemove.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnAdd)
		{
			comboBox.addItem(textField.getText());
			textField.setText("");
		}
		if(e.getSource()==btnRemove)
		{
			comboBox.removeItem(comboBox.getSelectedItem());
		}
	}
}
