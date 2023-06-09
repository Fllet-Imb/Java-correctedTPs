        
/**
 * Voici le détail de la classe représentant une entreprise :
 *      Nom
 *      Adresse
 *      Type (Publique / Privée / Semi-publique)
 *      Nombre de bâtiments
 *      Domaine (Informatique, Médical, Logistique, par exemple)
 *      Nombre d’employés
 *      Détenteur majoritaire
 *  Cette classe doit posséder les méthodes suivantes :
 *      Changer le nombre de bâtiments par une valeur donnée
 *      
 *      Changer le nombre d’employés par une valeur donnée
 *      Une seule méthode permettant (au moyen d’un boolean) :
 *          -   Un affichage complet :
*              Nom de l'entreprise, adresse
*             Entreprise "type" détenue par "detenteur majoritaire" dans le domaine yyyyyy 
*              Il y a X bâtiments pour Y employés
 *          -   Un affichage partiel :
 *              Nom de l'entreprise et adresse
*   
 *      Changer le type par une valeur donnée :
 *          -   Si l’entreprise est Publique :
 *                  Le détenteur majoritaire est obligatoirement « L’Etat »
 */
public class Entreprise
{
    // variables d'instance
    private String nom;
    private String adresse;
    private String type;
    private int nbBatiment;
    private String domaine;
    private int nbEmploye;
    private String detenteurMajoritaire;
 
    /**
     * Constructeur d'objets de classe Entreprise
     */
    public Entreprise(String nom, String adresse, String type, int nbBatiment, String domaine, int nbEmploye, String detenteurMajoritaire)
    {
        // initialisation des variables d'instance
        this.nom = nom;
        this.adresse = adresse;
        this.type = type;
        this.nbBatiment = nbBatiment;
        this.detenteurMajoritaire = detenteurMajoritaire;
        this.domaine = domaine;
        this.nbEmploye = nbEmploye;
    }

    public void changerNbBatiment (int nb){
        this.nbBatiment = nb;
    }
    
    public void setNbEmploye(int nb){
        this.nbEmploye = nb;
    }
    
    public void afficher(boolean full){
        System.out.println(nom + ", " + adresse);
        if(full){
            System.out.println("Entreprise " + type +" détenue par " + detenteurMajoritaire + " dans le domaine " + domaine);
            System.out.println("L'entreprise possède " + nbBatiment + " bâtiments pour " + nbEmploye + " employés");
        }
    }
    public void changerType (String type){
        this.type = type;
        if (type.equals("Publique")){
            this.detenteurMajoritaire = "L'Etat";
        }
    }
}
