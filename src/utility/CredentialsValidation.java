package utility;

public class CredentialsValidation 
{
	public boolean validate(String email, String password) 
	{
		if(email.equals("admin") && password.equals("admin"))
			return true;
		else 
			return false;
	}
}