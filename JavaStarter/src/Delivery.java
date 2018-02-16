import java.util.Scanner;

public class Delivery {

	static int marshclientele() {
		System.out.println("введите количество клиентов");
		Scanner sc = new Scanner(System.in);
		int marshclientele = sc.nextInt();
		int s = 1;
		for(int i = 1; i<=marshclientele; i++) 
			s = s * i;
		return s;
	}
	
	
	public static void main(String[] args) {
		
	int s = marshclientele();	
		
		
		
	System.out.println("Возможное количество маршрутов " +s);
	}

}
