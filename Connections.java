package connectIn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Connections extends Professional{
	static ArrayList connections = new ArrayList();
	public void enter()
	{
		System.out.println(("@@@@ Enter Connection @@@@"));
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name: ");
		String n = s.nextLine();
		connections.add(n);
		System.out.println("Press a to add more");
		System.out.println("Press v to views connections");
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
		System.out.println(("@@@@ View Connection @@@@"));
		System.out.println("1.View Ascending");
		System.out.println("2.Random");
		System.out.println("3.Go back");
		int i = s.nextInt();
		switch (i) {
		case 1: {
			System.out.println("@@@@ Ascending @@@@");
			Iterator i1 = connections.iterator();
			while(i1.hasNext())
			{
					System.out.println(i1.next());				
			}
			view();
			break;
		}
		case 2: {
			System.out.println("@@@@ Random @@@@");
			for(Object obj:connections)
			{
				
					System.out.println(obj);
				
			}
			view();
			break;
		}
		case 3:
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
