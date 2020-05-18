package model;
import utility.UnamePwdValidation;
import java.util.Scanner;


//Register class is to register the Admin details
class Register 
{
	public String userName;
	public String email;
	public String password;
	public String confirmPassword;
	public String mobile;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}


/*The Register class details are get and set here in AdminRegister and validations are done in 
UnamePwdValidation of utility package
*/
public class AdminRegister
{
	public static void main(String[] args)
	{
		Register register =new Register();
		UnamePwdValidation validate = new UnamePwdValidation();
		try(Scanner scanner = new Scanner(System.in))
		{
			System.out.println("Enter Your Name: ");
			String userName = scanner.nextLine();
			
			System.out.println("Enter Your Email-Id: ");
			String email = scanner.nextLine();
			
			System.out.println("Enter Your Password: ");
			String password = scanner.nextLine();
			
			System.out.println("Re-enter Your Password: ");
			String confirmPassword = scanner.nextLine();
			
			System.out.println("Enter Your Mobile Number: ");
			String mobile = scanner.nextLine();
			
			if(validate.checkUserDetails(email, password, confirmPassword, mobile))
			{
				System.out.println("ALL IS WELL AGAIN..!");
				register.setUserName(userName);
				register.setEmail(email);
				register.setPassword(password);
				register.setConfirmPassword(confirmPassword);
				register.setMobile(mobile);
			}
			else
			{
				System.out.println("Please correct your details.!");
			}
			
		}	
	}
	public void printData(Register register)
	{
		System.out.println("Your Name: " + register.getUserName());
		System.out.println("Your Name: " + register.getEmail());
		System.out.println("Your Name: " + register.getPassword());
		System.out.println("Your Name: " + register.getConfirmPassword());
		System.out.println("Your Mobile Number: " + register.getMobile());
	}
}
