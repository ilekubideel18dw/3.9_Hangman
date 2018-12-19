import java.util.Random;
import java.util.ArrayList;

public class Words {
	
	private ArrayList<String> words = new ArrayList<String>();
	private String randomWord = "";
	
	public Words(){};
	public Words(ArrayList<String> words) {
		
		this.words = words;
		
	}
		
	public ArrayList<String> getWords() {
		
		return words;
		
	}
	
	public void setWords(ArrayList<String> words) {
		
		this.words = words;
		
	}
	
	public void setRandomWord(String randomWord) {
		
		this.randomWord = randomWord;
		
	}
	
	public String getRandomWord() {
		
		return randomWord;
		
	}
	
	public void selectRandomWord() {
		
		this.randomWord = words.get((new Random()).nextInt(words.size()));
		
		// https://code.i-harness.com/es/q/4cd182
		
	}
	
	public void enterWords() {
		
		words.add("lazkano");
		words.add("intxausti");
		words.add("artola");
		words.add("alberdi");
		words.add("lekubide");
		words.add("ortiz");
		words.add("gonzalez");
		
	}
	
}