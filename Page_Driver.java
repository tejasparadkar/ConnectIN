package connectIn;

	import java.util.Scanner;

	public class Page_Driver {
		static
		{
			System.out.println("||||||ConnectIn||||||");
		}
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("****Select Mode****");
			System.out.println("1.Signup");
			System.out.println("2.Login");
			System.out.println("3.Guest");
			System.out.println("4.Exit");
			
			Menu m = new Menu();
			int choice = s.nextInt();
			switch (choice) {
			case 1: {
				m.signUp();
				break;
			}
			case 2: {
				m.login();
				break;
			}
			case 3: {
				System.out.println("||||||Guest mode||||||");
				m.homePage();
				System.exit(0);
			}
			case 4: {
				System.out.println("!!!!!Thank You for visiting!!!!!");
				System.exit(0);
			}
			default:
				System.err.println("%%%%Enter valid input%%%%");
				main(null);
			}
			m.homePage();

		}

	}
