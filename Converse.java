
public class Converse {
	
	void tobeConvert()
	{
		String binary,hex,octal;
		int num=100;
		//integer wrapper class
		Integer obj =new Integer(num);
		binary =obj.toBinaryString(num);
		hex=obj.toHexString(num);
		octal=obj.toOctalString(num);
		System.out.println("decimal value : " +num);
		System.out.println("binary equivalent " +binary);
		System.out.println("hexa equivalent " +hex);
		System.out.println("octal equivalent " +octal);
		
		
	}

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		
		Converse objconvert =new Converse();
		objconvert.tobeConvert();
		
		
	}

}
