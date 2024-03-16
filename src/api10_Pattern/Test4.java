package api10_Pattern;

import java.util.regex.Pattern;

//문자열 정규식...(?는 0번이나 1번, +는 1번이상, *는 0번이상)
public class Test4 {
	public static void main(String[] args) {
		String regEx1 = "^[abc]*$"; //a또는 b또는 c문자가 포함? ^[abc]*$,^[a|b|c]*$
		String regEx2 = "^[a-z]+$"; //영문 소문자만 1번이상
		String regEx3 = "^[A-Z]+$"; //영문 대문자만 0번이상
		String regEx4 = "^[a-zA-Z]*$"; //영문 대/소문자만 0번이상
		String regEx5 = "^[가-힣]*$"; //영문 대/소문자만 0번이상
		String regEx6 = "^[a-zA-Z가-힣]*$"; //영문 대/소문자/한글만 0번이상
		String regEx7 = "^[a-zA-Z가-힣 ]*$"; //영문 대/소문자/한글/공백만 0번이상
		String regEx8 = "^[a-zA-Z가-힣0-9 ]*$"; //영문 대/소문자/한글/공백만 0번이상
		String regEx9 = "^[a-zA-Z가-힣0-9_-]*$"; //영문 대/소문자/한글/공백만 0번이상
		
		String str0 = "";
		String str1 = "1234";
		String str2 = "1234ghjk";
		String str3 = "aaa";
		String str4 = "bc";
		String str5 = "asdc";
		String str6 = "AS-DF";
		String str7 = "asDf";
		String str8 = "abcsDf";
		String str9 = "abc   ";//공백 스패이스
		String str10 = "abc		";//탭
		String str11 = "ㄱ";
		String str12 = "그린컴퓨터";
		String str13 = "그린 컴퓨터";
		String str14 = "그린 Computer";
		String str15 = "그린2_Computer";
		
		System.out.println("1:00= " + Pattern.matches(regEx1, str0));
		System.out.println("1:01= " + Pattern.matches(regEx1, str1));
		System.out.println("1:02= " + Pattern.matches(regEx1, str2));
		System.out.println("1:03= " + Pattern.matches(regEx1, str3));
		System.out.println("1:04= " + Pattern.matches(regEx1, str4));
		System.out.println("1:05= " + Pattern.matches(regEx1, str5));
		System.out.println("1:06= " + Pattern.matches(regEx1, str6));
		System.out.println("1:07= " + Pattern.matches(regEx1, str7));
		System.out.println("1:08= " + Pattern.matches(regEx1, str8));
		System.out.println("1:09= " + Pattern.matches(regEx1, str9));
		System.out.println("1:10= " + Pattern.matches(regEx1, str10));
		System.out.println("1:11= " + Pattern.matches(regEx1, str11));
		System.out.println("1:12= " + Pattern.matches(regEx1, str12));
		System.out.println("1:13= " + Pattern.matches(regEx1, str13));
		System.out.println("1:14= " + Pattern.matches(regEx1, str14));
		System.out.println("1:15= " + Pattern.matches(regEx1, str15));
		System.out.println();
		
		System.out.println("2:00= " + Pattern.matches(regEx2, str0));
		System.out.println("2:01= " + Pattern.matches(regEx2, str1));
		System.out.println("2:02= " + Pattern.matches(regEx2, str2));
		System.out.println("2:03= " + Pattern.matches(regEx2, str3));
		System.out.println("2:04= " + Pattern.matches(regEx2, str4));
		System.out.println("2:05= " + Pattern.matches(regEx2, str5));
		System.out.println("2:06= " + Pattern.matches(regEx2, str6));
		System.out.println("2:07= " + Pattern.matches(regEx2, str7));
		System.out.println("2:08= " + Pattern.matches(regEx2, str8));
		System.out.println("2:09= " + Pattern.matches(regEx2, str9));
		System.out.println("2:10= " + Pattern.matches(regEx2, str10));
		System.out.println("2:11= " + Pattern.matches(regEx2, str11));
		System.out.println("2:12= " + Pattern.matches(regEx2, str12));
		System.out.println("2:13= " + Pattern.matches(regEx2, str13));
		System.out.println("2:14= " + Pattern.matches(regEx2, str14));
		System.out.println("2:15= " + Pattern.matches(regEx2, str15));
		System.out.println();
		
		System.out.println("3:00= " + Pattern.matches(regEx3, str0));
		System.out.println("3:01= " + Pattern.matches(regEx3, str1));
		System.out.println("3:02= " + Pattern.matches(regEx3, str2));
		System.out.println("3:03= " + Pattern.matches(regEx3, str3));
		System.out.println("3:04= " + Pattern.matches(regEx3, str4));
		System.out.println("3:05= " + Pattern.matches(regEx3, str5));
		System.out.println("3:06= " + Pattern.matches(regEx3, str6));
		System.out.println("3:07= " + Pattern.matches(regEx3, str7));
		System.out.println("3:08= " + Pattern.matches(regEx3, str8));
		System.out.println("3:09= " + Pattern.matches(regEx3, str9));
		System.out.println("3:10= " + Pattern.matches(regEx3, str10));
		System.out.println("3:11= " + Pattern.matches(regEx3, str11));
		System.out.println("3:12= " + Pattern.matches(regEx3, str12));
		System.out.println("3:13= " + Pattern.matches(regEx3, str13));
		System.out.println("3:14= " + Pattern.matches(regEx3, str14));
		System.out.println("3:15= " + Pattern.matches(regEx3, str15));
		System.out.println();		
		
		System.out.println("4:00= " + Pattern.matches(regEx4, str0));
		System.out.println("4:01= " + Pattern.matches(regEx4, str1));
		System.out.println("4:02= " + Pattern.matches(regEx4, str2));
		System.out.println("4:03= " + Pattern.matches(regEx4, str3));
		System.out.println("4:04= " + Pattern.matches(regEx4, str4));
		System.out.println("4:05= " + Pattern.matches(regEx4, str5));
		System.out.println("4:06= " + Pattern.matches(regEx4, str6));
		System.out.println("4:07= " + Pattern.matches(regEx4, str7));
		System.out.println("4:08= " + Pattern.matches(regEx4, str8));
		System.out.println("4:09= " + Pattern.matches(regEx4, str9));
		System.out.println("4:10= " + Pattern.matches(regEx4, str10));
		System.out.println("4:11= " + Pattern.matches(regEx4, str11));
		System.out.println("4:12= " + Pattern.matches(regEx4, str12));
		System.out.println("4:13= " + Pattern.matches(regEx4, str13));
		System.out.println("4:14= " + Pattern.matches(regEx4, str14));
		System.out.println("4:15= " + Pattern.matches(regEx4, str15));
		System.out.println();
		
		System.out.println("5:00= " + Pattern.matches(regEx5, str0));
		System.out.println("5:01= " + Pattern.matches(regEx5, str1));
		System.out.println("5:02= " + Pattern.matches(regEx5, str2));
		System.out.println("5:03= " + Pattern.matches(regEx5, str3));
		System.out.println("5:04= " + Pattern.matches(regEx5, str4));
		System.out.println("5:05= " + Pattern.matches(regEx5, str5));
		System.out.println("5:06= " + Pattern.matches(regEx5, str6));
		System.out.println("5:07= " + Pattern.matches(regEx5, str7));
		System.out.println("5:08= " + Pattern.matches(regEx5, str8));
		System.out.println("5:09= " + Pattern.matches(regEx5, str9));
		System.out.println("5:10= " + Pattern.matches(regEx5, str10));
		System.out.println("5:11= " + Pattern.matches(regEx5, str11));
		System.out.println("5:12= " + Pattern.matches(regEx5, str12));
		System.out.println("5:13= " + Pattern.matches(regEx5, str13));
		System.out.println("5:14= " + Pattern.matches(regEx5, str14));
		System.out.println("5:15= " + Pattern.matches(regEx5, str15));
		System.out.println();
		
		System.out.println("6:00= " + Pattern.matches(regEx6, str0));
		System.out.println("6:01= " + Pattern.matches(regEx6, str1));
		System.out.println("6:02= " + Pattern.matches(regEx6, str2));
		System.out.println("6:03= " + Pattern.matches(regEx6, str3));
		System.out.println("6:04= " + Pattern.matches(regEx6, str4));
		System.out.println("6:05= " + Pattern.matches(regEx6, str5));
		System.out.println("6:06= " + Pattern.matches(regEx6, str6));
		System.out.println("6:07= " + Pattern.matches(regEx6, str7));
		System.out.println("6:08= " + Pattern.matches(regEx6, str8));
		System.out.println("6:09= " + Pattern.matches(regEx6, str9));
		System.out.println("6:10= " + Pattern.matches(regEx6, str10));
		System.out.println("6:11= " + Pattern.matches(regEx6, str11));
		System.out.println("6:12= " + Pattern.matches(regEx6, str12));
		System.out.println("6:13= " + Pattern.matches(regEx6, str13));
		System.out.println("6:14= " + Pattern.matches(regEx6, str14));
		System.out.println("6:15= " + Pattern.matches(regEx6, str15));
		System.out.println();                              
		
		System.out.println("7:00= " + Pattern.matches(regEx7, str0));
		System.out.println("7:01= " + Pattern.matches(regEx7, str1));
		System.out.println("7:02= " + Pattern.matches(regEx7, str2));
		System.out.println("7:03= " + Pattern.matches(regEx7, str3));
		System.out.println("7:04= " + Pattern.matches(regEx7, str4));
		System.out.println("7:05= " + Pattern.matches(regEx7, str5));
		System.out.println("7:06= " + Pattern.matches(regEx7, str6));
		System.out.println("7:07= " + Pattern.matches(regEx7, str7));
		System.out.println("7:08= " + Pattern.matches(regEx7, str8));
		System.out.println("7:09= " + Pattern.matches(regEx7, str9));
		System.out.println("7:10= " + Pattern.matches(regEx7, str10));
		System.out.println("7:11= " + Pattern.matches(regEx7, str11));
		System.out.println("7:12= " + Pattern.matches(regEx7, str12));
		System.out.println("7:13= " + Pattern.matches(regEx7, str13));
		System.out.println("7:14= " + Pattern.matches(regEx7, str14));
		System.out.println("7:15= " + Pattern.matches(regEx7, str15));
		System.out.println();                              
		
		System.out.println("8:00= " + Pattern.matches(regEx8, str0));
		System.out.println("8:01= " + Pattern.matches(regEx8, str1));
		System.out.println("8:02= " + Pattern.matches(regEx8, str2));
		System.out.println("8:03= " + Pattern.matches(regEx8, str3));
		System.out.println("8:04= " + Pattern.matches(regEx8, str4));
		System.out.println("8:05= " + Pattern.matches(regEx8, str5));
		System.out.println("8:06= " + Pattern.matches(regEx8, str6));
		System.out.println("8:07= " + Pattern.matches(regEx8, str7));
		System.out.println("8:08= " + Pattern.matches(regEx8, str8));
		System.out.println("8:09= " + Pattern.matches(regEx8, str9));
		System.out.println("8:10= " + Pattern.matches(regEx8, str10));
		System.out.println("8:11= " + Pattern.matches(regEx8, str11));
		System.out.println("8:12= " + Pattern.matches(regEx8, str12));
		System.out.println("8:13= " + Pattern.matches(regEx8, str13));
		System.out.println("8:14= " + Pattern.matches(regEx8, str14));
		System.out.println("8:15= " + Pattern.matches(regEx8, str15));
		System.out.println();                              
		
		System.out.println("9:00= " + Pattern.matches(regEx9, str0));
		System.out.println("9:01= " + Pattern.matches(regEx9, str1));
		System.out.println("9:02= " + Pattern.matches(regEx9, str2));
		System.out.println("9:03= " + Pattern.matches(regEx9, str3));
		System.out.println("9:04= " + Pattern.matches(regEx9, str4));
		System.out.println("9:05= " + Pattern.matches(regEx9, str5));
		System.out.println("9:06= " + Pattern.matches(regEx9, str6));
		System.out.println("9:07= " + Pattern.matches(regEx9, str7));
		System.out.println("9:08= " + Pattern.matches(regEx9, str8));
		System.out.println("9:09= " + Pattern.matches(regEx9, str9));
		System.out.println("9:10= " + Pattern.matches(regEx9, str10));
		System.out.println("9:11= " + Pattern.matches(regEx9, str11));
		System.out.println("9:12= " + Pattern.matches(regEx9, str12));
		System.out.println("9:13= " + Pattern.matches(regEx9, str13));
		System.out.println("9:14= " + Pattern.matches(regEx9, str14));
		System.out.println("9:15= " + Pattern.matches(regEx9, str15));
		System.out.println();                              
		
		
	}                     
}
