package calculadora;

import java.awt.EventQueue;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Calculadora extends javafx.application.Application{

	private JFrame frame;
	private static ReproductorMusica mus;
	private JTextField resultado;
	private JTextField tiempo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		mus = new ReproductorMusica();
		Application.launch(args);
	      
		
	}

	
	
	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		ObjCalculadora cal= new ObjCalculadora();
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 312, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		/*ImageIcon img = new ImageIcon("Ficheros/calc.png");
		frame.setIconImage(img.getImage());*/
		
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
		
		JButton resolver = new JButton("=");
		resolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.resolver();
				resultado.setText(cal.getPantalla());
			}
		});
		resolver.setBounds(175, 100, 70, 33);
		frame.getContentPane().add(resolver);
		
		JButton borrar = new JButton("\u03A7");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.borrar();;
				resultado.setText(cal.getPantalla());
			}
		});
		borrar.setBounds(175, 140, 70, 33);
		frame.getContentPane().add(borrar);
		
		JButton suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.sumar();
				resultado.setText(cal.getPantalla());
			}
		});
		suma.setBounds(30, 220, 41, 33);
		frame.getContentPane().add(suma);
		
		JButton resta = new JButton("-");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal.restar();
				resultado.setText(cal.getPantalla());
			}
		});
		resta.setBounds(120, 220, 41, 33);
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
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cal.dividir();
				resultado.setText(cal.getPantalla());
				
			}
		});
		dividir.setBounds(175, 220, 70, 33);
		frame.getContentPane().add(dividir);
		
		JButton pausa = new JButton("||");
		pausa.setFont(new Font("Tahoma", Font.PLAIN, 10));
		pausa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mus.pausa();//pausamos la cancion cuando pulsamos en el boton pausa
			}
		});
		pausa.setBounds(60, 309, 45, 22);
		frame.getContentPane().add(pausa);
		
		JButton reanudar = new JButton("\u25BA");
		reanudar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		reanudar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mus.reanudar();//reanudamos la cancion cuando pulsamos en reanudar
				}
		});
		reanudar.setBounds(10, 309, 45, 22);
		frame.getContentPane().add(reanudar);
		
		tiempo = new JTextField();
		tiempo.setHorizontalAlignment(SwingConstants.CENTER);
		tiempo.setBounds(110, 310, 41, 20);
		frame.getContentPane().add(tiempo);
		tiempo.setColumns(10);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				mus.ajustarVolumen(slider.getValue());
			}
		});
		slider.setBounds(161, 311, 64, 20);
		frame.getContentPane().add(slider);
		
		JSlider slider_1 = new JSlider();
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				mus.ajustarTiempo(slider_1.getValue());
			}
		});
		slider_1.setBounds(10, 333, 95, 17);
		frame.getContentPane().add(slider_1);
		
		Timer timer = new Timer (100, new ActionListener () //hacemos un hilo para que se actualize la duracion de la musica
		{ 
		    public void actionPerformed(ActionEvent e) 
		    { 
		    	tiempo.setText(mus.getProgreso());
		       // System.out.println(mus.getProgreso());
		        //slider_1.setValue((int) mus.obtenerProgreso());
		     } 
		}); 
		

		timer.start();
		
		frame.setTitle("Calculadora by Pablo98ad");
		try {
			frame.setIconImage(ImageIO.read(new File("Ficheros/calc.png")));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		mus.reproducirInicio();
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
	
	
	

}
