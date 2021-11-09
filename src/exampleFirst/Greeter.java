package exampleFirst;

public class Greeter {

    public void greet(Greeting greeting)
    {
        greeting.perform();
        //System.out.println("Hello World !");
    }
    public static void main(String args[])
    {
        Greeter greeter=new Greeter();
        HelloWorldGreeting helloWorldGreeting=new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

       Greeting myLambdaFunction= () -> System.out.println("hello world");
      // MyAdd addFunction= (int a, int b) -> a+b;

    }

    interface MyLambda
    {
        void foo();

    }
   /* interface MyAdd
    {
        int add(int X,int Y);

    }
    */

}
