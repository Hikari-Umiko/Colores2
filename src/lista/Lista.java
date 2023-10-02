package lista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Toolkit;

public class Lista<E> {

	private JFrame frmLista;
	private JTextField txtNombre;
	private JButton btnBorrar;
	private JButton btnAgregar;
	private JList lstNombre;
	private JLabel lblMensaje;
	DefaultListModel model=new DefaultListModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista window = new Lista();
					window.frmLista.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLista = new JFrame();
		frmLista.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Pictures\\cecy.jpg"));
		frmLista.setTitle("Lista");
		frmLista.setBounds(100, 100, 463, 404);
		frmLista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLista.setLocationRelativeTo(null);
		frmLista.getContentPane().setLayout(null);
		
		lstNombre = new JList();
		lstNombre.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				lblMensaje.setText("Hola "+lstNombre.getSelectedValue());
			}
		});
		lstNombre.setBounds(26, 74, 119, 211);
		frmLista.getContentPane().add(lstNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(98, 8, 92, 20);
		frmLista.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(42, 11, 46, 14);
		frmLista.getContentPane().add(lblNewLabel);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addElement(txtNombre.getText());
				lstNombre.setModel(model);
			}
		});
		btnAgregar.setBounds(52, 40, 89, 23);
		frmLista.getContentPane().add(btnAgregar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNombre.setText(" ");
				model.clear();
				lstNombre.setModel(model);
				lblMensaje.setText(" ");
			}
		});
		btnBorrar.setBounds(151, 39, 89, 23);
		frmLista.getContentPane().add(btnBorrar);
		
		lblMensaje = new JLabel("");
		lblMensaje.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblMensaje.setBounds(261, 142, 165, 53);
		frmLista.getContentPane().add(lblMensaje);
	}
}
