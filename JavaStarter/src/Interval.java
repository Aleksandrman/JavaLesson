import java.util.Scanner;

public class Interval {
static Scanner cs = new Scanner(System.in);
	public static void main(String[] args) {
		Interval();

	}
public static void Interval() {
	System.out.println("Введите число");
	int number = cs.nextInt();
	if(number >= 0 && number <= 100){
	if (number >= 0 && number <= 14)
		System.out.println("число в промежутке от 0 до 14");
	if (number >= 15 && number <= 35)
		System.out.println("число в промежутке от 15 до 35");
	if (number >= 36 && number <= 50)
		System.out.println("число в промежутке от 36 до 50");
	if (number >= 50 && number <= 100)
		System.out.println("число в промежутке от 50 до 100");
	}
	else System.out.println("число не входит в указанный промежуток");
}
	
	
}
