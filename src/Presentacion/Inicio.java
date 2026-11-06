package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;

public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
					frame.setLocation(500,200);
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
	public Inicio() {
		setAlwaysOnTop(true);
		setLocation(new Point(400, 300));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//LaABEL
		JLabel lblNewLabel = new JLabel("New label");
		
		lblNewLabel.setBounds(29, 11, 48, 14);
		//BOTTON DE ESTUDIANTE
		contentPane.add(lblNewLabel);
		JButton btnNewButton = new JButton("Nuevo estudiante");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pMateria ventana=new pMateria();
				ventana.setVisible(true);
				
			}
		});
		
		btnNewButton.setBounds(39, 40, 146, 23);
		//BOTTON DE MATERIA
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Nueva materia");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pMateria ventana=new pMateria();
				ventana.setVisible(true);
			}
		});
		
		btnNewButton_1.setBounds(39, 71, 146, 23);
		//BOTTON DE NOTA
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Nueva nota");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pNota ventana=new pNota();
				ventana.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(39, 105, 146, 23);
		contentPane.add(btnNewButton_2);

	}
}
