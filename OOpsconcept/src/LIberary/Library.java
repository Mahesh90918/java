package LIberary;

import java.util.Scanner;

public class Library {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != 1) {
			System.out.println("enter the method1 ");
			choice = sc.nextInt();
			method1 abc = new method1();
			System.out.println("Enter the student number");
			abc.id = sc.nextInt();
			sc.nextLine();
			System.out.println("enter the name");
			abc.name = sc.nextLine();
			System.out.println("enter the book");
			abc.book = sc.nextLine();
			abc.getdata(abc.id, abc.name, abc.book);
			abc.setdata();
		
						Method2 def = new Method2();
						def.physics();
						def.chemistry();
				
						def.biology();
					
				}
			}
		}
	