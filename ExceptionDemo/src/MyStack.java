import java.util.ArrayList;

public class MyStack<T> {

    // the maximum size of the stack
    protected int stackSize;

    // the internal structure of the stack
    protected ArrayList<T> stack;

    // the last popped element
    protected T lastPoppedElement;

    // the constructor
    public MyStack(int size) {
        stack = new ArrayList<>();
        stackSize = size;
    }

    /**
     * TODO: This method adds an new Element to the stack.
     *
     * @param newElement the new element to be added
     * @throws StackOverflowException when the new stack size exceeds the size limit
     */
    public void push(T newElement) throws StackOverflowException {
        try{
            if (stack.size() > stackSize)
                throw StackOverflowException;
            this.stack.add(newElement);
        }catch(StackOverflowException e){


        }
    }

    /**
     * This method pops an element from the top of the stack.
     * TODO: This method should handle IndexOutOfBoundsException which is thrown by the private
     * variable stack, an ArrayList, when the referencing index is out of bound. Then it should print
     * "The stack is empty." and return the lastPoppedElement.
     *
     * @return the last popped element from the stack
     */
    public T pop() {

    }

}
