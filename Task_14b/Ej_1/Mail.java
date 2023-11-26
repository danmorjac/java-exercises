package Task_14b.Ej_1;

public class Mail {
	private String to;
	private String from;
	private String subject;
	private String body;
	private static int count =0;
	private int numberID=0;
	public Mail( String to, String from, String subject, String body) {
		this.to=to;
		this.from=from;
		this.subject=subject;
		this.body=body;
		this.numberID= ++count;
	}

	public String getTo() {
		return to;
	}

	public String getFrom() {
		return from;
	}

	public String getSubject() {
		return subject;
	}

	public String getBody() {
		return body;
	}

	@Override
	public String toString() {
		return "ID: "+numberID+ "\nTo: " + to + "\nFrom: " + from + "\nSubject: " + subject + "\nBody: " + body + "\n-------------------";
	}

}
