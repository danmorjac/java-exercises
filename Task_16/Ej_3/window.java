package Task_16.Ej_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Task_16.Ej_3.Face.BaseClass;

public class window {

	private JFrame frame;
	protected Graphics g;
	private static Face f =new Face();

	private static Face.BaseClass [] refArray = new Face.BaseClass[5];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
					window.frame.setVisible(true);
					refArray[0] = f.new Head();
					refArray[1] = f.new LeftEye();       
					refArray[2] = f.new RightEye();       
					refArray[3] = f.new Nose();       
					refArray[4] = f.new Mouth(); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for (BaseClass e: refArray) {                          	                
					g = panel.getGraphics();
					e.draw(g); } 
			}
		});
		panel.add(btnNewButton);
	}

}

