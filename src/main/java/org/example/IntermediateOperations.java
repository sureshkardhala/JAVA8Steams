package org.example;

import java.util.*;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        //1. filter(Predicate<T> predicate)
        Stream<Integer> streamList1 = Stream.of(10,20,30,40,50);
        streamList1.filter((Integer a) -> a>=30).forEach((Integer a)-> System.out.print(a +" "));

        System.out.println();

        //2. map(function<T, R> mapper)
        Stream<Integer> streamList2 = Stream.of(10,20,30,40,50);
        streamList2.map((Integer a)-> a+10).forEach((Integer a)-> System.out.print(a +" "));

        System.out.println();
        //3. flatmap(function<T, stream<R>> mapper)
        List<List<String>> stringList = Arrays.asList(
                Arrays.asList("ABC", "BCD"),
                Arrays.asList("CDE", "DEF"),
                Arrays.asList("EFG", "FGH")
        );
        List<String> streamList3 = stringList.stream()
                .flatMap((List<String> sentence)-> sentence.stream()).toList();
        for (String a : streamList3){
            System.out.print(a+" ");
        }
        System.out.println();
        List<String> streamList4 = stringList.stream()
                .flatMap((List<String> sentence)-> sentence.stream().map((String a )-> a.toLowerCase())).toList();
        for (String a : streamList3){
            System.out.print(a+" ");
        }


        //4. distinct()
        List<Integer> arrList3 = Arrays.asList(1,1,2,3,2,2,2,3,3,3,5,4,4,4);
        System.out.println("Before Distinct");
        for(Integer a : arrList3){
            System.out.print(a+ " ");
        }

        arrList3 = arrList3.stream().distinct().toList();
        System.out.println();
        System.out.println("AfterDistinct");
        for(Integer a : arrList3){
            System.out.print(a+ " ");
        }


        //5. sorted()

        List<Integer> arrList4 = Arrays.asList(1,1,2,3,2,2,2,3,3,3,5,4,4,4);
        System.out.println("Before Sorting");
        for(Integer a : arrList4){
            System.out.print(a+ " ");
        }

        arrList4 = arrList4.stream().sorted().toList();
        System.out.println();
        System.out.println("After Sorting");
        for(Integer a : arrList4){
            System.out.print(a+ " ");
        }

        System.out.println();

        //6. peek() - iterate each over element and won't do anything
        arrList4 = arrList4.stream().peek(System.out::print).toList();

        //7. limit(long a)
        System.out.println();
        System.out.println("Before Limit");
        for(Integer a : arrList4){
            System.out.print(a+ " ");
        }
        arrList4 = arrList4.stream().limit(7).toList();
        System.out.println();
        System.out.println("After Limit");
        for(Integer a : arrList4){
            System.out.print(a+ " ");
        }

        //8. skip(long a)
        System.out.println();
        System.out.println("Before Skip");
        for(Integer a : arrList4){
            System.out.print(a+ " ");
        }
        arrList4 = arrList4.stream().skip(2).toList();
        System.out.println();
        System.out.println("After Skip");
        for(Integer a : arrList4){
            System.out.print(a+ " ");
        }

        //9. mapToInt()
        List<String> stList = Arrays.asList("1", "2");
        int[] intList = stList.stream().mapToInt((String a) -> Integer.parseInt(a)).toArray();
        System.out.println();
        for (int a : intList){
            System.out.println(a);
        }

        //10. mapToLong()
        //11. mapToDouble()


    }
}
