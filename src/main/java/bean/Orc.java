package bean;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class Orc {
   public String tipo,tipoSite,tipoSoft,tipoApp,tipoLogo,tipoCart,tipoBan;
   private int num,numF,numF2;
 public String valor;
   private boolean site,soft,app,logo,cart,ban;
   public String getTipoApp() {
	return tipoApp;
}
   
public boolean valore(){
	if(valor==null){
		return false;
	}else{
		return true;
	}
}


public void setTipoApp(String tipoApp) {
	this.tipoApp = tipoApp;
}



public String getTipoLogo() {
	return tipoLogo;
}



public void setTipoLogo(String tipoLogo) {
	this.tipoLogo = tipoLogo;
}



public String getTipoCart() {
	return tipoCart;
}



public void setTipoCart(String tipoCart) {
	this.tipoCart = tipoCart;
}



public String getTipoBan() {
	return tipoBan;
}



public void setTipoBan(String tipoBan) {
	this.tipoBan = tipoBan;
}



public int getNumF2() {
	return numF2;
}



public void setNumF2(int numF2) {
	this.numF2 = numF2;
}



public boolean isApp() {
	return app;
}



public void setApp(boolean app) {
	this.app = app;
}



public boolean isLogo() {
	return logo;
}



public void setLogo(boolean logo) {
	this.logo = logo;
}



public boolean isCart() {
	return cart;
}



public void setCart(boolean cart) {
	this.cart = cart;
}



public boolean isBan() {
	return ban;
}



public void setBan(boolean ban) {
	this.ban = ban;
}

   public boolean isSite() {
	return site;
}



public void setSite(boolean site) {
	this.site = site;
}



public String getTipo() {
	return tipo;
}



public void setTipo(String tipo) {
	this.tipo = tipo;
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



	public void calcSite(){
		if(tipoSite.equals("pg")){
			int v=1000+(num*100);
			valor="Valor: de R$1000 até R$"+v;
		}
		if(tipoSite.equals("pgD")){
			int v=1500+(num*150);
			valor="Valor: de R$1500 até R$"+v;
		}
		if(tipoSite.equals("pgBD")){
			int v=2000+(num*200);
			valor="Valor: de R$2000 até R$"+v;
		}
	}
    public void verificaSite(){
    	if(tipo.equals("site")){
    		site=true;
    		soft=false;
    		app=false;
    		cart=false;
    		logo=false;
    		ban=false;
    	}else if(tipo.equals("soft")){
    		site=false;
    		soft=true;
    		app=false;
    		cart=false;
    		logo=false;
    		ban=false;
    	}else if(tipo.equals("android")){
    		site=false;
    		soft=false;
    		app=true;
    		cart=false;
    		logo=false;
    		ban=false;
    	}else if(tipo.equals("cart")){
    		site=false;
    		soft=false;
    		app=false;
    		cart=true;
    		logo=false;
    		ban=false;
    	}else if(tipo.equals("logo")){
    		site=false;
    		soft=false;
    		app=false;
    		cart=false;
    		logo=true;
    		ban=false;
    		valor="O preço é R$70 ";
    	}else if(tipo.equals("ban")){
    		site=false;
    		soft=false;
    		app=false;
    		cart=false;
    		logo=false;
    		ban=true;
    	}
    }


	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getTipoSite() {
		return tipoSite;
	}



	public void setTipoSite(String tipoSite) {
		this.tipoSite = tipoSite;
	}



	public int getNumF() {
		return numF;
	}



	public void setNumF(int numF) {
		this.numF = numF;
	}



	public boolean isSoft() {
		return soft;
	}



	public void setSoft(boolean soft) {
		this.soft = soft;
	}



	public String getTipoSoft() {
		return tipoSoft;
	}



	public void setTipoSoft(String tipoSoft) {
		this.tipoSoft = tipoSoft;
	}
	public void calcSoft(){
		if(tipoSoft.equals("simples")){
			double v= 1000+(numF*50.5);
			valor="Valor: de R$1000 até R$"+v;
		}
		if(tipoSoft.equals("bd")){
			double v=2000+(numF*80.9);
			valor="Valor: de R$2000 até R$"+v;
		}
		if(tipoSoft.equals("net")){
			double v=2100+(numF*82);
			valor="Valor: de R$2100 até R$"+v;
		}
	}
	public void calcApp(){
		if(tipoApp.equals("simples")){
			double v= 1000+(numF*50.5);
			valor="Valor: de R$1000 até R$"+v;
		}
		if(tipoApp.equals("bd")){
			double v=2000+(numF*80.9);
			valor="Valor: de R$2000 até R$"+v;
		}
		if(tipoApp.equals("jogo")){
		
			valor="Valor: a partir de R$3000";
		}
	}
	public void preco(){
		if(tipoCart.equals("fv")){
		   valor="O preço é R$60 lembrando que o preço não contém impressão, para imprimir nos mesmos imprimir entre em contato conosco";	
		} 
		if(tipoCart.equals("f")){
			valor="O preço é R$40 lembrando que o preço não contém impressão, para imprimir nos mesmos imprimir entre em contato conosco";
		}
	}
	public void calcBan(){
		if(tipoBan.equals("web")){
			valor="O preço é R$70 ";
		}
		if(tipoBan.equals("imp")){
			valor="O preço é R$60 lembrando que o preço não contém impressão, para imprimir nos mesmos imprimir entre em contato conosco";
		}
	}
}
