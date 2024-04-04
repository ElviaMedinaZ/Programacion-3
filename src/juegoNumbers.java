import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.BoxLayout;

public class juegoNumbers {

    private JFrame frmRompecabezasNumerico;
    private JButton[][] botones;
    private JButton botonVacio; // sirve para intercambiar los botones al arrastrar
    private int hrs=0;
    private int miliseg=0;
    private int seg=0;
    private int min=0;
    private JLabel lblTiempo;
    private Timer timer;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    juegoNumbers window = new juegoNumbers();
                    window.frmRompecabezasNumerico.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public juegoNumbers() {
        initialize();
        timer=new Timer(10,(ActionEvent e)->{
        	
        	iniciar();
        }) ;
    }

    private void iniciar() {
		// TODO Auto-generated method stub
		tiempo();
		correrTiempo();
	}

	private void initialize() {
        frmRompecabezasNumerico = new JFrame();
        frmRompecabezasNumerico.setTitle("Rompecabezas numerico");
        frmRompecabezasNumerico.setBounds(100, 100, 521, 520);
        frmRompecabezasNumerico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmRompecabezasNumerico.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));

        JPanel panel = new JPanel();
        panel.setBackground(new Color(221, 160, 221));
        frmRompecabezasNumerico.getContentPane().add(panel);
        panel.setLayout(new BorderLayout(0, 0));

        botones = new JButton[4][4];

        String[] btn = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",""};
        //int indice=0;
        int[] indice = acomodo(16);

        JPanel panelCenter = new JPanel();
        panelCenter.setBackground(new Color(255, 204, 255));
        panelCenter.setLayout(new GridLayout(4, 4, 10, 5));

        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                JButton boton = new JButton(btn[indice[fila * 4 + columna]]);
                boton.addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {
                        botonVacio = obtenerBotonVacio(boton);
                        if (botonVacio != null) {
                            intercambiarBotones(botonVacio, boton);
                        }
                    }
                });
               
                
                botones[fila][columna] = boton;
                botones[fila][columna].setBackground(Color.decode("#F6E5FF"));
                botones[fila][columna].setFont(new Font("Arial",Font.BOLD,16));
                panelCenter.add(boton);
                
               // indice++;
            }
            
            
        }

        panel.add(panelCenter, BorderLayout.CENTER);
        
        JPanel panelNorth = new JPanel();
        panelNorth.setBackground(new Color(255, 204, 255));
        panel.add(panelNorth, BorderLayout.NORTH);
        
        JPanel panelWest = new JPanel();
        panelWest.setBackground(new Color(255, 204, 255));
        panel.add(panelWest, BorderLayout.WEST);
        
        JPanel panelSouth = new JPanel();
        panelSouth.setBackground(new Color(255, 204, 255));
        panel.add(panelSouth, BorderLayout.SOUTH);
        panelSouth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        
        
        JPanel panelEast = new JPanel();
        panelEast.setBackground(new Color(255, 204, 255));
        panel.add(panelEast, BorderLayout.EAST);
        panelEast.setLayout(new BoxLayout(panelEast, BoxLayout.Y_AXIS));
        
        
        
         lblTiempo = new JLabel("Tiempo: 0\r\n");
        lblTiempo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTiempo.setHorizontalAlignment(SwingConstants.CENTER);
        panelEast.add(lblTiempo);
        
        JLabel lblNewLabel = new JLabel("                              ");
        panelEast.add(lblNewLabel);
        
        
        JButton btnIniciar = new JButton("       Iniciar    ");
        btnIniciar.setBackground(Color.decode("#FBE66F"));
        btnIniciar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	timer.start();
        	btnIniciar.setEnabled(false);
        	}
        });
        btnIniciar.setFont(new Font("Arial", Font.BOLD, 16));
        panelEast.add(btnIniciar);
        
        JLabel lblNewLabel_1 = new JLabel("                               ");
        panelEast.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("                       ");
        panelEast.add(lblNewLabel_1_1);
        
        JButton btnPausar = new JButton("      Pausar   ");
        btnPausar.setBackground(Color.decode("#CDA9E9"));
        btnPausar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		timer.stop();
            	btnIniciar.setEnabled(true);
        	}
        });
        btnPausar.setFont(new Font("Arial", Font.BOLD, 16));
        panelEast.add(btnPausar);
        
        JLabel lblNewLabel_1_2 = new JLabel("                    ");
        panelEast.add(lblNewLabel_1_2);
        
        JLabel lblNewLabel_1_3 = new JLabel("                           ");
        panelEast.add(lblNewLabel_1_3);
        
        JButton btnReiniciar = new JButton("    Reiniciar  ");
        btnReiniciar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		reiniciar();
        		if(timer.isRunning()) {
        			timer.stop();
        			btnIniciar.setEnabled(true);
        		}
        		timer.stop();
        		hrs=0;
        		min=0;
        		seg=0;
        		correrTiempo();
        	}
        });
        btnReiniciar.setFont(new Font("Arial", Font.BOLD, 16));
        btnReiniciar.setBackground(new Color(117, 196, 208));
        panelEast.add(btnReiniciar);
        
       
    }
    
    
    ////////////////////////////////////// ACOMODO TABLERO //////////////////////////////////////////////////////////////
    private int[] acomodo(int tam) {
        int[] indices = new int[tam];

        for (int i = 0; i < tam; i++) {
            indices[i] = i;
        }

        Random random = new Random();

        for (int i = tam - 1; i > 0; i--) {
            int recorridoBotones = random.nextInt(i + 1);
            int aux = indices[recorridoBotones];

            indices[recorridoBotones] = indices[i];
            indices[i] = aux;
        }

        return indices;
    }

    private JButton obtenerBotonVacio(JButton boton) {
        int filaBoton = -1;
        int columnaBoton = -1;

        // posicion del boton
        for (int fila = 0; fila < botones.length; fila++) {
            for (int columna = 0; columna < botones[fila].length; columna++) {
                if (botones[fila][columna] == boton) {
                    filaBoton = fila;
                    columnaBoton = columna;
                    break;
                }
            }
        }

        // Verifica si los botones se pueden mover al espacio vacio
        JButton botonVacio = null;
        if (filaBoton > 0 && botones[filaBoton - 1][columnaBoton].getText().equals("")) {
            botonVacio = botones[filaBoton - 1][columnaBoton];
        } else if (filaBoton < botones.length - 1 && botones[filaBoton + 1][columnaBoton].getText().equals("")) {
            botonVacio = botones[filaBoton + 1][columnaBoton];
        } else if (columnaBoton > 0 && botones[filaBoton][columnaBoton - 1].getText().equals("")) {
            botonVacio = botones[filaBoton][columnaBoton - 1];
        } else if (columnaBoton < botones[filaBoton].length - 1 && botones[filaBoton][columnaBoton + 1].getText().equals("")) {
            botonVacio = botones[filaBoton][columnaBoton + 1];
        }

        return botonVacio;
    }

    
    
    private void intercambiarBotones(JButton botonVacio, JButton botonMovido) {
      if(timer.isRunning())
      {
    	  String aux = botonVacio.getText();
          botonVacio.setText(botonMovido.getText());
          botonMovido.setText(aux);
          
          ganar();
      }
     
    }
    
    private void reiniciar() {
        int[] indice = acomodo(16);
        
      
        
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                if (indice[fila * 4 + columna] == 15) { 
                    botones[fila][columna].setText("");
                } else {
                    botones[fila][columna].setText(String.valueOf(indice[fila * 4 + columna] + 1));
                }
            }
        }
    }

    
    ////////////////////////////////////// GANAR //////////////////////////////////////////////////////////////
    
    private void ganar() {
        // Matriz aux para  los num en  botones
        String[][] numerosEnBotones = new String[4][4];
        int contador=0;
        
        // llena la matriz aux
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                numerosEnBotones[fila][columna] = botones[fila][columna].getText();
            }
        }
        
        // Matriz ganadora
        String[][] ordenGanador = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", ""}
        };
        
        // Comparar  matrices
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                if (!numerosEnBotones[fila][columna].equals(ordenGanador[fila][columna])) {
                	contador=0;
                    return;
                }
                else {
                	contador++;
                }
            }
        }
        
       if (contador == 16)
       {
    	   timer.stop();
    	   JOptionPane.showMessageDialog(null, "Felidades terminaste el rompecabezas","Ganaste",JOptionPane.WARNING_MESSAGE);
       }
    }

    ////////////////////////////////////// TIEMPO //////////////////////////////////////////////////////////////
    public void tiempo() {
		miliseg++;
		
		if(		miliseg==100) {
			miliseg=0;
			seg++;
		}
		if(seg==60) {
			seg=0;
			min++;
		}
		if(min==60) {
			min=0;
			min++;
		}
		correrTiempo();
	}
	
	public void correrTiempo() {
		lblTiempo.setText(" Tiempo:\n "+ hrs +":"+ min +":"+ seg );
	}
  

   
}