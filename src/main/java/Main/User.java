/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Date;

/**
 *
 * @author qayin
 */
public abstract class User {
    private String nome;
    private String email;
    private Date dataNasc;

    public User(String nome, String email, Date dataNasc) {
        this.nome = nome;
        this.email = email;
        this.dataNasc = dataNasc;
    }
    
    
    

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    
    
    
}
