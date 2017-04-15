package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.commons.mail.EmailException;
@ManagedBean
@SessionScoped
public class IndexController {
 @ManagedProperty(name="orc",value="#{orc}")
 private Orc orc;
 
 public EmailUtils getEu() {
	return eu;
}
public void setEu(EmailUtils eu) {
	this.eu = eu;
}
private EmailUtils eu=new EmailUtils();
 
 public Orc getOrc() {
	return orc;
}
public void setOrc(Orc orc) {
	this.orc = orc;
}
private Mensagem mensagem = new Mensagem();
 
 public Mensagem getMensagem() {
 return mensagem;
 }
 public void setMensagem(Mensagem mensagem) {
 this.mensagem = mensagem;
 }
 
 public void enviaEmail() {
 try {
 EmailUtils.enviaEmail(mensagem);

 } catch (EmailException ex) {
 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro! Occoreu um erro ao enviar a mensagem.", "Erro"));

 }
 }
 public void enviaorc() {
	 try {
	 EmailUtils.enviaOrc(orc.valor,orc.tipo);

	 } catch (EmailException ex) {
	 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro! Occoreu um erro ao enviar a mensagem.", "Erro"));

	 }
	 }
 public void limpaCampos() {
 mensagem = new Mensagem();
 }
 
}