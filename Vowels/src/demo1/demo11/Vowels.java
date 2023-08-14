package demo1.demo11;

public class Vowels {
	
	String name;
	
	public Vowels(String name){
		this.name = name.toLowerCase();
	}
	
	public void printVowels() {
		
		if(name.contains("a") && name.contains("e") 
				&& name.contains("i") && name.contains("o") 
				&& name.contains("u")) {
			System.out.println("Vowels");
		}
		else {
			System.out.println("Not Vowels");
		}
	}
	
	public void printWithoutInbuild() {
		boolean a = false;
		boolean e = false;
		boolean i = false;
		boolean o = false;
		boolean u = false;
		
		for(int j=0; j<name.length();j++) {
			 if (name.charAt(j) == 'a') {
				 a = true;
	         }
			 else if (name.charAt(j) == 'e') {
	             e = true;
	         } 
			 else if (name.charAt(j) == 'i') {
	             i = true;
	         } 
			 else if (name.charAt(j) == 'o') {
	             o = true;
	         }
			 else if (name.charAt(j) == 'u') {
	             u = true;
	         }
		}
		
		if (a && e && i && o && u) {
            System.out.println("vowels.");
        } 
		else {
            System.out.println("Not vowels.");
		}
		
	}

}
