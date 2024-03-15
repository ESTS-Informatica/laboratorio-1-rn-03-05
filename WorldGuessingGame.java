import java.util.Scanner;

/**
 * Escreva uma descrição da classe WorldGuessingGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WorldGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private InputReader reader;
    private int numberOfTries;
    
    //Construtor
    public WorldGuessingGame(){
     hiddenWord = "abc";
     numberOfTries = 0;
     guessedWord = "___";
     reader= new InputReader();
    }
    
    //Métodos Seletores 
    
    public String getHiddenWord() {
        return hiddenWord;
    }

    
    public String getGuessedWord() {
        return guessedWord;
    }

    
    public int getNumberOfTries() {
        return numberOfTries;
    }

    //Método que escreve para o ecrã a palavra que se vai adivinhando
    public void showGuessedWord(){
      System.out.println("A palavra que estás a adivinhar é " + guessedWord);
    }
    
    //Método showWelcome
    private void showWelcome(){
       System.out.println("Bem vindo ao jogo de adivinhar a palavra");
       System.out.println("A palavra que tens de adivinhar tem "+hiddenWord.length() + "letras");
    }
    
    private void guess(char letter) {
        boolean found = false;
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (hiddenWord.charAt(i) == letter && guessedWord.charAt(i) == '_') {
                guessedWord = guessedWord.substring(0, i) + letter + guessedWord.substring(i + 1);
                found = true;
            }
        }
        if (found) {
            System.out.println("Letra correta!");
        } else {
            System.out.println("Letra incorreta!");
        }
    }
    
    private void showResult(){
     System.out.println("já tentás-te adivinhar a palavra "+numberOfTries+ " vezes");
    }
    
    public void play (){
       showWelcome();
       Scanner scanner = new Scanner(System.in);
        while (!hiddenWord.equals(guessedWord)) {
            showGuessedWord();
            System.out.print("Digite uma letra: ");
            char letter = scanner.next().charAt(0);
            guess(letter);
            numberOfTries++;
        }
        showResult();
        scanner.close();
    }
    
}
