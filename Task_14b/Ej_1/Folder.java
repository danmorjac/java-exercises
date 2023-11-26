package Task_14b.Ej_1;

import java.util.ArrayList;

public class Folder {

	private ArrayList <Mail> l = new ArrayList<Mail>();
	public Folder() {}

	public void addMail(Mail m) {l.add(m);}

	public void removeMail(int pos) {

		if(pos<=l.size() && pos >=0) {
			System.out.println("I have removed this position: "+l.get(pos));l.remove(pos);}
		else 
			System.out.println("Invalid position");}

	public void seachMail(String n) {
		for(int i = 0;i<l.size();i++) {
			if (l.get(i).getFrom().equals(n)) {
				System.out.println(l.get(i));
			}
		}
		}
	

	@Override
	public String toString() {

		String emails= "";

		for(int i=0;i<l.size();i++) {
			if(i == l.size()-1) {
				emails += l.get(i);
			}
			else {
				emails += l.get(i)+ "\n";
			}
		}
		return emails;
	}




}

