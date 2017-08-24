package inputValidationPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputValidationConsol {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static String chooseValidation(String message, String... myChooses ){
		String s;
		do{
			System.out.println(message);
			s=scan.next();
			for(String myChoose: myChooses){
				myChoose.toLowerCase();
				if(myChoose.contentEquals(s)) return myChoose;
			}
		}while(true);	
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T inputValidation(String message , String outputType  ){
		T validatedInput=null;
		outputType.toLowerCase();
				
		do{	
			System.out.println(message);
			try{
			switch (outputType) {
			case "int":
				validatedInput=(T) Integer.valueOf(scan.next());
				break;
			case "double":
				validatedInput=(T) Double.valueOf(scan.next());
				break;
			case "string":
				validatedInput=(T) scan.next();	
				break;
			}
			}catch (Exception exception){}
					
		}while(validatedInput == null);	
		return validatedInput;
	}

	public static Date inputDateValidation(String mesage ){
		
		SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd");
		do{
			System.out.println(mesage);
			try{
				return simpleDateFormat.parse(scan.next());				
			}catch(Exception e){}			
		}while(true);			
	}
}








