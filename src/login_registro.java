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
	private JTextField textFieldCorreoRecuperarCuenta;

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
        frmVentana.setBackground(SystemColor.menu);
        frmVentana.setTitle("ventana");
        frmVentana.setBounds(100, 100, 604, 760);
        frmVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        login(frmVentana);
        registro(frmVentana);
        recuperarCuenta(frmVentana);
        
        
        
        
        /////////////////////////////////////////////// PANELES //////////////////////////////////
        
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(SystemColor.menu);
        frmVentana.setJMenuBar(menuBar);
        
        
        //========================================== MENU DE CUENTA ==========================================
        
        
        JMenu mnCuenta = new JMenu("Cuenta");
        menuBar.add(mnCuenta);
      //========================================== MENU DE LOGIN ==========================================
        
        
        JMenuItem mntmLogin = new JMenuItem("Login");
        mntmLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVentana.getContentPane().removeAll();
				login(frmVentana);
				frmVentana.validate();
				frmVentana.repaint();
			}
		});
        mnCuenta.add(mntmLogin);
       
      //========================================== MENU DE REGISTRO ==========================================
        
        
        JMenuItem mntmRegistro = new JMenuItem("Registro");
        mntmRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVentana.getContentPane().removeAll();
				//recover(frmVentana);
				registro(frmVentana);
				frmVentana.validate();
				frmVentana.repaint();
			}
		});
        mnCuenta.add(mntmRegistro);
        
        
        //========================================== MENU RECUPERACION DE CUENTA ==========================================
        
        JMenuItem mntmRecuperacionCuenta = new JMenuItem("Recuperación de cuenta");
        mntmRecuperacionCuenta.setHorizontalAlignment(SwingConstants.CENTER);
        
        mntmRecuperacionCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVentana.getContentPane().removeAll();
				recuperarCuenta(frmVentana);
				frmVentana.validate();
				frmVentana.repaint();
			}
		});
        
        mnCuenta.add(mntmRecuperacionCuenta);
        
        //========================================== MENU DE USUARIOS ==========================================
        
        
        JMenu mnUsuarios = new JMenu("Usuarios");
        mnUsuarios.setBackground(new Color(0, 102, 153));
        menuBar.add(mnUsuarios);
        
        JMenuItem mntmAlta = new JMenuItem("Alta");
        mnUsuarios.add(mntmAlta);
        
        mntmAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVentana.getContentPane().removeAll();
				alta(frmVentana);
				frmVentana.validate();
				frmVentana.repaint();
			}
		});
        
        
        JMenuItem mntmBaja = new JMenuItem("Baja");
        mnUsuarios.add(mntmBaja);
        
        mntmBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVentana.getContentPane().removeAll();
				baja(frmVentana);
				frmVentana.validate();
				frmVentana.repaint();
			}
		});
        
        
        
        JMenuItem mntmConsultar = new JMenuItem("Consultar");
        mnUsuarios.add(mntmConsultar);
        
        mntmConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVentana.getContentPane().removeAll();
				consultar(frmVentana);
				frmVentana.validate();
				frmVentana.repaint();
			}
		});
        
        //========================================== MENU DE AYUDA ==========================================
        
        JMenu mnAyuda = new JMenu("Ayuda");
        menuBar.add(mnAyuda);
        
        JMenuItem mntmComoCrearUsr = new JMenuItem("¿Cómo crear un usuario?");
        mnAyuda.add(mntmComoCrearUsr);
        
        mntmComoCrearUsr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVentana.getContentPane().removeAll();
				creacionUsuario(frmVentana);
				frmVentana.validate();
				frmVentana.repaint();
			}
		});
        
        JMenuItem mntmAccederSis = new JMenuItem("¿Cómo acceder al sistema?");
        mnAyuda.add(mntmAccederSis);
        
        mntmAccederSis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVentana.getContentPane().removeAll();
				accederSistema(frmVentana);
				frmVentana.validate();
				frmVentana.repaint();
			}
		});
        
        
        
        JMenuItem mntmOlvidarContra = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
        mnAyuda.add(mntmOlvidarContra);
        
        mntmOlvidarContra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmVentana.getContentPane().removeAll();
				olvideContraseña(frmVentana);
				frmVentana.validate();
				frmVentana.repaint();
			}
		});
        
       
    
    }
	
