package demo.exercise.section7.ex34;

public class Carpet {

	private double cost;

	public Carpet(double cost) {
		if (cost < 0) 
			cost = 0;
		this.cost = cost;
	}

	public double getCost() {
		return this.cost;
	}
	
	

}
