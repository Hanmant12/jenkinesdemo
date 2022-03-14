package staticexample;

class example
{
    static int a=10;
    static int b=20;
    static void call()
    {
        System.out.println("Value1="+a);
    }
}
class staticmember
{
    public static void main(String args[ ])
    {
    	example.call();
        System.out.println("Value2="+example.b);
    }
}