package pro.sky.java.course2;

public class StringListImpl implements StringList {

    private int lengthArray;
    private String[] list;
    private int size = 0;

    public StringListImpl() {
        lengthArray = 10;
        list = new String[lengthArray];
    }

    public int getLengthArray() {
        return lengthArray;
    }

    @Override
    public String add(String item) {
        if (item == null) {
            throw new InvalidInputData();
        }
        list[size] = item;
        size++;
        if (size == lengthArray) {
            String[] timeArray = new String[(lengthArray += 10)];
            System.arraycopy(list, 0, timeArray, 0, size);
            list = timeArray;
        }
        return list[(size - 1)];
    }

    @Override
    public String add(int index, String item) {
        return item;
    }

    @Override
    public String set(int index, String item) {
        return null;
    }

    @Override
    public String remove(String item) {
        return null;
    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public boolean contains(String item) {
        return false;
    }

    @Override
    public int indexOf(String item) {
        return 0;
    }

    @Override
    public int lastIndexOf(String item) {
        return 0;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] toArray() {
        return new String[0];
    }
}
