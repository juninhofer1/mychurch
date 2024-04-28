package br.com.my.church.mychurch.models.props;

public enum PerfilUsuario {

    Membro(1, "Membro"),
    Lider(2, "Líder"),
    LiderEscala(3, "Líder Escala"),
    Admin(4, "Administrador");

    private final int code;
    private final String description;

    PerfilUsuario(int numVal, String description) {
        this.code = numVal;
        this.description = description;
    }

    public int getNumVal() {
        return code;
    }
}
