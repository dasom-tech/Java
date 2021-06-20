package main;

import java.awt.Color;

import javax.swing.JFrame;

public class WindowTestSwing extends JFrame{
	
	public WindowTestSwing() {
		
		setSize(1024, 768);
		setLocation(0, 0);
		setVisible(true);
		setBackground(Color.blue);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우즈리스너 작업 안 해줘도 창 닫힘
	}

}
