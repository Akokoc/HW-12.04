package telran.model;

import telran.iterators.MyStringIterator;

import java.util.Iterator;

public class MyString {
    char[] ch = {};
    int size=0;

    public MyString(String str) {
        this.ch = str.toCharArray();
        this.size = str.length();

    }
    public int getSize(){
        return size;
    }

    public char getChar(int position){
        return ch[position];
    }
}
