import java.util.Scanner;

public class rectangle {

	static void rectangleImage(int x, int y) {
		for(int a = x ;a>0;a--) {
			for(int b = y ;b>0;b--) {
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
		
		int token = 0;
		for(int a = 1 ;a<4 ;a++) {
			for(int b = 0 ;b<5 ;b++) {
				if (b)
				System.out.print("*");
			System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		int height = 5, width = 5 ;
		//Scanner sc = new Scanner(System.in);
		//System.out.println("введите высоту");
		
		
		//rectangleImage(5 , 5);
		//triangleRectangularImage(5);
		triangleImage(3);

	}

}
