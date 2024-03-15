
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
    private int numberOfTries;
    
    //Construtor
    public WorldGuessingGame(){
     hiddenWord = "abc";
     numberOfTries = 0;
     guessedWord = "___";
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
    
    
}
