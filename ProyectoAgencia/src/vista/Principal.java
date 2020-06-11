package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Citas");
		lblNewLabel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				lblNewLabel.setToolTipText("Concertar cita");
			}
		});
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

			}
		});
		
		JLabel verCitas = new JLabel("Información");
		verCitas.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				verCitas.setToolTipText("Ver información de sus citas");
			}
		});
		
		verCitas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				Citas c = new Citas();
				c.setVisible(true);
			}
		});
		verCitas.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/bloc.png")));
		verCitas.setBounds(345, 15, 270, 222);
		contentPane.add(verCitas);
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/cita.jpg")));
		lblNewLabel.setBounds(41, 29, 165, 141);
		contentPane.add(lblNewLabel);

		JLabel Fondo = new JLabel("Fondo");
		Fondo.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/Fondo.jpg")));
		Fondo.setBounds(0, 0, 640, 386);
		contentPane.add(Fondo);

	}

	private void initComponents() {

	}
}
