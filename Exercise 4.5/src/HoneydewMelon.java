
public class HoneydewMelon extends Melon {
	
	private String taste;
	
	public HoneydewMelon(String name, double p, int q, String t) {
		super(name, p, q);
		this.taste = t; 
		
	}
	public String getTaste() {
		return this.taste;
	}
	
	Discount a = new HoneydewMelonDiscount(); //create new object for Yellow Mango Discount
	
	public double calPrice() {
		return (super.totalPrice()-(super.totalPrice()*a.discount()));
	}

	
	public String toString() {
		return ("Total Price : RM" + paid + "\n"
				+ "Taste of " + super.name + " is " + getTaste() + "\n"
				+ "Price after discount: RM" + calPrice());
				
	}

}