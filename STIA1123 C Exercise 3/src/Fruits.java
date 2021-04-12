
public class Fruits {
	String name, color, numberseed, taste;
	double weight, price,totalweight, totalprice;
	int nooffruits;
	
	void setName(String name) {
		this.name = name;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	void setNoSeed(String number) {
		this.numberseed = number;
	}
	
	void setTaste (String taste) {
		this.taste = taste;
	}
	
	void setWeight(double weight) {
		this.weight = weight;
	}
	
	void setPrice(double price) {
		this.price = price;
	}
	
	void setNoOfFruits(int no) {
		this.nooffruits = no;
	}
	
	String getName() {
		return this.name;
	}
	
	String getColor() {
		return this.color;
	}
	
	String getNoSeed() {
		return this.numberseed;
	}
	
	String getTaste() {
		return this.taste;
	}
	
	double getWeight() {
		return this.weight;
	}
	
	double getPrice() {
		return this.price;
	}
	
	int getNoOfFruits() {
		return this.nooffruits;
	}
	
	double getTotalWeight() {
		this.totalweight = this.nooffruits * this.weight;
		return this.totalweight;
	}
	
	double getTotalPrice() {
		this.totalprice = this.totalweight * this.price;
		return this.totalprice;
	}
}
