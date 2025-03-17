import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class ExamenProgramacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamenProgramacion frame = new ExamenProgramacion();
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
	public ExamenProgramacion() {
		setTitle("Factura");
		setBackground(new Color(255, 255, 255));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0,102,153));
		panel.setBounds(0, 0, 434, 59);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Factura en Java");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(10, 11, 343, 37);
		panel.add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 153));
		panel_1.setBounds(-26, 451, 488, 31);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(10, 70, 414, 78);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 4, 8, 15));
		
		Border borde = new LineBorder(new Color(202,202,202), 1);
		TitledBorder tituloBorde = BorderFactory.createTitledBorder(borde,"Datos del cliente");
	    tituloBorde.setTitleFont(new Font("Arial", Font.BOLD, 12));
	    panel_2.setBorder(tituloBorde);
		
		JLabel lblNewLabel_1 = new JLabel("Documento:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_2.add(lblNewLabel_1);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_2.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dirección:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_2.add(lblNewLabel);
		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Teléfono:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_2.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		//
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(255, 255, 255));
		panel_2_1.setBounds(10, 153, 414, 46);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(new GridLayout(0, 4, 0, 15));
		
		Border borde2 = new LineBorder(new Color(202,202,202), 1);
		TitledBorder tituloBorde2 = BorderFactory.createTitledBorder(borde2,"Datos de factura");
	    tituloBorde2.setTitleFont(new Font("Arial", Font.BOLD, 12));	
	    panel_2_1.setBorder(tituloBorde2);
		
		JLabel lblNewLabel_1_1 = new JLabel("N# Factura:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_2_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("1");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_2_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("2021/05/21");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2_1.add(lblNewLabel_4);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(12, 224, 409, 89);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Agua", "2", "500", "1000.0"},
				{"Cereal", "5", "1000", "5000.0"},
				{"Leche", "2", "300", "600.0"},
			},
			new String[] {
				"Producto", "Cantidad", "Valor", "Sub Total"
			}
		));
		Border tituloBorde4 = BorderFactory.createLineBorder(new Color(202,202,202),1,false);
	    scrollPane.setBorder(tituloBorde4);
		scrollPane.setViewportView(table);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(new Color(255, 255, 255));
		panel_2_1_1.setBounds(12, 199, 409, 22);
		contentPane.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		Border tituloBorde3 = BorderFactory.createLineBorder(new Color(202,202,202),1,false);
	    panel_2_1_1.setBorder(tituloBorde3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ver listado de facturas");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(35, 0, 141, 22);
		panel_2_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Añadir");
		lblNewLabel_2_1_1.setBounds(284, 0, 60, 22);
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_2_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Eliminar");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(354, 0, 60, 22);
		panel_2_1_1.add(lblNewLabel_3_1);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBackground(new Color(255, 255, 255));
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBounds(10, 315, 402, 108);
		contentPane.add(panel_4_1_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Sub Total:");
		lblNewLabel_7_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_7_1.setBounds(10, 1, 97, 19);
		panel_4_1_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("6600.0");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10_1.setBounds(107, 1, 97, 19);
		panel_4_1_1.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("% Descuento:");
		lblNewLabel_8_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1.setBounds(10, 30, 97, 19);
		panel_4_1_1.add(lblNewLabel_8_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(107, 30, 46, 19);
		panel_4_1_1.add(textField_5);
		
		JLabel lblNewLabel_11_1 = new JLabel("IVA 19%:");
		lblNewLabel_11_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_11_1.setBounds(10, 59, 97, 19);
		panel_4_1_1.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("1254.0");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9_1.setBounds(107, 59, 97, 19);
		panel_4_1_1.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Total Factura:");
		lblNewLabel_6_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(10, 88, 97, 19);
		panel_4_1_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("7524.0");
		lblNewLabel_12_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_12_1.setBounds(107, 88, 97, 19);
		panel_4_1_1.add(lblNewLabel_12_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(162, 27, 30, 23);
		panel_4_1_1.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Valor descontado:");
		lblNewLabel_8_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_8_1_1.setBounds(193, 30, 107, 19);
		panel_4_1_1.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("330.0");
		lblNewLabel_10_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10_1_1.setBounds(305, 31, 97, 19);
		panel_4_1_1.add(lblNewLabel_10_1_1);
		
		JButton btnNewButton = new JButton("Finalizar factura");
		btnNewButton.setBounds(200, 425, 140, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(347, 425, 77, 23);
		contentPane.add(btnLimpiar);
		
		
		
		
	}
	//------------------------------Utilizo Graphics para las imagenes porque es mas sencillo para mi-------------------------------
	public void paint(Graphics g) {
        super.paint(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        BufferedImage imagen;
        BufferedImage imagen2;
        BufferedImage imagen3;
        try {
        	imagen = ImageIO.read(new File("imagenes/circulo.png"));
        	imagen2 = ImageIO.read(new File("imagenes/eliminarX.png"));
        	imagen3 = ImageIO.read(new File("imagenes/anadir.png"));
        	
        	g2.drawImage(imagen,32,233,15,15,null,null);
        	g2.drawImage(imagen2,353,233,15,15,null,null);
        	g2.drawImage(imagen3,282,233,15,15,null,null);
        }catch(IOException e) {
        	e.printStackTrace();
        }
	}
}
