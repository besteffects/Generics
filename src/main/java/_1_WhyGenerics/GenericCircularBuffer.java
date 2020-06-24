package _1_WhyGenerics;

public class GenericCircularBuffer<T> {
    private T[] buffer;
    private int readCursor = 0;
    private int writeCursor = 0;

    public GenericCircularBuffer(int size) {
        buffer = (T[]) new Object[size];
    }

    //try to write something into the buffer
    public boolean offer(T value) {
        if (buffer[writeCursor] != null) {
            return false;
        }
        buffer[writeCursor] = value;
        writeCursor = next(writeCursor);
        return true;
    }

    //try to read something out of the buffer\
    //returns the value that we can read out, otherwise it returns null
    public T poll() {
        final T value = buffer[readCursor];
        //if a value to read is available
        if (value != null) {
            buffer[readCursor] = null; //read a value and remove it from a buffer
            readCursor = next(readCursor);
        }
        return value;
    }

    public int next(int index) {
        return (index + 1) % buffer.length;
    }
}

