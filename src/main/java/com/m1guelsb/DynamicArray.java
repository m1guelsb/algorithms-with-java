package com.m1guelsb;

public class DynamicArray {
  int size;
  int capacity;
  Object[] array;

  public DynamicArray() {
    this.array = new Object[capacity];
  }

  public DynamicArray(int capacity) {
    this.capacity = capacity;
    this.array = new Object[capacity];
  }

  public void add(Object element) {
    if (size >= capacity) {
      grow();
    }
    array[size] = element;
    size++;
  }

  public void insert(int index, Object element) {
    if (size >= capacity) {
      grow();
    }
    for (int i = size; i > index; i--) {
      array[i] = array[i - 1];
    }
    array[index] = element;
    size++;
  }

  public void delete(Object element) {
    for (int i = 0; i < size; i++) {
      if (array[i] == element) {
        for (int j = i; j < (size - i - 1); j++) {
          array[i + j] = array[i + j + 1];
        }
        array[size - 1] = null;
        size--;

        if (size <= (int) (capacity / 3)) {
          shrink();
        }
        break;
      }
    }
  }

  public int indexOf(Object element) {
    for (int i = 0; i < size; i++) {
      if (array[i] == element) {
        return i;
      }
    }

    return -1;
  }

  private void grow() {
    int newCapacity = (int) (capacity * 2);

    Object[] newArray = new Object[newCapacity];

    for (int i = 0; i < size; i++) {
      newArray[i] = array[i];
    }
    capacity = newCapacity;
    array = newArray;
  }

  private void shrink() {
    int newCapacity = (int) (capacity / 2);

    Object[] newArray = new Object[newCapacity];

    for (int i = 0; i < size; i++) {
      newArray[i] = array[i];
    }
    capacity = newCapacity;
    array = newArray;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public String toString() {
    String string = "";

    for (int i = 0; i < size; i++) {
      string += array[i] + ", ";
    }

    if (string == "") {
      return string = "[]";
    }

    string = "[" + string.substring(0, string.length() - 2) + "]";

    return string;
  }

}
