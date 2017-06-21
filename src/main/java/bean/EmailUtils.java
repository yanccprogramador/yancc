package bean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.commons.mail.*;

import entity.Pessoa;
public class EmailUtils {
	 
	 private static final String HOSTNAME = " smtp.live.com";
	 private static final String USERNAME = "yancprogramacoes@hotmail.com";
	 private static final String PASSWORD = "yanc0302";
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
		 email.setSSLOnConnect(true);
		
		 email.setFrom(USERNAME);
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
		 email.setFrom(USERNAME);
	 email.setSubject("Orçamento");
	 email.setMsg(p.getNome()+" de email "+p.getEmail()+" enviou "+"orçamento no  "+val+" para fazer um "+tipo);
	 email.addTo(Destino);
	 String resposta = email.send();
	 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "E-mail enviado com sucesso para", "Informação"));
	 }
	 public static void enviaOrcSistema(String minimundo,String problema,String rn,String func,String rnf) throws EmailException {
		 Mensagem msg=new Mensagem();
		 Email email = new SimpleEmail();
		 email.setHostName(HOSTNAME);
		 email.setSmtpPort(587);
		 email.setAuthenticator(new DefaultAuthenticator(USERNAME, PASSWORD));
		 email.setTLS(true);
		 email.setFrom(USERNAME);
	 email.setSubject("Orçamento");
	 email.setMsg(p.getNome()+" de email "+p.getEmail()+" enviou "+
	 "orçamento  para fazer um sistema deste modo \n \n"
	+"Minimundo: "+minimundo+"\n"
	+"Problema: "+problema+"\n"
	+"Regras de negocio"+rn+"\n"
	+"Requisitos não funcionais"+rnf+"\n"
	+"Requisitos funcionais"+func+" \nResponda este e-mail com o valor.");
	 email.addTo(Destino);
	 String resposta = email.send();
	 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "E-mail enviado com sucesso para", "Informação"));
	 }
	}