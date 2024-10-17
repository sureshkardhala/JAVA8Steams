package org.example;

import java.util.*;
import java.util.stream.Stream;

public class Streams {
    /* Steps of using streams, (Streams are pipelines, where we can process collection in a disred ways)
            step 1: Creating streams
            step 2: Perform Intermediate Operations like filter, sort, ...
                    And many intermediate operations can perform.
            step 3: Terminal Operations like collect, reduce, count .....
                     Only one Terminal operation have to perform.
     */


    //Step 1. Creating streams
    public static void main(String[] args) {


        //a. From Collections
        List<Integer> list = Arrays.asList(10,20,30,40,50);
        Stream<Integer> streamList= list.stream();

        //b. From Arrays
        Integer[] arrList = {10,20,30,40,50};
        Stream<Integer> streamArray = Arrays.stream(arrList);


        //c. From static method
        Stream<Integer> streamMethodArray = Stream.of(10,20,30,40,50);


        //d. From stream builder
        Stream.Builder<Integer> streamBuilder;
        streamBuilder = new Stream.Builder() {
            @Override
            public void accept(Object o) {

            }

            @Override
            public Stream build() {
                return Stream.empty();
            }
        };

        streamBuilder.add(10).add(20).add(30).add(40).add(50);
        Stream<Integer> streamBuilderList = streamBuilder.build();


        //e. From Iterator
        Stream<Integer> streamInteratorList = Stream.iterate(10, (Integer a)-> a+10).limit(5);

    }


}
