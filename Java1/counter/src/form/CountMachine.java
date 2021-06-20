package form;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class CountMachine extends Frame implements WindowListener, ActionListener {
	
	Label label1, label2;
	Button button1, button2, button3;
	int count = 0;
	
	public CountMachine() {
		setTitle("카운터");
		setLayout(null);
		
		label1 = new Label("카운터");
		label1.setBounds(200, 100, 250, 50);
		add(label1);
		
		label2 = new Label(" " + count);
		label2.setBounds(200, 200, 250, 50);
		add(label2);
		
		button1 = new Button();
		button1.setLabel("+");
		button1.setBounds(200, 300, 100, 100);
		button1.setBackground(Color.blue);
		button1.setForeground(Color.white);
		button1.addActionListener(this);
		add(button1);
		
		button2 = new Button();
		button2.setLabel("-");
		button2.setBounds(350, 300, 100, 100);
		button2.setBackground(Color.blue);
		button2.setForeground(Color.white);
		button2.addActionListener(this);
		add(button2);
		
		button3 = new Button();
		button3.setLabel("reset");
		button3.setBounds(200, 450, 250, 150);
		button3.setBackground(Color.blue);
		button3.setForeground(Color.white);
		button3.addActionListener(this);
		add(button3);
		
		setBounds(100, 100, 640, 700);
		setVisible(true);
		setBackground(Color.blue);
		
		addWindowListener(this);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button)e.getSource();
		String btnTitle = btn.getLabel();
		
		if(btnTitle.equals("+")) {
			count++;
		}else if(btnTitle.equals("-")) {
			count--;
		}else if(btnTitle.equals("reset")) {
			count = 0;
		}
		label2.setText(count + " ");	
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	

}
