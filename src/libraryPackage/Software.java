package libraryPackage;

public class Software extends Product{
	
	private double version;
	private int numberOfCd;
	
	
	public Software() {
		this(0.0,0);
	}


	public Software(double version, int numberOfCd) {
		this.version = version;
		this.numberOfCd = numberOfCd;
	}


	public double getVersion() {
		return version;
	}


	public void setVersion(double version) {
		this.version = version;
	}


	public int getNumberOfCd() {
		return numberOfCd;
	}


	public void setNumberOfCd(int numberOfCd) {
		this.numberOfCd = numberOfCd;
	}


	@Override
	public String toString() {
		return "Software [version= " + version + ", numberOfCd= " + numberOfCd + ", \n" + super.toString() + "]";
	}



	
	
}
