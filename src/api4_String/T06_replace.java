package api4_String;

public class T06_replace {
	public static void main(String[] args) {
		//             0         1         2
		//             012345678901234567890
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 방문하신것을 환영합니다.!!!";
		
		System.out.println("msg1 : " + msg1);
		System.out.println("msg2 : " + msg2);
		
		//replace() :치환 - 특정문자(열)을 지정한 문자(열)로 (모두)변경한다. 단,대소문자 구별한다.
		System.out.println("1. 'Korea'를 'USA'로 변경하시오? " + msg1.replace("Korea", "USA"));
		System.out.println("2. '한국'를 '미국'로 변경하시오? " + msg2.replace("한국", "미국"));
		System.out.println("3. 'o'를 'O'로 변경하시오? " + msg1.replace("o", "O"));
		System.out.println("4. 'o'를 'O'로 변경하시오? " + msg1.replaceAll("o", "O")); // 검색어에 '정규식'을 사용할때 replaceAll사용한다.
		System.out.println();
		
		String msg3 = " ! H e l l o ! ";
		System.out.println("msg3 : " + msg3);
		System.out.println("msg1+msg3+msg2 : " + msg1+msg3+msg2);
		System.out.println("msg1+msg3+msg2 : " + msg1+msg3.trim()+msg2);
		//System.out.println("msg3 : " + msg3);
		
		//msg3번에 포함된 모든 공백을 삭제후 msg1+msg3+msg2 출력하시오.
		System.out.println("msg1+msg3+msg2 : " + msg1+msg3.trim().replace(" ", "")+msg2);
		System.out.println("msg1+msg3+msg2 : " + msg1+msg3.replace(" ", "")+msg2);
		
		// msg3안에는 'hello'문자열을 포함하고 있는가?(contains() => 대소문자 구별한다.)
		String msg4 = "hello";
		System.out.println(msg3.replace(" ", "").toLowerCase().indexOf(msg4));
		System.out.println(msg3.replace(" ", "").toLowerCase().contains(msg4));//contains포함하고있냐고 물어봄
		System.out.println(msg3.replace(" ", "").contains(msg4));
		
		//지정한 문자(열)을 반복처리한다. : repeat();=>자바10이후부터 사용가능
		System.out.println(msg3.repeat(3));
		System.out.println("=".repeat(30));
	}
}
