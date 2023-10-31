import Entity.*;

public class Main {
    public static void main(String[] args) {
        Etudiant3eme etudiant1 = new Etudiant3eme(1, "Nour", "Lou", 17.02, "math");
        EtudiantAlternance  etudiant2 = new EtudiantAlternance(2, "Yomna", "Lou", 16.9, 1000);
        Etudiant3eme etudiant3 = new Etudiant3eme(3, "Ahmed", "Lou", 15.74, "tech");
        EtudiantAlternance  etudiant4 = new EtudiantAlternance(4, "Aziz", "Lou", 18.2, 2000);

        Ecole ecole1 = new Ecole("Esprit");
        Ecole ecole2 = new Ecole("Tekup");

        System.out.println(etudiant1.equals(etudiant2));

        System.out.println(etudiant1);
        System.out.println(etudiant2);
        System.out.println(etudiant3);
        System.out.println(etudiant4);

        etudiant1.ajouterUneAbsence();
        System.out.println(etudiant1);
        etudiant2.ajouterUneAbsence();
        System.out.println(etudiant2);

        try {
            ecole1.ajouterEtudiant(etudiant1);

        } catch (EtudiantExisteException e) {
            System.out.println(e.getMessage());
        }

        try {
            ecole1.ajouterEtudiant(etudiant1);

        } catch (EtudiantExisteException e) {
            System.out.println(e.getMessage());
        }

        try {
            ecole1.ajouterEtudiant(etudiant2);

        } catch (EtudiantExisteException e) {
            System.out.println(e.getMessage());
        }

        try {
            ecole1.ajouterEtudiant(etudiant3);

        } catch (EtudiantExisteException e) {
            System.out.println(e.getMessage());
        }

        try {
            ecole1.ajouterEtudiant(etudiant4);

        } catch (EtudiantExisteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(ecole1.getMoyenneDes3A());
        System.out.println(ecole1.moyenneSalaireAlternants());

        System.out.println(ecole1);

        ecole1.changerEcole(etudiant1, ecole2);
        System.out.println(ecole1);
        System.out.println(ecole2);

    }
}