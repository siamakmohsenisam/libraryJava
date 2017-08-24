package libraryPackage;

public class Cd extends Product{
	
	private int identification;
	private double capacity;
	
	
	public Cd() {
		this(0,0.0);
	}
	public Cd(int identification, double capacity) {
		super();
		this.identification = identification;
		this.capacity = capacity;
	}
	public int getIdentification() {
		return identification;
	}
	public void setIdentification(int identification) {
		this.identification = identification;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Cd [identification= " + identification + ", capacity= " + capacity + " \n" + super.toString()
				+ "]";
	}

	


}
