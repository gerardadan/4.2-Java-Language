package org.exercice1;

public class ArrayErrors {

    public static int getArrayIndexArrayIndexOutOfBoundsException(int[] array, int index)  throws ArrayIndexOutOfBoundsException{
        if(index >= array.length)
            throw new ArrayIndexOutOfBoundsException("Index out of range");

        return array[index];
    }

    public static int getArrayIndexException(int[] array, int index)  throws RuntimeException{
        if(index >= array.length)
            throw new RuntimeException("Index out of range");

        return array[index];
    }

}
