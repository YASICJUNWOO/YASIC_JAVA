package week3;

import javax.sql.rowset.serial.SQLOutputImpl;

public class week3 {

	public static void main(String[] args) {
	
		String strVar1 = "신민철0"; 
		String strVar2 = "신민철0"; //문자열 리터럴 동일하다면 같은 String 객체를 공유한다.
		
		if(strVar1 == strVar2) {
			System.out.println("strVar과 strVar2는 참조가 같음");
		}
		else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철"); //문자열 리터럴 동일해도 다른 String객체를 만들어주었다.(참조가 다름)
		
		if(strVar3 == strVar4) {
			System.out.println("strVar4과 strVar4는 참조가 같음");
		}
		else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
}
}

