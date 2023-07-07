package group1.logic;

public class Bill {

	private double grandTotal;
	OfferPolicy o = new OfferPolicy();
	Order o3 = new Order();
	
	public double computeGrandTotal(double s, double d) {
		this.grandTotal =s - (s * (d/100));
		return this.grandTotal;
	}
	
}
