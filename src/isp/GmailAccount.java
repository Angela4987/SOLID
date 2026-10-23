package isp;

public class GmailAccount implements IEmailSender{
	String name, emailAddress;
	
	@Override
	 public String getEmail() { return emailAddress; }
	
}



