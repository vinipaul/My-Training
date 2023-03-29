package com.Aggregation;
/**Create a class Product with data members: id, name, and description. Create another class LineItem which
consist of quantity and Product. Use aggregation to print the lineitem with Product.**/
public class LineItem {
	int quantity;
	Product productref;
	
	public LineItem(int quantity, Product productref) {
		super();
		this.quantity = quantity;
		this.productref = productref;
	}
	void printDetails()
	{
		System.out.println("Product id: "+productref.id+ "\n Product Name: "+productref.name +"\nProduct Description "
	+productref.description +"\nQuantity: "+quantity);
	}
		
	public static void main(String[] args) {
		Product pobj=new Product(20,"Dettol","Anticeptic");
		LineItem lobj=new LineItem(2,pobj);
		lobj.printDetails();
			}

		}

	


