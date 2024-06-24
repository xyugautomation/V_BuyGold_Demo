package Com.Sprint_2;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.testng.ITestResult;

public class EmailListener {

    public void onTestSuccess(ITestResult result) {
        sendEmail("Test Passed: " + result.getName(), result.getMethod().getDescription());
    }

    public void onTestFailure(ITestResult result) {
        sendEmail("Test Failed: " + result.getName(), result.getMethod().getDescription());
    }

    public void onTestSkipped(ITestResult result) {
        sendEmail("Test Skipped: " + result.getName(), result.getMethod().getDescription());
    }

    // Send email method
    private void sendEmail(String subject, String body) {
        final String username = "shiv.xyug@gmail.com";
        final String password = "";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

//        Session session = Session.getInstance(props,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//
//        try {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(username));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("recipient_email@example.com"));
//            message.setSubject(subject);
//            message.setText(body);
//            Transport.send(message);
//            System.out.println("Email sent successfully");
//        } catch (MessagingException e) {
//            throw new RuntimeException(e);
//        }
    }
	
	
	
	
	
}
