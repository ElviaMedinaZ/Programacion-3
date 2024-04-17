import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;

public class TableroDibujo extends JPanel implements KeyListener {
    private JFrame frame;
    
    private int x=220;
	private int y=220;
	private int ancho=30;
	private int alto=30;
	//private String color;
	
	
	
	Player p1 = new Player(x,y,ancho,alto,"#F296FF");
	Player obstaculo = new Player(100,170,60,200,"#DAF7A6");

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TableroDibujo window = new TableroDibujo();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public TableroDibujo() {
        initialize();
    }
    
    
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 649, 605);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new BorderLayout(0, 0));

        JPanel panelBoton = new JPanel();
        panelBoton.setBackground(new Color(176, 224, 230));
        panel.add(panelBoton, BorderLayout.SOUTH);

        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setBackground(new Color(202, 81, 190));
        btnReiniciar.setForeground(Color.WHITE);
        btnReiniciar.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnReiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panelBoton.add(btnReiniciar);
        
        // ////////////////////////////////////// PANEL DIBUJAR /////////////////////////////////

        JPanel panelDibujar = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
               g.setColor(Color.decode(p1.getColor()));
               g.fillRect(p1.getX(),p1.getY(),p1.getAncho(),p1.getAlto());
               
               g.setColor(Color.decode(obstaculo.getColor()));
               g.fillRect(obstaculo.getX(),obstaculo.getY(),obstaculo.getAncho(),obstaculo.getAlto());
            }
        };
        
        panelDibujar.setBackground(new Color(223, 248, 249));
        panelDibujar.addKeyListener(this); 
        panel.add(panelDibujar, BorderLayout.CENTER);

      
        //x = panelDibujar.getWidth() / 2-100;
        //y = panelDibujar.getHeight()/2-50;
        
        frame.addKeyListener(this); // Añadir el KeyListener al frame
        frame.setFocusable(true);//para poner el foco
       // frame.requestFocusInWindow();// recibe el foco en la ventana actual
        //frame.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.print( e.getKeyChar()  + " = " + e.getKeyCode()+"\n"); //tecla presionada
        
        // ////////////////////////// MOVIMIENTO /////////////////////////////////////

        
        switch(e.getKeyCode()) 
        {
        
        case 87://w

            p1.setY(p1.getY() -10);
            if(p1.colision(obstaculo)) {
            	 System.out.println("Colision");
            	p1.setY(p1.getY() + 10);
            }
            		 
            break;
            
        case 83://s
            p1.setY(p1.getY() + 10);
            if(p1.colision(obstaculo)) {
            	 System.out.println("Colision");
            	 p1.setY(p1.getY() - 10);
            }
            	
            break;
            
            
        case 68://d
            p1.setX(p1.getX() + 10);
            if(p1.colision(obstaculo)) {
            	 System.out.println("Colision");
            	 p1.setX(p1.getX() - 10);
            }
            break;
            
        case 65://a
            p1.setX(p1.getX() - 10);
            if(p1.colision(obstaculo)) {
            	 System.out.println("Colision");
            	 p1.setX(p1.getX() + 10);
            }
            
            break;
            
            default:
                break;      
        }
 
        
        frame.repaint();
       // frame.update(getGraphics());
    }
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}

