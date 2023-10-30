package Entity;
//TODO 5:
public class Etudiant3eme extends Etudiant {
    private String branche;

    Etudiant3eme () {
    }

    //TODO 6:
    Etudiant3eme (int id, String prenom, String nom, double moyenne, String branche) {
        super (id, prenom, nom, moyenne);
        this.branche = branche;
    }

    //TODO 4:
    public void ajouterUneAbsence () {
        //TODO 7:
        super.setMoyenne (super.getMoyenne ()-0.5);
    }


    //Getters Ans Setters:
    public String getBranche () {
        return branche;
    }

    public void setBranche (String branche) {
        this.branche = branche;
    }
}
