package com.deo.javalearning.JUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class MockTest {
    @Mock
    private Map<Integer, String> map;

    @Test
    public void testMockMapPutDefaultBehavior() {
        //when
        map.put(1, "test");

        //then
        assertThat(map.get(1), is(nullValue()));
    }

    @Test
    public void testMockMapKeySetDefaultBehavior() {
        //when
        map.put(1, "test");

        //then
        assertThat(map.keySet(), is(empty()));
    }

    @Test
    public void testMockMapValuesWithDefinedBehavior() {
        Collection<String> stub = Arrays.asList("test1", "test2", "test3");
        when(map.values()).thenReturn(stub);

        //when
        map.put(1, "test");

        //then
        assertThat(map.values(), is(stub));
    }
}
