package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMinuscules extends CommandeDocument{

    public CommandeMinuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    public void executer() {
        int deb = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.minuscules(deb, fin);
        super.executer();
    }

    @Override
    public String getDescriptionCommande() {
        return "Ajoute des minuscules au texte du document";
    }
}
