
public class Main {

	public static void main(String[] args) {
		Fruits a = new Fruits();
		a.setName("Mango");
		a.setColor("Yellow");
		a.setNoSeed("One");
		a.setTaste("Sweet");
		a.setWeight(1.5);
		a.setPrice(5);
		a.setNoOfFruits(2);
		
		
		System.out.println("Fruits: " + a.getName());
		System.out.println("Color: " + a.getColor());
		System.out.println("Number of seeds: " + a.getNoSeed());
		System.out.println("Taste: " + a.getTaste());
		System.out.printf("Weight: %.2f kg %n",a.getWeight());
		System.out.printf("Price: RM%.2f per kg %n",a.getPrice());
		System.out.println("No of Fruits: " + a.getNoOfFruits());
		System.out.printf("Total weight: %.2fkg %n",a.getTotalWeight());
		System.out.printf("Total Price: RM%.2f %n",a.getTotalPrice());
		System.out.println();
		
		Fruits b = new Fruits();
		b.setName("Lemon");
		b.setColor("Green");
		b.setNoSeed("Many");
		b.setTaste("Sour");
		b.setWeight(0.5);
		b.setPrice(1);
		b.setNoOfFruits(4);
		
		System.out.println("Fruits: "+b.getName());
		System.out.println("Color: "+b.getColor());
		System.out.println("Number of seeds: "+b.getNoSeed());
		System.out.println("Taste: "+b.getTaste());
		System.out.printf("Weight: %.2f kg %n",b.getWeight());
		System.out.printf("Price: RM%.2f per kg %n",b.getPrice());
		System.out.println("No of Fruits: " + b.getNoOfFruits());
		System.out.printf("Total weight: %.2fkg %n",b.getTotalWeight());
		System.out.printf("Total Price: RM%.2f %n",b.getTotalPrice());
	}

}
