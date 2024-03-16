package api1_Object;

//주소가 아닌 값을 찍기 위해서는 오버라이딩을 해라
//source -> Generate toString
//toSting은 원래 객체에 무조건 붙어있는거다.
public class T2_toStringRun {
	public static void main(String[] args) {
		T2_toStringVO vo = new T2_toStringVO();
		
		String name = "김말숙";
		int age = 30;
		boolean gender = false;
		String job = "";//""이걸안하면 null나옴
		String address = "청주";
		
		vo.setName(name);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setJob(job);
		vo.setAddress(address);
		
		System.out.println("성명 :  " + vo.getName());
		System.out.println("성명 :  " + vo.getName().toString());//to String은 obj에 들어있는 객체 
		System.out.println("나이 :  " + vo.getAge());
		System.out.println("성별 :  " + vo.isGender());
		System.out.println("직업 :  " + vo.getJob());
		System.out.println("주소 :  " + vo.getAddress());
		System.out.println();
		
		System.out.println("vo : " + vo.toString());
		System.out.println("vo : " + vo);
	}
}
