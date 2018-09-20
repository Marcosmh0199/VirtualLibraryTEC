package Control;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Session;



public class EnMail {
	public final String usuario="proyectopython18@gmail.com";
	public final String contraseña="python18pro";
	String para="";
	String asunto="";
	String cuerpomensaje="";
	
	public EnMail(String para,String asunto,String cuerpomensaje) {
		Properties propiedades = new Properties();
		propiedades.put("mail.smtp.auth", "true");
		propiedades.put("mail.smtp.starttls.enable", "true");
		propiedades.put("mail.smtp.host", "smtp.gmail.com");
		propiedades.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(propiedades, null);
		
		try {
			 
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(usuario));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(para));
            message.setSubject(asunto);
            message.setText(cuerpomensaje);
 
            Transport.send(message,usuario,contraseña);
            System.out.print("mensaje enviado");
 
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
	}
	public static void main(String[] args) {

		EnMail corr = new EnMail("manuelchavesmoya@gmail.com","este es el asunto","este es el cuerpo");
	}
}
