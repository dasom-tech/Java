package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuView extends JFrame implements ActionListener {
	
	JButton button[] = null;
	
	public MenuView() {
		super("menu");
		
		setLayout(null);
		
		JLabel label = new JLabel("Menu");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("바탕", Font.BOLD, 48));
		label.setBounds(200, 30, 200, 50);
		label.setBackground(Color.pink);
		add(label);
		
		String btnTitle[] = { "insert", "delete", "search", "update", "save" };
		button = new JButton[btnTitle.length];
		
		for (int i = 0; i < btnTitle.length; i++) {
			button[i] = new JButton(btnTitle[i]);
			button[i].setBounds(180, 120+60*i, 260, 50);
			button[i].addActionListener(this);
			add(button[i]);
		}
		
		setBounds(0, 0, 640, 480);
		setBackground(Color.gray);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object btn = e.getSource();
		
		if(btn == button[0]) {	//추가
			new InsertView();
			this.dispose();
		}else if(btn == button[1]) {	// 삭제
			new DeleteView();
			this.dispose();
		}else if(btn == button[2]) {	// 검색
			new SearchView();
			this.dispose();
		}else if(btn == button[3]) {	// 수정
			new UpdateView();
			this.dispose();
		}else if(btn == button[4]) {	// 저장
			new SaveView();
			this.dispose();
		}
	
	}

}
