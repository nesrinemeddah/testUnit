package fr.epsi.poe.hardis.tu;

/**
 * Created by medda on 28/02/2017.
 */
public class Restaurant {
    private String nom;
    private String adresse;
    private String codePostale;
    private String numeroDeTelephone;
    private boolean ouvert = true;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = "scoopo";

    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = "69000";
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
       if (numeroDeTelephone != null && !"".equals(numeroDeTelephone) && numeroDeTelephone.startsWith("0033")) {
                this.numeroDeTelephone = numeroDeTelephone;
        }
    }

    public boolean isOuvert() {
        return ouvert;
    }

    public void setOuvert(boolean ouvert) {
        this.ouvert = ouvert;
    }

}
