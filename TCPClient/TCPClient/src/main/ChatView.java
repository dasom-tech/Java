package main;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ChatView extends Frame implements WindowListener, ActionListener{
	
	Button button;
	
	TextArea textarea;
	TextField textfield;
	
	public ChatView() {
		
		setTitle("채팅창");
		
		Panel panel = new Panel();
		
		textarea = new TextArea();
		panel.add(textarea);
		
		Panel botpan = new Panel();
		
		textfield = new TextField(30);
		
		button = new Button("전송");
		button.addActionListener(this);
		
		botpan.add(textfield);
		botpan.add(button);
		
		Container contentPane = null;	//두 패널을 컨테이너에 넣어줘 한 window에 나타내지도록 함
		
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(botpan, BorderLayout.SOUTH);
		
		setBounds(100, 100, 640, 480);
		setVisible(true);
		
		addWindowListener(this);		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = textfield.getText() + "\n";
		textarea.append(msg);
		
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
