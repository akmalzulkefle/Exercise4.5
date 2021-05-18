
public abstract class Fruit{

	protected String name; 
	
	public Fruit(String name){
		
		this.name = name;
		
	} 
	
	public abstract double totalPrice();
	public abstract double totalPrice(double pp);
	public abstract double totalPrice(double pp, int qq);
	
}