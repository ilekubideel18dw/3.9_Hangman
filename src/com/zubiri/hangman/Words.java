package com.zubiri.hangman;
import java.util.Random;
import java.util.ArrayList;

public class Words {
	
	private ArrayList<String> words = new ArrayList<String>();
	private String randomWord = "";
	
	public Words(){
		
		this.words.add("lazkano");
		this.words.add("intxausti");
		this.words.add("artola");
		this.words.add("alberdi");
		this.words.add("lekubide");
		this.words.add("ortiz");
		this.words.add("gonzalez");
		
	}
	
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
	
	public void addWord(String word){
		
		this.words.add(word);
		
	}
	
	public String selectRandomWord() {
		
		return this.randomWord = words.get((new Random()).nextInt(words.size()));
		
		// https://code.i-harness.com/es/q/4cd182
		
	}
	
}