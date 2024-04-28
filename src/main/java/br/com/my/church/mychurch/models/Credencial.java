package br.com.my.church.mychurch.models;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Credencial {

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
