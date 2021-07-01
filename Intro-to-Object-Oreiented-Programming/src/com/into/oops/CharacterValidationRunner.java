package com.into.oops;

public class CharacterValidationRunner {

	public static void main(String[] args) {
		MyChar myChar=new MyChar('A');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonant());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		myChar.printLowerCaseAlphabets();
		myChar.printUpperCaseAlphabets();

	}


}
