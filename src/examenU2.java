
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Window.Type;

public class examenU2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtCalle;
	private JTextField txtJhonDoe;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					examenU2 frame = new examenU2();
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
	public examenU2() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 588);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor(""));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel bordeIzq = new JPanel();
		bordeIzq.setBackground(UIManager.getColor("Button.background"));
		contentPane.add(bordeIzq, BorderLayout.WEST);
		bordeIzq.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Datos del cliente:");
		lblNewLabel.setBounds(5, 5, 83, 14);
		bordeIzq.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(93, 5, 46, 14);
		bordeIzq.add(lblNewLabel_3);
		
		JPanel bordeSup = new JPanel();
		bordeSup.setBackground(Color.decode("#006699"));
		contentPane.add(bordeSup, BorderLayout.NORTH);
		bordeSup.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("");
		bordeSup.add(lblNewLabel_1);
		
		JLabel lblFacturaEnJava = new JLabel("    Factura en Java - NetBean - ArrayList y POO");
		lblFacturaEnJava.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFacturaEnJava.setForeground(Color.WHITE);
		bordeSup.add(lblFacturaEnJava);
		
		JLabel lblNewLabel_2 = new JLabel("      (Sin base de datos)");
		lblNewLabel_2.setForeground(Color.WHITE);
		bordeSup.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		bordeSup.add(lblNewLabel_1_1);
		
		JPanel bordeDer = new JPanel();
		bordeDer.setBackground(UIManager.getColor("Button.background"));
		contentPane.add(bordeDer, BorderLayout.EAST);
		
		JPanel bordeInf = new JPanel();
		bordeInf.setBackground(Color.decode("#006699"));
		contentPane.add(bordeInf, BorderLayout.SOUTH);
		
		JPanel panelCentro = new JPanel();
		panelCentro.setBackground(UIManager.getColor("Button.background"));
		contentPane.add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 434, 457, 0);
		panel.setBackground(new Color(205, 92, 92));
		panelCentro.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Datos del cliente:");
		lblNewLabel_4.setBounds(10, 10, 120, 14);
		panelCentro.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Documentos:");
		lblNewLabel_5.setBounds(20, 35, 100, 14);
		panelCentro.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Dirección:");
		lblNewLabel_6.setBounds(20, 60, 100, 14);
		panelCentro.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setText("12345");
		textField.setBounds(110, 32, 86, 20);
		panelCentro.add(textField);
		textField.setColumns(10);
		
		txtCalle = new JTextField();
		txtCalle.setText("Calle 1 # 123");
		txtCalle.setBounds(110, 60, 86, 20);
		panelCentro.add(txtCalle);
		txtCalle.setColumns(10);
		
		txtJhonDoe = new JTextField();
		txtJhonDoe.setText("Jhon Doe");
		txtJhonDoe.setBounds(290, 32, 150, 20);
		panelCentro.add(txtJhonDoe);
		txtJhonDoe.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Nombres:");
		lblNewLabel_7.setBounds(220, 35, 60, 14);
		panelCentro.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Teléfono: ");
		lblNewLabel_8.setBounds(220, 63, 90, 14);
		panelCentro.add(lblNewLabel_8);
		
		textField_2 = new JTextField();
		textField_2.setText("5554433");
		textField_2.setColumns(10);
		textField_2.setBounds(290, 60, 150, 20);
		panelCentro.add(textField_2);
		
		JLabel lblNewLabel_9 = new JLabel("Datos de factura");
		lblNewLabel_9.setBounds(20, 100, 120, 14);
		panelCentro.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("N° Factura:");
		lblNewLabel_10.setBounds(20, 120, 70, 14);
		panelCentro.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("1");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10_1.setBounds(90, 120, 30, 14);
		panelCentro.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_11 = new JLabel("Fecha:");
		lblNewLabel_11.setBounds(220, 120, 46, 14);
		panelCentro.add(lblNewLabel_11);
		
		JLabel lblNewLabel_11_1 = new JLabel("2021 /50/21");
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11_1.setBounds(290, 120, 80, 14);
		panelCentro.add(lblNewLabel_11_1);
		
		String titles [] = {"Producto","Cantidad","Valor","Sub total"};
		String tableData [] [] = { {"Agua","2","500","10000.0"},
								   {"Cereal","2","1000","5000.0"},
								   {"Leche","2","300","600.0"},
				                   
			
		};
		
		JTable tableProductos = new JTable (tableData,titles);
		
		JScrollPane tableScroll = new JScrollPane(tableProductos);
		tableScroll.setBounds(15,200,420,70);
		panelCentro.add(tableScroll);
		
		JLabel lblNewLabel_12 = new JLabel("Subtotal: ");
		lblNewLabel_12.setBounds(20, 291, 60, 14);
		panelCentro.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("6600.0");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13.setBounds(110, 291, 46, 14);
		panelCentro.add(lblNewLabel_13);
		
		textField_1 = new JTextField();
		textField_1.setText("5");
		textField_1.setBounds(110, 316, 40, 20);
		panelCentro.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_12_1 = new JLabel("% Descuento:");
		lblNewLabel_12_1.setBounds(20, 319, 100, 14);
		panelCentro.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_12_1_1 = new JLabel("IVA 19% :");
		lblNewLabel_12_1_1.setBounds(20, 349, 100, 14);
		panelCentro.add(lblNewLabel_12_1_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("1254.0");
		lblNewLabel_13_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13_1.setBounds(110, 349, 46, 14);
		panelCentro.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_13_1_1 = new JLabel("7524.0");
		lblNewLabel_13_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13_1_1.setBounds(110, 374, 46, 14);
		panelCentro.add(lblNewLabel_13_1_1);
		
		JLabel lblNewLabel_12_1_1_1 = new JLabel("Total Factura:");
		lblNewLabel_12_1_1_1.setBounds(20, 374, 100, 14);
		panelCentro.add(lblNewLabel_12_1_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(160, 315, 40, 23);
		panelCentro.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_12_1_2 = new JLabel("Valor descontado:");
		lblNewLabel_12_1_2.setBounds(210, 319, 120, 14);
		panelCentro.add(lblNewLabel_12_1_2);
		
		JLabel lblNewLabel_13_2 = new JLabel("330.0");
		lblNewLabel_13_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13_2.setBounds(324, 319, 46, 14);
		panelCentro.add(lblNewLabel_13_2);
		
		JButton btnNewButton = new JButton("Finalizar factura");
		btnNewButton.setBounds(180, 420, 140, 23);
		btnNewButton.setBackground(Color.decode("#dedede"));
		panelCentro.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(340, 420, 90, 23);
		btnLimpiar.setBackground(Color.decode("#dedede"));
		panelCentro.add(btnLimpiar);
		
		JLabel lblNewLabel_10_2 = new JLabel("Ver listado de facturas");
		lblNewLabel_10_2.setBounds(45, 161, 150, 14);
		panelCentro.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_3 = new JLabel("Añadir");
		lblNewLabel_10_3.setBounds(263, 161, 70, 14);
		panelCentro.add(lblNewLabel_10_3);
		
		JLabel lblNewLabel_10_3_1 = new JLabel("Eliminar");
		lblNewLabel_10_3_1.setBounds(370, 161, 70, 14);
		panelCentro.add(lblNewLabel_10_3_1);

		JLabel añadirimagen = new JLabel();
		añadirimagen.setIcon(new ImageIcon(getClass().getResource("añadir.png")));
		añadirimagen.setBounds(230, 158, 20, 20);
		panelCentro.add(añadirimagen);
		
		JLabel eliminarImg = new JLabel();
		eliminarImg.setIcon(new ImageIcon(getClass().getResource("eliminar.png")));
		eliminarImg.setBounds(340, 158, 20, 20);
		panelCentro.add(eliminarImg);
		
		JLabel listadoImg = new JLabel();
		listadoImg.setIcon(new ImageIcon(getClass().getResource("listado.png")));
		listadoImg.setBounds(15, 158, 20, 20);
		panelCentro.add(listadoImg);
		
		
		
		
		
	}
}