package br.com.my.church.mychurch.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8406291256835657000L;
	
	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cpf;
	private Date nascimento;
	private String nome;
	private String email;
	private String fone;
	private Long instituicao;
	private Boolean ativo;
	private Boolean aprovado = false;
	private Integer perfil = 0;
	@ManyToOne
	@JoinColumn(name = "id_igreja")
	private Igreja igreja;

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
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
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



	public Long getInstituicao() {
		return instituicao;
	}
	
	public void setInstituicao(Long instituicao) {
		this.instituicao = instituicao;
	}
	
	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Igreja getIgreja() {
		return igreja;
	}

	public void setIgreja(Igreja igreja) {
		this.igreja = igreja;
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
}
