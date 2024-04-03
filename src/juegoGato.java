import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class juegoGato {

	private JFrame frame;
	public static boolean turno;
	
	public static int x_cont =0;
	public static int o_cont =0;
	private JPanel panel_1;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JLabel puntosX;
	private JLabel puntosO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		turno=false;
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					juegoGato window = new juegoGato();
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
	public juegoGato() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 196, 222));
		frame.getContentPane().add(panel_1, "name_3389945802100");
		panel_1.setLayout(null);
		
		panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(24, 56, 388, 236);
		panel_1.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		btnNewButton = new JButton("");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btnNewButton);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btnNewButton_1);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btnNewButton_2);
			}
		});
		
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btnNewButton_3);
			}
		});
		
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btnNewButton_4);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btnNewButton_5);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.setForeground(Color.BLACK);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btnNewButton_6);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("");
		btnNewButton_7.setForeground(Color.BLACK);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btnNewButton_7);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("");
		btnNewButton_8.setForeground(Color.BLACK);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click(btnNewButton_8);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnNewButton_8);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReiniciar.setBackground(new Color(173, 216, 230));
		btnReiniciar.setBounds(24, 306, 388, 42);
		panel_1.add(btnReiniciar);
		
		btnReiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Component[] elementos = panel.getComponents();
				for (int i =0;i<elementos.length;i++)
				{
					if(elementos[i].getClass().toString().equals("class javax.swing.JButton")) 
					{
						JButton btn=((JButton)elementos[i]);
						btn.setText("");
						btn.setEnabled(true);
						btn.setBackground(null);
					}
				}
			}
			
		});
		
		puntosX = new JLabel("X =0");
		puntosX.setFont(new Font("Tahoma", Font.BOLD, 14));
		puntosX.setBounds(30, 31, 46, 14);
		panel_1.add(puntosX);
		
		
		puntosO = new JLabel("O = 0");
		puntosO.setFont(new Font("Tahoma", Font.BOLD, 14));
		puntosO.setBounds(237, 31, 46, 14);
		panel_1.add(puntosO);
		
		
		
	}
	
	void puntosObtenidos(String wins) {
        if (wins.equals("X")) {
            x_cont++;
            puntosX.setText("X = " + x_cont);
        } else if (wins.equals("O")) {
            o_cont++;
            puntosO.setText("O = " + o_cont);
        }
    }
		
	public void click(JButton btn) {
					
		// TODO Auto-generated method stub
		
		if(btn.getText().equals("")) {
			
			
			if(turno) {
				btn.setForeground(Color.BLACK);
				btn.setText("O");
				btn.setBackground(Color.decode("#D5BCF0"));
				
				turno=false;
			}else {
				btn.setForeground(Color.BLACK);
				btn.setText("X");
				btn.setBackground(Color.decode("#74B4C9"));
				turno=true;
			}
			
		}
		
		if(btnNewButton_1.getText().equals(btnNewButton_2.getText()) 
				&& btnNewButton.getText().equals(btnNewButton_2.getText()) 
				&& !btnNewButton.getText().equals(""))  {

				JOptionPane.showMessageDialog(null, "Haz ganado", "Felicidades!!", JOptionPane.WARNING_MESSAGE);
				puntosObtenidos(btn.getText());
				
		}
		
		btn.setEnabled(false);
		//primera fila
		if(btnNewButton.getText().equals(btnNewButton_1.getText()) 
				&& btnNewButton.getText().equals(btnNewButton_2.getText()) 
				&& !btnNewButton.getText().equals(""))  {

				JOptionPane.showMessageDialog(null,"Ganaste, eres genial :)", "Felicidades!!", JOptionPane.WARNING_MESSAGE);
				puntosObtenidos(btn.getText());
			
				
		}
		
		//segunda fila
		if(btnNewButton_3.getText().equals(btnNewButton_4.getText()) 
				&& btnNewButton_3.getText().equals(btnNewButton_5.getText()) 
				&& !btnNewButton_3.getText().equals(""))  {

				JOptionPane.showMessageDialog(null, "Ganaste, eres genial :)", "Felicidades!!", JOptionPane.WARNING_MESSAGE);
				puntosObtenidos(btn.getText());
				
		}
		
		if(btnNewButton_6.getText().equals(btnNewButton_7.getText()) 
				&& btnNewButton_6.getText().equals(btnNewButton_8.getText()) 
				&& !btnNewButton_6.getText().equals(""))  {

				JOptionPane.showMessageDialog(null, "Ganaste, eres genial :)", "Felicidades!!", JOptionPane.WARNING_MESSAGE);
				puntosObtenidos(btn.getText());
				
		}
		
		if(btnNewButton.getText().equals(btnNewButton_3.getText()) 
				&& btnNewButton.getText().equals(btnNewButton_6.getText()) 
				&& !btnNewButton.getText().equals(""))  {

				JOptionPane.showMessageDialog(null, "Ganaste, eres genial :)", "Felicidades!!", JOptionPane.WARNING_MESSAGE);
				puntosObtenidos(btn.getText());
				
		}
		
		if(btnNewButton_1.getText().equals(btnNewButton_4.getText()) 
				&& btnNewButton_1.getText().equals(btnNewButton_7.getText()) 
				&& !btnNewButton_1.getText().equals(""))  {

				JOptionPane.showMessageDialog(null, "Ganaste, eres genial :)", "Felicidades!!", JOptionPane.WARNING_MESSAGE);
				puntosObtenidos(btn.getText());
				
		}
		
		if(btnNewButton_2.getText().equals(btnNewButton_5.getText()) 
				&& btnNewButton_2.getText().equals(btnNewButton_8.getText()) 
				&& !btnNewButton_2.getText().equals(""))  {

				JOptionPane.showMessageDialog(null,"Ganaste, eres genial :)", "Felicidades!!", JOptionPane.WARNING_MESSAGE);
				puntosObtenidos(btn.getText());
				
		
		}
		
		if(btnNewButton.getText().equals(btnNewButton_4.getText()) 
				&& btnNewButton.getText().equals(btnNewButton_8.getText()) 
				&& !btnNewButton.getText().equals(""))  {

				JOptionPane.showMessageDialog(null,"Ganaste, eres genial :)", "Felicidades!!", JOptionPane.WARNING_MESSAGE);
				puntosObtenidos(btn.getText());
				
		}
				
		if(btnNewButton_6.getText().equals(btnNewButton_4.getText()) 
			&& btnNewButton_6.getText().equals(btnNewButton_2.getText()) 
			&& !btnNewButton_6.getText().equals(""))  {

			JOptionPane.showMessageDialog(null,"Ganaste, eres genial :)", "Felicidades!!", JOptionPane.WARNING_MESSAGE);
			puntosObtenidos(btn.getText());
						
		}		
				
		
		
	}
	
	
}