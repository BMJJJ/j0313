package api1_Object;

public class T2_toStringVO {
	private String name;
	private int age;
	private boolean gender;
	private String job;
	private String address;
	//한줄 띄어놓기 헷갈리지 않게하기 위함 처음설계와 나중에 추가한것을 구분
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "T2_tosStringVO [name=" + name + ", age=" + age + ", gender=" + gender + ", job=" + job + ", address="
				+ address + "]";
	}
	
	
	
	
//	@Override
//	public String toString() {//String을 오버라이딩
//		return "VO = [name = "+name+" , age="+age+" ,gender="+gender+" , job="+job+" , address="+address+"]";
//	}
}
