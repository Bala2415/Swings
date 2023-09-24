import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;


public class TreeDemo extends JFrame implements TreeSelectionListener{

	private JPanel contentPane;
	private JTree t;
	private DefaultMutableTreeNode node, root; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TreeDemo frame = new TreeDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static void createSub(File sub, DefaultMutableTreeNode nodee)
	{
		String x[] = sub.list();
		for(String y: x)
		{
			File f = new File(y);
			DefaultMutableTreeNode node = new DefaultMutableTreeNode(f);
			nodee.add(node);
			File fc = new File(f.getAbsolutePath().toString());
			if(fc.isDirectory())
			{
				TreeDemo.createSub(fc, node);
			}
			
		
		
		}
	}

	/**
	 * Create the frame.
	 */
	public TreeDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		root = new DefaultMutableTreeNode("C:\\Users\\User\\Desktop\\bala\\swings");
		File f = new File("C:\\Users\\User\\Desktop\\bala\\swings");
		if(f.exists())
		{
			String content[] = f.list();
			for(String con : content)
			{
				File sub =  new File(con);
				node = new DefaultMutableTreeNode(con);
				root.add(node);
				String name = sub.getAbsolutePath().toString();
				File cf = new File(name);
				System.out.println(sub.getAbsolutePath().toString());
				if(cf.isDirectory())
				{
					TreeDemo.createSub(cf,node);
				}
				
				}
		}
		t = new JTree(root);
		contentPane.add("Center", t);
		t.addTreeSelectionListener(this);
	}

	@Override
	public void valueChanged(TreeSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
