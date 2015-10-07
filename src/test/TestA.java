package test;

public class TestA {

	public static String myName = "ABC";
	
	public String name = "abc";

	public static String getMyName() {
		return myName;
	}

	public static void setMyName(String myName) {
		TestA.myName = myName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
