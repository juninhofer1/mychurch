package br.com.my.church.mychurch.infrastructure.persistence.church;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "churches")
public class ChurchEntity implements Serializable {

    @Id
    @Column(name = "id_church")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String phone;
    private String token;

    public ChurchEntity() {
        super();
    }

    public ChurchEntity(String name, String phone, String token) {
        this.name = name;
        this.phone = phone;
        this.token = token;
    }

    public ChurchEntity(Long id, String name, String phone, String token) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.token = token;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
