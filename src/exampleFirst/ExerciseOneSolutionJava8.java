package exampleFirst;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseOneSolutionJava8 {

    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person("simmi", "Tripathi", 22),
                new Person("soumya", "Pandey", 20),
                new Person("Arbaz", "Khan", 21)
        );


        // step1:sort list by lastname

        Collections.sort(people,(p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));

        printConditionally(people,p->true);
        //printLastNameStartingWithC(people);
        printConditionally(people,p-> p.getLastName().startsWith("K"));
    }


    // step2:create a method that prints all elements in thr list




    // step3:create a method that prints all elements with last name starting with K
    public static void printConditionally(List<Person> people, ExerciseOneSolutionJava7.Condition condition)
    {
        for(Person p:people)
        {
            if(condition.test(p))
            {
                System.out.println(p);
            }
        }

    }

    interface Condition
    {
        boolean test(Person p);
    }






}
