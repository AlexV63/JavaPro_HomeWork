package ExtraWorks;

import java.util.*;


public class ArrIterator {

     static class ArrayIterator<E> implements Iterator<E> {
         private E[] arr;
         private int pointer = 0;

         public ArrayIterator(E[] arr) {
             this.arr = arr;
         }

         @Override
         public boolean hasNext() {
             return pointer < arr.length;
         }

         @Override
         public E next() {
             if (!hasNext()) {
                 throw new NoSuchElementException();
             }
             return arr[pointer++];
         }

         public static void main(String[] args) {
             String[] strings = {
                     "January",
                     "February",
                     "March"
             };
//             ArrayIterator<String> iterator = new ArrayIterator<>(strings);
//
//             while (iterator.hasNext()) {
//                 System.out.println(iterator.next());
//             }
//
             List<String> someList = new ArrayList<>(List.of("January", "February", "March"));

             Iterator<String> iter = someList.iterator();
//
//             while (iter.hasNext()) {
//                 String s = iter.next();
//                 System.out.println(s);
//                 if (s.equals("February")){
//                     iter.remove();
//                 }
//             }
  //           iter = someList.iterator();
  //           iter.forEachRemaining(System.out::println);


             ListIterator<String> iterList = someList.listIterator();
             while (iterList.hasNext()){
                 String s = iterList.next();
                 System.out.println(s);

  //               if (s.equals("March")){
                     iterList.set("September");
  //              }
                 iterList.add("December");
                 System.out.println(s);
             }
         }
     }
 }
