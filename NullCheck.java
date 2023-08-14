package demo1.demo11;

public class NullCheck {
	
	void m(Object obj) {
		System.out.println("222");
	}
	
	void m(String str) {
		System.out.println("111");
		
	}
	
	public static void main(String[] args) {
		NullCheck n = new NullCheck();
		n.m((Object)null);
	}

}
