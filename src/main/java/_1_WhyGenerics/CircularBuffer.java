package _1_WhyGenerics;

public class CircularBuffer {
    private Object[] buffer;
    private int readCursor=0;
    private int writeCursor =0;

    public CircularBuffer(int size){
        buffer=new Object[size];
    }
    public boolean offer(int value) {
        return true;
    }

    public Object poll(){
        return null;
    }

    public  int next(int index){
        return (index+1)%buffer.length;
    }
}
