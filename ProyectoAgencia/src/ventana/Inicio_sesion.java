package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Inicio_sesion extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JPasswordField contraseña;
	private JButton btnIngresar;
	private JLabel fondo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio_sesion frame = new Inicio_sesion();
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
	public Inicio_sesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalida = new JButton("Salir");
		btnSalida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btnSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSalida.setBounds(286, 208, 86, 36);
		contentPane.add(btnSalida);
		
		JLabel lblNewLabel = new JLabel("Iniciar sesi\u00F3n");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(121, 26, 259, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 18));
		lblUsuario.setBounds(52, 78, 110, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 18));
		lblContrasea.setBounds(38, 131, 110, 14);
		contentPane.add(lblContrasea);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(182, 77, 86, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		contraseña = new JPasswordField();
		contraseña.setBounds(182, 130, 86, 20);
		contentPane.add(contraseña);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				char[] contrasenia = contraseña.getPassword();
				String contraseniaFinal = new String (contrasenia);
				
				if(textUsuario.getText().equals("admin") && contraseniaFinal.equals("123")) {
					dispose();
					System.out.println("Bienvenido a la aplicación de citas.");
					
					Principal p = new Principal();
					p.setVisible(true);
				}
				else {
					System.out.println("Usuario o contraseña incorrectos");
					textUsuario.setText("");
					contraseña.setText("");
					textUsuario.requestFocus();
				}
			}
		});
		btnIngresar.setBounds(111, 208, 89, 36);
		contentPane.add(btnIngresar);
		
		fondo = new JLabel("New label");
		fondo.setIcon(new ImageIcon(Inicio_sesion.class.getResource("/imagen/Fondo.jpg")));
		fondo.setBounds(0, 0, 490, 389);
		contentPane.add(fondo);
	}
}
