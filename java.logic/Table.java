package group1.logic;


public class Table {
	
	private int tableNo;
	CustomerDetails c = new CustomerDetails();
	
	public Table() {
		super();
		this.tableNo = 0;
	
	}

	public int tableAllotmentSystem(int seatingCapacity) {
		
		if( seatingCapacity == 4) {
			return 1;
		}
		else if(seatingCapacity==3) {
			return 2;
		}
		else if(seatingCapacity==2) {
			return 5;
		}
		else if(seatingCapacity==6) {
			return 4;
		}
		else if(seatingCapacity>6 && seatingCapacity<10){
			return 3;
		}
		else {
			System.out.println("The capacity is full!! Please wait.");
		}
		
		
		return tableNo;
	}

}
