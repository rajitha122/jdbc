
import java.util.*;
class TestCollection13
{
public static void main(String[] arg)
{
HashMap<Integer,String>hm=new HashMap<Integer,String>();
hm.put(111,"john");
hm.put(121,"jim");
hm.put(222,"kim");
for(Map.Entry m:hm.entrySet())
{

System.out.println(m.getKey() + " " +m.getValue());
}
}
}