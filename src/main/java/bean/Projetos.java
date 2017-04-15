package bean;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.DefaultStreamedContent;

@ManagedBean(name="projects")
@SessionScoped
public class Projetos {

	private String[] lista;
	private List<String> nomes;



	public Projetos() {
		
		lista=new String[6];
		nomes=new ArrayList<>();
		 lista[0]="Absolute Photo Editor";
    	 lista[1]="Arquivos PHP";
    	 lista[2]="Language Change Android";
    	 lista[3]="Language Change Desktop";
    	 lista[4]="LP Soldiers Test";
    	 lista[5]="Biblioteca conversor de linguagem";
    	 List<Integer> l = Arrays.asList(0,1, 2, 3, 4,5);
	        Collections.shuffle(l);

	        
	        for(int i=0;i<6;i++){
	        	
				nomes.add(lista[l.get(i)]);
	        }
	}
	

	public String[] getLista() {
		return lista;
	}

	public void setLista(String[] lista) {
		this.lista = lista;
	}

	public List<String> getNomes() {	
		
		return nomes;
	}
	public DefaultStreamedContent download(String nome){

		InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/resources/projetos/"+nome+"/download.zip");
        DefaultStreamedContent file = new DefaultStreamedContent(stream, "aplica��o/zip", nome+".zip");
	
	 return file;
	}
	public void msg(){
	  FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Download iniciado, obrigado!",""));
		 
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}


	

}
