package api10_Pattern;

import java.util.regex.Pattern;

/*
  아이디 : 영문(대/소), _ , - ,숫자 ==>4자이상
  비밀번호 : 영문(대/소),~!@#$%^&*()_+-= ,숫자 ==>6자이상
  성명 : 영문(대/소), 한글
  나이 : 숫자
  전화번호 : 02-123-4567, 010-123-4567,010-1234-5678,043-123-4567,043-1234-1234
  이메일 : 
  주민번호 : 123456-1234567  (8번째는 1/2/3/4)
 */
public class Test4_회원가입체크 {
	public static void main(String[] args) {
		String exID = "^[a-zA-Z0-9_-]{4,}+$";
		String exPWD = "^[a-zA-Z0-9~!@#$%^&*()_+-=]{6,}+$";
		String exName = "^[a-zA-Z0-9~!@#$%^&*()_+-=]{6,}+$";
		
		String str1 = "";
		String str2 = "SDFAD!@#4214";
		
		System.out.println("1:00= " + Pattern.matches(exID, str1));
		System.out.println("1:00= " + Pattern.matches(exPWD, str2));
		
	}
}
