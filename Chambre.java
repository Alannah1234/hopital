public class Chambre extends Element
{
    private int no_chambre;
    private int nombreDeLits;
    private int surveillants;
    private String codeService;
    private String primaryKey ;


    public Chambre(int no_chambre, int nombreDeLits, int surveillants, String codeService) {
        this.no_chambre = no_chambre;
        this.nombreDeLits = nombreDeLits;
        this.surveillants = surveillants;
        this.codeService = codeService;
        this.primaryKey = no_chambre + codeService;
    }

    public int getNo_chambre() {
        return no_chambre;
    }

    public void setNo_chambre(int no_chambre) {
        this.no_chambre = no_chambre;
    }

    public int getNombreDeLits() {
        return nombreDeLits;
    }

    public void setNombreDeLits(int nombreDeLits) {
        this.nombreDeLits = nombreDeLits;
    }

    public int getSurveillants() {
        return surveillants;
    }

    public void setSurveillants(int surveillants) {
        this.surveillants = surveillants;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }
}