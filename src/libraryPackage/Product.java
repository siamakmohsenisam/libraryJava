package libraryPackage;

import java.util.Date;

public class Product {

	private String code;
	private String title;
	private Double price;
	private Date date;
	private Type type;
	
	
	public Product() {
		this("","",0.0 , new Date(), Type.BOOK);
	}

	public Product(String code, String title, Double price, Date date, Type type) {
		super();
		this.code = code;
		this.title = title;
		this.price = price;
		this.date = date;
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", title=" + title + ", price=" + price + ", date=" + date + ", type=" + type
				+ "]";
	}

	public enum Type {
		
		BOOK, 
		MAGAZINE, 
		SOFTWARE , 
		CD
	}
	
}
