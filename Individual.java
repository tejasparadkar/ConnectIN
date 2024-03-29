package connectIn;

import java.util.Scanner;

public class Individual extends Menu {
	
	public void options()
	{
		{
			System.out.println("|||||Individual Section|||||");
		}
		Scanner s = new Scanner(System.in);
		System.out.println("****Select Mode****");
		System.out.println("1.Professional");
		System.out.println("2.Ordinary");
		System.out.println("3.Go Back");
		int choice = s.nextInt();
		switch (choice) {
		case 1: {
			Professional p = new Professional();
			p.features();
			break;
		}
		case 2: {
			Ordinary o = new Ordinary();
			o.features();
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
