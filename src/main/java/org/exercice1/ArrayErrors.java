package org.exercice1;

public class ArrayErrors {

    public static ArrayIndexOutOfBoundsException getIncorrectArrayIndex(int[] array) {
        try {
            int incorrectIndex = array[array.length + 1];
            return null;
        } catch (ArrayIndexOutOfBoundsException e) {
            return e;
        }
    }
}
