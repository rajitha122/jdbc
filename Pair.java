
public class Pair<T>
{
private T first;
private T second;
public Pair()
	{

	first=null;
	second=null;
	}
	
	public Pair(T FirstItem ,T SecondItem)
	{
	first=FirstItem;
	second=SecondItem;
	}
	public void setFirst(T newFirst)
	{
	
	first=newFirst;
	}
	public void setSecond(T newSecond)
	{
	
	second=newSecond;
	}
	public T getFirst()
	{
	return first;
	}
	
	public T getSecong()
	{
	return second;
	}
	public String toString()
	{
	return("first : "  +first.toString() + " \n" 
	+ " second : " +second.toString());
	}
	public boolean equals(Object otherObject)
	{
	if(otherObject==null)
	return false;
	else if(getClass() !=otherObject.getClass())
	return false;
	else{
	Pair<T> otherPair=(Pair<T>)otherObject;
	return(first.equals(otherPair.first)&&second.equals(otherPair.second));
	}
	}
	
	public void display()
	{
		
		System.out.println(first + "  "+second);
	}
	}