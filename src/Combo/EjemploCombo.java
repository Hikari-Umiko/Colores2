package Combo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class EjemploCombo {

	private JFrame frmSoyUnConbo;
	private JLabel lblOpciones;
	private JComboBox cmbOpciones;
	private JLabel lblOpcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploCombo window = new EjemploCombo();
					window.frmSoyUnConbo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EjemploCombo() {
		initialize();
		cambiarColor();
	}

	public void cambiarColor() {
	
		String opcion=String.valueOf(cmbOpciones.getSelectedItem());
		
	}
	private void initialize() {
		frmSoyUnConbo = new JFrame();
		frmSoyUnConbo.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Downloads\\logo.png"));
		frmSoyUnConbo.setTitle("Soy un conbo");
		frmSoyUnConbo.setBounds(100, 100, 574, 367);
		frmSoyUnConbo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSoyUnConbo.getContentPane().setLayout(null);
		
		cmbOpciones = new JComboBox();
		cmbOpciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarColor();
			}
		});
		cmbOpciones.setModel(new DefaultComboBoxModel(new String[] {"Rojo", "Azul", "Verde", "Rosa", "Negro"}));
		cmbOpciones.setBounds(106, 98, 117, 38);
		frmSoyUnConbo.getContentPane().add(cmbOpciones);
		
		lblOpcion = new JLabel("Opciones");
		lblOpcion.setBounds(37, 110, 46, 14);
		frmSoyUnConbo.getContentPane().add(lblOpcion);
		
		lblOpciones = new JLabel("");
		lblOpciones.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblOpciones.setOpaque(true);
		lblOpciones.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOpciones.setBounds(106, 170, 301, 46);
		frmSoyUnConbo.getContentPane().add(lblOpciones);
		
		JSlider sldNumero = new JSlider();
		sldNumero.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				cambiarColor();
			}
		});
		sldNumero.setMinimum(1);
		sldNumero.setBounds(38, 61, 200, 26);
		frmSoyUnConbo.getContentPane().add(sldNumero);
	}
}
