import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
	//Atributos base
	public Ventana() {
		
		this.setSize(1000, 750);//Tamaño de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar
		this.setTitle("Ventana"); //Titulo

		
		//tamaños
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,270));
		this.setResizable(true);
		
		
		///////////////////////////////////////////////////////////////////////
		// Tamaño de ventana de la calculadora
		
		/*this.setSize(345, 440);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar
		this.setTitle("Calculadora"); //Titulo
		
		//tamaños
		this.setMinimumSize(new Dimension(300,330));
		this.setMaximumSize(new Dimension(345,440));
		this.setResizable(false);
		*/
		///////////////////////////////////////////////////////////////////////
		
		//ubicacion
		this.setLocation(200,200);
		this.setLayout(null);//Quita molde predefinido
		this.setLocationRelativeTo(null);//centrar
		
		this.iniciarComponentes();//Agrega los componentes
		this.setVisible(true);
	}
	
	/////////////////////////////// INICIAR COMPONENTES //////////////////////////////////
	
	public void iniciarComponentes()
	{
		//COSAS QUE CASI SIEMPRE LLEVARAN (ya que pueden tener mas)
		
		//size
		//Location
		//background -opaque
		//String constructor
		
		//this.admin();
		//this.login();
		//this.registro();
		//this.calculadora();
		//this.calculadora2();
		this.calculadora3();;
		
		this.repaint();
		this.validate();
	}
	
	// //////////////////////////////// LOGIN /////////////////////////////////////////////
	
	public void login()
	{
		JPanel login = new JPanel();
		login.setSize(this.getWidth(), this.getHeight()); //Panel en mitad del frame
		login.setBackground(Color.decode("#335B92"));
		login.setLayout(null);
		
		
		JLabel loginTag = new JLabel("User Login",0);// SwingConstants.CENTER sirve tambien para centrar
		loginTag.setSize(450,80);//Tamaño del boton
		loginTag.setFont (new Font ("Arial", Font.BOLD,35));//Cambiar la fuente
		loginTag.setForeground(Color.white);//Cambiar el color de letra
		loginTag.setLocation(270,10);
		loginTag.setOpaque(true);
		loginTag.setBackground(null);//Poner el color de fondo
		login.add(loginTag);
		
		JLabel MyAccountTittle = new JLabel("My account",0);// SwingConstants.CENTER sirve tambien para centrar
		MyAccountTittle.setSize(450,80);//Tamaño del boton
		MyAccountTittle.setFont (new Font ("Arial", Font.BOLD + Font.ITALIC,45));//Cambiar la fuente
		MyAccountTittle.setForeground(Color.decode("#E0c668"));//Cambiar el color de letra
		MyAccountTittle.setLocation(270,100 );
		login.add(MyAccountTittle);
		
		//////////////////////////////777
		/*JLabel logoGato = new JLabel();
		logo.setIcon(new ImageIcon(getClass().getResource("iconoGato.JPEG")));
		logo.setBounds(10,50,240,240);
		login.add(logoGato); */
		//////////////////////////////////
		
		
		JLabel userTag = new JLabel("Enter your user name: ");
		userTag.setBounds(220, 180, 300, 40); // Ajusta coorde y tam de contraseña
		userTag.setFont (new Font ("Arial",Font.BOLD+Font.ITALIC,20));
		userTag.setForeground(Color.white);
		login.add(userTag);
		
		JTextField userName = new JTextField();
		userName.setBounds(220, 230, 600, 60); 
		userName.setFont (new Font ("Arial",Font.BOLD,20));
	    login.add(userName);
	    
	    
	  
	    JLabel logoUser = new JLabel();
	    logoUser.setIcon(new ImageIcon(getClass().getResource("user.png")));
	    logoUser.setBounds(168,235,50,50);
		login.add(logoUser); 
		
		
		
		JLabel password = new JLabel("Enter your password: ");
		password.setBounds(220, 330, 300, 40); // Ajusta coorde y tam de contraseña
		password.setFont (new Font ("Arial",Font.BOLD+ Font.ITALIC,20));
		password.setForeground(Color.white);
		login.add(password);
	    
	    
		JPasswordField passwordField = new JPasswordField("");
		passwordField.setBounds(220, 380, 600, 60);//X,Y,Ancho,Largo
		passwordField.setFont (new Font ("Arial",Font.BOLD,20));
	    login.add(passwordField);
	    
	    
	    JButton btLogin = new JButton("Login");
		btLogin.setFont(new Font("Arial",Font.BOLD,20));//establece fuente del texto
		btLogin.setBounds(400, 460, 200, 70);
		btLogin.setBackground(Color.decode("#E0c668"));
		login.add(btLogin);
		
		
		JLabel logoPassword = new JLabel();
		logoPassword.setIcon(new ImageIcon(getClass().getResource("Password.png")));
		logoPassword.setBounds(161,385,50,50);
		login.add(logoPassword); 
		
		
		
		JLabel NoAccount = new JLabel("Don´t have a account?");
		NoAccount.setBounds(420,560,200,40);//(x,y,ancho,alto)
		NoAccount.setFont (new Font ("Arial",Font.BOLD,15));
		NoAccount.setForeground(Color.white);
		login.add(NoAccount);//añade el componente
		
		
		JButton singUp = new JButton("Sing Up");
	    singUp.setFont(new Font("Arial",Font.BOLD,20));
	    singUp.setBounds(430, 610, 150, 50); 
	    singUp.setBackground(Color.decode("#E0c668"));
	    login.add(singUp);
		
		JLabel contornoTexto = new JLabel(" ");
		contornoTexto.setBounds(90, 100, 800, 450); // Ajusta coordenadas y tamaño de la etiqueta 
		contornoTexto.setBackground(Color.decode("#2B4D7B"));
		contornoTexto.setOpaque(true);
	    login.add(contornoTexto); 
	    
		
		this.add(login);
		
	}
	
	public void registro(){
		
		JPanel registro = new JPanel();//crear otro panel
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setBackground(Color.DARK_GRAY);//color al panel
		registro.setLocation(500,0);//el panel aparece en la otra mitad del frame
		registro.setLayout(null);
		
		
		JLabel registroTag = new JLabel("REGISTRO",0);
		registroTag.setSize(300, 80);//Tamaño del boton
		registroTag.setFont (new Font ("Microsoft Uighur",Font.BOLD,50));//Cambiar la fuente
		registroTag.setForeground(Color.white);//Color letra
		registroTag.setLocation(100,20);
		registroTag.setOpaque(true);
		registroTag.setBackground(Color.pink);//Fondo color
		registro.add(registroTag);
		
		
		JLabel userTag = new JLabel("NOMBRE DE USUARIO",0);
		userTag.setBounds(100, 115, 300, 40); // Ajusta coorde y tam de contraseña
		userTag.setFont (new Font ("Microsoft Uighur",Font.BOLD,30));
		userTag.setForeground(Color.white);
		userTag.setBackground(Color.pink);//Fondo color
		userTag.setOpaque(true);
		registro.add(userTag);
		
		
		JTextField nameText = new JTextField();
		nameText.setBounds(50, 160, 400, 40); //coordenadas y tam
		nameText.setHorizontalAlignment(0);//centrado
		nameText.setFont(new Font ("Microsoft Uighur",Font.BOLD,20));
		nameText.setForeground(Color.black);
	    registro.add(nameText);
	    
	    
	    JLabel bio = new JLabel("BIO",0);
	    bio.setBounds(50, 200, 400, 40);
	    bio.setFont(new Font ("Microsoft Uighur",Font.BOLD,30));
	    bio.setForeground(Color.white);
	    registro.add(bio);
	    
	    
	    JTextArea bioText = new JTextArea();//texto multilinea
	    bioText.setBounds(50, 240, 400, 80);
	    bioText.setFont(new Font ("Microsoft Uighur",Font.BOLD,20));
	    bioText.setForeground(Color.BLACK);
	    registro.add(bioText);
	    
	    
	   JLabel prefer = new JLabel("PREFERENCIAS",0);
	    prefer.setBounds(50, 320, 400, 40);
	    prefer.setFont(new Font ("Microsoft Uighur",Font.BOLD,30));
	    prefer.setForeground(Color.white);
	    registro.add(prefer);
	    
	    
		JCheckBox itemBox1=new JCheckBox("Dulce");
		itemBox1.setBounds(50, 360, 80, 40);
		itemBox1.setFont(new Font ("Microsoft Uighur",Font.BOLD,30));
		itemBox1.setForeground(Color.white);
		itemBox1.setOpaque(false);
		registro.add(itemBox1);
		
		
		JCheckBox itemBox2=new JCheckBox("Salado");
		itemBox2.setBounds(140, 360, 90, 40);
		itemBox2.setFont(new Font ("Microsoft Uighur",Font.BOLD,30));
		itemBox2.setForeground(Color.white);
		itemBox2.setOpaque(false);
		registro.add(itemBox2);
		
		
		JCheckBox itemBox3=new JCheckBox("Saludable");
		itemBox3.setBounds(240, 360, 120, 40);
		itemBox3.setFont(new Font ("Microsoft Uighur",Font.BOLD,30));
		itemBox3.setForeground(Color.white);
		itemBox3.setOpaque(false);
		itemBox3.setBorderPainted(true);//agregar bordes
		itemBox3.setBorder(BorderFactory.createLineBorder(Color.MAGENTA,2));//pintar bordes 
		registro.add(itemBox3);
		
		
		JLabel terminos = new JLabel("TERMINOS",0);
		terminos.setBounds(50, 400, 400, 40);
		terminos.setFont(new Font("Microsoft Uighur", Font.BOLD, 30));
		terminos.setForeground(Color.white);
		terminos.setBackground(Color.pink);//Fondo color
		terminos.setOpaque(true);
	    registro.add(terminos);
	    
	    
		JRadioButton acceptRadio = new JRadioButton("Acepto los términos");
		acceptRadio.setBounds(50, 440, 200, 40);
		acceptRadio.setFont(new Font("Microsoft Uighur", Font.BOLD, 24));
		acceptRadio.setForeground(Color.white);
		acceptRadio.setOpaque(false);
		registro.add(acceptRadio);
		

		JRadioButton rejectRadio = new JRadioButton("No acepto los términos");
		rejectRadio.setBounds(250, 440, 200, 40);
		rejectRadio.setFont(new Font("Microsoft Uighur", Font.BOLD, 24));
		rejectRadio.setForeground(Color.white);
		rejectRadio.setOpaque(false);
		registro.add(rejectRadio);
		

		ButtonGroup terms = new ButtonGroup();
		terms.add(acceptRadio);
		terms.add(rejectRadio);
		

		String colonias[] = {"Centro", "Camino Real", "Progreso", "Pedregal", "Conchalito"};
		JComboBox locations = new JComboBox(colonias);
		locations.setBounds(50, 480, 400, 40);
		locations.setFont(new Font("Microsoft Uighur", Font.BOLD, 30));
		registro.add(locations);
		
		
		JButton aceptar = new JButton("Crear Cuenta");
		aceptar.setFont(new Font("Microsoft Uighur",Font.BOLD,38));//establece fuente del texto
		aceptar.setBounds(50, 530, 400, 70);
		registro.add(aceptar);
		
		
		
		
		this.add(registro);
		
	}
	
	public void admin() {
		
		JPanel adminPanel = new JPanel();//crear otro panel
		adminPanel.setSize(this.getWidth(), this.getHeight());
		adminPanel.setBackground(Color.decode("#CDDAEE"));//color al panel
		adminPanel.setLocation(0,0);//el panel aparece en la otra mitad del frame
		adminPanel.setLayout(null);
		
		
		//Menu y opciones
		JMenuBar barra = new JMenuBar();
		JMenu menuFile = new JMenu("Archivo");
		JMenuItem openItem = new JMenuItem ("Abrir archivo...");
		JMenuItem createItem = new JMenuItem ("Crear un archivo...");
		barra.add(menuFile);//Si no añadimos los elementos, no aparece el menu al ejecutar
		
		menuFile.add(openItem);
		menuFile.add(createItem);
		
		this.setJMenuBar(barra);
		
		
		JLabel UsersTag = new JLabel("Usuarios",0);
		UsersTag.setSize(300, 80);//Tamaño del boton
		UsersTag.setFont (new Font ("Microsoft Uighur",Font.BOLD,50));//Cambiar la fuente
		UsersTag.setForeground(Color.black);//Color letra
		UsersTag.setLocation(350,20);
		UsersTag.setOpaque(true);
		UsersTag.setBackground(Color.decode("#A8BFE3"));//Fondo color
		adminPanel.add(UsersTag);
		
		
		JLabel TitleWidget = new JLabel("Total de usuarios",0);
		TitleWidget.setBounds(40,90,300,100);
		TitleWidget.setFont (new Font ("Microsoft Uighur",Font.BOLD,30));//Cambiar la fuente
		TitleWidget.setForeground(Color.black);//Color letra
		adminPanel.add(TitleWidget);
		
		
		JLabel contentWidget = new JLabel("100",0);
		contentWidget.setBounds(40,100,300,140);
		contentWidget.setFont (new Font ("Microsoft Uighur",Font.BOLD,40));//Cambiar la fuente
		contentWidget.setForeground(Color.black);//Color letra
		adminPanel.add(contentWidget);
		
		
		JLabel widget = new JLabel("");
		widget.setBounds(40,120,300,80);
		widget.setOpaque(true);
		widget.setBackground(Color.decode("#A8BFE3"));
		adminPanel.add(widget);
		
		
		JButton dowland = new JButton ("Exportar");
		dowland.setBounds(730, 225,100 , 40);
		
		adminPanel.add(dowland);
		
		JButton addUser = new JButton ("Añadir");
		addUser.setBounds(850, 225, 100, 40);
		adminPanel.add(addUser);
		
		
		String titles [] = {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"};
		String tableData [] [] = { {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				                   {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
			
		};
		
		JTable tableUsers = new JTable (tableData,titles);
		//tableUsers.setBounds(40,120,400,50);
		JScrollPane tableScroll = new JScrollPane(tableUsers);
		tableScroll.setBounds(30,280,920,300);
		adminPanel.add(tableScroll);
		
		this.add(adminPanel);
		
	}
	
	/*
	
	public void calculadora() {
		
		
		JPanel calculadora = new JPanel ();
	    calculadora.setSize(this.getWidth(), this.getHeight());
	    calculadora.setBackground(Color.decode("#DCDDDB"));
	    calculadora.setLayout(null);
	    
	    
	    JTextField pantalla = new JTextField ("0");
	    pantalla.setFont(new Font("Segoe UI",Font.BOLD,50));//establece fuente del texto
	    pantalla.setHorizontalAlignment(SwingConstants.RIGHT); // Alinea el texto a la derecha
	    pantalla.setForeground(Color.black);
		pantalla.setBounds(10,10,310,80);
		pantalla.setBackground(Color.decode("#848E63"));
		calculadora.add(pantalla);
		
	    JButton CE = new JButton("CE");
		CE.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
		CE.setForeground(Color.white);
		CE.setBounds(10, 100, 70, 50); 
		CE.setBackground(Color.decode("#62908D"));
		calculadora.add(CE);
		

	    JButton botonVacio = new JButton("");
	    botonVacio.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
	    botonVacio.setBounds(90, 100, 230, 50); 
	    botonVacio.setBackground(Color.decode("#908DC2"));
		calculadora.add(botonVacio);
	
		
		JButton BotonNum0 = new JButton("0");
		BotonNum0.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
		BotonNum0.setForeground(Color.white);
		BotonNum0.setBounds(10, 340, 70, 50); 
		BotonNum0.setBackground(Color.decode("#908DC2"));
		calculadora.add(BotonNum0);
		
		JButton punto = new JButton(".");
		punto.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
		punto.setForeground(Color.white);
		punto.setBounds(90, 340, 70, 50); 
		punto.setBackground(Color.decode("#908DC2"));
		calculadora.add(punto);
		
		JButton igual = new JButton("=");
		igual.setFont(new Font("Segoe UI", Font.BOLD, 30));
		igual.setForeground(Color.white);
		igual.setBounds(170, 340, 70, 50); 
		igual.setBackground(Color.decode("#908DC2"));
		calculadora.add(igual);
		
		
		JButton botonNum1 = new JButton("1");
		botonNum1.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
		botonNum1.setForeground(Color.white);
		botonNum1.setBounds(10, 280, 70, 50); 
		botonNum1.setBackground(Color.decode("#908DC2"));
		calculadora.add(botonNum1);
		
		JButton botonNum2 = new JButton("2");
		botonNum2.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
		botonNum2.setForeground(Color.white);
		botonNum2.setBounds(90, 280, 70, 50); 
		botonNum2.setBackground(Color.decode("#908DC2"));
		calculadora.add(botonNum2);
		
		JButton num3 = new JButton("3");
		num3.setFont(new Font("Segoe UI", Font.BOLD, 30));
		num3.setForeground(Color.white);
		num3.setBounds(170, 280, 70, 50); 
		num3.setBackground(Color.decode("#908DC2"));
		calculadora.add(num3);
		
		
		JButton botonNum4 = new JButton("4");
		botonNum4.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
		botonNum4.setForeground(Color.white);
		botonNum4.setBounds(10, 220, 70, 50); 
		botonNum4.setBackground(Color.decode("#908DC2"));
		calculadora.add(botonNum4);
		
		JButton num5 = new JButton("5");
		num5.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
		num5.setForeground(Color.white);
		num5.setBounds(90, 220, 70, 50); 
		num5.setBackground(Color.decode("#908DC2"));
		calculadora.add(num5);
		
		JButton num6 = new JButton("6");
		num6.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
		num6.setForeground(Color.white);
		num6.setBounds(170, 220, 70, 50); 
		num6.setBackground(Color.decode("#908DC2"));
		calculadora.add(num6);
		
		
		JButton botonNum7 = new JButton("7");
		botonNum7.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
		botonNum7.setForeground(Color.white);
		botonNum7.setBounds(10, 160, 70, 50); 
		botonNum7.setBackground(Color.decode("#908DC2"));
		calculadora.add(botonNum7);
	
		JButton num8 = new JButton("8");
		num8.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
		num8.setForeground(Color.white);
		num8.setBounds(90, 160, 70, 50); 
		num8.setBackground(Color.decode("#908DC2"));
		calculadora.add(num8);
		
		JButton num9 = new JButton("9");
		num9.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
		num9.setForeground(Color.white);
		num9.setBounds(170, 160, 70, 50); 
		num9.setBackground(Color.decode("#908DC2"));
		calculadora.add(num9);

		
		JButton division = new JButton("/");
		division.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
		division.setForeground(Color.white);
		division.setBounds(250, 160, 70, 50); 
		division.setBackground(Color.decode("#7C6290"));
		calculadora.add(division);
		
		JButton multiplicacion = new JButton("*");
		multiplicacion.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
		multiplicacion.setForeground(Color.white);
		multiplicacion.setBounds(250, 220, 70, 50); 
		multiplicacion.setBackground(Color.decode("#7C6290"));
		calculadora.add(multiplicacion);
		
		JButton resta = new JButton("-");
		resta.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
		resta.setForeground(Color.white);
		resta.setBounds(250, 280, 70, 50); 
		resta.setBackground(Color.decode("#7C6290"));
		calculadora.add(resta);
		
		JButton suma = new JButton("+");
		suma.setFont(new Font("Segoe UI",Font.BOLD,30));//establece fuente del texto
		suma.setForeground(Color.white);
		suma.setBounds(250, 340, 70, 50); 
		suma.setBackground(Color.decode("#7C6290"));
		calculadora.add(suma);
		
	    this.add(calculadora);
		
	    
		
	}*/
	
	
/*public void calculadora2() {
		
		this.setSize(480,650);
		
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(), this.getHeight());
		panel.setBackground(Color.decode("#DCDDDB"));
		panel.setLayout(new BorderLayout());
		
		
		JLabel text = new JLabel("100.00",4);
		text.setOpaque(true);
		text.setFont(new Font("Arial",Font.BOLD,40));
		text.setBackground(Color.WHITE);
		panel.add(text, BorderLayout.NORTH);
		
		
		JPanel centro = new JPanel();
		
		centro.setBackground(Color.decode("#AF91C9"));
		centro.setLayout(new GridLayout(4,3,10,10));
		panel.add(centro,BorderLayout.CENTER);

		
		
		String btns[] = {"7","8","9","6","5","4","3","2","1","0",".","/"};
		
		for(int i=0; i<12; i++)
		{
			JButton boton = new JButton(btns[i]);
			centro.add(boton);
		}
		
		
		
		JPanel east = new JPanel();
		east.setBackground(Color.decode("#DD8BF1"));
		east.setLayout(new GridLayout(3,1,10,10));
		panel.add(east,BorderLayout.EAST);
		
		String btns2[] = {"+","-","="};
		
		for(int i=0; i<3; i++) 
		{
			JButton boton = new JButton(btns2[i]);
			east.add(boton);
		}
		
		
		
		JPanel west = new JPanel();
		west.setBackground(Color.decode("#A688FF"));
		west.setLayout(new BoxLayout(west,BoxLayout.Y_AXIS));
		panel.add(west,BorderLayout.WEST);
		
		String btns3[] = {"MC","M+","*"};
		for(int i=0; i<3; i++) 
		{
			JButton boton = new JButton(btns3[i]);
			
			west.add(boton);
		
		}
		
		
		
		this.add(panel);
		
	}*/
	
	public void calculadora3()
	
	{
		this.setSize(800,600);
		
		JPanel principal = new JPanel();
		principal.setSize(this.getWidth(), this.getHeight());
		principal.setBackground(Color.white);
		principal.setLayout(new BorderLayout());
			
		JLabel interes = new JLabel("	     Interés"); //genera el texto interes
		interes.setOpaque(true);
		interes.setFont(new Font("Arial",Font.BOLD + Font.ITALIC,30));
		interes.setForeground(Color.red);
		interes.setBackground(Color.WHITE);
		principal.add(interes, BorderLayout.NORTH);
		
		
		
		JLabel westVacio = new JLabel("	     "); //genera el texto interes
		westVacio.setOpaque(true);
		westVacio.setFont(new Font("Arial",Font.BOLD + Font.ITALIC,30));
		//westVacio.setForeground(Color.red);
		westVacio.setBackground(null);
		principal.add(westVacio, BorderLayout.WEST);
		
		
		JLabel eastVacio = new JLabel("	     "); //genera el texto interes
		eastVacio.setOpaque(true);
		eastVacio.setFont(new Font("Arial",Font.BOLD + Font.ITALIC,42));
		//westVacio.setForeground(Color.red);
		eastVacio.setBackground(null);
		principal.add(eastVacio, BorderLayout.EAST);
		
		JLabel SouthVacio = new JLabel("	     "); //genera el texto interes
		SouthVacio.setOpaque(true);
		SouthVacio.setFont(new Font("Arial",Font.BOLD + Font.ITALIC,70));
		//westVacio.setForeground(Color.red);
		SouthVacio.setBackground(null);
		principal.add(SouthVacio, BorderLayout.SOUTH);
		
		
		
		JPanel central = new JPanel();//contiene cuadro verde y rojo
		//central.setSize(this.getWidth(), this.getHeight());
		central.setBackground(Color.white);
		central.setOpaque(true);
		central.setLayout(new GridLayout(2,1,40,40)); 
		principal.add(central, BorderLayout.CENTER);
		
		JPanel central1 = new JPanel();//contiene cuadro verde y rojo
		//central1.setSize(this.getWidth(), this.getHeight());
		
		central1.setBackground(Color.decode("#97FF92"));//verde
		//central1.setBounds(50,50,100,100);
		central1.setOpaque(true);
		central1.setLayout(null); 
		central.add(central1);
		
		
		JLabel TexteCalcular  = new JLabel("Calcular interés",2); //genera el texto interes
		TexteCalcular.setOpaque(true);
		TexteCalcular.setFont(new Font("Arial",Font.BOLD,17));
		TexteCalcular.setForeground(Color.black);
		TexteCalcular.setBounds(2,1,200,40);
		TexteCalcular.setBackground(null);
		central1.add(TexteCalcular, BorderLayout.NORTH);
		
		
		JLabel capital = new JLabel("Capital:"); //genera el texto interes
		capital.setOpaque(true);
		capital.setFont(new Font("Arial",Font.ITALIC,20));
		capital.setBounds(190,40,100,30);
		capital.setBackground(null);
		central1.add(capital);
		
		JTextField capitalText = new JTextField("1500"); //genera el texto interes
		capitalText.setOpaque(true);
		capitalText.setFont(new Font("Arial",Font.ITALIC,20));
		capitalText.setBounds(350,40,150,30);
		capitalText.setBackground(Color.white);
		central1.add(capitalText);
		
		JLabel tiempo = new JLabel("Tiempo:"); //genera el texto interes
		tiempo.setOpaque(true);
		tiempo.setFont(new Font("Arial",Font.ITALIC,20));
		tiempo.setBounds(190,80,100,30);
		tiempo.setBackground(null);
		central1.add(tiempo);
		
		
		JTextField tiempoText = new JTextField("2"); //genera el texto interes
		tiempoText.setOpaque(true);
		tiempoText.setFont(new Font("Arial",Font.ITALIC,20));
		tiempoText.setBounds(350,80,150,30);
		tiempoText.setBackground(Color.white);
		central1.add(tiempoText);
		
		
		JLabel tasaInteres = new JLabel("Tasa interés:"); //genera el texto interes
		tasaInteres.setOpaque(true);
		tasaInteres.setFont(new Font("Arial",Font.ITALIC,20));
		tasaInteres.setBounds(190,120,160,30);
		tasaInteres.setBackground(null);
		central1.add(tasaInteres);
		
		
		JTextField TasaInteresText= new JTextField("0.1"); //genera el texto interes
		TasaInteresText.setOpaque(true);
		TasaInteresText.setFont(new Font("Arial",Font.ITALIC,20));
		TasaInteresText.setBounds(350,120,150,30);
		TasaInteresText.setBackground(Color.white);
		central1.add(TasaInteresText);
		
		
		JButton calcular = new JButton("Calcular");
		calcular.setBounds(180, 180, 140, 30);
		calcular.setFont(new Font("Arial", Font.BOLD, 15));
		calcular.setForeground(Color.white);
		calcular.setBackground(Color.BLACK);
		calcular.setOpaque(true);
		central1.add(calcular);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setBounds(350, 180, 140, 30);
		cancelar.setFont(new Font("Arial", Font.BOLD, 15));
		cancelar.setForeground(Color.white);
		cancelar.setBackground(Color.BLACK);
		cancelar.setOpaque(true);
		central1.add(cancelar);
		
		JPanel central2 = new JPanel();//contiene cuadro verde y rojo
		//central.setSize(this.getWidth(), this.getHeight());
		central2.setBackground(Color.decode("#FF8787"));
		central2.setOpaque(true);
		central2.setLayout(null); 
		central.add(central2);
		
		
		JLabel interesEtiqueta = new JLabel("Interes:"); //genera el texto interes
		interesEtiqueta.setOpaque(true);
		interesEtiqueta.setFont(new Font("Arial",Font.ITALIC,20));
		interesEtiqueta.setBounds(190,50,100,30);
		interesEtiqueta.setBackground(null);
		central2.add(interesEtiqueta);
		
		
		JTextField interesText= new JTextField("315.0000000000002"); //genera el texto interes
		interesText.setOpaque(true);
		interesText.setFont(new Font("Arial",Font.ITALIC,20));
		interesText.setBounds(300,50,200,30);
		interesText.setBackground(Color.white);
		central2.add(interesText);
		
		
		JLabel MontoEtiqueta = new JLabel("Monto:"); //genera el texto interes
		MontoEtiqueta.setOpaque(true);
		MontoEtiqueta.setFont(new Font("Arial",Font.ITALIC,20));
		MontoEtiqueta.setBounds(190,100,100,30);
		MontoEtiqueta.setBackground(null);
		central2.add(MontoEtiqueta);
		
		
		JTextField monto= new JTextField("1815.0000000000002"); //genera el texto interes
		monto.setOpaque(true);
		monto.setFont(new Font("Arial",Font.ITALIC,20));
		monto.setBounds(300,100,200,30);
		monto.setBackground(Color.white);
		central2.add(monto);
		

		this.add(principal);
		
		
	}
	
}