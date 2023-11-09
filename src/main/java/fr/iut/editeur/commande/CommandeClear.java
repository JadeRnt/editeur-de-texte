package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument{
    public CommandeClear(Document doc, String[] parametres) {
        super(doc, parametres);
    }

    public void executer() {
        document.clear();
        super.executer();
    }

    /**
     *
     * @return
     */
    @Override
    public String getDescriptionCommande() {
        return "Clear le texte du document";
    }
}
