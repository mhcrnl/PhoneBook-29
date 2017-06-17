/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

/**
 *
 * @author mhcrnl
 */
public class Contact {
    
    private int nrCrt;
    private String nume;
    private String prenume;
    private String telefon;
    private String email;
    private String companie;
    
    public Contact(String nume, String prenume, String telefon, String email, String companie){
        this.nume = nume;
        this.prenume = prenume;
        this.telefon = telefon;
        this.email = email;
        this.companie = companie;
        this.nrCrt++;
    } 

    /**
     * @return the nrCrt
     */
    public int getNrCrt() {
        return nrCrt;
    }

    /**
     * @param nrCrt the nrCrt to set
     */
    public void setNrCrt(int nrCrt) {
        this.nrCrt = nrCrt;
    }

    /**
     * @return the nume
     */
    public String getNume() {
        return nume;
    }

    /**
     * @param nume the nume to set
     */
    public void setNume(String nume) {
        this.nume = nume;
    }

    /**
     * @return the prenume
     */
    public String getPrenume() {
        return prenume;
    }

    /**
     * @param prenume the prenume to set
     */
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
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
     * @return the companie
     */
    public String getCompanie() {
        return companie;
    }

    /**
     * @param companie the companie to set
     */
    public void setCompanie(String companie) {
        this.companie = companie;
    }
    
    
    
}
