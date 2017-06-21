package bean;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class Orc {
   public String tipo,minimundo,problema,funcoes,rn,rnf;
 public String valor;
   private boolean sistema; 
public boolean valore(){
	if(valor==null){
		return false;
	}else{
		return true;
	}
}





public String getTipo() {
	return tipo;
}





public void setTipo(String tipo) {
	this.tipo = tipo;
}





public String getMinimundo() {
	return minimundo;
}





public void setMinimundo(String minimundo) {
	this.minimundo = minimundo;
}





public String getProblema() {
	return problema;
}





public void setProblema(String problema) {
	this.problema = problema;
}





public String getFuncoes() {
	return funcoes;
}





public void setFuncoes(String funcoes) {
	this.funcoes = funcoes;
}





public String getRn() {
	return rn;
}





public void setRn(String rn) {
	this.rn = rn;
}





public String getRnf() {
	return rnf;
}





public void setRnf(String rnf) {
	this.rnf = rnf;
}

 
	public Orc() {
		// TODO Auto-generated constructor stub
	}

	
	
	



	public String getValor() {
		return valor;
	}



	public void setValor(String valor) {
		this.valor = valor;
	}


    public boolean isSistema() {
		return sistema;
	}





	public void setSistema(boolean sistema) {
		this.sistema = sistema;
	}





	public void verificaSite(){
    	if(tipo.equals("sistema")){
    		sistema=true;
    	}else if(tipo.equals("cart")){
    		sistema=false;
    		valor="Valor varia de 50-70";
    	}else if(tipo.equals("logo")){
    		sistema=false;
    		valor="O preço é R$70 ";
    	}else if(tipo.equals("ban")){
    		sistema=false;
    		valor="O valor varia de 70-90";
    	}
    }


}
