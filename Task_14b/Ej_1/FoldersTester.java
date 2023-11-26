package Task_14b.Ej_1;

import java.util.Scanner;

public class FoldersTester {
	static Scanner k = new Scanner(System.in);

	private static Mail inputMailKeyboard() {
		System.out.println("Type the information of your mail");
		System.out.println("Sender:");
		String to=k.nextLine();
		System.out.println("Receiver:");
		String from=k.nextLine();
		System.out.println("Subject:");
		String subject=k.nextLine();
		System.out.println("Body of the Mail:");
		String body=k.nextLine();

		Mail m =new Mail(to, from, subject, body);
		return m;
	}
	private static int inputMenuOption() {
		int resp=0;
		do {
			System.out.println("1. Show all the mails of the folder");
			System.out.println("2. Add a new Mail");
			System.out.println("3. Show the mails of a sender");
			System.out.println("4. Exit the program");
			System.out.println("-------------------------------------------------");
			System.out.println("Choose one option (1, 2, 3, 4)");
			resp=k.nextInt(); k.nextLine();
		}while (resp<1 && resp>4);
		return resp;
	}
	private static int inputFolder() {
		int resp=0;
		do {
			System.out.println("1. InBox");
			System.out.println("2. Sent mails");
			resp=k.nextInt();k.nextLine();
		}while (resp<1 && resp>2);
		return resp;
	}
	public static void main(String[] args) {
		int opt =0;
		int folder=0;
		Folder inbox = new Folder();
		Folder sent = new Folder();
		Folder f = new Folder();
		do {
			opt = inputMenuOption();
			if (opt!=4) { 
				folder =inputFolder();
				if (folder==1) f=inbox; 
				else f=sent;
			}
			// now you can do the selected action in f folder (that is the selected one)
			switch (opt) {
			case 1: 
				System.out.println(f.toString());
				break;
			case 2:
				f.addMail(inputMailKeyboard());
				break;
			case 3:
				System.out.println("Imput a sender:");
				String name=k.next();
				f.seachMail(name);
				break;
			}
		} while (opt!=4);


	}

}
