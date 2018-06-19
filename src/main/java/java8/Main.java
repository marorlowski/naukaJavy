package java8;


import lombok.val;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {

//        Button button = new Button();
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Buttona are pressed");
//            }
//        });
//
//        button.addActionListener((e -> {
//            System.out.println("Buttona are pressed");
//        }));

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
////
////
////
////        for(Integer a : list)
////        {
////            System.out.println(a);
////        }
////
////        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
////        list2.forEach(n-> System.out.println(n));
////
////
////        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
////        list3.forEach(System.out::println);
////
////
////        LocalDateTime dateTime = LocalDateTime.now();
////        System.out.println(dateTime);
////
////        int i=1;
////
////        String t = (i==1)?"równe" : "nierówne";
////
////        System.out.println(t);
////
////        String name = "Marek";
////        int age = 26;
////        System.out.printf("Witaj, %s. Za rok będziesz mieć %d lat.\n", name, age);
////
////
////        ArrayList<String> names = new ArrayList<>();
////
////        names.add("Marek");
////        names.add("Wojtek");
////        names.add("Grzesiek");
////
////        System.out.println(names);
////
////        Collections.reverse(names);
////        System.out.println(names);

        LocalDate date = LocalDate.of(2018, 1, 1);
        val emp = new Employee();

        emp.setName("Marek");
        emp.setSalary(100);

        System.out.println(emp.getName()+" "+emp.getSalary());

        emp.setName("Wojtek");
        emp.setSalary(200);

        System.out.println(emp.getName()+" "+emp.getSalary());

//        val task = new HelloTask();
//        val thread = new Thread(task);
//        thread.start();


        Runnable task = ()->{for (int i=0; i<10; i++)System.out.println("RUN");};
        task.run();
    }
}
