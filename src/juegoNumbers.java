import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class juegoNumbers {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					juegoNumbers window = new juegoNumbers();
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
	public juegoNumbers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 521, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(221, 160, 221));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(new Color(221, 160, 221));
		panelBotones.setBounds(39, 34, 428, 374);
		panel.add(panelBotones);
		panelBotones.setLayout(new GridLayout(4, 4, 10, 5));
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(125, 428, 253, 42);
		panel.add(btnNewButton);
		
		String[] btn = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",""};

        int[] indice = acomodo(16);
     
        for (int i=0;i<16; i++) 
        {
            JButton boton = new JButton(btn[indice[i]]);
            panelBotones.add(boton);
        }
    }

    
    private int[] acomodo(int tam) 
    {
        int[] indices = new int[tam];
        
        for (int i = 0; i<tam; i++) 
        {
            indices[i] = i;
        }
        
        Random random = new Random();
        
        for (int i = tam-1; i>0; i--) 
        {
            int index = random.nextInt(i+1);
            int temp = indices[index];
            
            indices[index] = indices[i];
            indices[i] = temp;
        }
        
        return indices;
    }
		
		 
	
}

