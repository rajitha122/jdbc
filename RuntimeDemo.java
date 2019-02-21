class RuntimeDemo
{
protected RuntimeDemo()
{
}
public static void main(String[] arg)
{

Runtime objRun =Runtime.getRuntime();
Process objProcess =null;
try
{

objProcess =  objRun.exec("calc.exe");
System.out.println(objRun.freeMemory());
System.out.println(System.getProperty("java.class.version"));
System.out.println(System.getProperty("java.Specification.vendor"));
}
catch(Exception e)
{
System.out.println("error " );
}
}
}

