package Day11;

public class GenericList<T> {
    Object[] arr;
    int size;
    int index;

    public GenericList(int size) {
        arr = new Object[size];
        this.size = size;
        index = 0;
    }

    public void add(Object value) {
        if (index < size) {
            arr[index++] = value;
        } else {
            System.out.println("Out of index");
        }
    }

    public Object peek() {
        if (size < 0) {
            return (T) arr[size-- - 1];
        }else {
            return -100;
        }
    }

    public static void main(String[] args) {
        GenericList<String> testGeneric = new GenericList<String>(4);

        testGeneric.add(1);
        testGeneric.add(2);
        testGeneric.add(3);
        testGeneric.add(4);

        System.out.println(testGeneric.size);
    }
}
