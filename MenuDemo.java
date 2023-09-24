import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;


public class MenuDemo extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuItem mntmNew, mntmOpen, mntmSave;
	private JTextArea ta;
	private JFileChooser fc;
	private JColorChooser cc;
	private JMenu mnEdit;
	private JMenuItem mntmCut;
	private JMenuItem mntmCopy;
	private JMenuItem mntmPaste;
	private JMenu mnFormat;
	private JMenu mnFont;
	private JMenuItem mntmArial;
	private JMenuItem mntmCourierNew;
	private JMenu mnColour;
	private JMenuItem mntmBackground;
	private JMenuItem mntmForeground;
	private JMenuItem mntmExit;
	private JToolBar tbar;
	private JButton btnNew;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuDemo frame = new MenuDemo();
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
	public MenuDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);
		mntmNew.addActionListener(this);
		
		mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);
		mntmOpen.addActionListener(this);
		
		mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		mntmExit.addActionListener(this);
		mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		mntmCut = new JMenuItem("Cut");
		mnEdit.add(mntmCut);
		mntmCut.addActionListener(this);
		
		mntmCopy = new JMenuItem("Copy");
		mnEdit.add(mntmCopy);
		mntmCopy.addActionListener(this);
		
		mntmPaste = new JMenuItem("Paste");
		mnEdit.add(mntmPaste);
		
		mnFormat = new JMenu("Format");
		menuBar.add(mnFormat);
		
		mnFont = new JMenu("Font");
		mnFormat.add(mnFont);
		
		mntmArial = new JMenuItem("Arial");
		mnFont.add(mntmArial);
		mntmArial.addActionListener(this);
		
		mntmCourierNew = new JMenuItem("Courier New");
		mnFont.add(mntmCourierNew);
		
		mnColour = new JMenu("Colour");
		mnFormat.add(mnColour);
		
		mntmBackground = new JMenuItem("BackGround");
		mnColour.add(mntmBackground);
		mntmBackground.addActionListener(this);
		mntmForeground = new JMenuItem("ForeGround");
		mnColour.add(mntmForeground);
		mntmForeground.addActionListener(this);
		mntmCourierNew.addActionListener(this);
		mntmSave.addActionListener(this);
		mntmPaste.addActionListener(this);
		contentPane.setLayout(null);
		
		ta = new JTextArea();
		ta.setBounds(5, 21, 424, 215);
		contentPane.add(ta);
		
		fc = new JFileChooser();
		cc = new JColorChooser();
		setTitle("Untitled.txt");
		
		tbar = new JToolBar();
		
		btnNew = new JButton("Add");
		btnNew.addActionListener(this);
		tbar.add(btnNew);
		contentPane.add(tbar, "North");
	}

	@Override
	public void actionPerformed(ActionEvent e){
		// TODO Auto-generated method stub
		if(mntmNew.isArmed())
		{
			ta.setText("");
			setTitle("'Untitled.txt");
		}
		if(mntmOpen.isArmed())
		{
			int opt = fc.showOpenDialog(this);
			if(opt == JFileChooser.APPROVE_OPTION)
			{
				
				try
				{
				String fname = fc.getSelectedFile().toString();
				FileInputStream fout = new FileInputStream(fname);
				int ch;
				String str="";
				while((ch = fout.read())!=-1)
						{
						str = str+(char)ch;
						}
				ta.setText(str);
				fout.close();
				setTitle(fname);
				}
				catch(FileNotFoundException ee)
				{
					System.out.println(ee);
				}
				catch(IOException ee)
				{
					System.out.println(ee);
				}
				
				
			}
		}
		if(mntmSave.isArmed())
		{
			int opt = fc.showSaveDialog(this);
			if(opt == JFileChooser.APPROVE_OPTION)
			{
				
				try
				{
				String fname = fc.getSelectedFile().toString();
				FileWriter fout = new FileWriter(fname);
				int ch;
				String str=ta.getText();
				fout.write(str);
				fout.close();
				setTitle(fname);
				}
				catch(FileNotFoundException ee)
				{
					System.out.println(ee);
				}
				catch(IOException ee)
				{
					System.out.println(ee);
				}
				
				
			}
		}
		if(mntmExit.isArmed())
		{
			System.exit(0);
		}
		if(mntmCut.isArmed())
		{
			ta.cut();
		}
		if(mntmCopy.isArmed())
		{
			ta.copy();
		}
		if(mntmPaste.isArmed())
		{
			ta.paste();
		}
		if(mntmArial.isArmed())
		{
			
			ta.setFont(new Font("Arial",ta.getFont().getStyle(), ta.getFont().getSize()));
		}
		if(mntmCourierNew.isArmed())
		{
			
			ta.setFont(new Font("Courier New",ta.getFont().getStyle(), ta.getFont().getSize()));
		}
		if(mntmBackground.isArmed())
		{
			Color col = ta.getBackground();
			ta.setBackground( cc.showDialog(this,"Select Background Color", col));
		}
		if(mntmForeground.isArmed())
		{
			Color col = ta.getForeground();
			ta.setForeground( cc.showDialog(this,"Select Foreground Color", col));
		}
		if(e.getSource()==btnNew)
		{
			ta.setText("");
			setTitle("Untitled.txt");
		}
	}
}
