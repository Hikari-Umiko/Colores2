import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class ColorRGB {

	private JFrame frmColorRgb;
	private JLabel lblRojo;
	private JSlider sldRojo;
	private JLabel lblVerde;
	private JSlider sldVerde;
	private JLabel lblAzul;
	private JSlider sldAzul;
	private JLabel lblVRojo;
	private JLabel lblColor;
	private JLabel lblValorRGB;
int r=0,v=0,a=0;
private JLabel lblVAzul;
private JLabel lblVVerde;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColorRGB window = new ColorRGB();
					window.frmColorRgb.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ColorRGB() {
		initialize();
	}

	public void cambiarColor() {
		lblVRojo.setText(""+r);
		lblVVerde.setText(""+v);
		lblVAzul.setText(""+a);
		lblValorRGB.setText("RGB("+r+","+v+","+a+")");
		lblColor.setBackground(new Color(r,v,a));
		
	}
	private void initialize() {
		frmColorRgb = new JFrame();
		frmColorRgb.setTitle("Color RGB");
		frmColorRgb.setBounds(100, 100, 558, 439);
		frmColorRgb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmColorRgb.setLocationRelativeTo(null);
		frmColorRgb.getContentPane().setLayout(null);
		
		lblRojo = new JLabel("Rojo");
		lblRojo.setFont(new Font("Sitka Small", Font.BOLD, 18));
		lblRojo.setBounds(10, 11, 46, 28);
		frmColorRgb.getContentPane().add(lblRojo);
		
		lblVerde = new JLabel("Verde");
		lblVerde.setFont(new Font("Sitka Small", Font.BOLD, 18));
		lblVerde.setBounds(10, 98, 57, 18);
		frmColorRgb.getContentPane().add(lblVerde);
		
		lblAzul = new JLabel("Azul");
		lblAzul.setFont(new Font("Sitka Small", Font.BOLD, 18));
		lblAzul.setBounds(10, 175, 46, 23);
		frmColorRgb.getContentPane().add(lblAzul);
		
		lblVRojo = new JLabel("0");
		lblVRojo.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblVRojo.setHorizontalAlignment(SwingConstants.CENTER);
		lblVRojo.setBounds(216, 39, 37, 26);
		frmColorRgb.getContentPane().add(lblVRojo);
		
		lblVVerde = new JLabel("0");
		lblVVerde.setHorizontalAlignment(SwingConstants.CENTER);
		lblVVerde.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblVVerde.setBounds(216, 116, 37, 26);
		frmColorRgb.getContentPane().add(lblVVerde);
		
		lblVAzul = new JLabel("0");
		lblVAzul.setHorizontalAlignment(SwingConstants.CENTER);
		lblVAzul.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblVAzul.setBounds(216, 209, 37, 26);
		frmColorRgb.getContentPane().add(lblVAzul);
		
		lblColor = new JLabel("");
		lblColor.setOpaque(true);
		lblColor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblColor.setBounds(310, 39, 193, 178);
		frmColorRgb.getContentPane().add(lblColor);
		
		lblValorRGB = new JLabel("Azul");
		lblValorRGB.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblValorRGB.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorRGB.setBounds(93, 283, 353, 86);
		frmColorRgb.getContentPane().add(lblValorRGB);
		
		sldRojo = new JSlider();
		sldRojo.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				r=sldRojo.getValue();
				cambiarColor();
			}
		});
		sldRojo.setValue(0);
		sldRojo.setMaximum(255);
		sldRojo.setBounds(10, 39, 200, 26);
		frmColorRgb.getContentPane().add(sldRojo);
		
		sldVerde = new JSlider();
		sldVerde.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				v=sldVerde.getValue();
				cambiarColor();
			}
		});
		sldVerde.setValue(0);
		sldVerde.setMaximum(255);
		sldVerde.setBounds(10, 127, 200, 26);
		frmColorRgb.getContentPane().add(sldVerde);
		
		sldAzul = new JSlider();
		sldAzul.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				a=sldAzul.getValue();
				cambiarColor();
			}
		});
		sldAzul.setMaximum(255);
		sldAzul.setValue(0);
		sldAzul.setBounds(10, 209, 200, 26);
		frmColorRgb.getContentPane().add(sldAzul);
		
	}
}
