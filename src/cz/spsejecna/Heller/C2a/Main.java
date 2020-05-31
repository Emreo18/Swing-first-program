package cz.spsejecna.Heller.C2a;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		
		JTextArea area = new JTextArea("Welcome in my program" + "\n" + "This program is only for fun");
		Font font = new Font("Historia Demo", Font.BOLD, 20);
        area.setFont(font);
		area.setForeground(Color.BLACK);
		area.setBounds(10, 30, 200, 200);
		JFrame f = new JFrame("Prográmek");
		JMenuBar mb = new JMenuBar();
		f.setJMenuBar(mb);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(800, 500);
		f.setVisible(true);
		f.add(area);
		f.setLocationRelativeTo(null);
 
		// States menu
		JMenu menu, CzechMenu, GermanyMenu, PolandMenu, SlovakiaMenu, AustriaMenu, HelpMenu;
		JMenuItem infoCZ, infoGE, infoPL, infoSK, infoAUT;
		menu = new JMenu("States");
		mb.add(menu);

		CzechMenu = new JMenu("Czech republic");
		GermanyMenu = new JMenu("Germany");
		PolandMenu = new JMenu("Poland");
		SlovakiaMenu = new JMenu("Slovakia");
		AustriaMenu = new JMenu("Austria");
		infoCZ = new JMenuItem("about Czech republic");
		infoGE = new JMenuItem("about Germany");
		infoPL = new JMenuItem("about Poland");
		infoSK = new JMenuItem("about Slovakia");
		infoAUT = new JMenuItem("about Austria");
		CzechMenu.add(infoCZ);
		GermanyMenu.add(infoGE);
		PolandMenu.add(infoPL);
		SlovakiaMenu.add(infoSK);
		AustriaMenu.add(infoAUT);
		menu.add(CzechMenu);
		menu.add(GermanyMenu);
		menu.add(PolandMenu);
		menu.add(SlovakiaMenu);
		menu.add(AustriaMenu);

		// states actions
		infoCZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				area.setText("Capital : Praha" + "\n" + "Population : 10,65 milion " + "\n" + "President : Miloš Zeman "
						+ "\n" + "Area : 78 865 km²");
			}
		});

		infoGE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				area.setText("Capital : Berlin" + "\n" + "Population : 83,02 milion " + "\n"
						+ "President : Frank-Walter Steinmeier " + "\n" + "Area : 357 023 km²");
			}
		});
		infoPL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				area.setText("Capital : Varsava" + "\n" + "Population : ‎38,43 milion " + "\n"
						+ "President : Andrzej Duda " + "\n" + "Area : 312 679 km²");
			}
		});
		infoSK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				area.setText("Capital : Bratislava" + "\n" + "Population : ‎5,45 milion " + "\n"
						+ "President : Zuzana Čaputová " + "\n" + "Area : 49 035 km²");
			}
		});

		infoAUT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				area.setText("Capital : Vienna" + "\n" + "Population : 8,86 milion " + "\n"
						+ "President : 	Alexander Van der Bellen " + "\n" + "Area : 83 878,99 km²");
			}
		});
	  
		// About menu + help
		
		JMenu about = new JMenu("About");
		mb.add(about);
        //help
		HelpMenu = new JMenu("Help");
		JMenuItem AboutProgram = new JMenuItem("About program");
		HelpMenu.add(AboutProgram);
		about.add(HelpMenu);
		
		AboutProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				area.setText("- This program has been written by Erik Heller from C2a class" + "\n" + "- Program serves as a tool for everything" + "\n"  + " -Serves as amusement");
			}
		});
		//contact 
		JMenuItem contact = new JMenuItem("Contact developer");
		HelpMenu.add(contact);
		
		contact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				area.setText("Name: Erik" + "\n" + "Last name : Heller" + "\n" + "Phone number : 111 222 333" + "\n" + "Email : emreo@seznam.cz"); }
		});
	
		// exit
		JMenuItem exit = new JMenuItem("Exit");
		about.add(exit);

		class exitaction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}
		exit.addActionListener(new exitaction());

	}
}