package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener {
	
	public WindowTest() {
		
		//setLayout(new FlowLayout()); //일렬로 정렬
		//setLayout(new GridLayout(3, 1)); // 화면 자체를 꽉 차게 나눔
		setLayout(null); // 만든 크기, 위치대로 나뉨
		
		// Label
		Label label = new Label();
		label.setText("Label");
		label.setBackground(Color.pink);
		label.setBounds(150, 30, 50, 30);
		add(label);
		
		Label label1 = new Label("레이블 입니다.");
		label1.setBackground(Color.DARK_GRAY);
		label1.setBounds(150, 80, 100, 30);
		add(label1);
		
		Button button = new Button();
		button.setLabel("버튼");
		button.setBounds(150, 150, 100, 30);
		add(button);
		
//		setSize(640, 480);
//		setLocation(100, 100);
		setBounds(100, 100, 800, 600);
		setVisible(true);
		
		addWindowListener(this); // x 누르면 화면 꺼지도록 늘 듣고있도록.

	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

}
