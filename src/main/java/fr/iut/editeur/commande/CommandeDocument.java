package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[]parameters;

    /**
     *
     * @param document
     * @param parameters
     */
    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    /**
     *
     * @return
     */
    @Override
    public String getDescriptionCommande() {
        return "Description de la commande Document";
    }

    /**
     *
     */
    @Override
    public void executer() {
        System.out.println("Exécution de la commande : " + getDescriptionCommande());
        System.out.println(this.document);
    }
}
