
//19   22

import java.util.Scanner;

public class MyFirstApp {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(System.in);
		int len;
		//char cha;
		//System.out.print("Введи символ, каким будем рисовать: ");
		//String scchar = sc.nextLine();
		//cha = scchar.charAt(0);
		System.out.print("Введи длинну грани уёба )): ");
		len = sc.nextInt();
		

		String[] triangle = new String[len];
		String[] romb = new String[(len*2)];

		System.out.println(" ");
		System.out.println(" ");

		for (int i=0; i < len; i++) {
			triangle[i] = "";
			for (int j=0; j < (len * 2) - 1; j++) {
				if (i == 0) {
					if (j == len - 1) {
						triangle[i] = triangle[i] + "^";
					} else {
						triangle[i] = triangle[i] + " ";
					}
				} else if (i == len - 1 ) {
					triangle[i] = triangle[i] + "-";
				} else {
					if (j == (len - 1) - i) {
						triangle[i] = triangle[i] + "/";
					} else if (j == (len - 1) + i) {
						triangle[i] = triangle[i] + "\\";
					} else {
						triangle[i] = triangle[i] + " ";
					}
				}
			}
			System.out.println(triangle[i]);
		}

		System.out.println(" ");
		System.out.println(" ");
		
		for (int i=0; i < (len * 2) - 1; i++) {
			romb[i] = "";
			int count_centr = 0;
			for (int j=0; j < (len * 2) - 1; j++) {
				if (i == 0) { 
					if (j == len - 1) {
						romb[i] = romb[i] + "^";
					} else {
						romb[i] = romb[i] + " ";
					}
				//} else if (i == len - 1 ) {
					//romb[i] = romb[i] + cha;
				} else if (i == ((len*2)-1)-1) {
					if (j == len - 1) {
						romb[i] = romb[i] + "V";
					} else {
						romb[i] = romb[i] + " ";
					}
				} else if (i == len-1) {
					if (j == 0) {
						romb[i] = romb[i] + "<";
					} else if (j == (len-1)*2) {
						romb[i] = romb[i] + ">";
					} else {
						romb[i] = romb[i] + " ";
					}
				} else if (i < len) {
					if (j == (len - 1) - i) {
						romb[i] = romb[i] + "/";
					} else if (j == (len - 1) + i) {
						romb[i] = romb[i] + "\\";
					} else {
						romb[i] = romb[i] + " ";
					}
				} else if (i>=len) {
					if (j == i-(len-1)) {
						romb[i] = romb[i] + "\\";
					} else if (j == (((len*2)-1)-1)-(i-(len-1))) {
						romb[i] = romb[i] + "/";
					} else {
						romb[i] = romb[i] + " ";
					}
				}
			}
			
			System.out.println(romb[i]);
		}

		System.out.println(" ");
		System.out.println(" ");

		for (int i=0; i < (len * 2); i++) {
			romb[i] = "";
			//int count_centr_vertical = 0;
			for (int j=0; j < (len * 2); j++) {
				if (i == 0) { //Если Первая строка
					if (j == len - 1) { //Если центр
						romb[i] = romb[i] + "/";
						j++;
						romb[i] = romb[i] + "\\";
					} else {			//Если не центр
						romb[i] = romb[i] + " ";
					}
				//} else if (i == len - 1 ) {
					//romb[i] = romb[i] + cha;
				} else if (i == (len*2)-1) { //Если Последняя строка
					if (j == len - 1) { //Если центр
						romb[i] = romb[i] + "\\";
						j++;
						romb[i] = romb[i] + "/";
					} else {			//Если не центр
						romb[i] = romb[i] + " ";
					}
				} else if (i == len-1) { //Если центральная строка
					if (j == 0) {	//Если левый столбец
						romb[i] = romb[i] + "/";
					} else if ( j == ( len * 2 ) - 1 ) { //Если правый столбец
						romb[i] = romb[i] + "\\";
					} else { //Если другое
						romb[i] = romb[i] + " ";
					}
				} else if (i == len) { //Если центральная строка
					if (j == 0) {	//Если левый столбец
						romb[i] = romb[i] + "\\";
					} else if ( j == ( len * 2 ) - 1 ) { //Если правый столбец
						romb[i] = romb[i] + "/";
					} else { //Если другое
						romb[i] = romb[i] + " ";
					}
				} else if (i < len) {	//Если верхняя половина
					if (j == (len - 1) - i) { //Если левая часть
						romb[i] = romb[i] + "/"; 
					} else if (j == len + i) { //Если правая часть
						romb[i] = romb[i] + "\\"; 
					} else {
						romb[i] = romb[i] + " "; // Если остальное
					}
				} else if ( i >= len ) { //Если нижняя половина
					if ( j == i - len ) { //Если левая часть
						romb[i] = romb[i] + "\\";
					} else if (j == ( ( len * 2 ) - 1 ) - ( i - len ) ) { //Если правая часть
						romb[i] = romb[i] + "/"; 
					} else { //Если остальное
						romb[i] = romb[i] + " ";
					}
				}
			}
			
			System.out.println(romb[i]);
		}

		System.out.println(" ");
		System.out.println(" ");

		/*
		for (int i=0; i < (len * 2) - 1; i++) {
			romb[i] = "";
			for (int j=0; j < (len * 2) - 1; j++) {
				if (i == 0) {
					if (j == len - 1) {
						romb[i] = romb[i] + "cha";
					} else {
						romb[i] = romb[i] + " ";
					}
				} else if (i == len - 1 ) {
					romb[i] = romb[i] + cha;
				} else if (i < len) {
					if (j == (len - 1) - i) {
						romb[i] = romb[i] + cha;
					} else if (j == (len - 1) + i) {
						romb[i] = romb[i] + cha;
					} else {
						romb[i] = romb[i] + " ";
					}
				} else if (i>=len) {
					if (j == i-(len-1)) {
						romb[i] = romb[i] + cha;
					} else if (j == (((len*2)-1)-1)-(i-(len-1))) {
						romb[i] = romb[i] + cha;
					} else {
						romb[i] = romb[i] + " ";
					}
				}
			}
			
			System.out.println(romb[i]);
		}*/
		
	}   
}