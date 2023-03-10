// Daily Challenge: Author & Book Classes
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Write class Author, Book
* date: 07/02/2023
*/
package daily;

public class Book {
	private Author author;
	private String name;
	private double price;
	private int qty;

	public Author getAuthor() {
		return author;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return this.name + " by " + author;
	}
}
