import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;


public class CreateTableDemo extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtCno;
	private JButton btnAddRow, btnCreate;
	
	Vector<String> row;
	Vector<Vector> data = new Vector<Vector>();
	Vector<String> cols = new Vector<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateTableDemo frame = new CreateTableDemo();
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
	public CreateTableDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		txtName = new JTextField();
		txtName.setBounds(207, 37, 167, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(207, 88, 167, 20);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtCno = new JTextField();
		txtCno.setBounds(207, 145, 167, 20);
		contentPane.add(txtCno);
		txtCno.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(37, 40, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(37, 91, 46, 14);
		contentPane.add(lblAddress);
		
		JLabel lblCno = new JLabel("Contact No.");
		lblCno.setBounds(37, 148, 89, 14);
		contentPane.add(lblCno);
		
		btnAddRow = new JButton("Add Row");
		btnAddRow.setBounds(207, 199, 89, 23);
		contentPane.add(btnAddRow);
	
		
		btnCreate = new JButton("Create Table");
		btnCreate.setBounds(306, 199, 118, 23);
		contentPane.add(btnCreate);
	
		btnAddRow.addActionListener(this);
		btnCreate.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnAddRow)
		{
			row = new Vector<String>();
			row.add(txtName.getText());
			row.add(txtAddress.getText());
			row.add(txtCno.getText());
			data.add(row);
			txtName.setText("");
			txtAddress.setText("");
			txtCno.setText("");
			System.out.println(row);
		}
		if(e.getSource()==btnCreate)
		{
			System.out.println(data);
			cols.add("Name");
			cols.add("Address");
			cols.add("Contact No.");
			ShowTable  st = new ShowTable(data, cols);
			st.setVisible(true);
			st.setTitle("Amazon Company");
		}
	}
}
