package api4_String;

import java.util.HashMap;

public class T08_valueof {
	//String.Valureof() : ~~자료형들을 '문자열'로 변환한다
	public static void main(String[] args) {
		
		//int intSu = 1234;
		//double dblSu = 1234.0;
		Integer intSu = 1234;//객체가 됨
 		Double dblSu = 1234.0;
		String strSu = "1234";
		HashMap<String, Integer> map = new HashMap<>();
		
		System.out.println(strSu);
		System.out.println(strSu.getClass().getName());
		System.out.println(intSu.getClass().getName());
		System.out.println(dblSu.getClass().getName());
		System.out.println(map.getClass().getName());
		
		int intSu2 = 1234;
		System.out.println("1.intSu + 100 = " + (intSu +100));
		//String strSu2 = (String) intSu2;(x)
		//String strSu2 = intSu2.toString();(x)
		String strSu2 = intSu + ""; // O
		strSu2 = intSu2 + "";       // O
		
		String strSu3 = String.valueOf(intSu2);
		System.out.println(strSu3.getClass().getName());
		
		double dblSu4 = 3.14;
		String strSu4 = String.valueOf(dblSu4);
		System.out.println(strSu4.getClass().getName());
		System.out.println();
		
		int a1 = 100, a2 =200;
		int res = a1 + a2;
		System.out.println("res : " +res);
		
		String str5= String.valueOf(a1) + String.valueOf(a2);
		System.out.println(str5);
		
		//int res6 = (int) (String.valueOf(a1) +(int) String.valueOf(a2));
		int res6 = Integer.parseInt(String.valueOf(a1)) + Integer.parseInt(String.valueOf(a2));
		System.out.println("res6 : " + res6);
	}
}
