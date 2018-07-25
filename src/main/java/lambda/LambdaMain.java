package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {
        /**
         * Pierwsze ćwiczenie
         */

//        Person person = new Person();
//        person.setName("Jan");
//        person.setAge(20);
//        printAgeMoreThan20(person, p -> p.getAge() > 20);

        /**
         * Drugie ćwiczenie
         */
//        IStringPrinter printer = (t -> System.out.println(t));


        /**
         * Trzecie ćwiczenie
         */

//        OperatorTest operatorTest = new OperatorTest();
//        testStringPrinter(operatorTest::print);

        /**
         * Czwarte ćwiczenie
         */

        List<Person> persons = getPersonList();

//        persons.stream().forEach(p -> System.out.println(p.getName()));

//        persons.stream().filter(o-> o.getAge()>=20).forEach(p->System.out.println(p.getName()));

//        persons = persons.stream().filter(o-> o.getAge()>=30).collect(Collectors.toList());

        printList(persons);

//        persons.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).collect(Collectors.toList());

//        persons.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
//
//        List<Person> sortedList = persons
//                .stream()
//                .filter(p->p.getAge()>=21)
//                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
//                .collect(Collectors.toList());
//
//        printList(sortedList);

        persons.stream().flatMap(p-> Arrays.asList(p,"test").stream()).forEach(o->{
            if(o instanceof Person)System.out.print(((Person)o).getName());
            else System.out.println(o);
        });

    }

    /**
     * Pierwsze ćwiczenie
     */
    public static void printAgeMoreThan20(Person person, IAgeChecker checker) {
        System.out.println("Result: " + checker.checkAga(person));
    }

    /**
     * Drugie ćwiczenie
     */
    private static void testStringPrinter(Consumer<String> printer) {
        printer.accept("Testowy text");
    }

    /**
     * Czwarte ćwiczenie
     */
    private static List<Person> getPersonList() {
        List<Person> result = new ArrayList<>();
        result.add(new Person("Jan", 21));
        result.add(new Person("Boby", 30));
        result.add(new Person("Vlad", 18));
        return result;
    }

    /**
     * Czwarte ćwiczenie
     */
    private static void printList(List<Person> list) {
        list.stream().forEach(p -> System.out.println(p.getName() + " | " + p.getAge()));
    }
}
