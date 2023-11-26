package Sockets.chat_threads;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
	private String ip;
	//	private final static String IP = "127.0.0.1";
	private Socket socket;
	private ServerSocket server;
	private BufferedReader input;
	private ReadingFromStream reading;
	private PrintStream output;
	private final static String CLOSE = "*#*@*#*@*#";
	private boolean isServer = false;
	private String username;

	//	Getters
	public BufferedReader getInput() {return input;}
	public JTextArea getTxt_chat() {return txt_chat;}
	public static String getClose() {return CLOSE;}

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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if (output != null) output.println(CLOSE);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 215, 207));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(text_control);
		contentPane.add(text_toSend);
		contentPane.add(btn_server);
		contentPane.add(btn_client);
		contentPane.add(btn_exit);
		contentPane.add(btn_send);


		btn_server.setBounds(325, 41, 105, 27);
		btn_server.setEnabled(true);
		btn_server.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearChat();
				setUsername();
				try {setServer();} 
				catch (IOException e1) {e1.printStackTrace();}
			}
		});

		btn_client.setBounds(325, 80, 105, 27);
		btn_client.setEnabled(true);
		btn_client.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearChat();
				setUsername();
				setIP();
				try {setClient();} 
				catch (UnknownHostException e1) {e1.printStackTrace();} 
				catch (IOException e1) {e1.printStackTrace();}
			}
		});

		btn_send.setBounds(325, 225, 105, 27);
		btn_send.setEnabled(false);
		btn_send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {sendMSG();}
		});

		btn_exit.setBounds(325, 183, 105, 27);
		btn_exit.setEnabled(false);
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {output.println(CLOSE);}
		});

		text_control.setBounds(12, 12, 301, 17);
		text_control.setEditable(false);

		text_toSend.setBounds(12, 222, 301, 33);
		text_toSend.setColumns(10);
		text_toSend.setEditable(false);
		text_toSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {sendMSG();}
		});

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 41, 301, 169);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(txt_chat);
		txt_chat.setEditable(false);
	}

	//	Setters
	private void setClient() throws UnknownHostException, IOException {
		this.text_control.setText("Client started");
		this.socket = new Socket(ip, PORT); 

		this.setBufferedReader();
		this.setPrintStream();

		this.switchEnable(true);
	}
	private void setServer() throws IOException {
		this.isServer = true;
		
		this.text_control.setText("Server started");
		this.server = new ServerSocket(PORT);

		this.text_control.setText("Server waiting for a client...");
		this.socket = server.accept();
		this.text_control.setText("Connected to client: " + this.socket.getInetAddress());

		socket.setSoLinger(true, 10);

		this.setBufferedReader();
		this.setPrintStream();

		this.switchEnable(true);
	}
	private void setBufferedReader() throws IOException {
		this.input = new BufferedReader( new InputStreamReader(this.socket.getInputStream()));

		reading = new ReadingFromStream(this);
		reading.start();
	}
	private void setPrintStream() throws IOException {
		this.output = new PrintStream(this.socket.getOutputStream());
	}
	private void setUsername() {
		username = inputDialog("What's your username:", "Configure username");
	}
	private void setIP() {
		boolean lock = true;
		String _ip;

		do {
			_ip = inputDialog("Which IP do you want to connect:", "Configure IP");

			if (isValidIP(_ip)) lock = false;
			else this.messageDialog("\"" + _ip + "\"" + " isn't a valid IP.\nTry it again.", "Wrong IP");
		} while (lock);

		ip = _ip;
	}

	//	Methods
	private void sendMSG() {
		// Save message and clear input
		String myText = username + ": " + text_toSend.getText();
		text_toSend.setText("");

		// Send it
		output.println(myText);

		// Print conversation
		txt_chat.setText(txt_chat.getText() + "\n" + myText);
	}
	public void closeConnection() throws IOException {
		boolean isClosed = false;
		
		socket.close();

		if (this.isServer) {
			server.close();

			isClosed = socket.isClosed() && server.isClosed();
		}
		else isClosed = socket.isClosed();

		if (isClosed) {
			this.text_control.setText("Connection closed");
			txt_chat.setText(txt_chat.getText() + "\nClose connection...");

			this.switchEnable(false);
		} 
		else {this.text_control.setText("Something went wrong");}
	}
	private void switchEnable(boolean editable) {
		btn_server.setEnabled(!editable);
		btn_client.setEnabled(!editable);
		btn_send.setEnabled(editable);
		btn_exit.setEnabled(editable);
		text_toSend.setEditable(editable);
	}
	private String inputDialog(String cta, String windowTitle) {
		return JOptionPane.showInputDialog(contentPane, cta, windowTitle, JOptionPane.PLAIN_MESSAGE);
	}
	private void messageDialog(String cta, String windowTitle) {
		JOptionPane.showMessageDialog(contentPane, cta, windowTitle, JOptionPane.INFORMATION_MESSAGE);
	}
	private boolean isValidIP(String ip) {
		boolean isValid = false;
		
		String[] octets = ip.split("\\.");
		if (octets.length == 4) {
			boolean lock = true;
			for (int i = 0; lock && i < octets.length; i++)
				if (!octets[i].matches("\\d+")) lock = false;
			if (lock) isValid = lock;
		}

		return isValid;
	}
	private void clearChat() {
		txt_chat.setText("");
		text_toSend.setText("");
	}
}
