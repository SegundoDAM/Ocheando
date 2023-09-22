package ejerciciolambda01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Dimension2D;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.sun.tools.javac.util.Position;

public class Ejemplo05Inicialbien extends JFrame {
	/*
	 * Esta es la forma mas sencilla, incomoda e ineficaz de hacer algo asi
	 */

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo05Inicialbien frame = new Ejemplo05Inicialbien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void hazAlgo(int i) {
		System.out.println(i);
	}

	/**
	 * Create the frame.
	 */
	public Ejemplo05Inicialbien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cajero");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 42, 86, 30);
		contentPane.add(lblNewLabel);

		JLabel lblPin = new JLabel(" ");
		lblPin.setBounds(29, 109, 46, 14);
		contentPane.add(lblPin);
		int i = 1;
		DimensionEntera dimension = new DimensionEntera(60, 60);
		for (Coordenada coordenada : new CoordenadaOM().getCoordenadasBotones()) {
			addMyButton(String.valueOf(i % 10), coordenada, dimension);
			i++;
		}
	}

	private void addMyButton(String position, Coordenada coordenada, DimensionEntera dimension) {
		JButton btnNewButton = new JButton(position);
		btnNewButton.addActionListener(e -> 
				hazAlgo(Integer.valueOf(position)));
		btnNewButton.setBounds(coordenada.getX(), coordenada.getY(), dimension.getWidth(), dimension.getHeight());
		contentPane.add(btnNewButton);
	}

}
