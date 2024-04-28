package br.com.my.church.mychurch.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "igreja")
public class Igreja implements Serializable {

    private static final long serialVersionUID = -8406291256835657000L;

    @Id
    @Column(name = "id_igreja")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String fone;
    private String token;

    public Igreja(Long id, String nome, String fone, String token) {
        this.id = id;
        this.nome = nome;
        this.fone = fone;
        this.token = token;
    }

    public Igreja(String nome, String fone, String token) {
        this.nome = nome;
        this.fone = fone;
        this.token = token;
    }

    public Igreja() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
