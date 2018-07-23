import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.JTree.*;
import javax.swing.tree.TreeSelectionModel;

public class MyJTree extends JFrame implements ActionListener {

	JTree tree;
	
	MyJTree(){
		
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("this NOde");
		DefaultMutableTreeNode book = null;
		DefaultMutableTreeNode category = null;
	
	
		category = new DefaultMutableTreeNode("this is my test");
		top.add(category);
		
		
		book = new DefaultMutableTreeNode("this is my book bitches");
		category.add(book);
		
		category = new DefaultMutableTreeNode("hello bitches");
		top.add(category);
		
		book = new DefaultMutableTreeNode("Porn stache");
		category.add(book);
		
		tree = new JTree(top);
		
		
		
		
		
		setVisible(true);
	}
	
	
	
	
	public void actionPerformed(ActionEvent ae){
		
	}
	
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(() -> {
			new MyJTree();
		});
	}
	
}
