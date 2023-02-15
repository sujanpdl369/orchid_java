package assignment_2;

import java.io.*;

public class UserDataDisplay {
	public static void main(String [] args) throws IOException{
//		This program reads data from the user and stores in array and displays them
//		through the use of functions.
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		int [] employeeId = new int[5] ;
		double [] salary = new double[5];
		String [] name = new String[5];
		int i;
		for( i =0; i<5; i++) {
			System.out.println("Enter "+(i+1)+"th employee's Id:");
			employeeId[i] = Integer.parseInt(br.readLine());
			System.out.println("Enter "+(i+1)+"th employee's Name:");
			name[i] = br.readLine();
			System.out.println("Enter "+(i+1)+"th employee's salary:");
			salary[i] = Double.parseDouble(br.readLine());
		}
		display(employeeId,name,salary);
	}
//	Function for displaying the value with 3 args: regNo/id, name and salary
	public static void display(int [] id, String [] name, double [] salary) {
		int j;
		System.out.println("Id\t\t Name\t\t Salary\t\t");
		for (j=0;j<5;j++) {
			System.out.println(id[j]+"\t\t"+name[j]+"\t\t"+salary[j]);
			
		}
	}

}
