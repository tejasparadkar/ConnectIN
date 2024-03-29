package connectIn;

import java.util.Scanner;

abstract public class Professional extends Individual {
	public void notes()
	{
		System.out.println("##### Notes #####");
		Scanner s = new Scanner(System.in);
		System.out.println("@@ Enter Notes @@");
		String a = s.nextLine();
		System.out.println("@@ Notes are @@");
		System.out.println(a);
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
			System.err.println("%%%%Select correct option%%%%");
			notes();
		}
	}
	public void businessCard()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("##### Business Card #####");
		System.out.println("1.Design your business card. ");
		System.out.println("2.Modify/View your business card. ");
		System.out.println("3.Go Back");
		int a = s.nextInt();
		BusinessCard b = new BusinessCard();
		switch (a) {
		case 1: 
		{
			b.design();
			break;
			
		}
		case 2:
		{
			b.modify();
			break;
		}
		case 3:
		{
			features();
			break;
		}
		default:
			System.err.println("%%%%Select correct option%%%%");
			businessCard();
			break;
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
			if (Connections.connections == null || Connections.connections.isEmpty())
			{
				System.err.println("%%%%First enter connections to view%%%%");
				c.enter();
			}
			else
			{
				c.view();
			}
			break;
		}
		case 3:
		{
			features();
			break;
		}
		default:
			System.err.println("%%%%Select correct option%%%%");
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
			System.err.println("%%%%Select correct option%%%%");
			organizations();
			break;
		}
	}
	public void features()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("|||||Professional|||||");
		System.out.println("1.Business Card");
		System.out.println("2.Notes");
		System.out.println("3.Connections");
		System.out.println("4.Organiztions Worked");
		System.out.println("5.Go back");
		int choice=s.nextInt();
		switch (choice) {
		case 1:
		{
			if(Menu.mno!=0)
			{
				businessCard();
			}
			else
			{
				checkLogin();
			}
			break;			
		}
		case 2:
		{
			notes();
			break;
		}
		case 3:
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
		case 4:
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
		case 5: {
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
