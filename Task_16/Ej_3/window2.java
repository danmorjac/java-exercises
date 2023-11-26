package Task_16.Ej_3;

	import java.awt.BorderLayout;
	import java.awt.EventQueue;
	import java.awt.Graphics;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;

	import Task_16.Ej_3.House.BaseClass;

	public class window2 {

		private JFrame frame;
		protected Graphics g;
		private static House f =new House();

		private static House.BaseClass [] refArray = new House.BaseClass[5];
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						window2 window2 = new window2();
						window2.frame.setVisible(true);
						refArray[0] = f.new Pared();
						refArray[1] = f.new LeftWindow();       
						refArray[2] = f.new RightWindow();       
						refArray[3] = f.new Door(); 
						refArray[4] = f.new Chimenea();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public window2() {
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
