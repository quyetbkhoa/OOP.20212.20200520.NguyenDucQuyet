package hust.soict.dsai.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class LookAndFeelDemo extends JFrame {
	boolean check1=true;
	boolean check2=true;
	public LookAndFeelDemo() {
		addDemoComponent();
		addLookAndFeelComboBox();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(380,120);
		setVisible(true);
	}
	void addDemoComponent() {
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new JLabel("Label:"));
		cp.add(new JTextField("Text field"));
		cp.add(new JRadioButton("Radio button"));
		cp.add(new JButton("Buttonnn"));
	}
	void addLookAndFeelComboBox() {
		Container cp= getContentPane();
		cp.add(new JLabel("Change Look and Feel here"));
//		create combo box
		
		LookAndFeelInfo[] lafInfos = UIManager.getInstalledLookAndFeels();
		int le = lafInfos.length;
		
		for (int i=0;i<lafInfos.length;i++) {
			if (lafInfos[i].getClassName()==UIManager.getCrossPlatformLookAndFeelClassName()) {
				check1= false;
			}
			if (lafInfos[i].getClassName()==UIManager.getSystemLookAndFeelClassName()) {
				check2=false;
			}
		}
		if (check1) { le+=1;}
		if (check2) { le+=1;}
		String[] lafNames = new String[le];
		for( int i=0;i<lafInfos.length;i++) {
			lafNames[i]= lafInfos[i].getName();
		}
		int index = lafInfos.length;
		if (check1) {
			lafNames[index]="Metal";
			index +=1;
		}
		if (check2) {
			lafNames[index]="System";
		}
//		String[] classname = new String[]
		JComboBox cbLookAndFeel= new JComboBox(lafNames);
		cp.add(cbLookAndFeel);
		
//		Handle change look and feel 
		JFrame frame=this;
		cbLookAndFeel.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt) {
				int index=cbLookAndFeel.getSelectedIndex();
				try {
					if (index<lafInfos.length) {
					UIManager.setLookAndFeel(lafInfos[index].getClassName()); }
					else if (check1 && index==lafInfos.length)
						UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					else if (check2 && index==lafInfos.length+1) {
						UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					}
				} catch ( Exception e ) {
					e.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(frame);
				if (index<lafInfos.length) {setTitle(lafInfos[index].getName()+ "LOok and Feel");}
				else if (index==lafInfos.length) {
					setTitle("Metal"+ "LOok and Feel");}
				else if (index==lafInfos.length+1) {
					setTitle("System"+ "LOok and Feel");}
			}
	    });
	}
	public static void main(String[] args) {
		new LookAndFeelDemo();
	}
}
