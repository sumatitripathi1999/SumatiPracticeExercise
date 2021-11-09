package exampleFirst;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String args[])
    {
        Person p =new Person("simmi",  null,  21);

        //to create optional object these methods are used
        //empty
        //of
        //ofNullable

        //returns empty optional object
        Optional<Object> emptyOptional= Optional.empty();
        System.out.println(emptyOptional);



         //throws null pointer exception if object is empty
        //Optional<String> lastnameOptional= Optional.of(p.getLastName());
      // System.out.println(lastnameOptional);

       //returns empty optional object
              Optional<String> lastNameOptional2=Optional.ofNullable(p.getLastName());
             //System.out.println(lastNameOptional2);
             if(lastNameOptional2.isPresent()) {
                 System.out.println(lastNameOptional2.get());
             }

             //orElse method
        System.out.println(lastNameOptional2.orElse("deafault name"));

             //customised exception   orElseThrow
       // System.out.println(lastNameOptional2.orElseThrow(()-> new IllegalArgumentException("last name not present")));

        //map() method
        System.out.println(lastNameOptional2.map(String::toUpperCase).orElseGet(()->"default email.."));

    }

}
