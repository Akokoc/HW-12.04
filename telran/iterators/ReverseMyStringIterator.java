package telran.iterators;

import telran.model.MyString;

import java.util.Iterator;

public class ReverseMyStringIterator implements Iterator<Character> {
    private MyString range;
    private int position;//индекс элемента в массиве

    public ReverseMyStringIterator(MyString range) {
        this.range = range;
        position = range.getSize() - 1;
    }

    @Override
    public boolean hasNext() {
        return position <= 0;
    }

    @Override
    public Character next() {
        return range.getChar(position--);
    }
}
