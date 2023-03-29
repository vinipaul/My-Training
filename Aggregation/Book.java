package com.Aggregation;
/**Create a class Author with data members: authorName,age,place. Create another class Book with data
members: bookName,price and Author. Print the Book detail**/
public class Book {
String bookname;
int price;
Author authorref;

public Book(String bookname, int price, Author authorref) {
	super();
	this.bookname = bookname;
	this.price = price;
	this.authorref = authorref;
}
void bookDetails() {
	System.out.println("Book Name: "+bookname+"\nPrice: "+price+
			"\nAuthor: "+authorref.name+"\nAge: "+authorref.age+"\nPlace: "+authorref.place);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Author authorobj=new Author("Benyamin",50,"India");
Book bobj=new Book("Adujeevitham",250,authorobj);
bobj.bookDetails();

	}

}
