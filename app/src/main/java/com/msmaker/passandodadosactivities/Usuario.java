package com.msmaker.passandodadosactivities;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nome;
    private String email;

    public Usuario(String name, String email) {
        this.nome = name;
        this.email = email;
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
}
