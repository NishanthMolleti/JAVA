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
			System.out.println("Hellooo..! Welcome to E-MANDI \n You are registering your details as an Adminstrator \n");
			System.out.println("Enter Your Name: \n");
			String userName = scanner.nextLine();
			
			System.out.println("Enter Your Email-Id: \n");
			String email = scanner.nextLine();
			
			System.out.println("Enter Your Password: \n");
			String password = scanner.nextLine();
			
			System.out.println("Re-enter Your Password: \n");
			String confirmPassword = scanner.nextLine();
			
			System.out.println("Enter Your Mobile Number: \n");
			String mobile = scanner.nextLine();
			
			if(validate.checkUserDetails(email, password, confirmPassword, mobile))
			{
				register.setUserName(userName);
				register.setEmail(email);
				register.setPassword(password);
				register.setConfirmPassword(confirmPassword);
				register.setMobile(mobile);
				printData(register);
			}
			else
			{
				System.out.println("Please correct your details.!");
			}
			
		}	
	}
	public static void printData(Register register)
	{
		System.out.println("Your Name: " + register.getUserName());
		System.out.println("Your Name: " + register.getEmail());
		System.out.println("Your Name: " + register.getPassword());
		System.out.println("Your Name: " + register.getConfirmPassword());
		System.out.println("Your Mobile Number: " + register.getMobile());
	}
}
