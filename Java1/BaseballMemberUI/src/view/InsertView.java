package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import panel.BatterPanel;
import panel.PitcherPanel;

public class InsertView extends JFrame implements ActionListener {
	
	Container containerPane;
	
	JRadioButton radio1, radio2;
	ButtonGroup group;
	
	public InsertView() {
		super("insert");
		
		JLabel label = new JLabel("Insert");
		add(label);
		
		radio1 = new JRadioButton("투수");
		radio1.setSelected(true);
		radio1.setBackground(Color.green);
		radio1.addActionListener(this);
		
		radio2 = new JRadioButton("타자");
		radio2.setSelected(false);
		radio2.setBackground(Color.green);
		radio2.addActionListener(this);
		
		group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.green);
		panel.add(label);
		panel.add(radio1);
		panel.add(radio2);
		
		PitcherPanel pp = new PitcherPanel(this);
		
		containerPane = getContentPane();
		containerPane.add(panel, BorderLayout.NORTH);
		containerPane.add(pp, BorderLayout.CENTER);
		
		setBounds(0, 0, 640, 480);
		getContentPane().setBackground(Color.GREEN);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		containerPane = getContentPane();
		containerPane.remove(1);
		
		if(radio1.isSelected() == true) {
			containerPane.add(new PitcherPanel(this), BorderLayout.CENTER);
		}else {
			containerPane.add(new BatterPanel(this), BorderLayout.CENTER);
		}
		
		revalidate();
		
	}

}
