package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import network.WriteClass;

public class ClientFrame extends JFrame implements ActionListener {
	
	public Socket socket;
	
	public JTextField textF = new JTextField(14);
	public JTextArea textA = new JTextArea();
	
	JButton btnTransfer = new JButton("send");
	JButton btnExit = new JButton("exit");
	
	JPanel panel = new JPanel();
	
	// 서버로 처음 전송인지?
	public boolean isFirst = true;
	
	WriteClass wc;	// 전송 클래스
	
	public ClientFrame(Socket socket) {
		super("chatting");
		
		this.socket = socket;
		
		wc = new WriteClass(this);
		
		new Id(this, wc);
		
		JScrollPane scrPane = new JScrollPane(textA);
		scrPane.setPreferredSize(new Dimension(200,120));
		add("Center", scrPane);
		
		panel.add(textF);
		panel.add(btnTransfer);
		panel.add(btnExit);
		
		add("South", panel);
		
		btnTransfer.addActionListener(this);
		btnExit.addActionListener(this);
		
		setBounds(200, 200, 450, 600);
		setVisible(false);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

	}

}
