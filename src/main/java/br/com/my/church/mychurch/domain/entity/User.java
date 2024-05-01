package br.com.my.church.mychurch.domain.entity;

import br.com.my.church.mychurch.infrastructure.persistence.church.ChurchEntity;
import br.com.my.church.mychurch.util.ValidateUtil;

import java.util.Date;

public class User {

    private Long id;
    private Date birthday;
    private String name;
    private String phone;
    private Boolean active = true;
    private Integer profile = 0;
    private String email;
    private String password;
    private String church;

    private Date registerDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getProfile() {
        return profile;
    }

    public void setProfile(Integer profile) {
        this.profile = profile;
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

    public String getChurch() {
        return church;
    }

    public void setChurch(String church) {
        this.church = church;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public int nomeValido() {
        return ValidateUtil.validateString(name, 200);
    }

    public int emailValido() {
        return ValidateUtil.validateStringWithRegex(email, 200, ValidateUtil.REGEX_EMAIL);
    }

    public int foneValido() {
        return ValidateUtil.validateCelular(phone);
    }

    public ValidatedField validarCampos() {
        ValidatedField validatedField;

        if (email != null) {
            switch (emailValido()) {
                case ValidateUtil.STRING_LONGA:
                    return new ValidatedField("Email deve conter no máximo 200 caracteres", false);
                case ValidateUtil.STRING_VAZIA:
                    return new ValidatedField("Informe um email válido", false);
                case ValidateUtil.STRING_INVALIDA:
                    return new ValidatedField("Email inválido, informe um email válido para continuar", false);
            }
        }

        switch (nomeValido()) {
            case ValidateUtil.STRING_LONGA:
                return new ValidatedField("Nome deve conter no máximo 200 caracteres", false);
            case ValidateUtil.STRING_VAZIA:
                return new ValidatedField("Informe um nome válido", false);
        }

        switch (foneValido()) {
            case ValidateUtil.STRING_LONGA:
                return new ValidatedField("O telefone deve conter no máximo 14 caracteres", false);
            case ValidateUtil.STRING_INVALIDA:
                return new ValidatedField("Número de celular inválido", false);
        }

        if (password == null) {
            return new ValidatedField("Informe uma senha", false);
        }

        if (password.isEmpty()) {
            return new ValidatedField("Informe uma senha válida", false);
        }

        if (password.length() < 6) {
            return new ValidatedField("A senha deve conter no mínimo 6 caracteres", false);
        }

        return new ValidatedField("Campos informados com sucesso", true);
    }
}
