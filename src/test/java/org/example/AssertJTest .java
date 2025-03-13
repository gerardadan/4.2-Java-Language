package org.example;

import org.exercice1.ArrayErrors;
import org.exercice1.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static java.util.Map.entry;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AssertJTest {

    @Test
    @DisplayName("Exercice 1")
    void testObjetEquals() throws CloneNotSupportedException {
        Book book1 = new Book(11, "Harry Potter 1");
        Book book2 = (Book) book1.clone();
        Book book3 = new Book(22, "Harry Potter 2");

        assertThat(book1).isEqualTo(book2);
        assertThat(book2).isNotEqualTo(book3);
    }

    @Test
    @DisplayName("Exercice 2")
    void testObjetReferenceEquals() throws CloneNotSupportedException {
        Book book1 = new Book(11, "Harry Potter 1");
        Book book2 = book1;
        Book book3 = new Book(33, "Harry Potter 3");

        assertThat(book1).isSameAs(book2);
        assertThat(book2).isNotSameAs(book3);
    }

    @Test
    @DisplayName("Exercice 3")
    void testArrayValueEquals() {
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {1, 2, 3};

        assertThat(numbers1).containsExactly(numbers2);
    }

    @Test
    @DisplayName("Exercice 4A")
    void testObjectArrayListOrder() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        List<Object> list1 = new ArrayList<>();
        list1.add(obj1);
        list1.add(obj2);
        list1.add(obj3);

        assertThat(list1).containsExactlyInAnyOrder(obj1, obj2, obj3);
    }

    @Test
    @DisplayName("Exercice 4B")
    void testObjectArrayListWhitoutOrder() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        List<Object> list1 = new ArrayList<>();
        list1.add(obj1);
        list1.add(obj2);
        list1.add(obj3);

        assertThat(list1).containsExactly(obj1, obj3, obj2);
    }

    @Test
    @DisplayName("Exercice 4C")
    void testObjectArrayListWhitoutDuplicates() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        List<Object> list1 = new ArrayList<>();
        list1.add(obj1);
        list1.add(obj2);
        list1.add(obj2);
        list1.add(obj3);

        assertThat(list1).containsOnlyOnce(obj2);
    }

    @Test
    @DisplayName("Exercice 5")
    void testCheckMapKeys() {
        Map.Entry<Integer, String> entry1 = new AbstractMap.SimpleEntry<>(1, "one");
        Map.Entry<Integer, String> entry2 = new AbstractMap.SimpleEntry<>(2, "two");
        Map<Integer, String> map = new HashMap<>();
        map.put(entry1.getKey(), entry1.getValue());

        assertThat(map).containsKey(entry1.getKey());
    }

    @Test
    @DisplayName("Exercice 6")
    public void testArrayIndexOutOfBoundsException() {

    }

    @Test
    @DisplayName("Exercice 7")
    public void testObjectOptionalEmpty() {
        Optional<String> optional = Optional.empty();
        assertThat(optional).isEmpty();
    }
}
