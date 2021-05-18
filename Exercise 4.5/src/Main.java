
public class Main {

public static void main(String[] args) {
	
	Melon m = new Melon("Melon", 4.99, 50); 
	System.out.println(m);
	System.out.println(); 

	Watermelon wm = new Watermelon("Watermelon", 3.99, 60, "Dark Green", "Spherical"); 
	System.out.println(wm);
	System.out.println();
	
	HoneydewMelon hm = new HoneydewMelon("Honeydew Melon", 5.99, 150, "Sweet Aromatic Flavor"); 
	System.out.println(hm);
	System.out.println();
	
	Papaya p = new Papaya("Papaya", "Reduce the risk of Heart Disease", 2.5, 13.5);
	System.out.println(p);
	
	
}

}