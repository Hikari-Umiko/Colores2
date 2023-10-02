package Combo;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SwingConstants;



public class EjemploCombo{

	private JFrame frmColores;
	private String color;
	private JComboBox cmbOpciones;
	private JLabel lblOpciones;
	private JLabel lblOpcion;
	private JSlider sldNumero;
	private JLabel lblNumero;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploCombo window = new EjemploCombo();
					window.frmColores.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public EjemploCombo() {
		initialize();
		cambiarColor();
	}
	public void cambiarColor() {
		int n=sldNumero.getValue();
		lblOpcion.setText(" "+n);
	    String colorSeleccionado = String.valueOf(cmbOpciones.getSelectedItem());

	    // Declarar una variable de tipo Color para almacenar el color seleccionado
	    Color color = null;

	    // Utilizar un switch para asignar el color seleccionado
	    switch (colorSeleccionado) {
	        case "Rojo":
	            color = Color.RED;
	            break;
	        case "Azul":
	            color = Color.BLUE;
	            break;
	        case "Verde":
	            color = Color.GREEN;
	            break;
	        case "Rosa":
	            color = Color.PINK;
	            break;
	        case "Negro":
	            color = Color.BLACK;
	            break;
	        default:	            
	            color = Color.WHITE; // Blanco por defecto
	            break;
	    }

	    // Establecer el color de fondo del componente lblOpcion
	    lblOpcion.setBackground(color);
	}

	private void initialize() {
		frmColores = new JFrame();
		frmColores.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\mauri\\OneDrive\\Imágenes\\icono cecytem.jpg"));
		frmColores.setTitle("Colores 2.0");
		frmColores.setBounds(100, 100, 488, 429);
		frmColores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmColores.setLocationRelativeTo(null);
		frmColores.getContentPane().setLayout(null);
		cmbOpciones = new JComboBox();
		cmbOpciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarColor();
			}
		});
		cmbOpciones.setFont(new Font("Sitka Small", Font.BOLD, 19));
		cmbOpciones.setModel(new DefaultComboBoxModel(new String[] {"Rojo", "Azul", "Verde", "Rosa", "Negro"}));
		cmbOpciones.setBounds(49, 132, 146, 37);
		frmColores.getContentPane().add(cmbOpciones);
		lblOpciones = new JLabel("Opciones");
		lblOpciones.setFont(new Font("Sitka Small", Font.BOLD, 19));
		lblOpciones.setBounds(57, 94, 138, 28);
		frmColores.getContentPane().add(lblOpciones);
		lblOpcion = new JLabel("");
		lblOpcion.setFont(new Font("Sitka Small", Font.BOLD, 19));
		lblOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpcion.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblOpcion.setOpaque(true);
		lblOpcion.setBounds(44, 218, 302, 68);
		frmColores.getContentPane().add(lblOpcion);
		sldNumero = new JSlider();
		sldNumero.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				cambiarColor();
			}
		});
		sldNumero.setMinimum(1);
		sldNumero.setValue(1);
		sldNumero.setBounds(44, 51, 200, 22);
		frmColores.getContentPane().add(sldNumero);
		lblNumero = new JLabel("Numero");
		lblNumero.setFont(new Font("Sitka Small", Font.BOLD, 19));
		lblNumero.setBounds(44, 10, 146, 31);
		frmColores.getContentPane().add(lblNumero);
	}
}