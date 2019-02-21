import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Book
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
		
	}
}
public class ArrayListExample {
public static void main(String [] arg)
{
	List<Book>list =new ArrayList<Book>();
	
	Book b1=new Book(101,"hgf","hvb","ghf",4);
	Book b2=new Book(102, "hfujdfgcu","ghj","hfhf",5);
	list.add(b1);
	list.add(b2);
	for(Book b:list)
	{
		System.out.println(b.id + " " +b.name + " " + b.author+ " " +b.publisher + " "+b.quantity);
		
	}
	
}
}
