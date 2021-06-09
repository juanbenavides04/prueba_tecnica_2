package spring.boot.rest.bci.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table()
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")
	@Column(name="id", unique = true)
	private Long id;
	
	@NotEmpty(message = "No Puede estar vacio")
	@Column(nullable = false,unique = true)
	private String name;
	
	@NotEmpty(message = "No Puede estar vacio")
	@Email(message = "No es una direccion de correo bien formada")
	@Column(nullable = false,unique = true)
	private String email;
	
	private String password;
	
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date created;
	
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date modified;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "usuario_id")
	private List<Phone> phones;
	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}





	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}




	
	
	public Date getCreated() {
		return created;
	}



	public void setCreated(Date created) {
		this.created = created;
	}



	public List<Phone> getPhones() {
		return phones;
	}



	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}



	public Date getModified() {
		return modified;
	}



	public void setModified(Date modified) {
		this.modified = modified;
	}



	@PrePersist
	public void prePersiste() {
		created=new Date();
	}

	
}
