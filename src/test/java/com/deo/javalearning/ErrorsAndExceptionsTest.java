package com.deo.javalearning;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class ErrorsAndExceptionsTest {
    @Test
    void StackOverflowWithRecursionTest() {
        assertThrows(StackOverflowError.class, () -> {
            rec(1);
        });
    }

    private int rec(int n) {
        return rec(n + 1);
    }

    @Test
    void outOfMemoryWithCycle() {
        List<Object[]> arrays = new LinkedList<>();
        assertThrows(OutOfMemoryError.class, () -> {
            for (; ; ) {
                arrays.add(new Object[100]);
            }
        });
    }

}
