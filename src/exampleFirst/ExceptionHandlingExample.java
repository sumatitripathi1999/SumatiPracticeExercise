package exampleFirst;

public class ExceptionHandlingExample {

    public static void main()
    {
        int[] someNumbers={1,3,5,6};
        int key=3;

        process(someNumbers,key);
    }

    public static void process(int[] someNumbers,int key)
    {
        for(int i:someNumbers)
        {
            System.out.println(i+key);
        }
    }
}
