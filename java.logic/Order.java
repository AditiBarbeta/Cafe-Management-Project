package group1.logic;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Order {
	private CustomerDetails customerDetails ;
	private double subTotal;
	
	PriorityQueue<String> order = new PriorityQueue<>();
	ArrayList<Integer> price = new ArrayList<>();

	Scanner inp = new Scanner(System.in);
	
	public void addorder() {
		
		System.out.println("Enter your order name: ");
		String ch = inp.next();
		//order.add(ch);
		
		switch(ch) {
		
		case "Mango_Shake":
			order.add("Mango_Shake");
			price.add(200);
			break;
			
		case "Chocolate_Maggi":
			order.add("Chocolate_Maggi");
			price.add(500);
			break;
			
		case "Potato_Pizza":
			order.add("Potato_Pizza");
			price.add(300);
			break;
			
		case "Paneer_Momos":
			order.add("Paneer_Momos");
			price.add(150);
			break;
			
		case "Rajma_Pasta":
			order.add("Rajma_Pasta");
			price.add(400);
			break;
			
		case "Tomato_Icecreame":
			order.add("Tomato_Icecreame");
			price.add(400);
			break;
		}
		System.out.println("Your order: "+order);
		System.out.println("Price: "+price);
	}
	
	public ArrayList<Integer> getPrice() {
		return price;
	}
public double computeSubTotal() {
	for(int i=0 ; i<this.price.size();i++) {
		this.subTotal =this.subTotal + this.price.get(i);
	}
	return this.subTotal;
}

	public void removeOrder() {
		order.clear();
		price.clear();
		this.subTotal = 0;
	}

	public double getSubTotal() {
		return subTotal;
	}

}
