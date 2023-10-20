package int_array_lab;

import java.util.Arrays;

/**
 * @Description:
 * @Title: int_array_lab.IntArray
 * @Author: Junpeng Li
 * @CreateTime: 9/25/23 11:22 AM
 */
public class IntArray {

    int[] arr;
    int size;
    int elementSize;

    public IntArray() {
        arr = new int[10];
        size = 10;
        elementSize = 0;
    }

    public IntArray(int initialCapacity) {
        arr = new int[initialCapacity];
        size = initialCapacity;
        elementSize = 0;
    }

    public int add(int element) {
        checkCapacity();
        arr[elementSize++] = element;
        return element;
    }

    public int add(int index, int x) {
        checkCapacity();
        if (index < elementSize) {
            int t0 = arr[index];
            for (int i = index; i < elementSize; i++) {
                int t1 = arr[i + 1];
                arr[i + 1] = t0;
                t0 = t1;
            }
            arr[index] = x;
            elementSize++;
            return x;
        } else {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }

    public void set(int index, int x) {
        assert index < size && index >= 0 : "Index should be within the size of array.";
        arr[index] = x;
    }

    public void delete(int index) {
        assert index < size && index >= 0 : "Index should be within the size of array.";
        for (int i = index; i < elementSize - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println(elementSize);
        arr[--elementSize] = 0;
    }

    private void checkCapacity() {
        if (elementSize == size) {
            try {
                expandCapacity();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void expandCapacity() throws Exception {
        size *= 2;
        arr = Arrays.copyOf(arr, size);
    }

    public static void main(String[] args) {
        try {
            IntArray array = new IntArray();
            array.add(1);
            array.add(2);
            array.add(3);
            System.out.println(array);
            array.add(1, 5);
            System.out.println(array);
            array.set(1, 100);
            System.out.println(array);
            array.delete(1);
            System.out.println(array);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "int_array_lab.IntArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntArray)) return false;

        IntArray intArray = (IntArray) o;

        return Arrays.equals(arr, intArray.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }
}












