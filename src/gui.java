import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;

public class gui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel PanelBordesl;
	private JTextField txtElviaYolanda;
	private JTextField txtMedina;
	private JTextField txtZamora;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		PanelBordesl = new JPanel();
		PanelBordesl.setBackground(new Color(0, 255, 0));
		PanelBordesl.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelBordesl);
		PanelBordesl.setLayout(new BorderLayout(0, 0));
		
		JPanel northPanel = new JPanel();
		northPanel.setBackground(new Color(0, 255, 0));
		PanelBordesl.add(northPanel, BorderLayout.NORTH);
		northPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel textRegistroUsuarios = new JLabel("     Registro de Usuarios");
		textRegistroUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		textRegistroUsuarios.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		textRegistroUsuarios.setForeground(new Color(255, 0, 0));
		northPanel.add(textRegistroUsuarios, BorderLayout.WEST);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(new Color(0, 255, 0));
		PanelBordesl.add(westPanel, BorderLayout.WEST);
		
		JPanel eastPanel = new JPanel();
		eastPanel.setBackground(new Color(0, 255, 0));
		PanelBordesl.add(eastPanel, BorderLayout.EAST);
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(new Color(0, 255, 0));
		PanelBordesl.add(southPanel, BorderLayout.SOUTH);
		
		JPanel panelPrin = new JPanel();
		panelPrin.setBackground(new Color(0, 255, 0));
		PanelBordesl.add(panelPrin, BorderLayout.CENTER);
		panelPrin.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel panelDatosGenerales = new JPanel();
		panelDatosGenerales.setBackground(new Color(128, 128, 0));
		panelPrin.add(panelDatosGenerales);
		panelDatosGenerales.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTituloDatos = new JPanel();
		panelTituloDatos.setBackground(new Color(127, 255, 212));
		panelDatosGenerales.add(panelTituloDatos, BorderLayout.NORTH);
		panelTituloDatos.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDatosGenerales = new JLabel(" Datos Generales");
		lblDatosGenerales.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosGenerales.setForeground(new Color(0, 0, 0));
		lblDatosGenerales.setFont(new Font("Arial", Font.BOLD, 15));
		panelTituloDatos.add(lblDatosGenerales, BorderLayout.WEST);
		
		JPanel contenidoDatosGenerales = new JPanel();
		contenidoDatosGenerales.setBackground(new Color(127, 255, 212));
		panelDatosGenerales.add(contenidoDatosGenerales, BorderLayout.CENTER);
		contenidoDatosGenerales.setLayout(null);
		
		JLabel tituloNombres = new JLabel("Nombres:");
		tituloNombres.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tituloNombres.setBounds(77, 11, 52, 14);
		contenidoDatosGenerales.add(tituloNombres);
		
		JLabel tituloAp = new JLabel("Apellido Paterno:");
		tituloAp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tituloAp.setBounds(36, 50, 93, 14);
		contenidoDatosGenerales.add(tituloAp);
		
		JLabel tituloAm = new JLabel("Apellido Materno:");
		tituloAm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tituloAm.setBounds(34, 89, 95, 14);
		contenidoDatosGenerales.add(tituloAm);
		
		JLabel tituloFechaNacimiento = new JLabel("Fecha de nacimiento:");
		tituloFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tituloFechaNacimiento.setBounds(10, 129, 119, 14);
		contenidoDatosGenerales.add(tituloFechaNacimiento);
		
		JLabel tituloNacionalidad = new JLabel("Nacionalidad");
		tituloNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tituloNacionalidad.setBounds(10, 240, 82, 14);
		contenidoDatosGenerales.add(tituloNacionalidad);
		
		JLabel tituloSexo = new JLabel("Sexo:");
		tituloSexo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tituloSexo.setBounds(10, 157, 127, 14);
		contenidoDatosGenerales.add(tituloSexo);
		
		txtElviaYolanda = new JTextField();
		txtElviaYolanda.setText("Elvia Yolanda");
		txtElviaYolanda.setBounds(139, 9, 119, 20);
		contenidoDatosGenerales.add(txtElviaYolanda);
		txtElviaYolanda.setColumns(10);
		
		txtMedina = new JTextField();
		txtMedina.setText("Medina");
		txtMedina.setColumns(10);
		txtMedina.setBounds(139, 48, 119, 20);
		contenidoDatosGenerales.add(txtMedina);
		
		txtZamora = new JTextField();
		txtZamora.setText("Zamora");
		txtZamora.setColumns(10);
		txtZamora.setBounds(139, 87, 119, 20);
		contenidoDatosGenerales.add(txtZamora);
		
		textField_3 = new JTextField();
		textField_3.setText("11/08/2003");
		textField_3.setColumns(10);
		textField_3.setBounds(139, 127, 119, 20);
		contenidoDatosGenerales.add(textField_3);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBackground(null);
		rdbtnMasculino.setBounds(143, 154, 100, 23);
		contenidoDatosGenerales.add(rdbtnMasculino);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBackground(null);
		rdbtnFemenino.setBounds(143, 194, 100, 23);
		contenidoDatosGenerales.add(rdbtnFemenino);
		
		JComboBox nacionalidad = new JComboBox();
		nacionalidad.setModel(new DefaultComboBoxModel(new String[] {"Perú", "México", "Argentina", "España"}));
		nacionalidad.setEditable(false);
		nacionalidad.setBounds(139, 237, 119, 22);
		contenidoDatosGenerales.add(nacionalidad);
		
		JPanel panelPerfilUsuarios = new JPanel();
		panelPerfilUsuarios.setBackground(new Color(250, 128, 114));
		panelPrin.add(panelPerfilUsuarios);
		panelPerfilUsuarios.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTituloPerfilUsuario = new JPanel();
		panelTituloPerfilUsuario.setBackground(Color.PINK);
		panelPerfilUsuarios.add(panelTituloPerfilUsuario);
		panelTituloPerfilUsuario.setLayout(null);
		
		JPanel panelTituloDatos_1 = new JPanel();
		panelTituloDatos_1.setBounds(97, 15, 0, 0);
		panelTituloDatos_1.setBackground(Color.CYAN);
		panelTituloPerfilUsuario.add(panelTituloDatos_1);
		panelTituloDatos_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPerfilDe = new JLabel("Perfil del Usuario");
		lblPerfilDe.setBounds(10, 0, 127, 20);
		lblPerfilDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerfilDe.setForeground(Color.BLACK);
		lblPerfilDe.setFont(new Font("Arial", Font.BOLD, 15));
		panelTituloPerfilUsuario.add(lblPerfilDe);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("UserLogo.JPG")));
		lblNewLabel.setBounds(77, 26, 171, 213);
		panelTituloPerfilUsuario.add(lblNewLabel);
		
		JCheckBox chckbxMostrarFoto = new JCheckBox("Mostrar Foto de Perfil");
		chckbxMostrarFoto.setSelected(true);
		chckbxMostrarFoto.setBounds(77, 246, 171, 23);
		chckbxMostrarFoto.setBackground(null);
		panelTituloPerfilUsuario.add(chckbxMostrarFoto);
		
		JCheckBox chckbxMostrarFe = new JCheckBox("Mostrar Fecha de Nacimiento");
		chckbxMostrarFe.setSelected(true);
		chckbxMostrarFe.setBounds(77, 272, 208, 23);
		chckbxMostrarFe.setBackground(null);
		panelTituloPerfilUsuario.add(chckbxMostrarFe);
		
		JPanel panelOpcionales = new JPanel();
		panelOpcionales.setBackground(new Color(250, 128, 114));
		panelPrin.add(panelOpcionales);
		panelOpcionales.setLayout(new BorderLayout(0, 0));
		
		JPanel panelDatosOp = new JPanel();
		panelDatosOp.setBackground(new Color(250, 128, 114));
		panelOpcionales.add(panelDatosOp, BorderLayout.CENTER);
		panelDatosOp.setLayout(null);
		
		JLabel lblDatosGenerales_1 = new JLabel(" Datos Opcionales");
		lblDatosGenerales_1.setBounds(0, 0, 136, 20);
		panelDatosOp.add(lblDatosGenerales_1);
		lblDatosGenerales_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDatosGenerales_1.setForeground(Color.BLACK);
		lblDatosGenerales_1.setFont(new Font("Arial", Font.BOLD, 15));
		
		JLabel lblDes = new JLabel("Descripcion");
		lblDes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDes.setBounds(14, 86, 82, 14);
		panelDatosOp.add(lblDes);
		
		JLabel lblPreferencias = new JLabel("Preferencias");
		lblPreferencias.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPreferencias.setBounds(163, 86, 82, 14);
		panelDatosOp.add(lblPreferencias);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(163, 122, 149, 94);
		panelDatosOp.add(scrollPane_1);
		
		JTextArea txtrHolaAmigosDe = new JTextArea();
		scrollPane_1.setViewportView(txtrHolaAmigosDe);
		txtrHolaAmigosDe.setText("Dibujar\r\nLeer\r\nDormir\r\nEscuchar música\r\nDeportes\r\nOtro");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 122, 120, 94);
		panelDatosOp.add(scrollPane);
		
		JTextArea txtrHola = new JTextArea();
		scrollPane.setViewportView(txtrHola);
		txtrHola.setText("Hola amigos \r\nde YouTube gracias \r\npor apoyarme \r\ny compartir mis\r\n videos, eso me\r\n pone muy feliz :)");
		
		
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(new Color(127, 255, 212));
		panelPrin.add(panelBotones);
		panelBotones.setLayout(null);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setForeground(new Color(255, 255, 255));
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNuevo.setBounds(114, 56, 108, 35);
		btnNuevo.setBackground(Color.BLACK);
		panelBotones.add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.setBounds(114, 115, 108, 35);
		btnGuardar.setBackground(Color.BLACK);
		panelBotones.add(btnGuardar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setBounds(114, 178, 108, 35);
		btnSalir.setBackground(Color.BLACK);
		panelBotones.add(btnSalir);
	}
}
