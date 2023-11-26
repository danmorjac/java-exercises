package Sockets.chat_threads;

import java.io.IOException;

import javax.swing.JTextArea;

public class ReadingFromStream extends Thread {
//	Attributes
	private Chat chat;
	
//	Constructor
	public ReadingFromStream(Chat chat) {this.chat = chat;}
	
//	Methods
	@Override
	public void run() {
		try {
			boolean lock = true;
			
			while(lock) {
				String newText = chat.getInput().readLine();
				
				if (newText == null || newText.equals(Chat.getClose())) {
					lock = false;
					chat.closeConnection();
				}
				else {
					JTextArea txt_chat = chat.getTxt_chat();
					
					txt_chat.setText(txt_chat.getText() + "\n" + newText);					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
