package org.example;
import java.util.*;

public class TerminalOperations {
    public static void main(String[] args) {
        //Terminal Operations

        //1. forEach()
        List<Integer> arrList = Arrays.asList(1,2,3,4,5);
        arrList.stream().distinct().forEach(System.out::print);

        //2. collect()
//        List<Integer> arrList1 = arrList.stream().collect();


        //3. toArray()
        Object [] arrList2 =  arrList.stream().map((Integer a) -> a+10).toArray();

        //4. reduce
        int c= arrList.stream().distinct().reduce(0,(Integer a, Integer b) -> a+b);
        System.out.println(c);

        //5. min(), max()

        //6. count()

        //7. anyMatch()

        //8. allMatch()

        //9. findFirst()

        //10. findAny()

    }
}
