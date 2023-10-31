package Entity;
//TODO 8:
public class EtudiantAlternance extends Etudiant {
    private int salaire;

    public EtudiantAlternance () {
    }

    //TODO 9:
    public EtudiantAlternance (int id, String prenom, String nom, double moyenne, int salaire) {
        super (id, prenom, nom, moyenne);
        this.salaire = salaire;
    }

    //TODO 4:
    @Override
    public void ajouterUneAbsence () {
        //TODO 10:
        salaire = salaire-50;
    }

    //TODO 11:
    @Override
    public String toString() {
        return super.toString() + " Salaire: " + salaire;
    }


    //Getters Ans Setters:
    public int getSalaire () {
        return salaire;
    }

    public void setSalaire (int salaire) {
        this.salaire = salaire;
    }
}
