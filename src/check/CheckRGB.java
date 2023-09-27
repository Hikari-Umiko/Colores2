package check;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckRGB {

	private JFrame frmCheckrgb;
	private JCheckBox chkRojo;
	private JLabel lblColor;
	private JCheckBox chkAzul;
	private JCheckBox chkVerde;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckRGB window = new CheckRGB();
					window.frmCheckrgb.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CheckRGB() {
		initialize();
	}

	public void asignarColor() {
		int r=(chkRojo.isSelected())?255:0;
		int g=(chkVerde.isSelected())?255:0;
		int b=(chkAzul.isSelected())?255:0;
		lblColor.setBackground(new Color(r,g,b));
	}
	private void initialize() {
		frmCheckrgb = new JFrame();
		frmCheckrgb.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Downloads\\logo.png"));
		frmCheckrgb.setTitle("CheckRGB");
		frmCheckrgb.setBounds(100, 100, 460, 300);
		frmCheckrgb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckrgb.setLocationRelativeTo(null);
		frmCheckrgb.getContentPane().setLayout(null);
		
		chkRojo = new JCheckBox("Rojo");
		chkRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkRojo.setFont(new Font("Sitka Small", Font.BOLD, 17));
		chkRojo.setBounds(20, 26, 97, 23);
		frmCheckrgb.getContentPane().add(chkRojo);
		
		chkVerde = new JCheckBox("Verde");
		chkVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkVerde.setFont(new Font("Sitka Small", Font.BOLD, 16));
		chkVerde.setBounds(20, 68, 97, 23);
		frmCheckrgb.getContentPane().add(chkVerde);
		
		chkAzul = new JCheckBox("Azul");
		chkAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkAzul.setFont(new Font("Sitka Small", Font.BOLD, 16));
		chkAzul.setBounds(20, 114, 97, 23);
		frmCheckrgb.getContentPane().add(chkAzul);
		
		lblColor = new JLabel("");
		lblColor.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblColor.setOpaque(true);
		lblColor.setBounds(165, 11, 240, 214);
		frmCheckrgb.getContentPane().add(lblColor);
		
	}
}
