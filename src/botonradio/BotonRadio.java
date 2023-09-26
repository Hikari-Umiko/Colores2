package botonradio;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class BotonRadio {

	private JFrame frmRadioboton;
	private JLabel lblColor;
	private JRadioButton radRojo;
	private JRadioButton radVerde;
	private JRadioButton radAzul;
	private JRadioButton radMagenta;
	private JRadioButton radCian;
	private JRadioButton radRosa;
	private JRadioButton radNegro;
	private JRadioButton radAmarillo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonRadio window = new BotonRadio();
					window.frmRadioboton.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BotonRadio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRadioboton = new JFrame();
		frmRadioboton.setTitle("RadioBoton");
		frmRadioboton.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Downloads\\logo.png"));
		frmRadioboton.setBounds(100, 100, 444, 389);
		frmRadioboton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRadioboton.setLocationRelativeTo(null);
		frmRadioboton.getContentPane().setLayout(null);
		
		lblColor = new JLabel((String) null);
		lblColor.setOpaque(true);
		lblColor.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblColor.setBounds(169, 83, 208, 193);
		frmRadioboton.getContentPane().add(lblColor);
		
		radRojo = new JRadioButton("Rojo");
		radRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.red);
			}
		});
		radRojo.setFont(new Font("Tahoma", Font.BOLD, 18));
		radRojo.setBounds(17, 34, 109, 23);
		frmRadioboton.getContentPane().add(radRojo);
		
		radVerde = new JRadioButton("Verde");
		radVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.green);
			}
		});
		radVerde.setFont(new Font("Tahoma", Font.BOLD, 18));
		radVerde.setBounds(17, 66, 109, 23);
		frmRadioboton.getContentPane().add(radVerde);
		
		radAzul = new JRadioButton("Azul");
		radAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.blue);
			}
		});
		radAzul.setFont(new Font("Tahoma", Font.BOLD, 18));
		radAzul.setBounds(17, 97, 109, 23);
		frmRadioboton.getContentPane().add(radAzul);
		
		radMagenta = new JRadioButton("Magenta");
		radMagenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.magenta);
			}
		});
		radMagenta.setFont(new Font("Tahoma", Font.BOLD, 18));
		radMagenta.setBounds(17, 159, 109, 23);
		frmRadioboton.getContentPane().add(radMagenta);
		
		radCian = new JRadioButton("Cian");
		radCian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.cyan);
			}
		});
		radCian.setFont(new Font("Tahoma", Font.BOLD, 18));
		radCian.setBounds(17, 198, 109, 23);
		frmRadioboton.getContentPane().add(radCian);
		
		radRosa = new JRadioButton("Rosa");
		radRosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.pink);
			}
		});
		radRosa.setFont(new Font("Tahoma", Font.BOLD, 18));
		radRosa.setBounds(17, 236, 109, 23);
		frmRadioboton.getContentPane().add(radRosa);
		
		radNegro = new JRadioButton("Negro");
		radNegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.black);
			}
		});
		radNegro.setFont(new Font("Tahoma", Font.BOLD, 18));
		radNegro.setBounds(17, 273, 109, 23);
		frmRadioboton.getContentPane().add(radNegro);
		
		radAmarillo = new JRadioButton("Amarillo");
		radAmarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.yellow);
			}
		});
		radAmarillo.setFont(new Font("Tahoma", Font.BOLD, 18));
		radAmarillo.setBounds(17, 305, 109, 23);
		frmRadioboton.getContentPane().add(radAmarillo);
		
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(radAzul);
		grupo.add(radVerde);
		grupo.add(radRojo);
		grupo.add(radMagenta);
		grupo.add(radCian);
		grupo.add(radRosa);
		grupo.add(radNegro);
		grupo.add(radAmarillo);
	}
}
