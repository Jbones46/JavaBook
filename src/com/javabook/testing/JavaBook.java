package com.javabook.testing;

public class JavaBook {

	public static void main(String[] args) {
		
Book Sojourn = new Book("Sojourn", "A book about change", "R.A. Salvatore", "New", 534);
		
Sojourn.bookDetails();

Sojourn.changedCondition("old");
Sojourn.conditionChanged();

	}
	

}
