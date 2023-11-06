package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscules extends CommandeDocument{

    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    public void executer() {
        int deb = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.majuscules(deb, fin);
        super.executer();
    }
}
