package br.com.my.church.mychurch.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ministerio")
public class Ministerio {

    @Id
    @Column(name = "id_ministerio")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @ManyToOne
    @JoinColumn(name = "id_igreja")
    private Igreja igreja;
    @OneToMany (cascade = {CascadeType.ALL})
    @JoinTable(
            name="lidere_ministerio",
            joinColumns = @JoinColumn( name="id_usuario")
            ,inverseJoinColumns = @JoinColumn( name="id_ministerio")
    )
    private List<Usuario> lideres;

    public void setIgreja(Igreja igreja) {
        this.igreja = igreja;
    }



    public Igreja getIgreja() {
        return igreja;
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

    public List<Usuario> getLideres() {
        return lideres;
    }

    public void setLideres(List<Usuario> lideres) {
        this.lideres = lideres;
    }
}
