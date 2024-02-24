import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
	//Atributos base
	public Ventana() {
		
		this.setSize(1000, 500);//Tamaño de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar
		this.setTitle("Mi ventana"); //Titulo
		
		//tamaños
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,270));
		this.setResizable(true);
		
		//ubicacion
		this.setLocation(200,200);
		this.setLayout(null);
		this.setLocationRelativeTo(null);//centrar
		this.setLayout(null);//Quitar el molde
		this.setLocationRelativeTo(null);
		
		this.iniciarComponentes();//Agrega los componentes
		this.setVisible(true);
	}
	
	public void iniciarComponentes()
	{
		//size
		//Location
		//background -opaque
		//String constructor
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight()); //Panel en mitad del frame
		login.setBackground(Color.LIGHT_GRAY);
		login.setLayout(null);
		
		
		JLabel loginTag = new JLabel("ACCEDER",0);// SwingConstants.CENTER sirve tambien para centrar
		loginTag.setSize(250,80);//Tamaño del boton
		loginTag.setFont (new Font ("Microsoft Uighur",Font.BOLD,50));//Cambiar la fuente
		loginTag.setForeground(Color.white);//Cambiar el color de letra
		loginTag.setLocation(120,20);
		loginTag.setOpaque(true);
		loginTag.setBackground(Color.pink);//Poner el color de fondo
		login.add(loginTag);
		
		
		JPanel registro = new JPanel();//crear otro panel
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setBackground(Color.DARK_GRAY);//color al panel
		registro.setLocation(500,0);//el panel aparece en la otra mitad del frame
		

		JLabel userTag = new JLabel("NOMBRE DE USUARIO: ");
		userTag.setBounds(10, 120, 300, 40); // Ajusta coorde y tam de contraseña
		userTag.setFont (new Font ("Microsoft Uighur",Font.BOLD,30));
		login.add(userTag);
		
		
		JTextField email = new JTextField();
	    email.setBounds(10, 160, 300, 40); 
	    login.add(email);
		
		JPasswordField passwordField = new JPasswordField("");
		passwordField.setBounds(10, 260, 300, 40);//X,Y,Ancho,Largo
	    login.add(passwordField);
	    
	    JLabel password = new JLabel("CONTRASEÑA: ");
	    password.setBounds(10, 220, 200, 40); // Ajusta coordenadas y tamaño de la etiqueta de contraseña
	    password.setFont(new Font("Microsoft Uighur", Font.BOLD, 30));
	    login.add(password); // Agrega la etiqueta de contraseña al panel de inicio de sesión

		
		
		JCheckBox remember = new JCheckBox("Recordarme");
		remember.setBounds(10, 300, 150, 40);
		remember.setOpaque(false);//vuelve opaco el fondo de la casilla
		login.add(remember);
		
		JLabel forgot = new JLabel("¿Olvidó su contraseña?");
		forgot.setBounds(175,300,150,40);//(x,y,ancho,alto)
		login.add(forgot);//añade el componente
		
		JButton accept = new JButton("ACCEDER");
		accept.setFont(new Font("Microsoft Uighur",Font.BOLD,40));//establece fuente del texto
		accept.setBounds(50, 350, 200, 70);
		login.add(accept);
		
		this.add(login);
		this.add(registro);
	}
}