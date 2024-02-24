import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
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
		this.setTitle("Mi ventana"); //Titulo
		
		//tamaños
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,270));
		this.setResizable(true);
		
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
		
		this.admin();
		//this.login();
		//this.registro();
		
		this.repaint();
		this.validate();
	}
	
	// //////////////////////////////// LOGIN /////////////////////////////////////////////
	
	public void login()
	{
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
		login.add(loginTag);
		

		JButton accept = new JButton("ACCEDER");
		accept.setFont(new Font("Microsoft Uighur",Font.BOLD,40));//establece fuente del texto
		accept.setBounds(50, 350, 200, 70);
		login.add(accept);
		
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
	
	
}