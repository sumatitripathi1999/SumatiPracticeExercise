package exampleFirst;

public class TypeInferenceExample {

    public static void main(String args[])
    {
        myStringLambda stringLambdaExample=(String s) -> s.length();

        //below two syntax are also correct, we can use any among these
       // myStringLambda stringLambdaExample=(s) -> s.length();
      //  myStringLambda stringLambdaExample= s -> s.length();

        System.out.println(stringLambdaExample.getLength("hello simmi"));
    }

interface myStringLambda
{
    int getLength(String s);
}

}
