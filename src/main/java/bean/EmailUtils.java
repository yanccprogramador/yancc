package bean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.commons.mail.*;

import entity.Pessoa;
public class EmailUtils {
	 
	 private static final String HOSTNAME = "smtp.gmail.com";
	 private static final String USERNAME = "yancprogramacoes";
	 private static final String PASSWORD = "programmer0302";
	 private static final String Destino = "yandepaula@gmail.com";
	 private static Pessoa p=new Pessoa();
	 public Pessoa getP() {
			return p;
		}

		public void setP(Pessoa p) {
			this.p = p;
		}
	 
	 public static void enviaEmail(Mensagem mensagem) throws EmailException {
		 Email email = new SimpleEmail();
		 email.setHostName(HOSTNAME);
		 email.setSmtpPort(587);
		 email.setAuthenticator(new DefaultAuthenticator(USERNAME, PASSWORD));
		 email.setTLS(true);
		 email.setFrom("yancprogramacoes@gmail.com");
	 email.setSubject(mensagem.getTitulo());
	 email.setMsg(p.getNome()+" com email "+p.getEmail()+" enviou esta  mensagem \n \n \n \n "+mensagem.getMensagem());
	 email.addTo(Destino);
	 String resposta = email.send();
	 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "E-mail enviado com sucesso ", "Informação"));
	 }
	 public static void enviaOrc(String val,String tipo) throws EmailException {
		 Mensagem msg=new Mensagem();
		 Email email = new SimpleEmail();
		 email.setHostName(HOSTNAME);
		 email.setSmtpPort(587);
		 email.setAuthenticator(new DefaultAuthenticator(USERNAME, PASSWORD));
		 email.setTLS(true);
		 email.setFrom("yancprogramacoes@gmail.com");
	 email.setSubject("Orçamento");
	 email.setMsg(p.getNome()+" de email "+p.getEmail()+" enviou "+"orçamento no  "+val+" para fazer um "+tipo);
	 email.addTo(Destino);
	 String resposta = email.send();
	 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "E-mail enviado com sucesso para", "Informação"));
	 }
	}