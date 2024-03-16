package api3_Class;

public class Test2 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("String클래스가 존재합니다.");
			
			// 객체의 정보(Test1.class) 알아내어 출력하기
			Class clazz = Test1.class;//알아두기
			System.out.println("전체이릅(패키지명+파일명) : " + clazz.getName());
			System.out.println("패키지명 : " + clazz.getPackage());
			System.out.println("타입명 : " + clazz.getTypeName());
			System.out.println("simple이름 : " + clazz.getSimpleName());
			System.out.println();
			
			Class imgPath = Test2.class;//파일경로 찾기 /=>작업하는것의 상위 경로 //시작시.을 붙이면 상대경로 클래스 기준으로 출발
			System.out.println("그림파일의 경로명 : " + imgPath.getResource("./images/121.jpg").getPath());
			System.out.println("Test2.class의 경로명 : " + imgPath.getResource("Test2.class").getPath());
			System.out.println("Test2.class의 경로명 : " + clazz.getResource("Test2.class").getPath());
			System.out.println("현재 작업경로의 루트(/)명 : " + clazz.getResource("/").getPath());
			System.out.println("그림파일의 경로명1 : " + imgPath.getResource("/api3_Class/images/122.jpg").getPath());
			//밑은 잘못된 경로와 파일명을 입력하면 NullPointerExcpection에러 발생
			//System.out.println("그림파일의 경로명2 : " + imgPath.getResource("/images/122.jpg").getPath());
			System.out.println("api2_System패키지의 Test1.class 경로명1 : " + imgPath.getResource("/api2_System/Test1.class").getPath());
			System.out.println("api2_System패키지의 Test1.class 경로명2 : " + imgPath.getResource("../api2_System/Test1.class").getPath());
			//최상위 폴더(src(또는 bin))를 벗어나면 경로와 파일명을 찾아올수 없다.
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 파일이 존재하지 않습니다." + e.getMessage());//주요메세지 보여주는것 getMessage
		} finally {//공통적으로 쓰겠다.
			System.out.println("작업끝");			
		}
	}
}
