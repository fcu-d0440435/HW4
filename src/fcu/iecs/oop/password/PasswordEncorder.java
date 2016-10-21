package fcu.iecs.oop.password;

public class PasswordEncorder {

//private String aaa;
public  String encorder(String aaa){
		
		aaa=aaa.replace('a','4');
		aaa=aaa.replace('A','4');
		aaa=aaa.replace('E','3');
		aaa=aaa.replace('e','3');
		aaa=aaa.replace('I','1');
		aaa=aaa.replace('i','1');
		aaa=aaa.replace('O','0');
		aaa=aaa.replace('o','0');
		aaa=aaa.replace('T','7');
		aaa=aaa.replace('t','7');
		return aaa;
	
	}

}
