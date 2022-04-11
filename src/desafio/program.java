package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter id of employee:"); 
		int n = sc.nextInt();
		
		    for (int i=1; i<=n; i++) {
	     	
			int var = 1; 
			System.out.println("name = Anakin Skywalker:");		
			System.out.println("email = skywalker@ssys.com.br:");
			System.out.println("department = Architecture:");
			System.out.println("salary = 4000.00:");
			System.out.println("birth_date = 01-01-1983:");
		}
		
		    for (int i=2; i<=n; i++) {
		
			int var2 = 2;
			System.out.println("name = Obi-Wan Kenobi:");
			System.out.println("email = kenobi@ssys.com.br:");
			System.out.println("department = Back-End:");
			System.out.println("salary = 3000.00:");
			System.out.println("birth_date = 01-01-1977:");
		 }
		    
			for (int i=3; i<=n; i++) {

			int var3 = 3;
			System.out.println("name = Leia Organa:"); 
			System.out.println("email = organa@ssys.com.br:");
			System.out.println("department = DevOps:");
			System.out.println("salary = 5000.00:");
		    System.out.println("birth_date = 01-01-1980");
		}		
		sc.close();
	}

}
