package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import network.WriteClass;

public class Id extends JFrame implements ActionListener {
	
	public static JTextField textF = new JTextField(8); //칸 수
	JButton btn;
	
	ClientFrame cf;
	WriteClass wc;
	
	public Id(ClientFrame cf, WriteClass wc) {
		this.cf = cf;
		this.wc = wc;
		
		setTitle("대화명 window");;
		setLayout(null);
		
		JLabel label = new JLabel("chating name");
		label.setBounds(50, 30, 1200, 60);
		add(label);
		
		
		textF.setBounds(30, 100, 200, 60);
		add(textF);
		
		btn =  new JButton("등록");
		btn.setBounds(50, 110, 120, 30);
		btn.addActionListener(this);
		add(btn);
		
		btn.setBounds(200, 200, 300, 250);
		btn.setBackground(Color.green);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		// ClientFrame을 시각화
		cf.setVisible(true);
		
		// 현재 창은 close
		this.dispose();
		

	}

}
