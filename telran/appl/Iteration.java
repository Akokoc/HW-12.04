package telran.appl;

import telran.iterators.MyStringIterator;
import telran.iterators.ReverseMyStringIterator;
import telran.model.MyString;

import java.util.Iterator;

public class Iteration {
    public static void main(String[] args) {
        String str="Hallo";
        MyString myStr= new MyString(str);

//        int[] arr = {1, 1, 2, 3, 5, 8};
//        for (int num : arr) {
//            System.out.print(num + " ");
//        int min = -12, max = 4;
//        MyString range = new MyString(min, max);
//        for (int num : range) {
//             System.out.print(num + " ");
//            }
//        System.out.println();
//            System.out.print(num+" ");
//        int[] arr={1,1,2,3,5,8};
//        for (int num:arr) {
//            System.out.print(num+" ");
//        }
        Iterator<Character> iter=new MyStringIterator(myStr);
        while (iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
        System.out.println();

        Iterator<Character> iterR = (Iterator<Character>) new ReverseMyStringIterator(myStr);
        while (iter.hasNext()){
            System.out.println(iterR.next()+" ");
        }



        }
    }
