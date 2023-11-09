package fr.iut.editeur.commande;
import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument {
    public CommandeInserer(Document doc, String[] parametres) {
        super(doc, parametres);
    }

    public void executer() {
        if (parameters.length == 3) {
            int x = Integer.parseInt(parameters[1]);
            String insert = parameters[2];
            this.document.inserer(insert, x);
            super.executer();
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String getDescriptionCommande() {
        return "Insere du texte au document";
    }
}
