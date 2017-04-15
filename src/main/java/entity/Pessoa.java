package entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity
public class Pessoa implements Serializable {
    @Id
	private int id;
	private String Nome;
	private String email;
	private static final long serialVersionUID = 1L;

	public Pessoa() {
		super();
	}   
	public String getNome() {
		return this.Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
   
}
