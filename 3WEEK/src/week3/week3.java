package week3;

import javax.sql.rowset.serial.SQLOutputImpl;

public class week3 {

	public static void main(String[] args) {
	
		String strVar1 = "�Ź�ö1";
		String strVar2 = "�Ź�ö1";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar�� strVar2�� ������ ����");
		}
		else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar4�� strVar4�� ������ ����");
		}
		else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}
}
}

