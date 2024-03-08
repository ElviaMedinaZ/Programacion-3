import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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
import java.util.Random;

public class Ventana extends JFrame implements MouseListener{
	//Atributos base
	public Ventana() {
		
		this.setSize(1000, 750);//Tamaño de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar
		this.setTitle("Ventana"); //Titulo

		
		//tamaños
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(1000,270));
		this.setResizable(false);
		
		
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
		this.addMouseListener(this);
	}
	
	
	@Override //El override va obligatorio para algunos
	public void paint(Graphics g) { //Si la funcion no se llama Paint no funciona 
		//super.paint(g);
		/*Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.pink);//Da el colorcito
		
		g2d.fillRect(50, 50, 200, 100);//coloca el cuadrado (solo dibuja rectangulos y cuadrados rellenos
		//g2d.drawLine(30, 70, 770, 70);
		g2d.clearRect(100, 100, 100, 100); //agarra una zona y la limpia como un borrador
		
		g2d.drawArc(300, 300, 100, 100, 45, 90);
		g2d.fillArc(300, 300, 100, 100, 45, 180);
		g2d.setColor(Color.black);
		g2d.drawLine(0, 0, 500, 500);
		//El orden de la posicion afecta
		
		g2d.drawOval(400, 400, 50, 80);
		g2d.fillOval(350, 400, 50, 80);
		
		int xPoints[] = {100,250,300};
		int yPoints [] = {100,200,300};
		//int nPoints [] = {1,2};
		
		g2d.setColor(Color.red);
		//g2d.drawPolyline(xPoints, yPoints,3);
		
		g2d.fillPolygon(xPoints,yPoints,3);
		
		g2d.setFont (new Font ("Arial", Font.BOLD,40));
		g2d.drawString("Hola", 250, 150);
		
		g2d.setStroke(new BasicStroke(10));
		
		g2d.setColor(Color.cyan);
		g2d.drawRoundRect(450, 150, 200, 150, 10, 10);
		
		/*try {
			File path  = new File ("iconoGato.jpeg");
			BufferedImage image = ImageIO.read(new File(path,"iconoGato.jpeg"));
		}catch(IOException e) {
			//TODO Auto-generated catch black
			e.printStackTrace();
		}
		
		try {
			
			BufferedImage image = ImageIO.read(new File("src/iconoGato.jpeg"));
			g2d.drawImage(image, 200, 500, null);
		}catch(IOException e)
		{
			//TODO Auto-generated catch black
			e.printStackTrace();
		}*/
		
		///////////////////////////////////codigo casa /////////////////////////////////////////////////
		/*super.paint(g);
		Graphics2D casa = (Graphics2D)g;
				
		casa.setColor(Color.decode("#60DCE0"));//azul
		casa.fillRect(0, 0, 1000, 600); // cielo
				
		casa.setColor(Color.decode("#3EF32F"));//verde
		casa.fillRect(0, 520, 1000, 120); // piso/pasto
				
		casa.setColor(Color.decode("#684F26"));//cafe
		casa.fillRect(0, 700, 1000, 30); // piso/tierra 
		
		casa.setColor(Color.decode("#957238"));//cremitaa  
		casa.fillRect(0, 670, 1000, 30); // piso/tierra medio 
		
		casa.setColor(Color.decode("#D3AC6A"));//tierra superior
		casa.fillRect(0, 640, 1000, 30); // piso/tierra superior 
		
		int x =0;
		int y =370; 
		int ancho =23; 
		int anchoHorizontal =10; 
		int separacion =20;

		//cerca horizontal
		for (int i = 0; i<6; i++) {
		    casa.setColor(Color.decode("#AE7B2A"));
		    casa.fillRect(x, y + i * (anchoHorizontal + separacion), 1000, anchoHorizontal); 
		}

		// cerca vertical
		for (int i = 0; i<70; i++) {
		    casa.setColor(Color.decode("#E0AB3B"));
		    casa.fillRect(x + i * (ancho + separacion), y, ancho, 160);
		}
		
		
		
		casa.setColor(Color.decode("#CCAF9F"));//rosa borde
		casa.fillRect(240, 190, 520, 310);//borde casa
		
		casa.setColor(Color.decode("#FEE6DA"));//color casa
		casa.fillRect(250, 200, 500, 300);//casita
				
				
		casa.setColor(Color.decode("#764A34"));//color contorno puerta
		casa.fillRect(300, 330, 100, 170);//contorno puerta
				
		casa.setColor(Color.decode("#955D40"));//color puerta
		casa.fillRect(310, 340, 80,150);//puerta
		
		casa.setColor(Color.decode("#AC9A1F"));//color perilla
		casa.fillOval(365, 398, 20, 19);//perilla puerta
		
		casa.setColor(Color.decode("#D3C143"));//color perilla
		casa.fillOval(367, 400, 15, 15);//perilla puerta
		
		casa.setColor(Color.decode("#969696"));//color base
		casa.fillRect(210, 500, 570, 30); // base casa 
		
		casa.setColor(Color.decode("#BEA7A7"));//color base
		casa.fillRect(210, 140, 570, 50); // techo casa 
		
		casa.setColor(Color.decode("#818181"));//color chimenea
		casa.fillRect(670, 90, 70, 50); // chimenea
		
		casa.setColor(Color.decode("#767676"));//color chimenea arriba
		casa.fillRect(660, 70, 90, 20); // chimenea arriba
		
		casa.setColor(Color.decode("#767676"));//color barilla 1
		casa.fillRect(300, 110, 5, 30); //barilla 1
		
		casa.setColor(Color.decode("#767676"));//color barilla 2
		casa.fillRect(290, 100, 5, 40); //barilla 2
		
		casa.setColor(Color.decode("#9C9C9C"));//color ventana borde
		casa.fillRect(480, 250, 200, 150); //borde ventana
		
		casa.setColor(Color.decode("#7FFFF8"));//Ventana
		casa.fillRect(490, 260, 180, 130);//ventana
		
		casa.setColor(Color.decode("#9C9C9C"));//Ventana marco color
		casa.fillRect(570, 260, 20, 140);//ventana marco*/
		
		///////////////////////////////////////////////////////////// MARIO I //////////////////////////////
		
		/*super.paint(g);
		Graphics2D mario = (Graphics2D)g;
		
		mario.setColor(Color.decode("#B3ECFA"));//azul
		mario.fillRect(0, 0, 1000, 700); // cielo
		
		mario.setColor(Color.decode("#000000"));//tubo azul sombra
		mario.fillRect(350, 305, 195, 510);
		
		mario.setColor(Color.decode("#2D7C8C"));//tubo azul sombra azul
		mario.fillRect(370, 310, 175, 330);
		
		mario.setColor(Color.decode("#54A5B5"));//tubo azul
		mario.fillRect(357, 310, 175, 313);
		
		mario.setColor(Color.decode("#000000"));//color sobra tubo azul
		mario.fillRect(545, 350, 30, 280);
		
		mario.setColor(Color.decode("#FEBD99"));//
		mario.fillRect(0, 650, 1000, 80); // piso
		
		mario.setColor(Color.decode("#000000"));//negro
		mario.fillRect(0, 630, 1000, 25); // piso contorno arriba
		
		mario.setColor(Color.decode("#FEBD99"));
		mario.fillRect(0, 632, 1000, 21); // piso arriba
		
		mario.setColor(Color.decode("#000000"));//color negro cubito
		mario.fillRect(43, 362, 81, 81);
		
		mario.setColor(Color.decode("#FF975D"));
		mario.fillRect(50, 370, 71, 71);
		
		mario.setColor(Color.decode("#000000"));//color negro cubito
		mario.fillRect(225, 113, 144, 76);
		
		mario.setColor(Color.decode("#FF975D"));
		mario.fillRect(228, 117, 67, 67);
		
		mario.setColor(Color.decode("#FF975D"));
		mario.fillRect(300, 117, 67, 67);
		
		mario.setColor(Color.decode("#000000"));//color kubito rosa
		mario.fillRect(232, 430, 200, 200);
		
		mario.setColor(Color.decode("#B98264"));
		mario.fillRect(237, 436, 190, 190);
		
		mario.setColor(Color.decode("#FF975D"));
		mario.fillRect(237, 436, 190, 190);
		
		mario.setColor(Color.decode("#FEBD99"));
		mario.fillRect(240, 437, 175, 182);
		
		mario.setColor(Color.decode("#000000"));//color negro cubito
		mario.fillRect(432, 460, 30, 170);
		
		mario.setColor(Color.decode("#000000"));//color negro kubito esquina
		mario.fillRect(820, 430, 200, 200);
		
		mario.setColor(Color.decode("#5AE254"));//color cubito  verde esquina
		mario.fillRect(830, 436, 190, 190);
		
		mario.setColor(Color.decode("#2DB027"));//sombra de abajo cubo esquina
		mario.fillRect(830, 619, 190, 8);
		
		try {
			
			BufferedImage image = ImageIO.read(new File("src/flor mario.png"));
			mario.drawImage(image, 630, 300, null);
		}catch(IOException e)
		{
			//TODO Auto-generated catch black
			e.printStackTrace();
		}
		
		mario.setColor(Color.decode("#000000"));//sombra cuerpo tubo verde
		mario.fillRect(640, 430, 120, 200);
		
		mario.setColor(Color.decode("#2DB027"));//cuerpo tubo verde
		mario.fillRect(650, 440, 100, 190);
		
		mario.setColor(Color.decode("#28802C"));//cuerpo tubo verde fuerte
		mario.fillRect(650, 440, 30, 190);
		
		mario.setColor(Color.decode("#000000"));// sombra cabeza tubo verde
		mario.fillRect(622, 430, 155, 70);
		
		mario.setColor(Color.decode("#2DB027"));//cabeza tubo verde
		mario.fillRect(632, 440, 135, 50);
		
		mario.setColor(Color.decode("#28802C"));//cabeza tubo verde
		mario.fillRect(632, 440, 50, 50);
		
		int x =0;
		int y =655; 
		int ancho =14; 
		int separacion =34;

		// lineas verticales
		for (int i = 0; i<21; i++) {
		    mario.setColor(Color.decode("#FE9D67"));
		    mario.fillRect(x + i * (ancho + separacion), y, ancho, 100);
		}
		
		
		
		mario.setColor(Color.decode("#FE9D67"));// piso
		mario.fillRect(0, 670, 1000, 80); 
		
		mario.setColor(Color.decode("#0000000"));// arbusto sombra
		mario.fillOval(20, 510, 80, 80);
		
		mario.setColor(Color.decode("#0000000"));// sombra llenado arbusto
		mario.fillRect(30, 590, 100, 40); 
		
		mario.setColor(Color.decode("#0000000"));// arbusto sombra
		mario.fillOval(40, 500, 80, 80);
		
		mario.setColor(Color.decode("#0000000"));// arbusto sombra
		mario.fillOval(60, 540, 80, 80);
		
		mario.setColor(Color.decode("#2DA433"));// arbusto
		mario.fillOval(9, 550, 80, 80);
		
		mario.setColor(Color.decode("#2DA433"));// arbusto
		mario.fillOval(50, 547, 80, 80);
		
		mario.setColor(Color.decode("#2DA433"));// arbusto
		mario.fillOval(30, 510, 80, 80);
		
		mario.setColor(Color.decode("#2DA433"));// llenado arbusto
		mario.fillRect(20, 590, 100, 40); 
		
		mario.setColor(Color.decode("#0000000"));// tornillo 1.1 bloque
		mario.fillOval(61, 374, 10, 10);
		
		mario.setColor(Color.decode("#0000000"));// tornillo 1.2 bloque
		mario.fillOval(102, 374, 10, 10);
		
		mario.setColor(Color.decode("#0000000"));// tornillo 1.3 bloque
		mario.fillOval(60, 424, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 1.4 bloque
		mario.fillOval(102, 424, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 2.1 azul
		mario.fillOval(370, 330, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 2.2 azul
		mario.fillOval(510, 330, 10, 10);
		
		mario.setColor(Color.decode("#0000000"));// tornillo 3.1 verde izq
		mario.fillOval(850, 463, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 3.2 verde izq
		mario.fillOval(850, 600, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 4.1 rosa grande
		mario.fillOval(265, 463, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 4.2 rosa grande
		mario.fillOval(388, 463, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 4.3 rosa grande
		mario.fillOval(265, 590, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 4.4 rosa grande
		mario.fillOval(388, 590, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 5.1 bloque 1/2
		mario.fillOval(239, 125, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 5.2 bloque 1/2
		mario.fillOval(275, 125, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 5.3 bloque 1/2
		mario.fillOval(239, 170, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 5.4 bloque 1/2
		mario.fillOval(275, 170, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 6.1 bloque 2/2
		mario.fillOval(311, 125, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 6.2 bloque 2/2
		mario.fillOval(345, 125, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 6.3 bloque 2/2
		mario.fillOval(310, 170, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 6.4 bloque 2/2
		mario.fillOval(346, 170, 10, 10);
		
		
		try {
			
			BufferedImage image = ImageIO.read(new File("src/mario.png"));
			mario.drawImage(image, 480, 450, null);
		}catch(IOException e)
		{
			//TODO Auto-generated catch black
			e.printStackTrace();
		}
		
		mario.setColor(Color.decode("#000000"));//color negro cubito
		mario.fillRect(883, 224, 81, 81);
		
		mario.setColor(Color.decode("#FF975D"));
		mario.fillRect(888, 230, 71, 71);
		
		mario.setColor(Color.decode("#000000"));// tornillo 7.1 bloque der
		mario.fillOval(902, 245, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 7.2 bloque der
		mario.fillOval(932, 245, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 7.3 bloque der
		mario.fillOval(902, 285, 10, 10);
		
		mario.setColor(Color.decode("#000000"));// tornillo 7.4 bloque der
		mario.fillOval(932, 285, 10, 10);
		*/
		///////////////////////////////////////////////// MARIO II ////////////////////////////////
		super.paint (g);
		
		Graphics2D mario2 = (Graphics2D)g;
		
		mario2.setColor(Color.decode("#0665C0"));//azul
		mario2.fillRect(0, 0, 1000, 700); // cielo
		
		
		mario2.setColor(Color.decode("#CED2DA")); //sombra de nube 1 arbusto
		mario2.fillRoundRect(180, 498, 160, 40,50,50);
		
		mario2.setColor(Color.decode("#EDF2FE")); //nube arbusto
		mario2.fillRoundRect(180, 493, 160, 40,50,50);
		
		mario2.setColor(Color.decode("#CED2DA")); //sombra nube 2
		mario2.fillRoundRect(296, 530, 160, 40,50,50);
		
		mario2.setColor(Color.decode("#EDF2FE")); // nube 2
		mario2.fillRoundRect(296, 533, 160, 40,50,50);
		
		mario2.setColor(Color.decode("#CED2DA")); //sombra  nube 3
		mario2.fillRoundRect(270, 456, 160, 40,50,50);
		
		mario2.setColor(Color.decode("#EDF2FE")); // nube 3
		mario2.fillRoundRect(270, 451, 160, 40,50,50);

		mario2.setColor(Color.decode("#91C2BF"));//montaña fondo 1 sombra
		mario2.fillRoundRect(20, 175, 203, 500,200,250);
		
		mario2.setColor(Color.decode("#A8CAD0"));//montañafondo 1 sombra azul
		mario2.fillRoundRect(28, 180, 190, 490,200,250);
		
		mario2.setColor(Color.decode("#B5D3D8"));//montaña fondo 1 B5D3D8
		mario2.fillRoundRect(25, 180, 180, 490,190,250); 
		
		
		
		mario2.setColor(Color.decode("#CED2DA")); //sombra  nube 5
		mario2.fillRoundRect(-50, 265, 200, 40,50,50);
		
		mario2.setColor(Color.decode("#EDF2FE")); // nube 5
		mario2.fillRoundRect(-50, 260, 200, 40,50,50);
		
		
		
		mario2.setColor(Color.decode("#91C2BF"));//montaña fondo 2 sombra
		mario2.fillRoundRect(357, 175, 208, 500,200,250);
		
		mario2.setColor(Color.decode("#A8CAD0"));//montañafondo 2 sombra azul
		mario2.fillRoundRect(370, 180, 190, 490,200,250);
		
		mario2.setColor(Color.decode("#B5D3D8"));//montaña fondo 2 B5D3D8
		mario2.fillRoundRect(360, 180, 180, 490,190,250); 
		
		
		mario2.setColor(Color.decode("#CED2DA")); //sombra  nube 7
		mario2.fillRoundRect(735, 242, 160, 40,50,50);
		
		mario2.setColor(Color.decode("#EDF2FE")); // nube 7
		mario2.fillRoundRect(735, 237, 160, 40,50,50);
		
		mario2.setColor(Color.decode("#CED2DA")); //sombra  nube 8
		mario2.fillRoundRect(770, 190, 160, 40,50,50);
		
		mario2.setColor(Color.decode("#EDF2FE")); // nube 8
		mario2.fillRoundRect(770, 185, 160, 40,50,50);
		
		
		mario2.setColor(Color.decode("#91C2BF"));//montaña fondo 3 sombra
		mario2.fillRoundRect(564, 105, 208, 500,200,250);
		
		mario2.setColor(Color.decode("#A8CAD0"));//montañafondo 3 sombra azul
		mario2.fillRoundRect(567, 110, 190, 490,200,250);
		
		mario2.setColor(Color.decode("#B5D3D8"));//montaña fondo 3 B5D3D8
		mario2.fillRoundRect(570, 110, 180, 490,190,250); 
		
		
		mario2.setColor(Color.decode("#CED2DA")); //sombra  nube 4
		mario2.fillRoundRect(221, 335, 200, 40,50,50);
		
		mario2.setColor(Color.decode("#EDF2FE")); // nube 4
		mario2.fillRoundRect(221, 330, 200, 40,50,50);
		
		
		
		mario2.setColor(Color.decode("#0f4263"));//montaña 1 sombra
		mario2.fillRoundRect(-85, 432, 250, 400,250,250);
		
		
		mario2.setColor(Color.decode("#419CD5"));//montaña 1 sombra azul
		mario2.fillRoundRect(-90, 435, 250, 400,250,250);
		
		
		mario2.setColor(Color.decode("#76b2d7"));//montaña 1
		mario2.fillRoundRect(-112, 437, 250, 400,250,250);

		mario2.setColor(Color.decode("#CED2DA")); //sombra  nube 6
		mario2.fillRoundRect(535, 388, 160, 40,50,50);
		
		mario2.setColor(Color.decode("#EDF2FE")); // nube 6
		mario2.fillRoundRect(535, 383, 160, 40,50,50);
		
		mario2.setColor(Color.decode("#0f4263"));//montaña 2 sombra
		mario2.fillRoundRect(360, 440, 272, 800,250,250);
		
		mario2.setColor(Color.decode("#419CD5"));//montaña 2 sombra azul
		mario2.fillRoundRect(370, 445, 258, 340,250,250);
		
		mario2.setColor(Color.decode("#76b2d7"));//montaña 2 azul clarito 
		mario2.fillRoundRect(360, 445, 250, 400,250,250);
		
		mario2.setColor(Color.decode("#0f4263"));//montaña 3 sombra
		mario2.fillRoundRect(630, 282, 240, 490,200,250);
		
		mario2.setColor(Color.decode("#419CD5"));//montaña 3 sombra azul
		mario2.fillRoundRect(635, 287, 230, 400,200,250);
		
		mario2.setColor(Color.decode("#76b2d7"));//montaña 3
		mario2.fillRoundRect(634, 290, 170, 400,200,250);
		
		mario2.setColor(Color.WHITE);
		mario2.fillRoundRect(780, 515, 160, 190,400,80);
		
		mario2.setColor(Color.BLACK);  //sombra bloque 1
		mario2.fillRoundRect(848, 430, 55, 43,10,10);
		
		mario2.setColor(Color.decode("#818181"));  //bloque 1
		mario2.fillRoundRect(851, 430, 50, 40,10,10);
		
		mario2.setColor(Color.decode("#979595"));  //bloque 1 sombra gris
		mario2.fillRoundRect(851, 430, 40, 35,10,10);
		
		mario2.setColor(Color.BLACK);  //sombra bloque 2
		mario2.fillRoundRect(848, 473, 55, 43,10,10);
		
		mario2.setColor(Color.decode("#818181"));  //bloque 2
		mario2.fillRoundRect(851, 473, 50, 40,10,10);
		
		mario2.setColor(Color.decode("#979595"));  //bloque 2 sombra gris
		mario2.fillRoundRect(851, 473, 40, 35,10,10);
		
		mario2.setColor(Color.BLACK);  //sombra bloque 3
		mario2.fillRoundRect(848, 516, 55, 43,10,10);
		
		mario2.setColor(Color.decode("#818181"));  //bloque 3
		mario2.fillRoundRect(851, 516, 50, 40,10,10);
		
		mario2.setColor(Color.decode("#979595"));  //bloque 3 sombra gris
		mario2.fillRoundRect(851, 516, 40, 35,10,10);
		
		mario2.setColor(Color.BLACK);  //sombra bloque 4
		mario2.fillRoundRect(848, 386, 55, 45,10,10);
		
		mario2.setColor(Color.decode("#818181"));  //bloque 4
		mario2.fillRoundRect(851, 388, 50, 40,10,10);
		
		mario2.setColor(Color.decode("#979595"));  //bloque 1 sombra gris
		mario2.fillRoundRect(851, 388, 40, 35,10,10);
		
		mario2.setColor(Color.BLACK);  //sombra bloque 5
		mario2.fillRoundRect(902, 386, 55, 45,10,10);
		
		mario2.setColor(Color.decode("#CCA51B"));  //bloque 5 
		mario2.fillRoundRect(905, 388, 50, 40,10,10);
		
		mario2.setColor(Color.decode("#FFD233"));  //bloque 5
		mario2.fillRoundRect(905, 388, 40, 35,10,10);
		
		mario2.setColor(Color.BLACK);  //sombra bloque 6
		mario2.fillRoundRect(956, 386, 55, 45,10,10);
		
		mario2.setColor(Color.decode("#CCA51B"));  //bloque 6
		mario2.fillRoundRect(958, 388, 50, 40,10,10);
		
		mario2.setColor(Color.decode("#FFD233"));  //bloque 5
		mario2.fillRoundRect(958, 388, 40, 35,10,10);
		
		
		mario2.setColor(Color.BLACK);  //ojo izq bloque 5
		mario2.fillRoundRect(913, 403, 10, 13,7,7);
		
		mario2.setColor(Color.BLACK);  //ojo der bloque 5
		mario2.fillRoundRect(934, 403, 10, 13,7,7);
		
		mario2.setColor(Color.WHITE);
		mario2.fillOval(61, 388, 20, 40);
		
		mario2.setColor(Color.WHITE);
		mario2.fillOval(124, 327, 20, 40);
		
		mario2.setColor(Color.WHITE);
		mario2.fillOval(121, 210, 20, 40);
		
		mario2.setColor(Color.WHITE);
		mario2.fillOval(476, 240, 20, 40);
		
		mario2.setColor(Color.WHITE);
		mario2.fillOval(394, 282, 20, 40);
		
		mario2.setColor(Color.WHITE);
		mario2.fillOval(396, 398, 20, 40);
		
		mario2.setColor(Color.WHITE);
		mario2.fillOval(600, 240, 20, 40);
		
		mario2.setColor(Color.WHITE);
		mario2.fillOval(682, 167, 20, 40);
		
		mario2.setColor(Color.WHITE);
		mario2.fillOval(716, 327, 20, 40);
		
		mario2.setColor(Color.WHITE);
		mario2.fillOval(768, 477, 20, 40);
		
		
		
		mario2.setColor(Color.decode("#CF9E61")); //Tierra
		mario2.fillRect(0, 600, 1000, 142); 
		
		
        int columnas =33;
        int circulosPorColumna =3;
        int radio =4;
        int separacionX =30; 
        int separacionY =50; 

        for (int i=0; i<columnas; i++) {
            for (int j=0; j < circulosPorColumna; j++) {
                int x=i * separacionX + 20; 
                int y=j * separacionY + 610; 
                mario2.setColor(Color.decode("#F4C76E")); //puntos piso
                mario2.fillOval(x - radio, y - radio, radio * 2, radio * 2);
            }
        }
        
        try {
			
			BufferedImage image = ImageIO.read(new File("src/flor2.png"));
			mario2.drawImage(image, 510, 390, null);
		}catch(IOException e)
		{
			//TODO Auto-generated catch black
			e.printStackTrace();
		}
        
		
		
		mario2.setColor(Color.decode("#000000"));//sombra cuerpo tubo azul
		mario2.fillRect(502, 450, 90, 150);
		
		mario2.setColor(Color.decode("#726fb6"));//cuerpo tubo azul
		mario2.fillRect(507, 440, 80, 150);
		
		mario2.setColor(Color.decode("#d5d8fb"));//cuerpo tubo azul fuerte
		mario2.fillRect(527, 460, 17, 130);
	
		mario2.setColor(Color.decode("#000000"));// sombra cabeza tubo azul
		mario2.fillRoundRect(492, 435, 110, 50, 10, 10);
		
		mario2.setColor(Color.decode("#726fb6"));//cabeza tubo azul
		mario2.fillRoundRect(497, 438, 100, 40,10,10);
		
		
		
		mario2.setColor(Color.decode("#000000"));//sombra cuerpo tubo azul
		mario2.fillRect(910, 510, 82, 50);
		
		mario2.setColor(Color.decode("#726fb6"));//cuerpo tubo azul 
		mario2.fillRect(917, 510, 70, 50);
		
		mario2.setColor(Color.decode("#000000"));// sombra cabeza tubo azul
		mario2.fillRoundRect(900, 470, 170, 40, 10, 10);
		
		mario2.setColor(Color.decode("#726fb6"));//cabeza tubo azul
		mario2.fillRoundRect(905, 475, 140, 30,10,10);
		
		mario2.setColor(Color.decode("#d5d8fb"));//brillo
		mario2.fillRect(935, 510, 10, 50);
		
		mario2.setColor(Color.decode("#d5d8fb"));//brillo
		mario2.fillRect(923,474, 10, 30);
		
		mario2.setColor(Color.decode("#d5d8fb"));//brillo
		mario2.fillRect(512,438, 15, 40);
		
	    int x = 0;
        int y = 565;
        int diametro = 40;
        int separacion = -10;
        
        // Dibuja los círculos
        
        for (int i = 0; i < 40; i++) {;
            mario2.setColor(Color.decode("#07BD03")); 
            mario2.fillOval(x + i * (diametro + separacion), y, diametro, diametro); 
        }
        
        try {
			
			BufferedImage image = ImageIO.read(new File("src/arbustoxd.png"));
			mario2.drawImage(image, 241, 535, null);
		}catch(IOException e)
		{
			//TODO Auto-generated catch black
			e.printStackTrace();
		}
        
        try {
			
			BufferedImage image = ImageIO.read(new File("src/mario2.png"));
			mario2.drawImage(image, 405, 470, null);
		}catch(IOException e)
		{
			//TODO Auto-generated catch black
			e.printStackTrace();
		}
        
        mario2.setColor(Color.black);//pasto
	    mario2.fillRect(0, 558, 1000, 10); // pasto
	    
	    mario2.setColor(Color.decode("#07BD03"));//pasto
	    mario2.fillRect(0, 560, 1000, 30); // pasto
	    
        
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
		//this.calculadora3();;
		
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
		
		
		
		JLabel NoAccount = new JLabel("Don  ´t have a account?");
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
		
	    
		
	}
	
	
public void calculadora2() {
		
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
		
	}
	
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


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX());
		System.out.println(e.getY());
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}