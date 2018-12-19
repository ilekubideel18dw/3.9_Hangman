import java.util.Random;
import java.util.ArrayList;

public class Words {
	
	private ArrayList<String> words = new ArrayList<String>();
	private String randomWord = "";
	
	public Words(ArrayList<String> words) {
		
		this.words = words;
		
	}
		
	public ArrayList getWords() {
		
		return words;
		
	}
	
	public void setWords(ArrayList<String> words) {
		
		this.words = words;
		
	}
	
	public String getRandomWord() {
		
		return randomWord;
		
	}
	
	public void setRandomWord(String randomWord) {
		
		this.randomWord = randomWord;
		
	}
	
	public void selectRandomWord() {
		
		this.randomWord = words.get((new Random()).nextInt(words.size()));
		
		// https://code.i-harness.com/es/q/4cd182
		
	}
	
	
	
}