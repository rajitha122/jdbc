
import java.util.ArrayList;
import java.util.Collections;
class MyBasicArrayList
{

	public static void main(String[] ard)
{
	ArrayList<String> s1=new ArrayList<String>(); 
	
	//for(int i=0;i<ArrayList.length;i++)

	s1.add("java");
	s1.add("phython");
	s1.add("mava");
	s1.add("science");
	
	System.out.println(s1);
	//get element index
	System.out.println("ele at insex 1: " +s1.get(1));
	System.out.println("does the list contains java ? " +s1.contains("java"));
	
	//add ele at specific index
	s1.add(2,"play");
	System.out.println(s1);
	System.out.println("is arraylist empty : " +s1.isEmpty());
	System.out.println("index of perl is "+s1.indexOf("science"));
	Collections.sort(s1);
	System.out.println(s1);
	
	
	
	
	}
	}