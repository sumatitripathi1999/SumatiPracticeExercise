package exampleFirst;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseOneSolutionJava7 {

    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person("simmi", "Tripathi", 22),
                new Person("soumya", "pandey", 20),
                new Person("Arbaz", "Khan", 21)
                );


        // step1:sort list by lastname

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

           printAll(people);
           printConditionally(people, new Condition() {
               @Override
               public boolean test(Person p) {
                   return p.getLastName().startsWith("K");
               }
           });
        {

        };
    }
        // step2:create a method that prints all elements in thr list

    public static void printAll(List<Person> people)
    {
        for(Person p:people)
        {
            System.out.println(p);
        }
    }


    // step3:create a method that prints all elements with last name starting with K
    public static void printConditionally(List<Person> people,Condition condition)
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
