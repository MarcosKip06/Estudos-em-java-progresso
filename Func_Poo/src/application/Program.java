package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employee will be registered? ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Employee #:" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}
		System.out.println("List of employees:");
		for(Employee x: list){
			System.out.println( x);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = posicao(list, idSalary);
		if(pos == null) {
			System.out.println("Id inexistente! ");
			//for(Employee x : list) {
				//System.out.println(x);
			//}
		}else {
			System.out.println();
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee x : list) {
			System.out.println(x);
		}
		


	}
	
	public static Integer posicao(List<Employee> list, int id) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
