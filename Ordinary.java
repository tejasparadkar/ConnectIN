package connectIn;

import java.util.Scanner;

abstract public class Ordinary extends Individual{
	public void notes()
	{
		System.out.println("#####Notes#####");
		Scanner s = new Scanner(System.in);
		System.out.println("@@ Enter Notes @@");
		String a = s.nextLine();
		System.out.println("@@ Notes are @@");
		System.out.println(a);
		System.out.println();
		System.out.println("Continue(Y/N)");
		char b = s.next().charAt(0);
		if(b=='Y')
		{
			notes();
		}
		else if (b=='N')
		{
			features();
		}
		else
		{
			System.err.println("Select correct option");
		}
	}
	public void connections()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("##### Connections #####");
		System.out.println("1.Enter your connections. ");
		System.out.println("2.Modify/View your connections. ");
		System.out.println("3.Go Back");
		int a = s.nextInt();
		Connections c = new Connections();
		switch (a) {
		case 1: 
		{
			c.enter();
			break;
			
		}
		case 2:
		{
			c.view();
			break;
		}
		case 3:
		{
			features();
			break;
		}
		default:
			System.err.println("Select correct option");
			connections();
			break;
		}
	}
	public void organizations()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("##### Past worked Organizations #####");
		System.out.println("1.Enter your Past worked Organizations. ");
		System.out.println("2.Modify/View your Past worked Organizations. ");
		System.out.println("3.Go Back");
		int a = s.nextInt();
		PWOrganizations o = new PWOrganizations();
		switch (a) {
		case 1: 
		{
			o.enter();
			break;
			
		}
		case 2:
		{
			o.view();
			break;
		}
		case 3:
		{
			features();
			break;
		}
		default:
			System.err.println("Select correct option");
			organizations();
			break;
		}
	}
	public void features()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("|||||Ordinary|||||");
		System.out.println("1.Notes");
		System.out.println("2.Connections");
		System.out.println("3.Organiztions Worked");
		System.out.println("4.Go back");
		int choice=s.nextInt();
		switch (choice) {
		case 1:
		{
			notes();
			break;
		}
		case 2:
		{
			if(Menu.mno!=0)
			{
				connections();
			}
			else
			{
				checkLogin();
			}
			break;
		}
		case 3:
		{
			if(Menu.mno!=0)
			{
				organizations();
			}
			else
			{
				checkLogin();
			}
			break;
		}
		case 4: {
			options();
			break;
		}
		default:
			System.err.println("%%%%Enter correct option%%%%");
			features();
			break;
		}
	}
	
	public void checkLogin()
	{
		System.err.println("%%%%Login first%%%%");
		System.out.println("Select following options");
		System.out.println("1.Login");
		System.out.println("2.SignUp");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a==1)
		{
			login();
			homePage();
		}
		else if(a==2)
		{
			signUp();
			homePage();
		}
		else
		{
			System.err.println("Enter correct option");
			login();
			homePage();
		}
	}
}
