package api4_String;

public class T02_indexof {
	public static void main(String[] args) {
		//             0         1         2
		//             012345678901234567890
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 방문하신것을 환영합니다.!!!";
		
		//indexof() : 찾고자 하는 문자(열)이 있는가를 표시? 있으면 위치값(인덱스값)을 변환, 없으면 -1을 반환
		System.out.println("1.msg1에 'O' 문자가 있는가? " + msg1.indexOf("O"));
		System.out.println("2.msg1에 'o' 문자가 있는가? " + msg1.indexOf("o"));
		System.out.println("3.msg1에 'korea' 문자가 있는가? " + msg1.indexOf("korea"));
		System.out.println("4.msg1에 'Korea' 문자가 있는가? " + msg1.indexOf("Korea"));
		System.out.println("5.msg2에 '환영' 문자가 있는가? " + msg1.indexOf("환영"));
		
		System.out.println(".msg1에 'o' 문자가 있는가? " + msg1.lastIndexOf("o"));
	}
}
