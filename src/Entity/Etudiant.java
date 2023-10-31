package Entity;
//TODO 4:
public abstract class Etudiant {
    private int id;
    private String prenom,nom;
    private double moyenne;

    public Etudiant () {
    }

    //TODO 1:
    public Etudiant (int id, String prenom, String nom, double moyenne) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.moyenne = moyenne;
    }

    //TODO 2:
    @Override
    public boolean equals (Object obj) {
        if (null == obj) return false;
        if (obj instanceof Etudiant etudiant){
            return id == etudiant.id && nom.equals(etudiant.nom);
        }
        return false;
    }

    //TODO 3:
    @Override
    public String toString() {
        return "ID: " + id + " Prenom: " + prenom + " Nom: " + nom + " Moyenne: " + moyenne;
    }

    //TODO 4:
    public abstract void ajouterUneAbsence ();


    //Getters Ans Setters:
    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getPrenom () {
        return prenom;
    }

    public void setPrenom (String prenom) {
        this.prenom = prenom;
    }

    public String getNom () {
        return nom;
    }

    public void setNom (String nom) {
        this.nom = nom;
    }

    public double getMoyenne () {
        return moyenne;
    }

    public void setMoyenne (double moyenne) {
        this.moyenne = moyenne;
    }
}
