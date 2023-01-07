package test;

public class TestProgram {
	void revers(String text) {
		String[] m=text.split(" ");
		/*
		 * System.out.println(m[0]); System.out.print(m[1]); System.out.print(m[2]);
		 */

		for(int j=m.length-1;j>=0;j--) {
			
			m[j]=" "+m[j];
			System.out.print(m[j]);
			

		}
		/*
		 * String s=""; char c[]=text.toCharArray(); //System.out.println(c);
		 * //System.out.println(c.length);
		 * 
		 * for(int i=c.length-1;i>=0;i--) { System.out.print(c[i]);
		 * 
		 * 
		 * }
		 * 
		 * System.out.println(s);
		 */
		
		
		
	}
	
	public static void main(String[] args) {
		
		TestProgram t=new TestProgram();
		t.revers("I love my country");
	}

}
