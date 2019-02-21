
import java.util.Scanner;
public class GenericPairDemo
	{
	public static void main(String[] args)
	{
		
	Pair<String> secretpair =new Pair<String>("happy","day");
	Scanner sc =new Scanner(System.in);
	System.out.println("enter two words");
	String word1=sc.next();
	String word2=sc.next();
	Pair<String> inputPair=new Pair<String>(word1,word2);
	Pair<Integer>secret1=new Pair<Integer>(10,20);
	secret1.display();
	if(inputPair.equals(secretpair))
	{
	System.out.println("you gessed the secret word");
	System.out.println("in the correct order!");
	}
	else
	{
	System.out.println("you guessed incorrectly");
	System.out.println("you gussed");
	System.out.println(inputPair);
	System.out.println("the secret word are:");
	System.out.println(secretpair);
	System.out.println(secret1);
	}
	}
	}