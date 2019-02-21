
public class stringMethod {

	protected StringMethod()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java is a " + "platform independent language";
		String s1="Hello worls";
		String s2=" Hello ";
		String s3="HELLO";
		
		System.out.println(s);
		System.out.println("index of t = " + s.indexOf('t'));
		System.out.println("last index of t = " +s.lastIndexOf('t'));
		
		System.out.println("index of(t,10)=" +s.indexOf('t',10));
		System.out.println("last index of(t,60)= " +s.lastIndexOf('t',60));
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(3, 8));
		System.out.println(s2.concat("world"));
		System.out.println(s2.replace('l','w' ));
		System.out.println(s2.toLowerCase());
		System.out.println(s2.trim());
		
	}

}
