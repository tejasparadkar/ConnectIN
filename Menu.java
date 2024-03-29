package connectIn;

import java.util.Scanner;

public class Menu 
{
	private String fname;
	private String lname;
	private String address;
	private String email;
	private String password;
	static long mno;
	public String getFname() 
	{
		return fname;
	}
	public void setFname(String fname) 
	{
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) 
	{
		this.lname = lname;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public long getMno() 
	{
		return mno;
	}
	public void setMno() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter mobile number: ");
		long mno = s.nextLong();
		if(mno>99999999 && mno<10000000000L)
		{
			this.mno=mno;
		}
		else
		{
			System.err.println("Enter correct mobile number");
			setMno();
		}
	}
	
	public void signUp()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String fname=s.next();
		setFname(fname);
		System.out.println("Enter last name: ");
		s.nextLine();
		String lname=s.nextLine();
		setLname(lname);
		System.out.println("Enter address: ");
		String address=s.nextLine();
		setAddress(address);
		System.out.println("Enter email: ");
		String email=s.nextLine();
		setEmail(email);
		System.out.println("Enter password: ");
		String password=s.nextLine();
		setPassword(password);
		setMno();
		System.out.println("Sign up successful");
		System.out.println("Proceed for Login");
		login();
	}
	public void login()
	{		
		if(fname!=null)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("1.Login with mobile number");
			System.out.println("2.Login with Email Id");
			int choice = s.nextInt();
			if(choice==1)
			{
				System.out.println("Enter mobile number: ");
				long mno = s.nextLong();
				System.out.println("Enter password: ");
				String pwd=s.next();
				if(this.mno==mno && this.password.equals(pwd))
				{
					System.out.println("Login successful");
				}
				else
				{
					System.err.println("Login unsuccessful");
					login();
				}
			}
			else if(choice==2)
			{
				System.out.println("Enter email: ");
				String email = s.next();
				System.out.println("Enter password: ");
				String pwd=s.next();
				if(this.email.equals(email) && this.password.equals(pwd))
				{
					System.out.println("Login successful");
				}
				else
				{
					System.err.println("Login unsuccessful");
					login();
				}
			}
			else
			{
				System.err.println("Enter correct choice");
				login();
			}
		}
		else
		{
			System.err.println("Login unsuccessful Sign up first");
			signUp();
		}
	}
	public void homePage()
	{
		System.out.println("****Select Mode****");
		System.out.println("1.Individual");
		System.out.println("2.Company");
		System.out.println("3.Exit");
		Scanner s = new Scanner(System.in);
		int choice=s.nextInt();
		switch (choice) {
		case 1: {
			Individual i = new Individual();
			i.options();
			break;
		}
		case 2: {
			Company c = new Company();
			c.options();
			break;
		}
		case 3: {
			System.out.println("!!!!!Thank You for visiting!!!!!");
			System.exit(0);
		}
		default:
			System.err.println("%%%%Enter correct input.%%%%");
			homePage();
		}
	}
}


