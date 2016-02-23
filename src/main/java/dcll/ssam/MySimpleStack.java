package dcll.ssam;

import java.util.EmptyStackException;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by mousa on 19/02/2016. Exigence 2;
 */
public class MySimpleStack implements SimpleStack {

    Stack<Object>  warppedStack = new Stack<Object>();
    @Override
    public boolean isEmpty() {
        return warppedStack.isEmpty();
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public void push(Item item) {

    }

    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}
