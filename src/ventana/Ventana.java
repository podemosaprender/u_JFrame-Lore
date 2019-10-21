package ventana;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ventana extends JFrame implements  ActionListener{
	JButton boton1 = new JButton("Jugar");
	JButton boton2 = new JButton("Instrucciones");
	JButton boton3 = new JButton("Salir");


	public Ventana() {
		this.setSize(800, 600);
		this.setTitle("Vegan Bird");
		this.setLocationRelativeTo(null);
		iniciarComponentes ();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void iniciarComponentes(){

		JPanel panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);

		JLabel fondo = new JLabel (new ImageIcon("fondoMenu.jpg"));
		fondo.setBounds(0, 0, 800, 600);
		panel.add(fondo);

		boton1.setBounds(300, 200, 150, 40);
		ImageIcon jugar = new ImageIcon("botJugar.png");
		boton1.setIcon(new ImageIcon (jugar.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
		boton1.setFont(new Font("cooper black",Font.ITALIC,25));
		panel.add(boton1);

		boton2.setBounds(300, 250, 150, 40);
		ImageIcon instruc = new ImageIcon("botInstruc.png");
		boton2.setIcon(new ImageIcon (instruc.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(boton2);

		boton3.setBounds(300, 300, 150, 40);
		ImageIcon salir = new ImageIcon("botSalir.png");
		boton3.setIcon(new ImageIcon (salir.getImage().getScaledInstance(boton3.getWidth(), boton3.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(boton3);	
		boton3.addActionListener ((ActionListener) this);


	}

	public void actionPerformed (ActionEvent e){
		if (e.getSource().equals (boton3)) {
			this.dispose();
		}
	}

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setVisible(true);

	}

}
