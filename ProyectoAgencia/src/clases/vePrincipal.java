package clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class vePrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vePrincipal frame = new vePrincipal();
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
	public vePrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea("Contraseña");
		textArea.setBounds(268, 148, 94, 22);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea("Nombre de usuario");
		textArea_1.setToolTipText("");
		textArea_1.setBounds(40, 148, 140, 22);
		contentPane.add(textArea_1);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(40, 101, 74, 14);
		contentPane.add(lblContrasea);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(40, 45, 46, 14);
		contentPane.add(lblUsuario);
	}
}
