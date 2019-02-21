import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

 class Student1 {

	int rollno;
	String name;
	String address;
	String city;
	public Student1(int rollno,String name,String address,String city)
	{
		this.rollno=rollno;
		this.name=name;
		this.address=address;
		this.city=city;
		
	}
	
	public String toString()
	{
		return this.rollno + " " + this.name + " " +this.address + " " +this.city;
		
	}
}

class Sortbyroll implements Comparator<Student1>
{
	public int compare(Student1 a, Student1 b)
	{
		return a.rollno -b.rollno;
		
	}
}
class Sortbyname implements Comparator<Student1>
{
	public int compare(Student1 a,Student1 b)
	{
		return a.name.compareTo(b.name);
		
	}
}
	class Sortbycity implements Comparator<Student1>
	{
		public int compare(Student1 a,Student1 b)
		{
			return a.city.compareTo(b.city);
			
		}
}
class ComparatorDemo
{
	public static void main(String[] arg)
	{
		ArrayList<Student1> ar=new ArrayList<Student1>();
		ar.add(new Student1(111, "jddj" , "ggsf" ,"delhi"));
		ar.add(new Student1(122 , "dfd" , "decf" ,"london"));
		ar.add(new Student1(123, "ddcf" , "dfwsc","mumbai"));
		
		Date d1=new Date();
		System.out.println(d1.toString());
		
		System.out.println("unsorted");
		for(int i=0;i<ar.size();i++)
		
		System.out.println(ar.get(i));
		
		Collections.sort(ar,new Sortbyroll());
		System.out.println(" sorted by roll");
		for(int i=0;i<ar.size();i++)
		
		System.out.println(ar.get(i));
		
		Collections.sort(ar, new Sortbyname());
		System.out.println("sorted by name");
		
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar, new Sortbycity());
		System.out.println("sorted by city");
		
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		
	}
}
