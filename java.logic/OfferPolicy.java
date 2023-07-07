package group1.logic;

public class OfferPolicy {

	private double maximumAmount;
	private double percentDiscount;
	private Order o2 = new Order();
	
	public OfferPolicy() {
		super();
		this.maximumAmount = 1000;
		this.percentDiscount = 20;
	    
	}
	
	
	public double computeDiscount(double s) {
		
		//double z = order1.computeSubTotal();
		if(s>maximumAmount) {
			System.out.println("Congratulations! You have been rewarded with " +percentDiscount+ "% discount.");
			return this.percentDiscount; 
		}
		else {
			System.out.println("Thanks for coming!");
		    return 0;
		}
	}
}
