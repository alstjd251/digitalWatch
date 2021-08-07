package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class labelSet extends JFrame {
	JLabel hms = new JLabel();
	JMenuBar mb = new JMenuBar();
	JMenu country = new JMenu("country");
	JMenuItem us = new JMenuItem("미국 - LA");
	JMenuItem ch = new JMenuItem("중국");
	JMenuItem ko = new JMenuItem("한국");
	getTime gt = new getTime();

	String g = new String();
	labelSet() {
		us.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (gt.str.equals("AM")) {
					hms.setText(gt.watch);
				}
				else if (gt.str.equals("PM")) {
					hms.setText(gt.watch);
				}
				g = "us";
			}
		});

		ch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (gt.str.equals("AM")) {
					hms.setText(gt.watch);
				}
				else if (gt.str.equals("PM")) {
					hms.setText(gt.watch);
				}
				g = "ch";
			}
		});

		ko.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hms.setText(gt.watch);
				g = "ko";
			}
		});
	}

	public void setting() {
		setTitle("ClockTest");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void label() {
		Font font = new Font("digital-7", Font.BOLD, 40);
		hms.setOpaque(true);
		hms.setBounds(85, 100, 300, 50);
		hms.setFont(font);

		if ((gt.str.equals("PM") && gt.hour >= 6) || (gt.str.equals("AM") && gt.hour < 6)) {
			hms.setBackground(Color.black);
			hms.setForeground(Color.white);
			
		}
		else if ((gt.str.equals("AM") && gt.hour >= 6) || (gt.str.equals("PM") && gt.hour < 6)) {
			hms.setBackground(Color.white);
			hms.setForeground(Color.black);
			
		}
		
		add(hms);
		mb.add(country);
		country.add(us);
		country.add(ch);
		country.add(ko);
		add(mb);
		setJMenuBar(mb);
		setVisible(true);
	}
}
