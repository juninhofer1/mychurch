package br.com.my.church.mychurch.infrastructure.persistence.user;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "usuario_new")
public class UserEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -8406291256835657000L;

    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date nascimento;
    private String nome;
    private String email;
    private String fone;
    private Boolean ativo = true;
    private Boolean aprovado = true;
    private Integer perfil = 0;
//    @ManyToOne
//    @JoinColumn(name = "id_igreja")
//    private ChurchEntity igreja;

//	@ManyToMany (cascade = {CascadeType.ALL})
//	@JoinTable(
//			name="ministerio_usuario",
//			joinColumns = @JoinColumn( name="id_usuario")
//			,inverseJoinColumns = @JoinColumn( name="id_ministerio")
//	)
//	private List<Ministerio> ministerios;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    public Integer getPerfil() {
        return perfil;
    }

    public void setPerfil(Integer perfil) {
        this.perfil = perfil;
    }

//    public ChurchEntity getIgreja() {
//        return igreja;
//    }
//
//    public void setIgreja(ChurchEntity igreja) {
//        this.igreja = igreja;
//    }
}
