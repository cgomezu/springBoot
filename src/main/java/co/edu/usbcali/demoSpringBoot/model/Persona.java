package co.edu.usbcali.demoSpringBoot.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "persona")
//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@userAppId")
public class Persona {

    // An autogenerated id (unique for each user in the db)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    // The person's email
    @NotNull(message="El email debe estar lleno.")
    private String email;

    // The person's name
    @NotNull
    private String name;

    // The person's lastname
    @NotNull
    private String lastname;

    // The person's cellphone
    @NotNull
    private String cellphone;

    // The user's address
    private String address;

    //The user
    @NotNull
    @OneToOne
    private Usuario usuario;
    
    @ManyToOne
    private TipoDocumento tipoDocumento;


    //Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	

}