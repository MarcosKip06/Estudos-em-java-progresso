package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		//Locale para os números decimais ficarem separados por ponto(.)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x,y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as medidas do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("Area do triangulo x: %.4f" , areax);
		System.out.println();
		System.out.printf("Area do triangulo y: %.4f" , areay);
		System.out.println();
		
		if(areax > areay) {
			System.out.println("Area to triangulo x é maior");
		}else {
			System.out.println("Área do triangulo y é maior");
		}
		
		
		
		

	}

}
