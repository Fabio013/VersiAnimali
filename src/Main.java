public class Main {

    public static void main(String[] args) {

        Animale animale = new Animale(); // Creo oggetto Animale
        Gatto gatto = new Gatto(); // Creo oggetto Gatto (Figlio-Sottoclasse di Animale)

        animale.faiIlVerso(); // Invoco metodo presente in Animale (stampa il verso generico)
        gatto.faiIlVerso(); // Invoco metodo presente in Gatto (stampa il verso del gatto)
    // il metodo seppur con lo stesso nome, fa cose diverse perchè è definito diversamente nella classe madre e figlio

        }
}