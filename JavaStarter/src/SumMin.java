
public class SumMin {

	static int sumMin(int a, int b){
		a++;
		b--;
		for(int c = a; c<b; c++) {
			a = a + c + 1;
		}
	return a;
	}
	
	static void odd(int a, int b) {
		for(; a<b; a++) {
			if(a % 2 != 0)
				System.out.println(a);
		}
	}
	
	
	public static void main(String[] args) {
	System.out.println(sumMin(3, 10));
	odd(1,10);
}                             
}
