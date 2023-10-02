package pizzeria2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.border.MatteBorder;
import java.awt.Color;

public class pizza {

	private JFrame frmWorkAtA;
	private JLabel lblCantidat;
	private JLabel lblCantidad;
	private JSlider sldCantidad;
	private JComboBox cmbEspecialidad;
	private JLabel lblTamaño;
	private JRadioButton radDuqueMini;
	private JRadioButton radDuquesaM;
	private JRadioButton radDuqueJ;
	private JRadioButton radDuqueO;
	private JButton btnBorrar;
	private JLabel lblTotal;
	private JTextArea txtResumen;
	private JLabel lblImagen;
	private JLabel lblEspecialidades;
	private JLabel lblComplementos;
	private JCheckBox chkCerveza;
	private JCheckBox chkDedosdeajo;
	private JCheckBox chkNuggets;
	private JCheckBox chkEnsalada;
	private JLabel lblPrecio;
String especialidad="Queso";
String tamanio="Mini";
int cantidad=1;
int total=0;
int totalComplementos=0;
int precioPizza=0;
String c1=" ",c2=" ",c3=" ",c4=" ";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pizza window = new pizza();
					window.frmWorkAtA.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pizza() {
		initialize();
	}

	public void ordenarPizza() {
		lblCantidad.setText(" "+cantidad);
		switch(tamanio) {
		case "DuqueMini":
		    precioPizza=50;
		    break;
		case "DuquesaM":
	        precioPizza=69;
	        break;
		case "DuqueJ":
		    precioPizza=85;
		    break;
		case "DuqueO":
		    precioPizza=120;
		    break;
		}
		total=(cantidad*precioPizza)+totalComplementos;
		txtResumen.setText("CANTIDAD:"+sldCantidad.getValue()+"\nTAMAÑO:"+tamanio+"\nESPECIALIDAD:"+especialidad+"\n\nCOMPLEMENTOS\n"+c1+"\n"+c2+"\n"+c3+"\n"+c4);
		DecimalFormat f=new DecimalFormat("#.00");
		lblTotal.setText("$ "+f.format(total)+" MXN");
	}
	private void initialize() {
		frmWorkAtA = new JFrame();
		frmWorkAtA.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Pictures\\con pizza.jpg"));
		frmWorkAtA.setTitle("Work at a pizza place");
		frmWorkAtA.setBounds(100, 100, 621, 437);
		frmWorkAtA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWorkAtA.setLocationRelativeTo(null);
		frmWorkAtA.getContentPane().setLayout(null);
		
		lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon("C:\\Users\\Alumno\\Pictures\\pizza.jpg"));
		lblImagen.setBounds(332, 37, 263, 176);
		frmWorkAtA.getContentPane().add(lblImagen);
		
		lblCantidad = new JLabel("1");
		lblCantidad.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setFont(new Font("Sylfaen", Font.BOLD, 17));
		lblCantidad.setBounds(239, 27, 46, 36);
		frmWorkAtA.getContentPane().add(lblCantidad);
		
		txtResumen = new JTextArea();
		txtResumen.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtResumen.setBounds(192, 241, 158, 153);
		frmWorkAtA.getContentPane().add(txtResumen);
		
		lblTotal = new JLabel("$0.0");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblTotal.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblTotal.setBounds(384, 299, 185, 65);
		frmWorkAtA.getContentPane().add(lblTotal);
		
