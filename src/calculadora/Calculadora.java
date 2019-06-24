package calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ObjCalculadora cal= new ObjCalculadora();
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 312, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCalculadoraJava = new JLabel("Calculadora Java");
		lblCalculadoraJava.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculadoraJava.setForeground(Color.ORANGE);
		lblCalculadoraJava.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCalculadoraJava.setBounds(76, 11, 149, 22);
		frame.getContentPane().add(lblCalculadoraJava);
		
		resultado = new JTextField();
		resultado.setBackground(new Color(102, 0, 255));
		resultado.setForeground(Color.MAGENTA);
		resultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setEditable(false);
		resultado.setBounds(33, 44, 240, 33);
		frame.getContentPane().add(resultado);
		resultado.setColumns(10);
		
		JButton uno = new JButton("1");
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cal.addNumero(1);
				resultado.setText(cal.getPantalla());
				
			}
		});
		uno.setBounds(30, 100, 41, 33);
		frame.getContentPane().add(uno);
		
		JButton dos = new JButton("2");
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.addNumero(2);
				resultado.setText(cal.getPantalla());
			}
		});
		dos.setBounds(75, 100, 41, 33);
		frame.getContentPane().add(dos);
		
		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.addNumero(3);
				resultado.setText(cal.getPantalla());
			}
		});
		tres.setBounds(120, 100, 41, 33);
		frame.getContentPane().add(tres);
		
		JButton cuatro = new JButton("4");
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.addNumero(4);
				resultado.setText(cal.getPantalla());
			}
		});
		cuatro.setBounds(30, 140, 41, 33);
		frame.getContentPane().add(cuatro);
		
		JButton cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.addNumero(5);
				resultado.setText(cal.getPantalla());
			}
		});
		cinco.setBounds(75, 140, 41, 33);
		frame.getContentPane().add(cinco);
		
		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.addNumero(6);
				resultado.setText(cal.getPantalla());
			}
		});
		seis.setBounds(120, 140, 41, 33);
		frame.getContentPane().add(seis);
		
		JButton siete = new JButton("7");
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.addNumero(7);
				resultado.setText(cal.getPantalla());
			}
		});
		siete.setBounds(30, 180, 41, 33);
		frame.getContentPane().add(siete);
		
		JButton ocho = new JButton("8");
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.addNumero(8);
				resultado.setText(cal.getPantalla());
			}
		});
		ocho.setBounds(75, 180, 41, 33);
		frame.getContentPane().add(ocho);
		
		JButton nueve = new JButton("9");
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.addNumero(9);
				resultado.setText(cal.getPantalla());
			}
		});
		nueve.setBounds(120, 180, 41, 33);
		frame.getContentPane().add(nueve);
		
		JButton suma = new JButton("+");
		suma.setBounds(175, 100, 70, 33);
		frame.getContentPane().add(suma);
		
		JButton resta = new JButton("-");
		resta.setBounds(175, 140, 70, 33);
		frame.getContentPane().add(resta);
		
		JButton multiplicacion = new JButton("x");
		multiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.multiplicar();
				resultado.setText(cal.getPantalla());
			}
		});
		multiplicacion.setBounds(175, 180, 70, 33);
		frame.getContentPane().add(multiplicacion);
		
		JButton cero = new JButton("0");
		cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.addNumero(0);
				resultado.setText(cal.getPantalla());
			}
		});
		cero.setBounds(75, 220, 41, 33);
		frame.getContentPane().add(cero);
		
		JButton dividir = new JButton("/");
		dividir.setBounds(175, 220, 70, 33);
		frame.getContentPane().add(dividir);
	}
}
