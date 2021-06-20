package main;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class WindowTest extends JFrame /* implements ActionListener */ {
	JTextField textField;
	JTextArea textArea;
	
	JButton btn1, btn2;
	
	public WindowTest() {
		super("타이틀바");
		
		/*
		 	Panel
		 	window 위에 window
		 	
		 	TextField, TextArea
		 
		 */
		
		JPanel panel = new JPanel();
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);	//텍스트창에서 자동줄바꿈 기능을 쓸수 있도록 만들어주는 메소드
		
		JScrollPane scrPane = new JScrollPane(textArea);
		scrPane.setPreferredSize(new Dimension(400, 300));	//scrPane 치수
		panel.add(scrPane);	//패널을 스크롤 추가한 scrPane으로 만듬.
		
		JPanel botpan = new JPanel();	//또다른 panel. textField와 btn1,2가 들어갈 하나의 panel.
		
		textField = new JTextField(30);
		
		btn1 = new JButton("next insert");
		//btn1.addActionListener(this); //위에 액션리스너를 추가했을때
		btn1.addActionListener(new ActionListener() { //ActionListener를 위에 추가 안하고 여기에 직접 추가
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("next insert");	
				
				String msg = textField.getText() + "\n";
				textArea.append(msg);	//textArea에 추가
				
			}
		});
		
		btn2 = new JButton("prev insert");
		//btn2.addActionListener(this);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String msg = textField.getText() + "\n";
				
				try {
					textArea.insert(msg, textArea.getLineStartOffset(0));
				} catch (BadLocationException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		botpan.add(textField);
		botpan.add(btn1);
		botpan.add(btn2);
		
		Container contentPane = getContentPane();	//두 패널을 컨테이너에 넣어줘 한 window에 나타내지도록 함
		
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(botpan, BorderLayout.SOUTH);
		
		setBounds(100, 100, 640, 480);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
/*
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		String btnlabel = btn.getLabel();
		
		if(btnlabel.equals("next insert")) {
			System.out.println("next insert");
		}else if(btnlabel.equals("prev insert")) {
			System.out.println("prev insert");
		}
	}
*/
}
