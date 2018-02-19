import java.util.Iterator;
import java.util.Scanner;

public class CostumerArray {

	public static void main(String[] args) {
		
		int arr[] = new int[getSizeArr()];
				
		getArr(arr);

		arrMinMax(arr);
		
		sumArr(arr);
				
		medium(arr);
				
		add(arr);
					
		showArr(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			int token = 0;
			for (int j = arr.length; j > i; j--) {
			if (arr[i] != -1) {
				if (arr[i] == arr[j]) {
				token++;
				//arr[j] = -1;
			}
			}
					}
		System.out.println(arr[i]+ " rerun " + token);
		}
		
	}

	private static void showArr(int[] arr) {
		for (int i : arr) {
				System.out.print(i+ " ");
			}
	}

	private static void getArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((Math.random()*10));
				}
	}

	private static int getSizeArr() {
		System.out.println("in number array");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		return x;
	}

	private static void arrMinMax(int[] arr) {
		int arrMin = arr[0];
		int arrMax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arrMin>arr[i])
				arrMin=arr[i];
			if (arrMax<arr[i])
				arrMax=arr[i];
		}
		System.out.println(arrMin + " min");
		System.out.println(arrMax + " max");
	}

	private static void sumArr(int[] arr) {
		int sumArr = 0;
		for (int i = 0; i < arr.length; i++) {
			sumArr += arr[i];
					}
		System.out.println(sumArr + " sum");
	}

	private static void medium(int[] arr) {
		int medium = 0;
		for (int i = 0; i < arr.length; i++) {
			medium += arr[i];
					}
		medium = medium/arr.length;
		System.out.println(medium + " medium");
	}

	private static void add(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 != 0)
				System.out.print(arr[i]+ " ");
					}
		System.out.println();
	}
}
