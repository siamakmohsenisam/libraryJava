package libraryPackage;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class  Singleton <T>{
	
	private static Singleton singleton = new Singleton();
	
	private List<T> listProduct = new ArrayList<T>();
	
	public static Singleton getInstance(){
		return singleton;
	}

	public Singleton() {
		
	}

	public List<T> getListProduct() {
		return listProduct;
	}

	public void setListProduct(List<T> listProduct) {
		this.listProduct = listProduct;
	}
		
	public void add(T t){
		listProduct.add(t);
	}

	public void remove(T t){
		listProduct.remove(t);
	}

	public void remove(int index){
		listProduct.remove(index);
	}

	public void contains(T t){
		listProduct.contains(t);
	}

	public int search(String code){
		
		for(T t: listProduct){			
			if (t instanceof Product){
				Product t2 = (Product) t ;
				if(t2.getCode().equals(code))
					return listProduct.indexOf(t2);
			}
		}
		return -1;
	}
	
		public String printList(){
			String s="";
			for(T t: listProduct){
				s+=t.toString();
				s+="\n";
			}
			return s;	
		}
		
	// method for sort
	public void sortList(String sortVariable){
		
		Comparator<T> objectSort =new Comparator<T>(){
			
			@Override
			public int compare(T o01, T o02) {
				Product o1=null;
				Product o2=null;
				if (o01 instanceof Product && o02 instanceof Product){
					o1 = (Product) o01 ;
					o2 = (Product) o02 ;
				}	
				String s1="",s2="";
				switch(sortVariable){
				
				case "code" :
					s1=o1.getCode();
					s2=o2.getCode();
					break;
				case "title" :
					s1=o1.getTitle();
					s2=o2.getTitle();
					break;
				case "price" :
					if(o1.getPrice() > o2.getPrice())
						return 1;
					else 
						return -1;
				case "date" :
					if(o1.getDate().before(o2.getDate()))
						return -1;
					else 
						return 1;					
				}
				
				if(s2.compareTo(s1)>0) return 1;
				if(s2.compareTo(s1)<0) return -1;
				return 0;
			}		
		};
		Collections.sort(getListProduct(), objectSort);
	}
}

