package telran.iterators;

import telran.model.MyString;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {
    private MyString range;
    private int position;//индекс элемента в массиве

    public MyStringIterator (MyString range){
        this.range=range;
        position=0;
    }

    @Override
    public boolean hasNext() {
        return position<= range.getSize()-1;
    }

    @Override
    public Character next() {
        return range.getChar(position++);
    }
}
