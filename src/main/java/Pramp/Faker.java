package main.java.Pramp;

import java.util.Random;

public class Faker {

	Random rnd = new Random();

	public static void main(String[] args) {
		String s = "Test?#";
		Faker f = new Faker();
		System.out.println(f.bothify(s));
	}

	public String letterify(String letterString) {
		char randChar = (char) (rnd.nextInt(26) + 'a');
		String replaced = letterString.replaceAll("\\?", ""+randChar+"");
		return replaced;
	}

	public String numerify(String numberString) {
		int randInt = (int) (rnd.nextInt(9));
		String replaced = numberString.replaceAll("\\#", ""+randInt+"");
		return replaced;
	}

	public String bothify(String string) {
		string = letterify(string);
		string = numerify(string);
		return string;
	}

}