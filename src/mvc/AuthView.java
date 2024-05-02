package mvc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AuthView {
	
	JPanel panel;
	AuthModel modelo;

	public AuthView() {
		// TODO Auto-generated constructor stub
		panel= new JPanel();
		modelo=new AuthModel();
		
	}
	
	public JPanel login() {
		
		panel.setBackground(Color.red);
		
		panel.setBackground(new Color(225, 247, 255));
		panel.setBounds(0, 0, 622, 596);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblLogin.setForeground(new Color(0, 63, 125));
		lblLogin.setBounds(260, 43, 111, 59);
		panel.add(lblLogin);
		
		JTextField txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUser.setBounds(92, 192, 448, 39);
		panel.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(new Color(0, 63, 125));
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(92, 151, 79, 39);
		panel.add(lblUsuario);
		
		JLabel lblContrasena = new JLabel("Contraseña");
		lblContrasena.setForeground(new Color(0, 63, 125));
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContrasena.setBounds(92, 273, 111, 39);
		panel.add(lblContrasena);
		
		JPasswordField psfContrasena = new JPasswordField();
		psfContrasena.setFont(new Font("Tahoma", Font.PLAIN, 20));
		psfContrasena.setBounds(92, 312, 448, 39);
		panel.add(psfContrasena);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.setForeground(Color.WHITE);
		btnAcceder.setBackground(new Color(0, 63, 125));
		btnAcceder.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAcceder.setBounds(216, 415, 195, 59);
		panel.add(btnAcceder);
		btnAcceder.addActionListener(new ActionListener() {
		
		
			
			public void actionPerformed(ActionEvent e) {
				if(modelo.login(txtUser.getText(), psfContrasena.getText())) {
					System.out.println("Bienvenido");
				}
				else {
					System.out.println("Eror al ingresar");
				}
			}
		});
		
		return panel;
	}
	
	
	public JPanel registro() {
		panel.setBackground(Color.pink);
		
		
		return panel;
	}

}
