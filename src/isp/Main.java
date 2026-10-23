package isp;

public class Main {
	public static void main(String[] args) {
        GmailAccount g = new GmailAccount();
        g.name = "Aitzol";
        g.emailAddress = "aitzol@gmail.com";

        EmailSender.sendEmail(g, "Kaixo!");     // ondo
        // SMSSender.sendSMS(g, "Kaixo!");      // errorea
    }

}
