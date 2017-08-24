package libraryPackage;

import java.util.Date;

public class Magazine extends Product{
	
	private Date date;

	
	public Magazine() {
		this(new Date());
	}

	public Magazine(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Magazine [date= " + date + ", \n" + super.toString() + "]";
	}


	
	

}
