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
    private int x;
    private int y;

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
        btnReiniciar.setBackground(new Color(221, 160, 221));
        btnReiniciar.setForeground(Color.WHITE);
        btnReiniciar.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnReiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panelBoton.add(btnReiniciar);

        JPanel panelDibujar = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.PINK);
                int ancho = 100; 
                int alto = 50; 
                int rectX = (getWidth()-ancho)/2; 
                int rectY = (getHeight()-alto)/2; 
                g.fillRect(rectX, rectY, ancho, alto);
            }
        };
        panelDibujar.setBackground(new Color(223, 248, 249));
        panelDibujar.addKeyListener(this); 
        panel.add(panelDibujar, BorderLayout.CENTER);

      
        x = panelDibujar.getWidth() / 2-100;
        y = panelDibujar.getHeight()/2-50;
        
        frame.addKeyListener(this); // Añadir el KeyListener al frame
        frame.setFocusable(true);//para poner el foco
        frame.requestFocusInWindow();// recibe el foco en la ventana actual
        frame.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.print( e.getKeyChar()  + " = " + e.getKeyCode()+"\n"); //tecla presioanda
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}

