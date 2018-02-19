import java.util.Scanner;

public class Bank {
	static int debt = 0;
	static int overpayment = 0;
	static int balance = 700;
	
	public static void overpayment(int pay, int fixpraice) {
		if (pay > fixpraice) {
			overpayment = (pay - fixpraice)+ overpayment;
					}
	}
		
		
	public static void debt(int pay, int fixpraice) {
			if (pay < fixpraice) {
				debt = fixpraice - pay;
						if (overpayment> 0) {
							if (overpayment> debt) {
								overpayment = overpayment - debt;
								debt = 0;
							}
							else{debt = debt - overpayment;
							overpayment = 0;
							}
						}					
					}
		}
	
		
	public static void pay(int pay) {
		int fixpraice = 100;
		
		balance = balance - pay;
		System.out.println("остаток "+ balance );
		if(balance >0) {
			if(pay!= fixpraice) {
				overpayment(pay, fixpraice);
				debt(pay, fixpraice);
			
			}
		
		System.out.println("Переплата " +overpayment);
		System.out.println("задолжность " +debt);
		}
		else {
			System.out.println("Долг погашен");
		}
	
		
		
	}
	
	
	
	
	public static void main(String[] args) {
	int pay;
	char play;
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Введите сумму платежа");
		pay = sc.nextInt();
			pay(pay);
			System.out.println("ещё платеж? да/нет");
		play = sc.next().charAt(0);	
		if(play == 'н')
			break;
		
		}
	}
 
}
