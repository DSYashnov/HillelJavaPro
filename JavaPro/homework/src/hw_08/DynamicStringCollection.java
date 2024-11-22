package hw_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicStringCollection implements Collection {
    private String[] elements;
    private int size;

    public DynamicStringCollection() {
        elements = new String[10]; // Початковий розмір масиву
        size = 0;
    }


    public boolean add(String o) {
        ensureCapacity();
        elements[size++] = o;
        return true;
    }


    public boolean add(int index, String o) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = o;
        size++;
        return true;
    }

    public boolean delete(String o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                elements[--size] = null;
                return true;
            }
        }
        return false;
    }


    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return elements[index];
    }


    public boolean contain(String o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }


    public boolean equals(Collection collection) {
        if (collection == null || size != collection.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!elements[i].equals(collection.get(i))) {
                return false;
            }
        }
        return true;
    }


    public boolean clear() {
        Arrays.fill(elements, 0, size, null);
        size = 0;
        return true;
    }


    public int size() {
        return size;
    }

    // Забезпечення додаткового місця в масиві
    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }
}
