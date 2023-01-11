

public class EntriesArray {
    
    private Object[] entriesArray;
    private int size;
    private int capacity = 1;

    public Object[] getEntriesArray() {
        return entriesArray;
    }

    public EntriesArray() {
        this.entriesArray = new Object[capacity];
    }

    public void setEntriesArray(Object[] entriesArray) {
        this.entriesArray = entriesArray;
    }


    public void add(Object data) {

        if(size >= capacity) grow();

        entriesArray[size] = data;
        size++;

    }

    private void grow() {

        int newCapacity = (int)(capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++) {
            newArray[i] = entriesArray[i];
        }
        capacity = newCapacity;
        entriesArray = newArray.clone();
    }

    public String toString() {
        String string = "";

        for(Object obj : entriesArray) {
            if(obj == null) break;
            string += obj + ", ";
        }
        return string;
    }
}
