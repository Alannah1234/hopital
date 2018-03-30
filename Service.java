public class Service extends Element
{
    private int code;
    private String nom;
    private char batiment;
    private int directeur;



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public char getBatiment() {
        return batiment;
    }

    public void setBatiment(char batiment) {
        this.batiment = batiment;
    }

    public int getDirecteur() {
        return directeur;
    }

    public void setDirecteur(int directeur) {
        this.directeur = directeur;
    }
}