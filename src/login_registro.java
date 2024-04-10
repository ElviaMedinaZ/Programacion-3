import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login_registro {

	private JFrame frmVentana;
	private JTextField textFieldNombre;
	private JTextField txtFieldCorreo;
	private JTextField txtFieldApellido;
	private JPasswordField fieldContra;
	private JPasswordField fieldConfirmarContra;
	private JTextField ApellidoMaterno;
	private JPanel panelCenterLog;
	private JTextField textFieldUsuario;
	private JTextField textField;
	
	private CardLayout cardLayout; 
	private JMenuItem mntmRegistro;
    private JMenuItem mntmLoginLog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_registro window = new login_registro();
					window.frmVentana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login_registro() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
        frmVentana = new JFrame();
        frmVentana.setTitle("Inicio de sesión");
        frmVentana.setBounds(100, 100, 604, 760);
        frmVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cardLayout = new CardLayout();
        frmVentana.getContentPane().setLayout(cardLayout);
        
        
        
        
        /////////////////////////////////////////////// PANELES //////////////////////////////////
        
        JPanel panelRegistrarse = new JPanel();
        panelRegistrarse.setBackground(new Color(153, 102, 204));
        frmVentana.getContentPane().add(panelRegistrarse,"registrarse");
        panelRegistrarse.setLayout(new BorderLayout(0, 0));
        
        JPanel panelNorth = new JPanel();
        panelNorth.setBackground(SystemColor.menu);
        panelRegistrarse.add(panelNorth, BorderLayout.NORTH);
        panelNorth.setLayout(new FlowLayout(FlowLayout.LEFT)); 
        
        JPanel panelWest = new JPanel();
        panelWest.setBackground(new Color(0, 102, 153));
        panelRegistrarse.add(panelWest, BorderLayout.WEST);
        
        JPanel panelEast = new JPanel();
        panelEast.setBackground(new Color(0, 102, 153));
        panelRegistrarse.add(panelEast, BorderLayout.EAST);
        
        JPanel panelSouth = new JPanel();
        panelSouth.setBackground(new Color(0, 102, 153));
        panelRegistrarse.add(panelSouth, BorderLayout.SOUTH);
        
        JPanel panelCenter = new JPanel();
        panelCenter.setBackground(new Color(0, 102, 153));
        panelRegistrarse.add(panelCenter, BorderLayout.CENTER);
        panelCenter.setLayout(new GridLayout(0, 1, 0, 0));
        
        //////////////////////////////////////////// MENU ////////////////////////////////
        JMenuBar menuBar = new JMenuBar();
        panelNorth.add(menuBar);
        
        JMenu mnUsuarios = new JMenu("Usuarios");
        menuBar.add(mnUsuarios);
        
        JMenuItem mntmLogin = new JMenuItem("Login");
        
        
        mnUsuarios.add(mntmLogin);
        
        
        JMenuItem mntmRegistrar = new JMenuItem("Registrar");
        mnUsuarios.add(mntmRegistrar);
        
        ////////////////////////////////////////////////////////////////////////
        
        JLabel lblNewLabel = new JLabel("                 ");
        panelWest.add(lblNewLabel);
              
        JLabel lblNewLabel_1 = new JLabel("                 ");
        panelEast.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("                 ");
        panelSouth.add(lblNewLabel_2);
        
        JLabel lblRegistrarse = new JLabel(" Registrarse");
        lblRegistrarse.setHorizontalAlignment(SwingConstants.CENTER);
        lblRegistrarse.setFont(new Font("Arial", Font.BOLD, 40));
        lblRegistrarse.setForeground(Color.WHITE);
        panelCenter.add(lblRegistrarse);
        
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNombre.setForeground(Color.WHITE);
        panelCenter.add(lblNombre);
        
        textFieldNombre = new JTextField();
        textFieldNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
        panelCenter.add(textFieldNombre);
        textFieldNombre.setColumns(10);
        
        JLabel lblApellido = new JLabel("Apellido Paterno");
        lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblApellido.setForeground(Color.WHITE);
        panelCenter.add(lblApellido);
        
        txtFieldApellido = new JTextField();
        txtFieldApellido.setFont(new Font("Tahoma", Font.PLAIN, 20));
        txtFieldApellido.setColumns(10);
        panelCenter.add(txtFieldApellido);
        
        JLabel lblApellidoMaterno = new JLabel("Apellido Materno:");
        lblApellidoMaterno.setForeground(Color.WHITE);
        lblApellidoMaterno.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panelCenter.add(lblApellidoMaterno);
        
        ApellidoMaterno = new JTextField();
        ApellidoMaterno.setFont(new Font("Tahoma", Font.PLAIN, 20));
        ApellidoMaterno.setColumns(10);
        panelCenter.add(ApellidoMaterno);
        
        JLabel lblCorreo = new JLabel("Correo electrónico");
        lblCorreo.setForeground(Color.WHITE);
        lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panelCenter.add(lblCorreo);
        
        txtFieldCorreo = new JTextField();
        txtFieldCorreo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        txtFieldCorreo.setColumns(10);
        panelCenter.add(txtFieldCorreo);
        
        JLabel lblContraseña = new JLabel("Contraseña");
        lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblContraseña.setForeground(Color.WHITE);
        panelCenter.add(lblContraseña);
        
        fieldContra = new JPasswordField();
        fieldContra.setFont(new Font("Tahoma", Font.PLAIN, 20));
        panelCenter.add(fieldContra);
        
        JLabel lblConfirmarContra = new JLabel("Confirmar contraseña");
        lblConfirmarContra.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblConfirmarContra.setForeground(Color.WHITE);
        panelCenter.add(lblConfirmarContra);
        
        fieldConfirmarContra = new JPasswordField();
        fieldConfirmarContra.setFont(new Font("Tahoma", Font.PLAIN, 20));
        panelCenter.add(fieldConfirmarContra);
        
        JCheckBox chckbxTerminos = new JCheckBox("Acepto los términos y condiciones, vendo mi alma al diablo.");
        chckbxTerminos.setSelected(true);
        chckbxTerminos.setFont(new Font("Tahoma", Font.PLAIN, 14));
        chckbxTerminos.setForeground(Color.WHITE);
        chckbxTerminos.setOpaque(false);
        
        panelCenter.add(chckbxTerminos);
        
        JButton btnRegistrarse = new JButton("Registrarse");
        btnRegistrarse.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        				
				String contra = new String(fieldContra.getPassword());
				String contraConf = new String(fieldConfirmarContra.getPassword());

				if (contra.equals(contraConf)) 
				{
					fieldContra.setBorder(BorderFactory.createLineBorder(Color.green,2));
					fieldConfirmarContra.setBorder(BorderFactory.createLineBorder(Color.green,2));
					JOptionPane.showMessageDialog(frmVentana, "Success", "Registro ", JOptionPane.INFORMATION_MESSAGE);
                }

				else
				{
					fieldContra.setBorder(BorderFactory.createLineBorder(Color.red,2));
					fieldConfirmarContra.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
			}
        	
        	

		});
        
        btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 17));
        btnRegistrarse.setBackground(Color.decode("#ecd47f"));
        panelCenter.add(btnRegistrarse); 
        
        /////////////////////////////////////////////////////////  PANEL LOGIN ////////////////////////////////////////////
        
        JPanel panelLogin = new JPanel();
        frmVentana.getContentPane().add(panelLogin,"login");
        panelLogin.setLayout(new BorderLayout(0, 0));
        
        
        
        JPanel panelNorthLog = new JPanel();
        panelNorthLog.setBackground(SystemColor.menu);
        panelLogin.add(panelNorthLog, BorderLayout.NORTH);
        panelNorthLog.setLayout(new GridLayout(0, 1, 0, 0));
        
        JPanel panelWestLog = new JPanel();
        panelWestLog.setBackground(new Color(0, 128, 128));
        panelLogin.add(panelWestLog, BorderLayout.WEST);
        
        JLabel lblNewLabel_6 = new JLabel("                 ");
        panelWestLog.add(lblNewLabel_6);
        
        JPanel PanelEastLog = new JPanel();
        PanelEastLog.setBackground(new Color(0, 128, 128));
        panelLogin.add(PanelEastLog, BorderLayout.EAST);
        
        JLabel lblNewLabel_5 = new JLabel("                 ");
        PanelEastLog.add(lblNewLabel_5);
        
        JPanel panelSouthLog = new JPanel();
        panelSouthLog.setBackground(new Color(0, 128, 128));
        panelLogin.add(panelSouthLog, BorderLayout.SOUTH);
        
        JLabel lblNewLabel_4 = new JLabel("        ");
        panelSouthLog.add(lblNewLabel_4);
        
        panelCenterLog = new JPanel();
        panelCenterLog.setBackground(new Color(0, 128, 128));
        panelLogin.add(panelCenterLog, BorderLayout.CENTER);
        panelCenterLog.setLayout(new GridLayout(0, 1, 60, 10));
        
        
        JLabel lblLogin = new JLabel(" Login");
        lblLogin.setBackground(new Color(255, 255, 255));
        lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogin.setFont(new Font("Arial", Font.BOLD, 40));
        lblLogin.setForeground(Color.WHITE);
        panelCenterLog.add(lblLogin);
        
        JLabel lblUsuario= new JLabel("Usuario");
        lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblUsuario.setForeground(Color.WHITE);
        panelCenterLog.add(lblUsuario);
        
        textFieldUsuario = new JTextField();
        textFieldUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textFieldUsuario.setToolTipText("");
        panelCenterLog.add(textFieldUsuario);
        textFieldUsuario.setColumns(10);
        
        JLabel lblContraseñaLog = new JLabel("Contraseña");
        lblContraseñaLog.setForeground(new Color(255, 255, 255));
        lblContraseñaLog.setFont(new Font("Tahoma", Font.PLAIN, 16));
        panelCenterLog.add(lblContraseñaLog);
        
        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        panelCenterLog.add(textField);
        textField.setColumns(10);
        
        JLabel lblRelleno1 = new JLabel("                                                                                                                 ");
        panelCenterLog.add(lblRelleno1);
        
        JButton btnIngresar = new JButton("Ingresar");
        btnIngresar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(frmVentana, "Registro fallido,intente nuevamente", "Error", JOptionPane.WARNING_MESSAGE);
        	}
        });
        btnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnIngresar.setBackground(Color.decode("#ecd47f"));
        panelCenterLog.add(btnIngresar);
        
        JLabel lblRelleno2 = new JLabel("");
        panelCenterLog.add(lblRelleno2);
        
        JLabel lblRelleno3 = new JLabel("");
        panelCenterLog.add(lblRelleno3);
        
        JLabel lblRelleno4 = new JLabel("");
        panelCenterLog.add(lblRelleno4);
        
        JLabel lblRelleno5 = new JLabel("");
        panelCenterLog.add(lblRelleno5);
        
        JLabel lblRelleno7 = new JLabel("");
        panelCenterLog.add(lblRelleno7);
        
        JLabel lblRelleno6 = new JLabel(" ");
        panelCenterLog.add(lblRelleno6);
        
        //////////////////////////////////////////// MENU ////////////////////////////////
        
        JMenuBar menuBarMenu = new JMenuBar();
        panelNorthLog.add(menuBarMenu);
        
        JMenu mnMenu = new JMenu("Usuarios");
        mnMenu.setHorizontalAlignment(SwingConstants.CENTER);
        menuBarMenu.add(mnMenu);
        
        //JMenuItem mntmInicio = new JMenuItem("Inicio");
        //mnMenu.add(mntmInicio);
        
        mntmLoginLog = new JMenuItem("Login");
        mntmLoginLog.setHorizontalAlignment(SwingConstants.CENTER);
        mnMenu.add(mntmLoginLog);
        
        mntmLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarLogin();
            }
        });
        
        
        mntmRegistro = new JMenuItem("Registro");
        mnMenu.add(mntmRegistro);
        
        mntmRegistro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarRegistro();
            }
        });
        
        ///////////////////////////////////////////////////////////////////////////////////
        
        
    
    }
	
	  private void mostrarRegistro() {
          cardLayout.show(frmVentana.getContentPane(), "registro");
         // mntmRegistro.setEnabled(false);
         // mntmLoginLog.setEnabled(true);
      }

      
      private void mostrarLogin() {
          cardLayout.show(frmVentana.getContentPane(), "login");
          
      }
}
