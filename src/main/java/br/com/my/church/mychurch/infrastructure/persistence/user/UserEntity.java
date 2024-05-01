package br.com.my.church.mychurch.infrastructure.persistence.user;

import br.com.my.church.mychurch.infrastructure.persistence.church.ChurchEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "users")
public class UserEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -8406291256835657000L;

    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date birthday;
    private String name;
    private String phone;
    private Boolean active = true;
    private Integer profile = 0;
    private String email;
    private String password;
    private Date registerDate;
    @ManyToOne
    @JoinColumn(name = "id_church")
    private ChurchEntity church;

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

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public ChurchEntity getChurch() {
        return church;
    }

    public void setChurch(ChurchEntity church) {
        this.church = church;
    }
}