		sldCantidad = new JSlider();
		sldCantidad.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		sldCantidad.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				cantidad=sldCantidad.getValue();
				ordenarPizza();
			}
		});
		sldCantidad.setValue(1);
		sldCantidad.setMaximum(10);
		sldCantidad.setMinimum(1);
		sldCantidad.setBounds(29, 27, 200, 26);
		frmWorkAtA.getContentPane().add(sldCantidad);
		
		cmbEspecialidad = new JComboBox();
		cmbEspecialidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				especialidad=String.valueOf(cmbEspecialidad.getSelectedItem());
				ordenarPizza();
			}
		});
		
		cmbEspecialidad.setModel(new DefaultComboBoxModel(new String[] {"Queso", "Salchichon", "Pepperoni", "Mexicana"}));
		cmbEspecialidad.setBounds(26, 94, 150, 22);
		frmWorkAtA.getContentPane().add(cmbEspecialidad);
		
		radDuqueMini = new JRadioButton("Duque Miniatura");
		radDuqueMini.setFont(new Font("Segoe Print", Font.BOLD, 12));
		radDuqueMini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radDuqueMini.isSelected()) {
					tamanio="DuqueMini";
				}
				ordenarPizza();
			}
			
		});
		radDuqueMini.setBounds(16, 164, 144, 23);
		frmWorkAtA.getContentPane().add(radDuqueMini);
		
		radDuquesaM = new JRadioButton("Duquesa Mediana");
		radDuquesaM.setFont(new Font("Segoe Print", Font.BOLD, 12));
		radDuquesaM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radDuquesaM.isSelected()) {
				tamanio="DuquesaM";
				}
				ordenarPizza();
			}
		});
		radDuquesaM.setBounds(16, 190, 144, 23);
		frmWorkAtA.getContentPane().add(radDuquesaM);
		
		radDuqueJ = new JRadioButton("Duque Jumbo");
		radDuqueJ.setFont(new Font("Segoe Print", Font.BOLD, 12));
		radDuqueJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radDuqueJ.isSelected()) {
					tamanio="DuqueJ";
					}
					ordenarPizza();
			}
		});
		radDuqueJ.setBounds(16, 216, 150, 23);
		frmWorkAtA.getContentPane().add(radDuqueJ);
		
		radDuqueO = new JRadioButton("Duque Olimpica");
		radDuqueO.setFont(new Font("Segoe Print", Font.BOLD, 12));
		radDuqueO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radDuqueO.isSelected()) {
					tamanio="DuqueO";
					}
					ordenarPizza();
			}
		});
		radDuqueO.setBounds(16, 242, 144, 23);
		frmWorkAtA.getContentPane().add(radDuqueO);
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(radDuqueMini);
		grupo.add(radDuquesaM);
		grupo.add(radDuqueJ);
		grupo.add(radDuqueO);
		
		chkCerveza = new JCheckBox("Cerveza");
		chkCerveza.setFont(new Font("Segoe Print", Font.BOLD, 12));
		chkCerveza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkCerveza.isSelected()) {
					totalComplementos+=35;
					c1="Una cerveza";
				}else {
					totalComplementos-=35;
					c1="";
				}
				ordenarPizza();
			}
		});
		chkCerveza.setBounds(16, 293, 97, 23);
		frmWorkAtA.getContentPane().add(chkCerveza);
		
		chkDedosdeajo = new JCheckBox("Dedos de Ajo");
		chkDedosdeajo.setFont(new Font("Segoe Print", Font.BOLD, 12));
		chkDedosdeajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkDedosdeajo.isSelected()) {
					totalComplementos+=40;
					c2="Unos Dedos de ajo";
				}else {
					totalComplementos-=40;
					c2="";
				}
				ordenarPizza();
			}
		});
		chkDedosdeajo.setBounds(16, 319, 125, 23);
		frmWorkAtA.getContentPane().add(chkDedosdeajo);
		
		chkNuggets = new JCheckBox("Nuggets");
		chkNuggets.setFont(new Font("Segoe Print", Font.BOLD, 12));
		chkNuggets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkNuggets.isSelected()) {
					totalComplementos+=20;
					c3="Unos Nuggets";
				}else {
					totalComplementos-=20;
					c3="";
				}
				ordenarPizza();
			}
		});
		chkNuggets.setBounds(16, 345, 97, 23);
		frmWorkAtA.getContentPane().add(chkNuggets);
		
		chkEnsalada = new JCheckBox("Ensalada");
		chkEnsalada.setFont(new Font("Segoe Print", Font.BOLD, 12));
		chkEnsalada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkEnsalada.isSelected()) {
					totalComplementos+=45;
					c4="Una Ensalada";
				}else {
					totalComplementos-=45;
					c4="";
				}
				ordenarPizza();
			}
		});
		chkEnsalada.setBounds(16, 371, 97, 23);
		frmWorkAtA.getContentPane().add(chkEnsalada);
		
		lblCantidat = new JLabel("Cantidad");
		lblCantidat.setBounds(28, 11, 46, 14);
		frmWorkAtA.getContentPane().add(lblCantidat);
		
		lblEspecialidades = new JLabel("Especialidades");
		lblEspecialidades.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblEspecialidades.setBounds(28, 64, 132, 26);
		frmWorkAtA.getContentPane().add(lblEspecialidades);
		
		lblTamaño = new JLabel("Tamaño");
		lblTamaño.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblTamaño.setBounds(16, 135, 112, 22);
		frmWorkAtA.getContentPane().add(lblTamaño);
		
		
		
		lblComplementos = new JLabel("Complementos");
		lblComplementos.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblComplementos.setBounds(16, 272, 125, 26);
		frmWorkAtA.getContentPane().add(lblComplementos);
		
		
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sldCantidad.setValue(1);
				cmbEspecialidad.setSelectedIndex(0);
				radDuqueMini.setSelected(true);
				radDuquesaM.setSelected(false);
				radDuqueJ.setSelected(false);
				radDuqueO.setSelected(false);
				chkCerveza.setSelected(false);
				chkDedosdeajo.setSelected(false);
				chkNuggets.setSelected(false);
				chkEnsalada.setSelected(false);
				txtResumen.setText(" ");
				lblCantidad.setText("1");
				lblTotal.setText("$ 0.0 MXN");
			}
		});
		btnBorrar.setFont(new Font("Sitka Small", Font.BOLD, 16));
		btnBorrar.setBounds(202, 143, 120, 49);
		frmWorkAtA.getContentPane().add(btnBorrar);
		
		JLabel lblResumen = new JLabel("Resumen de orden");
		lblResumen.setFont(new Font("Sitka Small", Font.BOLD, 14));
		lblResumen.setBounds(192, 222, 150, 14);
		frmWorkAtA.getContentPane().add(lblResumen);
		
		lblPrecio = new JLabel("Total a pagar.");
		lblPrecio.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblPrecio.setBounds(405, 247, 132, 26);
		frmWorkAtA.getContentPane().add(lblPrecio);
		
	
	}
}