// //////////////////////////////////////// PANEL DE REGISTRO /////////////////////////////////////
	
	public void registro(JFrame frame)
	{
		 JPanel panelRegistrarse = new JPanel();
	        panelRegistrarse.setBackground(new Color(153, 102, 204));
	        frmVentana.getContentPane().add(panelRegistrarse, "name_15220231935500");
	        panelRegistrarse.setLayout(new BorderLayout(0, 0));
	        
	        JPanel panelNorth = new JPanel();
	        panelNorth.setBackground(new Color(0, 102, 153));
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
	        
	       
	}
	
	// //////////////////////////////////////// PANEL DE LOGIN ////////////////////////////////////
	
	public void login (JFrame frame)
	{
        frmVentana.getContentPane().setLayout(new CardLayout(0, 0));
     JPanel panelLogin = new JPanel();
        frmVentana.getContentPane().add(panelLogin, "name_15220211530200");
        panelLogin.setLayout(new BorderLayout(0, 0));
        
        
        
        JPanel panelNorthLog = new JPanel();
        panelNorthLog.setBackground(new Color(51, 153, 153));
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
        
        JLabel lblNewLabel_3 = new JLabel("");
        panelCenterLog.add(lblNewLabel_3);
        
        
        JLabel lblLogin = new JLabel(" Login");
        lblLogin.setBackground(new Color(255, 255, 255));
        lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogin.setFont(new Font("Arial", Font.BOLD, 39));
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
        
	}
	
	// //////////////////////////////////////// PANEL DE CUENTA /////////////////////////////////////
	
	public void recuperarCuenta(JFrame frame) 
	{
	        
		 JPanel panelRecuperacion = new JPanel();
		 panelRecuperacion.setBackground(new Color(153, 102, 204));
	     frmVentana.getContentPane().add(panelRecuperacion, "name_15220231935500");
	     panelRecuperacion.setLayout(null);
	     
	     JLabel lblRecuperar = new JLabel("Recuperar cuenta");
	     lblRecuperar.setForeground(Color.WHITE);
	     lblRecuperar.setFont(new Font("Arial", Font.BOLD, 40));
	     lblRecuperar.setBounds(158, 23, 341, 83);
	     panelRecuperacion.add(lblRecuperar);
	    
	     JLabel lblCorreoElectrnico = new JLabel("Correo electrónico");
	     lblCorreoElectrnico.setForeground(Color.WHITE);
	     lblCorreoElectrnico.setFont(new Font("Tahoma", Font.PLAIN, 16));
	     lblCorreoElectrnico.setBounds(84, 160, 466, 50);
	     panelRecuperacion.add(lblCorreoElectrnico);
	     
	     textFieldCorreoRecuperarCuenta = new JTextField();
	     textFieldCorreoRecuperarCuenta.setFont(new Font("Tahoma", Font.PLAIN, 20));
	     textFieldCorreoRecuperarCuenta.setColumns(10);
	     textFieldCorreoRecuperarCuenta.setBounds(84, 212, 466, 50);
	     panelRecuperacion.add(textFieldCorreoRecuperarCuenta);
	     
	     
	     JButton btnRestablecer = new JButton("Restablecer");
	     btnRestablecer.setFont(new Font("Tahoma", Font.PLAIN, 20));
	     btnRestablecer.setBounds(84, 305, 466, 55);
	     panelRecuperacion.add(btnRestablecer);
	     
	     JButton btnRegresarAlLogin = new JButton("Regresar al login");
	     btnRegresarAlLogin.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent e) {
	     		
	     	}
	     });
	     btnRegresarAlLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
	     btnRegresarAlLogin.setBounds(84, 402, 466, 40);
	     panelRecuperacion.add(btnRegresarAlLogin);
	    
	}
	
	public void alta(JFrame frame)
	{
		JPanel panelAlta = new JPanel();
	     panelAlta.setBackground(new Color(0, 102, 153));
	     frmVentana.getContentPane().add(panelAlta, "name_2080397748900");
	     panelAlta.setLayout(null);
	     
	     JLabel lblAlta = new JLabel("Alta");
	     lblAlta.setHorizontalAlignment(SwingConstants.CENTER);
	     lblAlta.setBounds(141, 40, 332, 47);
	     lblAlta.setForeground(Color.WHITE);
	     lblAlta.setFont(new Font("Arial", Font.BOLD, 40));
	     panelAlta.add(lblAlta);
	}
	public void baja(JFrame frame)
	{
		 
	     JPanel panelBaja = new JPanel();
	     panelBaja.setLayout(null);
	     panelBaja.setBackground(new Color(0, 102, 153));
	     frmVentana.getContentPane().add(panelBaja, "name_2361270284800");
	     
	     JLabel lblBaja = new JLabel("Alta");
	     lblBaja.setHorizontalAlignment(SwingConstants.CENTER);
	     lblBaja.setForeground(Color.WHITE);
	     lblBaja.setFont(new Font("Arial", Font.BOLD, 40));
	     lblBaja.setBounds(147, 39, 332, 47);
	     panelBaja.add(lblBaja);
	}
	
	
	public void consultar(JFrame frame)
	{
		 JPanel panelConsultar = new JPanel();
	     panelConsultar.setLayout(null);
	     panelConsultar.setBackground(new Color(0, 102, 153));
	     frmVentana.getContentPane().add(panelConsultar, "name_2420776129300");
	     
	     JLabel lblConsultar = new JLabel("Consultar");
	     lblConsultar.setHorizontalAlignment(SwingConstants.CENTER);
	     lblConsultar.setForeground(Color.WHITE);
	     lblConsultar.setFont(new Font("Arial", Font.BOLD, 40));
	     lblConsultar.setBounds(147, 39, 332, 47);
	     panelConsultar.add(lblConsultar);

	}
	
	public void creacionUsuario(JFrame frame)
	{
		JPanel panelCreacionUsuario = new JPanel();
	     panelCreacionUsuario.setLayout(null);
	     panelCreacionUsuario.setBackground(new Color(0, 102, 153));
	     frmVentana.getContentPane().add(panelCreacionUsuario, "name_2463380285400");
	     
	     JLabel lblCrearUsuario = new JLabel("Creación de  usuario");
	     lblCrearUsuario.setHorizontalAlignment(SwingConstants.CENTER);
	     lblCrearUsuario.setForeground(Color.WHITE);
	     lblCrearUsuario.setFont(new Font("Arial", Font.BOLD, 40));
	     lblCrearUsuario.setBounds(49, 39, 469, 47);
	     panelCreacionUsuario.add(lblCrearUsuario);
	     
	}
	
	public void accederSistema(JFrame frame)
	{
		 JPanel panelAccederSistema = new JPanel();
	     panelAccederSistema.setLayout(null);
	     panelAccederSistema.setBackground(new Color(0, 102, 153));
	     frmVentana.getContentPane().add(panelAccederSistema, "name_2642386265100");
	     
	     JLabel lblAccederAlSistema = new JLabel("Acceder al sistema");
	     lblAccederAlSistema.setHorizontalAlignment(SwingConstants.CENTER);
	     lblAccederAlSistema.setForeground(Color.WHITE);
	     lblAccederAlSistema.setFont(new Font("Arial", Font.BOLD, 40));
	     lblAccederAlSistema.setBounds(49, 39, 469, 47);
	     panelAccederSistema.add(lblAccederAlSistema);
	}
	
	public void olvideContraseña(JFrame frame)
	{
		  JPanel panelOlvideMiContraseña = new JPanel();
		     panelOlvideMiContraseña.setLayout(null);
		     panelOlvideMiContraseña.setBackground(new Color(0, 102, 153));
		     frmVentana.getContentPane().add(panelOlvideMiContraseña, "name_2715971420200");
		     
		     JLabel lblquePasaSi = new JLabel("¿Qué pasa si olvidé mi contraseña?");
		     lblquePasaSi.setHorizontalAlignment(SwingConstants.CENTER);
		     lblquePasaSi.setForeground(Color.WHITE);
		     lblquePasaSi.setFont(new Font("Arial", Font.BOLD, 30));
		     lblquePasaSi.setBounds(22, 23, 556, 116);
		     panelOlvideMiContraseña.add(lblquePasaSi);
		        
	}
	  
	    
	     
	    	     
	     
	    
	     
	   
		
}
