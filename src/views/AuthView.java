package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import models.AuthModel;

public class AuthView {
    
    JFrame frame;
    JPanel panel;
    AuthModel modelo;

    public AuthView() {
        modelo = new AuthModel();

        frame = new JFrame();
        frame.setBounds(100, 100, 391, 550);
        frame.setLocationRelativeTo(null);// Centrar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
    }

    public JPanel login() {

        panel = new JPanel();
        panel.setBackground(Color.decode("#DFDCFF"));
        panel.setLayout(null);

        JLabel lblLogin = new JLabel("Login");
        lblLogin.setFont(new Font("Tahoma", Font.BOLD, 40));
        lblLogin.setForeground(Color.decode("#263275"));
        lblLogin.setBounds(130, 43, 111, 59);
        panel.add(lblLogin);

        JTextField txtUser = new JTextField();
        txtUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
        txtUser.setBounds(92, 192, 200, 39);
        panel.add(txtUser);
        txtUser.setColumns(10);

        JLabel lblUsuario = new JLabel("Usuario");
        lblUsuario.setForeground(Color.decode("#263275"));
        lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsuario.setBounds(92, 151, 79, 39);
        panel.add(lblUsuario);

        JLabel lblContrasena = new JLabel("Contraseña");
        lblContrasena.setForeground(Color.decode("#263275"));
        lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblContrasena.setBounds(92, 273, 111, 39);
        panel.add(lblContrasena);

        JPasswordField psfContrasena = new JPasswordField();
        psfContrasena.setFont(new Font("Tahoma", Font.PLAIN, 20));
        psfContrasena.setBounds(92, 312, 200, 39);
        panel.add(psfContrasena);

        JButton btnAcceder = new JButton("Acceder");
        btnAcceder.setForeground(Color.WHITE);
        btnAcceder.setBackground(Color.decode("#263275"));
        btnAcceder.setFont(new Font("Tahoma", Font.BOLD, 23));
        btnAcceder.setBounds(92, 400, 195, 59);
        panel.add(btnAcceder);

        btnAcceder.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                String usr = txtUser.getText();
                String psw = new String(psfContrasena.getPassword());

                if ( modelo.login(usr, psw) ){
                    JOptionPane.showMessageDialog(null, "Bienvenido", "Sistema iniciado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }


                // No se necesita condición para mostrar mensajes, ya que se manejan dentro del método login
            }
        });

        // Agregar el panel al contenido del frame
        frame.getContentPane().add(panel);
        frame.setVisible(true);

        return panel;
    }

    public JPanel registro() {
        panel = new JPanel();
        panel.setBackground(Color.pink);
        return panel;
    }
}