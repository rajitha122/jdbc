
public class GenericMethodTest 
{

	//generic method printarray
	
	public static <E> void printArray(E[] inputArray)
	{
		for(E element :inputArray)
		{
			System.out.printf("%s" ,element);
			
		}
		System.out.println();
	}
	public static void main(String[] ar)
	{
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray= {1.1,2.2,3.3,4.4};
		Character[] charArray= {'H','E','L','L','O'};
		System.out.println("ARRAY INTEGERARRAY CONTAINS");
		System.out.println(intArray);
		
		System.out.println("array doubleArray contains ");
		printArray(doubleArray);
		System.out.println("array character array");
		System.out.println(charArray);
		
		
		
				
		}
	}

