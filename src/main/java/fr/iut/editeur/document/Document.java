package fr.iut.editeur.document;

public class Document {

    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }
	
    public String getTexte() {
        return texteDocument;
    }

    public void setTexte(String texte) {
        this.texteDocument = texte;
    }

    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texteDocument.substring(0, start);
        String rightPart = texteDocument.substring(end);
        texteDocument = leftPart + remplacement + rightPart;
    }
    public void majuscules(int start, int end) {
        String textAtransformer = texteDocument.substring(start, end);
        remplacer(start, end, textAtransformer.toUpperCase());
    }

    public void minuscules(int start, int end) {
        String textAtransformer = texteDocument.substring(start, end);
        remplacer(start, end, textAtransformer.toLowerCase());
    }

    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }

    public void clear() {
        remplacer(0, texteDocument.length(), "");
        ajouter("I'm watching you :)");
    }

    public void inserer(String insert, int x) {
        remplacer(x+1,x+1,insert);
    }

    @Override
    public String toString() {
        return this.texteDocument;
    }
}
