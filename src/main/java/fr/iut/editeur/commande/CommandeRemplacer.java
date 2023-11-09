package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        int deb = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        if (parameters.length == 4) {
            String texte = parameters[3];
            this.document.remplacer(deb, fin, texte);
        }
        else {
            this.document.remplacer(deb, fin, "");
        }
        super.executer();
    }

    /**
     *
     * @return
     */
    @Override
    public String getDescriptionCommande() {
        return "Remplace du texte au document";
    }
}
