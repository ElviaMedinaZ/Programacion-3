import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.JPasswordField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class LoginJson {

	private JFrame frame;
	private JTextField txtUser;
	private JPasswordField psfContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginJson window = new LoginJson();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginJson() {
		initialize();
		login();
		bienvenido();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 638, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setLocation(200,200);
		frame.setLocationRelativeTo(null);//centrar
	
	}
	
	public void login() {
		
		JPanel panelLogin = new JPanel();
		panelLogin.setBackground(new Color(225, 247, 255));
		panelLogin.setBounds(0, 0, 622, 596);
		frame.getContentPane().add(panelLogin);
		panelLogin.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblLogin.setForeground(new Color(0, 63, 125));
		lblLogin.setBounds(260, 43, 111, 59);
		panelLogin.add(lblLogin);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUser.setBounds(92, 192, 448, 39);
		panelLogin.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(new Color(0, 63, 125));
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(92, 151, 79, 39);
		panelLogin.add(lblUsuario);
		
		JLabel lblContrasena = new JLabel("Contraseña");
		lblContrasena.setForeground(new Color(0, 63, 125));
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContrasena.setBounds(92, 273, 111, 39);
		panelLogin.add(lblContrasena);
		
		psfContrasena = new JPasswordField();
		psfContrasena.setFont(new Font("Tahoma", Font.PLAIN, 20));
		psfContrasena.setBounds(92, 312, 448, 39);
		panelLogin.add(psfContrasena);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			// TODO Auto-generated method stub
				
			JSONParser parser = new JSONParser();
			String usr = txtUser.getText();
	        String psw = new String(psfContrasena.getPassword());

	        boolean encontrado = false;

	        try {
	        
	            Object obj = parser.parse(new FileReader("src/users.json")); 
	            JSONObject jsonObject = (JSONObject) obj;
	            JSONArray users = (JSONArray) jsonObject.get("users");
	            

	            for (Object user : users) {
	                JSONObject userObject = (JSONObject) user;

	                String username = (String) userObject.get("username");
	                String password = (String) userObject.get("password");
	                System.out.println("Username: " + username);
	                System.out.println("Password: " + password);
	                System.out.println("=============================");
	                
	                if (username.equals(usr) && password.equals(psw)) {
	                	encontrado = true;
	                	
	                	break;
	                }
	             }

	             if (encontrado) 
	             {
	            	 panelLogin.setVisible(false); 
	            	 bienvenido();
	            	 frame.repaint();
	              }
	             else {
	            	 JLabel lblError = new JLabel("Usuario o contraseña incorrectos");
	            	 lblError.setForeground(Color.RED);
	            	 lblError.setFont(new Font("Tahoma", Font.PLAIN, 16));
	            	 lblError.setBounds(92, 360, 400, 20);
	            	 panelLogin.add(lblError);
	            	 panelLogin.revalidate();
	            	 panelLogin.repaint();
	             }

	        } catch (IOException | ParseException e1) {
	            e1.printStackTrace();
	        }
			
		}
			
		
		});
		btnAcceder.setForeground(Color.WHITE);
		btnAcceder.setBackground(new Color(0, 63, 125));
		btnAcceder.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAcceder.setBounds(216, 415, 195, 59);
		panelLogin.add(btnAcceder);
		
	}
	
	public void bienvenido() {
		JPanel panelBienvenido = new JPanel();
		panelBienvenido.setBounds(0, 0, 622, 596);
		panelBienvenido.setBackground(new Color(225, 247, 255));
		frame.getContentPane().add(panelBienvenido);
		
		JLabel lblLogin = new JLabel("Bienvenido");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblLogin.setForeground(new Color(0, 63, 125));
		lblLogin.setBounds(260, 43, 111, 59);
		panelBienvenido.add(lblLogin);
		
		
		
	}
}
