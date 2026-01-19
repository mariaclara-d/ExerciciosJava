package exercicio_lista;

import java.util.Locale;
import java.util.Scanner;

import java.util.*;
import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee> employees = new ArrayList<>();
		
		
		System.out.println("How many employess will be registred?");
		int N;
		N = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<N; i++) {
			
			System.out.println("Employee#" + (i+1) + ":");
			
			System.out.println("ID:");
			
			int idDigitado = sc.nextInt();
			
			sc.nextLine();
			
			
			Employee aux = null;
			
			for (Employee x:employees) {
				if(x.getId() == idDigitado) {
					aux = x;
					break;
				}
			}
			
			if (aux != null) {
				System.out.println("ID already taken! Try again.");
				i--;
				
			}else {
				System.out.println("Name:");
				String name = sc.nextLine();
				
				System.out.println("Salary:");
				double salary = sc.nextDouble();
				
				employees.add(new Employee(idDigitado, name, salary));
			}
			
			
		}			
		
		System.out.println("Enter the employee id that will have salary increase:");
		int idAumento = sc.nextInt();
			
		Employee emp = employees.stream().filter(x-> x.getId()==idAumento).findFirst().orElse(null);
		
		

		if (emp!=null) {
			
			System.out.println();
			System.out.println("Enter the percentage:");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
			
		} else {
			System.out.println("This ID does not exist!");
		}
		
		
		System.out.println("List of Employees:");
		
		for (Employee obj : employees) {
			
			System.out.println(obj);
		}
		
		sc.close();
		
	}
	

	
}
