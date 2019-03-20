package StackAndQueue;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Question 3.3
 * Stack of Plates:
 * Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
 * Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
 * threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should be
 * composed of several stacks and should create a new stack once the previous one exceeds capacity.
 * SetOfStacks. push() and SetOfStacks. pop() should behave identically to a single stack
 * (that is, pop () should return the same values as it would if there were just a single stack)
 */
public class StackOfPlates {

    private int capacity;

    private ArrayList<Stack> stacks = new ArrayList<Stack>();

    public StackOfPlates(int capacity) {
        this.capacity = capacity;
    }


    public void push(int item)
    {
        Stack last = getLastStack();

        if ((null != last) && (last.size() < this.capacity)) {
            last.push(item);
        } else {
            Stack newStack = new Stack();
            newStack.push(item);
            this.stacks.add(newStack);
        }
    }

    private Stack getLastStack()
    {
        if (this.stacks.size() == 0) {
            return null;
        }

        return this.stacks.get(stacks.size() - 1);
    }


    public int pop()
    {
        Stack last = getLastStack();

        if (null == last) {
            throw new EmptyStackException();
        }

        int item = (Integer) last.pop();

        if (last.empty()) {
            this.stacks.remove(last);
        }

        return item;
    }

    /**
     * No rollover, just pop
     *
     * @param stackIndex
     * @return
     */
    public int popAt(int stackIndex)
    {
        Stack stack = this.stacks.get(stackIndex);
        return (Integer) stack.pop();
    }
}
