/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.classi;

/**
 *
 * @author emanuelfois
 */
public class UtenteRegistrato {
    
    private int id;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String urlFotoProfilo;

    public UtenteRegistrato() {
        id = 0;
        nome = "";
        cognome="";
        email = "";
        password = "";
    }

 /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the razza
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the razza to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    
    public boolean equals(Object altroUtente) {
        if (altroUtente instanceof UtenteRegistrato)
            if (this.getId() == ((UtenteRegistrato)altroUtente).getId()) return true;
        return false;
    }

    /**
     * @return the urlFotoProfilo
     */
    public String getUrlFotoProfilo() {
        return urlFotoProfilo;
    }

    /**
     * @param urlFotoProfilo the urlFotoProfilo to set
     */
    public void setUrlFotoProfilo(String urlFotoProfilo) {
        this.urlFotoProfilo = urlFotoProfilo;
    }
}