package connectIn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PWOrganizations extends Professional{
	ArrayList organizations = new ArrayList();
	public void enter()
	{
		System.out.println(("@@@@ Enter Past Worked Organizations @@@@"));
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name: ");
		String n = s.nextLine();
		organizations.add(n);
		System.out.println("Press a to add more");
		System.out.println("Press v to views organnizations");
		System.out.println("Press b to go back to menu");
		char c =s.next().charAt(0);
		if(c=='a')
		{
			enter();
		}
		else if(c=='v')
		{
			view();
		}
		else if(c=='b')
		{
			features();
		}
		else
		{
			System.err.println("%%%% Enter correct option %%%%");
			features();
		}
	}
	public void view()
	{
		Scanner s = new Scanner(System.in);
		System.out.println(("@@@@ View Past worked Organizations @@@@"));
		System.out.println("1.View Ascending");
		System.out.println("2.View Descending");
		System.out.println("3.Random");
		System.out.println("4.Go back");
		int i = s.nextInt();
		switch (i) {
		case 1: {
			System.out.println("@@@@ Ascending @@@@");
			Iterator i1 = organizations.iterator();
			while(i1.hasNext())
			{
				for(int z=1;z<=organizations.size();z++)
				{
					System.out.print(z+".");
					System.out.println(i1.next());
				}
			}
			view();
			break;
		}
		case 2: {
			System.out.println("@@@@ Descending @@@@");
			for(int i2=organizations.size()-1;i>=0;i--)
			{
				for(int z=1;z<=organizations.size();z++)
				{
					System.out.print(z+".");
					System.out.println(organizations.get(i2));
				}
			}
			view();
			break;
		}
		case 3: {
			System.out.println("@@@@ Random @@@@");
			for(Object obj:organizations)
			{
				for(int z=1;z<=organizations.size();z++)
				{
					System.out.print(z+".");
					System.out.println(obj);
				}
			}
			view();
			break;
		}
		case 4:
		{
			features();
			break;
		}
		default:	
			System.err.println("%%%% Enter correct option %%%%");
			view();
			break;
		}
	}
}
