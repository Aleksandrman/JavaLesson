
public class recursion {
//static int a = 3;
	
	public static void recursion(int a) {
		a--;
		System.out.println("first stage recursion "+ a);
		if(a!=0)
			 recursion(a);
		
		System.out.println("second stage recursion "+ a);
	}
	
	public static void main(String[] args) {
		recursion(3);

	}

}
