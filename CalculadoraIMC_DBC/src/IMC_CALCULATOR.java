import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class IMC_CALCULATOR extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-13,7
	 */
	private final JPanel panel = new JPanel();
	private JTextField nombre;
	private JTextField edad;
	private JTextField peso;
	private JTextField altura;
	private JTextField resultado;

	double peso1;
	double altura1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMC_CALCULATOR frame = new IMC_CALCULATOR();
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
	public IMC_CALCULATOR() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 343);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Calculadora IMC");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(138, 11, 176, 42);
		contentPane.add(lblNewLabel);

		nombre = new JTextField();
		nombre.setFont(new Font("Arial", Font.PLAIN, 14));
		nombre.setBounds(80, 93, 176, 21);
		contentPane.add(nombre);
		nombre.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 91, 104, 21);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Edad");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 123, 104, 21);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Peso");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(10, 155, 104, 21);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Altura");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(10, 187, 104, 21);
		contentPane.add(lblNewLabel_1_3);

		edad = new JTextField();
		edad.setFont(new Font("Arial", Font.PLAIN, 14));
		edad.setColumns(10);
		edad.setBounds(80, 123, 176, 21);
		contentPane.add(edad);

		peso = new JTextField();
		peso.setFont(new Font("Arial", Font.PLAIN, 14));
		peso.setColumns(10);
		peso.setBounds(80, 155, 176, 21);
		contentPane.add(peso);

		altura = new JTextField();
		altura.setFont(new Font("Arial", Font.PLAIN, 14));
		altura.setColumns(10);
		altura.setBounds(80, 187, 176, 21);
		contentPane.add(altura);

		resultado = new JTextField();
		resultado.setFont(new Font("Arial", Font.PLAIN, 14));
		resultado.setBackground(new Color(255, 255, 255));
		resultado.setColumns(10);
		resultado.setBounds(49, 255, 386, 21);
		contentPane.add(resultado);

		JButton calcular = new JButton("Calcular");
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				peso1 = Double.parseDouble(peso.getText());
				altura1 = Double.parseDouble(altura.getText());
				double calcImc = 0;

				calcImc = (peso1 / (altura1 * altura1));

				if (calcImc < 18.5) {
					resultado.setText(nombre.getText() + " tu imc es: " + calcImc + " " + " tienes Peso Inferior al Normal");
				} else if (calcImc < 24.9) {
					resultado.setText(nombre.getText() + " tu imc es: " + calcImc + " " + "tienes Peso Normal");
				} else if (calcImc < 29.9) {
					resultado.setText(nombre.getText() + " tu imc es: " + calcImc + " " + "tienes Peso Superior al normal");
				} else {
					resultado.setText(nombre.getText() + " tu imc es: " + calcImc + " " + "tienes Obesidad");
				}

			

			}
		});
		calcular.setFont(new Font("Arial", Font.PLAIN, 14));
		calcular.setBounds(316, 91, 119, 42);
		contentPane.add(calcular);

		JButton limpiar = new JButton("Limpiar");
		limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre.setText("");
				edad.setText("");
				peso.setText("");
				altura.setText("");
				resultado.setText("");
			}
		});
		limpiar.setFont(new Font("Arial", Font.PLAIN, 14));
		limpiar.setBounds(316, 155, 119, 42);
		contentPane.add(limpiar);

		JLabel lblImc = new JLabel("IMC");
		lblImc.setHorizontalAlignment(SwingConstants.LEFT);
		lblImc.setFont(new Font("Arial", Font.PLAIN, 18));
		lblImc.setBounds(10, 243, 59, 42);
		contentPane.add(lblImc);
	}
}
