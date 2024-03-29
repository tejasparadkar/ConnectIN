package connectIn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Company extends Menu {
	ArrayList company= new ArrayList();
	public void addCompany()
	{
		
		System.out.println("@@@@ Add Company @@@@");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Company name: ");
		String n = s.nextLine();
		company.add(n);
		System.out.println("Press a to add more");
		System.out.println("Press v to views companies");
		System.out.println("Press b to go back to menu");
		char c =s.next().charAt(0);
		if(c=='a')
		{
			addCompany();
		}
		else if(c=='v')
		{
			viewCompany();
		}
		else if(c=='b')
		{
			options();
		}
		else
		{
			System.err.println("%%%% Enter correct option %%%%");
			options();
		}
		
	}
	public void viewCompany()
	{
		System.out.println("@@@@ View Company @@@@");
		Scanner s = new Scanner(System.in);
		System.out.println("1.View Ascending");
		System.out.println("2.View Descending");
		System.out.println("3.Random");
		System.out.println("4.Go back");
		int i = s.nextInt();
		switch (i) {
		case 1: {
			System.out.println("@@@@ Ascending @@@@");
			Iterator i1 = company.iterator();
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
			viewCompany();
			break;
		}
		case 2: {
			System.out.println("@@@@ Descending @@@@");
			for(int i2=company.size()-1;i>=0;i--)
			{
					System.out.println(company.get(i2));
			}
			viewCompany();
			break;
		}
		case 3: {
			System.out.println("@@@@ Random @@@@");
			for(Object obj:company)
			{
				System.out.println(obj);
			}
			viewCompany();
			break;
		}
		case 4:
		{
			options();
			break;
		}
		default:
			System.err.println("%%%% Enter correct option %%%%");
			viewCompany();
			break;
		}
	
	}
	public void options()
	{
		{
			System.out.println("|||||Company Section|||||");
		}
		Scanner s = new Scanner(System.in);
		System.out.println("1.Add Company");
		System.out.println("2.View Companies");
		System.out.println("3.Go Back");
		int choice=s.nextInt();
		switch (choice) {
		case 1:
		{
			addCompany();
			break;
		}
		case 2:
		{
			viewCompany();
			break;
		}
		case 3: {
			homePage();
			break;
		}
		default:
			System.err.println("%%%%Enter correct option%%%%");
			options();
			break;
		}
		
	}

}
