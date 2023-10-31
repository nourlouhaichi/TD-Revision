package Entity;
public class Ecole {
    private String nom;
    private Etudiant[] tabEtudiant ;
    //TODO 13:
    private  int compteur = 0;

    //TODO 12:
    public Ecole () {
        tabEtudiant = new Etudiant[500];
    }

    public Ecole (String nom) {
        tabEtudiant = new Etudiant[500];
        this.nom = nom;
    }

    //TODO 14:
    public int rechercherEtudiant (Etudiant e) {
        for (int i = 0; i < compteur; i++) {
            if (tabEtudiant[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    //TODO 15:
    //TODO 21:
    public void ajouterEtudiant (Etudiant e) throws EtudiantExisteException {
        if (compteur < 500) {
            if (rechercherEtudiant (e) == -1) {
                tabEtudiant[compteur] = e;
                compteur++;
            }
            //else System.out.println("Etudiant existe deja.");
            else throw new EtudiantExisteException("Etudiant existe deja.");
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

    //TODO 18:
    @Override
    public String toString () {
        String s = "Nom Ecole: " + nom + " Les Etudiants: \n " ;
        for (int i = 0; i < compteur; i++) {
            s = s + tabEtudiant[i].toString() + "\n";
        }
        return s;
    }

    //TODO 19:
    //TODO 22:
    public void changerEcole (Etudiant etd, Ecole e) {
        int indice = rechercherEtudiant(etd);
        if (indice != -1) {
            try {
                e.ajouterEtudiant(etd);
            } catch (EtudiantExisteException exc){
                System.out.println(exc.getMessage());
            }
            for (int i = indice; i < compteur; i++) {
                tabEtudiant[i] = tabEtudiant[i+1];
            }
            tabEtudiant[compteur] = null;
            compteur--;
        }
        else System.out.println("Cet etudiant n'existe pas");
    }


    //Getters Ans Setters:
    public void setNom (String nom) {
        this.nom = nom;
    }

    public String getNom () {
        return nom;
    }
}
