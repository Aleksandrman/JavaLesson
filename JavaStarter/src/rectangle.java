import java.util.Scanner;

public class rectangle {

	static void rectangleImage(int x) {
		for(int a = x ;a>0;a--) {
			for(int b = x*2 ;b>0;b--) {
				System.out.print("*");
			System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	static void cube(int x) {
		for(int a = x ;a>0;a--) {
			for(int b = x ;b>0;b--) {
				System.out.print("*");
			System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void triangleRectangularImage(int x) {	
		
		
		for(int a = 1 ;a<=x ;a++) {
			for(int b = 0 ;a>b ;b++) {
				System.out.print("*");
			System.out.print("  ");
			}
			System.out.println();
		}
	}
	
    static void triangleImage(int x) {	
		
		
		for(int a = 1 ;a<=x ;a++) {
			for(int b = x;b>a ;b--) {
				System.out.print(" ");		
			
			}
			for(int c = 1;c<a*2 ;c++) {
				System.out.print("*");	
			} 
			System.out.println();
			
		}
		
}

    static void rhombus(int num) {

	for(int a = 1; a<=num/2+ (num%2);a++) {
		
		for(int b = num; b>a; b--)
			System.out.print(" ");
		for(int b = 1; b<a*2;b++)
			System.out.print("*");
		
		System.out.println();
	}

	//-----
	if (num%2 !=0) {
	int j = 1;
for(int a = 1; a<=num/2+(num%2)-1;a++) {
	
	for(int b = num/2+ (num%2); b>=j; b--)
		System.out.print(" ");
	for(int b = num; b>a*2;b--)
		System.out.print("*");
		j--;
	System.out.println();
}	
}
	else {
		int j = 1;
		for(int a = 1; a<=num/2+(num%2);a++) {
			
			for(int b = num/2+ (num%2); b>=j; b--)
				System.out.print(" ");
			for(int b = num+1; b>a*2;b--)
				System.out.print("*");
				
			j--;
				
				
				System.out.println();
	}
	}
	
	
		
	
}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("какую фигуру рисуем? квадрат, треугольник90, прямоугольник, ромб, треугольник45");
		String figure = sc.nextLine();
		
		System.out.println("введите высоту фигуры");
		int hight = sc.nextInt();
		
		
		
		
		switch (figure) {
		case "квадрат": cube(hight); break;
		case "треугольник90": triangleRectangularImage(hight); break;		
		case "прямоугольник":  rectangleImage(hight); break;
		case "ромб":  rhombus(hight); break;
		case "треугольник45": triangleImage(hight); break;			
		default: System.out.println("Незнаю такой фигуры"); break;
		}
		
	}

	

}
