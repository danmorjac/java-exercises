package Task_13.Ej_2;

public class PetTester {

	public static void main(String[] args) {

		Pet Cat=new Pet();
		Pet Dog =new Pet();
		
		Cat.set("Manchitas", 6, 7);
		
		Dog.setName("Patitas");
		Dog.setAge(12);
		Dog.setWeight(15.5);
		
		System.out.println(Cat);
		System.out.println(Dog);
	}

}
