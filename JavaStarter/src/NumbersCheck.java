
public class NumbersCheck {

	public static void main(String[] args) {
		for(int i = 0; i<1000;i++)
		chekNature(i);
	}

	static void chekPositive(int a) {
		
		if(a>0)
			System.out.println("число положительное");
		if(a<0)
			System.out.println("число отрицательное");
		if(a==0)
			System.out.println("ноль");
	}
	
static void chekNature(int a) {
	int token = 0;
	for(int x = 1; x<=a;x++) {
		if(a%x==0)
			token++;
	}
if(token == 2)
	System.out.println(a+" число натуральное");
//else
	//System.out.println("число простое");
}
}
