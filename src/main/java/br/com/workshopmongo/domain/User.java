package br.com.workshopmongo.domain;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    /*Atributos*/
    private String id;
    private String name;
    private String email;

    /*Construtor Vazio*/
    public User() {

    }

    /*Construtor*/
    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    /*Metodos Getter e Setters*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    /*Metodos Equals Hashcode*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }
}
