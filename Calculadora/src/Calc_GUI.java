import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc_GUI extends JFrame {
	
	double num1, num2;
	String signo;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField cajaResultado;
	private JButton dividir;
	private JButton multiplicar;
	private JButton siete;
	private JButton ocho;
	private JButton nueve;
	private JButton cuatro;
	private JButton cinco;
	private JButton seis;
	private JButton uno;
	private JButton dos;
	private JButton tres;
	private JButton btnNewButton_14;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;
	private JButton btnNewButton_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc_GUI frame = new Calc_GUI();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calc_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 281, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cajaResultado = new JTextField();
		cajaResultado.setFont(new Font("Arial", Font.PLAIN, 18));
		cajaResultado.setBounds(10, 11, 245, 55);
		contentPane.add(cajaResultado);
		cajaResultado.setColumns(10);
		
		JButton borrarCompleto = new JButton("C");
		borrarCompleto.setFont(new Font("Arial", Font.PLAIN, 13));
		borrarCompleto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText("");
			}	
		});
		borrarCompleto.setBounds(10, 89, 44, 39);
		contentPane.add(borrarCompleto);
		
		dividir = new JButton("/");
		dividir.setFont(new Font("Arial", Font.PLAIN, 18));
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(cajaResultado.getText().replace(',', '.'));
				signo = "/";
				cajaResultado.setText("");
			}
		});
		dividir.setBounds(61, 89, 44, 39);
		contentPane.add(dividir);
		
		multiplicar = new JButton("*");
		multiplicar.setFont(new Font("Arial", Font.PLAIN, 18));
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(cajaResultado.getText().replace(',', '.'));
				signo = "*";
				cajaResultado.setText("");
			}
		});
		multiplicar.setBounds(115, 89, 44, 39);
		contentPane.add(multiplicar);
		
		siete = new JButton("7");
		siete.setFont(new Font("Arial", Font.PLAIN, 18));
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText() + "7");
			}
		});
		siete.setBounds(10, 139, 44, 39);
		contentPane.add(siete);
		
		ocho = new JButton("8");
		ocho.setFont(new Font("Arial", Font.PLAIN, 18));
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText() + "8");
			}
		});
		ocho.setBounds(61, 139, 44, 39);
		contentPane.add(ocho);
		
		nueve = new JButton("9");
		nueve.setFont(new Font("Arial", Font.PLAIN, 18));
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText() + "9");
			}
		});
		nueve.setBounds(115, 139, 44, 39);
		contentPane.add(nueve);
		
		cuatro = new JButton("4");
		cuatro.setFont(new Font("Arial", Font.PLAIN, 18));
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText() + "4");
			}
		});
		cuatro.setBounds(10, 189, 44, 39);
		contentPane.add(cuatro);
		
		cinco = new JButton("5");
		cinco.setFont(new Font("Arial", Font.PLAIN, 18));
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText() + "5");
			}
		});
		cinco.setBounds(61, 189, 44, 39);
		contentPane.add(cinco);
		
		seis = new JButton("6");
		seis.setFont(new Font("Arial", Font.PLAIN, 18));
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText() + "6");
			}
		});
		seis.setBounds(115, 189, 44, 39);
		contentPane.add(seis);
		
		uno = new JButton("1");
		uno.setFont(new Font("Arial", Font.PLAIN, 18));
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText() + "1");
			}
		});
		uno.setBounds(10, 239, 44, 39);
		contentPane.add(uno);
		
		dos = new JButton("2");
		dos.setFont(new Font("Arial", Font.PLAIN, 18));
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText() + "2");
			}
		});
		dos.setBounds(61, 239, 44, 39);
		contentPane.add(dos);
		
		tres = new JButton("3");
		tres.setFont(new Font("Arial", Font.PLAIN, 18));
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText() + "3");
			}
		});
		tres.setBounds(115, 239, 44, 39);
		contentPane.add(tres);
		
		btnNewButton_14 = new JButton("0");
		btnNewButton_14.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText() + "0");
			}
		});
		btnNewButton_14.setBounds(10, 289, 95, 39);
		contentPane.add(btnNewButton_14);
		
		btnNewButton_17 = new JButton("-");
		btnNewButton_17.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(cajaResultado.getText().replace(',', '.'));	
				signo = "-";
				cajaResultado.setText("");
			}
		});
		btnNewButton_17.setBounds(190, 89, 44, 89);
		contentPane.add(btnNewButton_17);
		
		btnNewButton_18 = new JButton("+");
		btnNewButton_18.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(cajaResultado.getText().replace(',', '.'));
				signo = "+";
				cajaResultado.setText("");
			}
		});
		btnNewButton_18.setBounds(190, 189, 44, 89);
		contentPane.add(btnNewButton_18);
		
		btnNewButton_19 = new JButton("=");
		btnNewButton_19.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_19.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        num2 = Double.parseDouble(cajaResultado.getText().replace(',', '.'));

		        double resultado = 0;
		        switch(signo) {
		            case "+":
		                resultado = num1 + num2;
		                break;
		            case "-":
		                resultado = num1 - num2;
		                break;
		            case "*":
		                resultado = num1 * num2;
		                break;
		            case "/":
		                if (num2 != 0) {
		                    resultado = num1 / num2;
		                } else {
		                    cajaResultado.setText("ERROR");
		                    return;
		                }
		                break;
		            default:
		                cajaResultado.setText("ERROR");
		                return;
		        }

		        // Verifico si el resultado es entero
		        if (resultado == (int) resultado) {
		            cajaResultado.setText(Integer.toString((int) resultado));
		        } else {
		            cajaResultado.setText(Double.toString(resultado));
		        }
		    }
		});
		btnNewButton_19.setBounds(190, 289, 44, 39);
		contentPane.add(btnNewButton_19);
		
		btnNewButton_1 = new JButton(",");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cajaResultado.setText(cajaResultado.getText() + ",");
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1.setBounds(115, 289, 44, 39);
		contentPane.add(btnNewButton_1);
	}

	public JPanel getPanel() {
		return panel;
	}
}

