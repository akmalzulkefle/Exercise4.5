
public class Papaya extends Fruit {

	private String benefits;
	private double weight;
	private double price;

	public Papaya(String name, String b, double w, double p) {
		super(name);
		this.benefits = b;
		this.weight = w; 
		this.price = p;
		
		System.out.println("Papaya constructor is invoke");
	}
	
	public String getBenefits() {
		return this.benefits;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double calcPrice() {
		return this.price * this.weight;
	}
	
	public String toString() {
		return ("The benefits of " + super.name + " is to " + getBenefits() + "\n" 
		        + "Weight : " + getWeight() + "kg" + "\n"
				+ "Total Price : RM" + calcPrice());
		
	}

	@Override
	public double totalPrice() {
		return 0;
	}

	@Override
	public double totalPrice(double pp) {
		return 0;
	}

	@Override
	public double totalPrice(double pp, int qq) {
		return 0;
	}
}