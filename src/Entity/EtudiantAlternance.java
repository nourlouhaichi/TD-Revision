package Entity;
//TODO 8:
public class EtudiantAlternance extends Etudiant {
    private int salaire;

    EtudiantAlternance () {
    }

    //TODO 9:
    EtudiantAlternance (int id, String prenom, String nom, double moyenne, int salaire) {
        super (id, prenom, nom, moyenne);
        this.salaire = salaire;
    }

    //TODO 4:
    public void ajouterUneAbsence () {
        //TODO 10:
        salaire = salaire-50;
    }

    //TODO 11:
    @Override
    public String toString() {
        return "ID: " + super.getId()
                + " Prenom: " + super.getPrenom()
                + " Nom: " + super.getNom()
                + " Moyenne: " + super.getMoyenne()
                + "Salaire: " + salaire;
    }


    //Getters Ans Setters:
    public int getSalaire () {
        return salaire;
    }

    public void setSalaire (int salaire) {
        this.salaire = salaire;
    }
}
