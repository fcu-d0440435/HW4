package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
	
     public static void main(String[] args){
    	 
    	 PasswordEncorder password = new PasswordEncorder();
    	 Scanner scanner =new Scanner(System.in);
    	 String keyword;
    	 String a = "exit";
    	 int flag=1;
    	 
    	 do{
    	  System.out.println("Give me a password:");
    	  keyword = scanner.next();
    	  
    	  if(keyword.compareTo(a)==0){
    		  
    		  flag=0;
    	  }
    	  else {
    		  keyword =password.encorder(keyword);
    		  System.out.printf("%s",keyword);
    		  
    		  
    	  }
    	  
    	  
    	 

    
    	 }while(flag == 1);
     

}

	
}