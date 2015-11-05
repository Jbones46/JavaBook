package com.javabook.testing;

public class Book {
	private String title;
	private String description;
	private String author;
	private String condition;
	private int numberOfPages;
	
	
	public Book(String bookTitle, String bookDescription, String bookAuthor, String bookCondition, int bookNumberOfPages){
		title = bookTitle;
		description = bookDescription;
		author = bookAuthor;
		condition = bookCondition;
		numberOfPages = bookNumberOfPages;
		
			
				
		
		
	}
	public void bookDetails() {
		System.out.println("This book called " + title  + " is about " + description + " is written by " + author + "is " + numberOfPages + "pages long and in " + condition +" condition");
		
	}
	 
	public void changedCondition(String newCondition){
		condition = newCondition;
	}
	
	public String newCondition() {
		
		return condition;
	}
	
	public void conditionChanged() {
		
		System.out.println("the Condition of the book has changed to " + condition);
	}
	
	

}
