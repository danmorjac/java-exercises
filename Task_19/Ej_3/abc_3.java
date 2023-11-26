package Task_19.Ej_3;

class TwoGen<T, V>{
	T ob1;
	V ob2;

	public TwoGen(T o1, V o2){
		ob1=o1;
		ob2=o2;
	}

	public T getOb1(){return ob1;}

	public V getOb2(){return ob2;}

	public void setOb1(T o1){ob1=o1;}

	public void setOb2(V o2){ob2=o2;}

	public void showType(){
		System.out.println("Type of T is: " + ob1.getClass().getName());
		System.out.println("Type of V is: " + ob2.getClass().getName());
	}

	@Override
	public String toString() {
		return "TwoGen{" +
				"ob1=" + ob1 +
				", ob2='" + ob2 + '\'' +
				'}';
	}

	public static void main(String[] args) {
		TwoGen<Double, Boolean> two = new TwoGen<>(3.1416, true);
		two.showType();

		System.out.println("Before setters: " + two.toString());
		two.setOb1(2.7182);
		two.setOb2(false);
		System.out.println("After setters: " + two.toString());

		double v = two.getOb1();
		System.out.println("Value: " + v);

		boolean bool = two.getOb2();
		System.out.println("Value: " + bool);

	}
}







