package connectIn;

import java.util.Scanner;

public class BusinessCard extends Professional {
	
	static String n;
	static String c;
	static String d;
	static String ei;
	static long mno;
	
	public void design()
	{
		System.out.println(("@@@@ Design @@@@"));
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		n=s.nextLine();
		System.out.println("Enter company name: ");
		c=s.nextLine();
		System.out.println("Enter Designation: ");
		d=s.nextLine();
		System.out.println("Enter email id: ");
		ei=s.nextLine();
		System.out.println("Enter Mobile number: ");
		mno=s.nextLong();
		
		print();
		
	}
	public void print()
	{
		Scanner s = new Scanner(System.in);
		System.out.println(("@@@@ View @@@@"));
		System.out.println("Name: "+n);
		System.out.println("Designation: "+d);
		System.out.println("Company Name: "+c);
		System.out.println("Email id: "+ei);
		System.out.println("Mobile Number: "+mno);
		System.out.println(("@@@@@@@@@@@@@@@@@@@"));
		System.out.println("Press b for returning to menu");
		System.out.println("Press m for modification");
		char c = s.next().charAt(0);
		if(c=='b')
		{
			businessCard();
		}
		else if(c=='m')
		{
			modify();
		} 
	}
	public void modify()
	{
		if(n!=null)
		{
			System.out.println("1.View");
			System.out.println("2.Modify");
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			if(a==1)
			{
				print();
			}
			else if(a==2)
			{
				System.out.println(("@@@@ Modify @@@@"));
				System.out.println("What do you want to modify? ");
				System.out.println("1.Name");
				System.out.println("2.Designation");
				System.out.println("3.Company Name");
				System.out.println("4.Email id");
				System.out.println("5.Mobile Number");
				int c = s.nextInt();
				switch (c) {
				case 1:{
					System.out.println("Enter new Name:");
					s.nextLine();
					String n = s.nextLine();
					this.n=n;
					modify();
					break;
				}
				case 2:{
					System.out.println("Enter new Designation:");
					s.nextLine();
					String d = s.nextLine();
					this.d=d;
					modify();
					break;
				}
				case 3:{
					System.out.println("Enter new Company Name:");
					s.nextLine();
					String cn = s.nextLine();
					this.c=cn;
					modify();
					break;
				}
				case 4:{
					System.out.println("Enter new Email ID");
					s.nextLine();
					String ei = s.nextLine();
					this.ei=ei;
					modify();
					break;
				}
				case 5:{
					System.out.println("Enter new Mobile Number");
					s.nextLine();
					long mno = s.nextLong();
					this.mno=mno;
					modify();
					break;
				}
				default:
					System.err.println("Select correct option");
					modify();
					break;
				}
			}
		}
		else 
		{
			System.err.println("%%%% First Design your card to modify/view. %%%%");
			design();
		}
	}
}
