package Sockets.frame_chat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class Chat extends JFrame {

	private JPanel contentPane;
	private JTextField text_toSend = new JTextField();;
	private JButton btn_server = new JButton("Server");
	private JButton btn_client = new JButton("Client");
	private JButton btn_send = new JButton("Send");
	private JButton btn_exit = new JButton("Exit");
	private JTextArea txt_chat = new JTextArea();
	private JTextArea text_control = new JTextArea();
	private final static int PORT = 5005;
	private final static String SERVER = "127.0.0.1";
//	private final static String SERVER = "10.2.1.148";
//	private final static String SERVER = "10.2.1.187";
	private Socket socket;
	private ServerSocket server;
	private BufferedReader input;
	private PrintStream output;
	private final static String CLOSE = "*#*@*#*@*#";
	private boolean AmIServer;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chat frame = new Chat();
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
	public Chat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 215, 207));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		text_control.setEditable(false);
		contentPane.add(text_control);
		contentPane.add(text_toSend);
		contentPane.add(btn_server);
		contentPane.add(btn_client);
		contentPane.add(btn_exit);
		contentPane.add(btn_send);


		btn_server.setBounds(325, 41, 105, 27);
		btn_server.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					setServer();
				} catch (IOException e1) {
					System.out.println("btn_server");
					e1.printStackTrace();
				}
			}
		});

		btn_client.setBounds(325, 80, 105, 27);
		btn_client.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					setClient();
				} catch (UnknownHostException e1) {
					System.out.println("btn_client");
					e1.printStackTrace();
				} catch (IOException e1) {
					System.out.println("btn_client");
					e1.printStackTrace();
				}
			}
		});
		
		btn_send.setBounds(325, 225, 105, 27);
		btn_send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String myText = "me: " + text_toSend.getText();
				text_toSend.setText("");
				
				output.println(myText);
				
				String currentText = txt_chat.getText() + "\n" + myText;
				try {
					String newText = input.readLine();
					
					if (newText.equals(CLOSE)) closeConnection();
					else {						
						currentText += "\n" + newText;
						txt_chat.setText(currentText);
					}
				} catch (IOException e1) {
					System.out.println("btn_send");
					e1.printStackTrace();
				}
			}
		});
		
		btn_exit.setBounds(325, 183, 105, 27);
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.println(CLOSE);
				
				try {closeConnection();}
				catch (IOException e1) {
					System.out.println("btn_exit");
					e1.printStackTrace();
				}
			}
		});

		text_control.setBounds(12, 12, 301, 17);
		
		text_toSend.setBounds(12, 222, 301, 33);
		text_toSend.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 41, 301, 169);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(txt_chat);
		txt_chat.setEditable(false);
	}

//	Methods
	private void setClient() throws UnknownHostException, IOException {
		AmIServer = false;
		
		this.text_control.setText("Client started");
		this.socket = new Socket(SERVER, PORT); 

		this.setBufferedReader();
		this.setPrintStream();
	}
	private void setServer() throws IOException {
		AmIServer = true;
		
		this.text_control.setText("Server started");
		this.server = new ServerSocket(PORT);
		
		this.text_control.setText("Server waiting for a client...");
		this.socket = server.accept();
		this.text_control.setText("Connected to client: " + this.socket.getInetAddress());
		
		socket.setSoLinger(true, 10);

		this.setBufferedReader();
		this.setPrintStream();
	}
	private void setBufferedReader() throws IOException {
		this.input = new BufferedReader( new InputStreamReader(this.socket.getInputStream()));
	}
	private void setPrintStream() throws IOException {
		this.output = new PrintStream(this.socket.getOutputStream());
	}
	private void closeConnection() throws IOException {
		boolean isClosed = false;
		
		socket.close();
		
		if (AmIServer) {
			server.close();
			
			isClosed = socket.isClosed() && server.isClosed();
		}
		else isClosed = socket.isClosed();
		
		if (isClosed) this.text_control.setText("Connection closed");
	}
}
