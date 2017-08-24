package testerPackage;

import java.util.Scanner;
import libraryPackage.Book;
import libraryPackage.Cd;
import libraryPackage.Magazine;
import libraryPackage.Person;
import libraryPackage.Product.Type;
import libraryPackage.Singleton;
import libraryPackage.Software;
import inputValidationPackage.InputValidationConsol;

public class Tester
{
	public static Scanner scan = new Scanner(System.in);
	static Singleton singleton = Singleton.getInstance();
	
	public static void main(String[] args) 
	{
		String help = "";	
		do{
			help = InputValidationConsol.chooseValidation("What do you want to do ? (Add(A) , Remove(R) , Search(Se) ,Sort(So), Print all list(P)  : ",
					                                           "a","r","se","so","p");
			switch(help)
			{
			case "a":
				addItem();
				break;
			case "so":
				sortList();
				break;
			case "r":
				removeItem();
				break;
			case "se":
				searchItem();
				break;
			case "p":
				System.out.println(singleton.printList());
				break;	
			}
						
		}while(InputValidationConsol.chooseValidation("Do you want continue Y/N : " , "y" , "n") == "y");
	}
	
	private static void sortList() {
		
		String help = "";
		help=InputValidationConsol.chooseValidation("which field you want sort ( Code(C), Title(T) , Date(D) , Price(P) ) : " , "c","t","d","p");
		
		switch(help)
		{
		case "c":
			singleton.sortList("code");
			break;
		case "t":
			singleton.sortList("title");
			break;
		case "d":
			singleton.sortList("date");
			break;
		case "p":
			singleton.sortList("price");
			break;
		}
		
	}

	private static void searchItem() {

		int index;
		String code = InputValidationConsol.inputValidation("Please enter code of product for search : ", "string");
		
		index=singleton.search(code);
		if(index !=-1)
		System.out.println(singleton.getListProduct().get(index).toString());
		else System.out.println("not found");	
		
	}
	
	private static void removeItem() {
		
		int index=-1;
		String code = InputValidationConsol.inputValidation("Please enter code of product for remove : ", "string");
		
		index=singleton.search(code);
		if(index !=-1)
		singleton.remove(index);
		else System.out.println("not found");		
	}
	
	private static void addItem() {
		String help = "";
		help=InputValidationConsol.chooseValidation("which type do you want add (Book, Software, CD, Magezin) B/S/C/M : " , "b","s","c","m");
		switch(help)
		{
		case "b":
			Book book = new Book();
			Person author = new Person();
			author.setFirstName(InputValidationConsol.inputValidation("Please enter author's firstname : ", "string"));
			author.setLastName(InputValidationConsol.inputValidation("Please enter author's lastname : ", "string"));
			author.setEmail(InputValidationConsol.inputValidation("Please enter author's email : ", "string"));
			book.setAuthor(author);
			
			Person editor = new Person();
			editor.setFirstName(InputValidationConsol.inputValidation("Please enter editor's firstname : ", "string"));
			editor.setLastName(InputValidationConsol.inputValidation("Please enter editor's lastname : ", "string"));
			editor.setEmail(InputValidationConsol.inputValidation("Please enter editor's email : ", "string"));
			book.setEditor(editor);
			
			book.setIsbn(InputValidationConsol.inputValidation("Please enter isbn : ", "string"));
			book.setNumberOfPage(InputValidationConsol.inputValidation("Please enter page number : ", "int"));
			
			book.setCode(InputValidationConsol.inputValidation("Please enter code  : ", "string"));
			book.setTitle(InputValidationConsol.inputValidation("Please enter title : ", "string"));
			book.setPrice(InputValidationConsol.inputValidation("Please enter price : ", "double"));
			book.setDate(InputValidationConsol.inputDateValidation("Please enter date. Example (yyyy-MM-dd) :"));
			book.setType(Type.BOOK);
			
			singleton.add(book);
			
			break;
			
		case "s":
			Software software= new Software();
			software.setVersion(InputValidationConsol.inputValidation("Please enter version : ", "double"));
			software.setNumberOfCd(InputValidationConsol.inputValidation("Please enter number of CD :", "int"));
			
			software.setCode(InputValidationConsol.inputValidation("Please enter code  : ", "string"));
			software.setTitle(InputValidationConsol.inputValidation("Please enter title : ", "string"));
			software.setPrice(InputValidationConsol.inputValidation("Please enter price : ", "double"));
			software.setDate(InputValidationConsol.inputDateValidation("Please enter date. Example (yyyy-MM-dd) :"));
			software.setType(Type.SOFTWARE);
			
			singleton.add(software);
			
			break;
			
		case "m":
			Magazine magazine= new Magazine();
			magazine.setDate(InputValidationConsol.inputDateValidation("Please enter date. Example (yyyy-MM-dd) :"));
			
			magazine.setCode(InputValidationConsol.inputValidation("Please enter code  : ", "string"));
			magazine.setTitle(InputValidationConsol.inputValidation("Please enter title : ", "string"));
			magazine.setPrice(InputValidationConsol.inputValidation("Please enter price : ", "double"));
			magazine.setDate(InputValidationConsol.inputDateValidation("Please enter date. Example (yyyy-MM-dd) :"));
			magazine.setType(Type.MAGAZINE);
			
			singleton.add(magazine);
			
			break;	
		case "c":
			Cd cd = new Cd();
			cd.setIdentification(InputValidationConsol.inputValidation("Please enter identification : ", "int"));
			cd.setCapacity(InputValidationConsol.inputValidation("Please enter capacity : ", "double"));
			
			cd.setCode(InputValidationConsol.inputValidation("Please enter code  : ", "string"));
			cd.setTitle(InputValidationConsol.inputValidation("Please enter title : ", "string"));
			cd.setPrice(InputValidationConsol.inputValidation("Please enter price : ", "double"));
			cd.setDate(InputValidationConsol.inputDateValidation("Please enter date. Example (yyyy-MM-dd) :"));
			cd.setType(Type.CD);
			
			singleton.add(cd);
		
			break;
		}
	}
}	