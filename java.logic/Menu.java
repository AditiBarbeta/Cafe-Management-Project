package group1.logic;

import java.util.Enumeration;
import java.util.Hashtable;


public class Menu {

	
	private String dishName;
	private String price;
	
	
	
	
	public void addDishes()  {
	
		Hashtable<String, String> menu = new Hashtable<String,String>();
		System.out.println("------------MENU-------------");
	
		menu.put("Mango_Shake","200");
		menu.put("Chocolate_Maggi","500");
		menu.put("Potato_Pizza","300");
		menu.put("Paneer_Momos","150");
		menu.put("Rajma_Pasta","400");
		menu.put("Tomato_Icecreame","400");
		Enumeration n = menu.keys();
		while(n.hasMoreElements()) {
			dishName = (String) n.nextElement();
			
			System.out.println(dishName+" : Rs."+menu.get(dishName));
			
		}
		System.out.println("------------------------------");
	}
	

	
}
