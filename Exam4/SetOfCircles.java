package Exam4;

import java.util.ArrayList;

public class SetOfCircles {
	private ArrayList<Circle> l = new ArrayList<Circle>();
	public SetOfCircles() {}

	public  boolean addCircle(Circle c) {

		boolean added=false;

		if(c!=null) {

			l.add(c);
			added=true;
		}
		else
			added=false;
		
		return added;
	}

	public void showFirstCircleThatContains (Point p) {

		boolean check=false;

		while(check=false) {

			for(int i=0;i<=l.size();i++) {
				if(l.get(i).isContained(p)){
					System.out.println("The point " + p + " is contained in the circle "+ l.get(i) );
					check=true;
				}
			}
		}
	}

	public void showCirclesThatIntersectWith (Circle c) {

		for(int i=0;i<=l.size();i++) {
			if(l.get(i).intersectsWith(c)){
				System.out.println("The point " + c + " intersects in the circle "+ l.get(i) );

			}
		}
	}

}



