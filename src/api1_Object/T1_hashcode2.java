package api1_Object;

import java.util.HashMap;

class Aa{
	String name;
	
	public Aa(String name) {
		this.name = name;
	}
}

class Bb{//모든 객체는 object를 상속
	String name;
	
	public Bb(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((Bb)obj).name) return true;
		else return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}

public class T1_hashcode2 {
	public static void main(String[] args) {
		//HashMap
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "데이터1");//같은건 덮어쓴다.
		map.put(1, "데이터2");		
		map.put(2, "데이터3");
		System.out.println(map);
		
		HashMap<Aa, String> map2 = new HashMap<>();
		map2.put(new Aa("첫번째"), "데이터1");
		map2.put(new Aa("첫번째"), "데이터2");
		map2.put(new Aa("두번째"), "데이터3");
		System.out.println(map2);
		
		HashMap<Bb, String> map3 = new HashMap<>();
		map3.put(new Bb("첫번째"), "데이터1");
		map3.put(new Bb("첫번째"), "데이터2");
		map3.put(new Bb("두번째"), "데이터3");
		System.out.println(map2);
		
		
	}
}
