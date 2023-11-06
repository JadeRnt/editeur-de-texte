package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument{

    public CommandeEffacer(Document doc, String[] parametres) {
        super(doc, parametres);
    }

    public void executer() {
        int deb = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.effacer(deb, fin);
        super.executer();
    }
}
