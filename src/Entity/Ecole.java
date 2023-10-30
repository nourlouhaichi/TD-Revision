package Entity;
public class Ecole {
    private String nom;
    private Etudiant[] tabEtudiant ;
    //TODO 13:
    private  int compteur = 0;

    //TODO 12:
    Ecole () {
        tabEtudiant = new Etudiant[500];
    }

    //TODO 14:
    int rechercherEtudiant (Etudiant e) {
        for (int i = 0; i < compteur; i++) {
            if (tabEtudiant[i] == e) {
                return i;
            }
        }
        return -1;
    }

    //TODO 15:
    public void ajouterEtudiant (Etudiant e) {
        if (compteur < 500) {
            if (rechercherEtudiant (e) == -1) {
                tabEtudiant[compteur] = e;
                compteur++;
            }
            else System.out.println("Etudiant existe deja.");
        }
        else System.out.println("Le tableau est plein");
    }

    //TODO 16:
    public double getMoyenneDes3A () {
        double moyTotal = 0;
        int nbEtud3eme = 0;
        for (int i = 0; i < compteur; i++) {
            if (tabEtudiant[i] instanceof Etudiant3eme etudiant) {
                moyTotal = moyTotal + etudiant.getMoyenne();
                nbEtud3eme++;
            }
        }
        return moyTotal/nbEtud3eme;
    }

    //TODO 17:
    public double moyenneSalaireAlternants () {
        double salTotal = 0;
        int nbEtudAlt = 0;
        for (int i = 0; i < compteur; i++) {
            if (tabEtudiant[i] instanceof EtudiantAlternance etudiant) {
                salTotal = salTotal + etudiant.getSalaire();
                nbEtudAlt++;
            }
        }
        return salTotal/nbEtudAlt;
    }

    //TODO 17:
    @Override
    public String toString () {
        return "Nom Ecole: " + nom + "Les Etudiants: " ;
    }


    //Getters Ans Setters:
    Ecole (String nom) {
        tabEtudiant = new Etudiant[500];
        this.nom = nom;
    }

    //Getters Ans Setters:
    public void setNom (String nom) {
        this.nom = nom;
    }

    public String getNom () {
        return nom;
    }
}
