package StackAndQueue;

/**
 *
 * Question 3.1
 * Three in One: Describe how you could use a single array to implement three stacks.
 *
 */
public class ThreeInOne {

    private int eachStackCapacity;

    private int[] sharedArray;

    public ThreeInOne(int eachStackCapacity) throws RuntimeException
    {
        if (eachStackCapacity <= 0) {
            throw new RuntimeException("Capacity must be a positive number");
        }

        this.eachStackCapacity = eachStackCapacity;

        this.sharedArray = new int[this.eachStackCapacity * 3];
    }


    /**
     * Our stacks are infinite
     * new values will evict old ones
     *
     *
     * @param stackIndex
     * @param item
     * @throws RuntimeException
     */
    public void push(int stackIndex, int item) throws RuntimeException
    {
        if ((stackIndex < 0) || (stackIndex > 2)) {
            throw new RuntimeException("Stack index out of bounds");
        }

        int startOfStack = stackIndex * this.eachStackCapacity;
        int endOfStack = (stackIndex + 1) * this.eachStackCapacity - 1;

        for (int i = endOfStack; i > startOfStack; i--) {
            this.sharedArray[i] = this.sharedArray[i - 1];
        }

        this.sharedArray[startOfStack] = item;


    }

    public int pop(int stackIndex)
    {
        int startOfStack = stackIndex * this.eachStackCapacity;
        int endOfStack = (stackIndex + 1) * this.eachStackCapacity - 1;

        int item = this.sharedArray[startOfStack];

        for (int i = startOfStack; i < endOfStack; i++) {
            this.sharedArray[i] = this.sharedArray[i + 1];
        }

        this.sharedArray[endOfStack] = 0;

        return item;
    }

    /**
     * Helper
     */
    public void dump()
    {
        int index = 0;
        for (int item: this.sharedArray) {
            System.out.println(index++ + "=>" +item);
        }
        System.out.println();
        System.out.println();
    }
}
