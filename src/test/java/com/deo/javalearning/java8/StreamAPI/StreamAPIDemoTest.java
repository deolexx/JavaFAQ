package com.deo.javalearning.java8.StreamAPI;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamAPIDemoTest {
    List<User> users = new ArrayList<>();
    User bob, rob, sam, dan, uri, zik;

    @BeforeEach
    void setUp() {

        bob = new User("Bob", 17, "bob@gmail.com");
        users.add(bob);
        rob = new User("Rob", 19, "rob@mail.ru");
        users.add(rob);
        sam = new User("Sam", 14, "sam@gmail.com");
        users.add(sam);
        dan = new User("Dan", 18, "dan@com");
        users.add(dan);
        uri = new User("Uri", 12, "ura@gmail.com");
        users.add(uri);
        zik = new User("Zik", 39, "zik@com");
        users.add(zik);
    }


    @Test
    void collectToMap() {
        Map<String, User> userMap = users.stream().collect(Collectors.toMap(user -> user.getName(), user -> user));
        assertEquals(bob, userMap.get("Bob"));
        assertEquals(rob, userMap.get("Rob"));
        assertEquals(sam, userMap.get("Sam"));
        assertEquals(dan, userMap.get("Dan"));
        assertEquals(uri, userMap.get("Uri"));
        assertEquals(zik, userMap.get("Zik"));
    }

    @Test
    void collectToMap2() {
        Map<String, User> userMap = users.stream().collect(Collectors.toMap(User::getName, Function.identity()));
        assertEquals(bob, userMap.get("Bob"));
        assertEquals(rob, userMap.get("Rob"));
        assertEquals(sam, userMap.get("Sam"));
        assertEquals(dan, userMap.get("Dan"));
        assertEquals(uri, userMap.get("Uri"));
        assertEquals(zik, userMap.get("Zik"));
    }

    @Test
    void groupingBy() {
        Map<String, List<User>> userMap = users.stream().collect(Collectors.groupingBy(User::getName));
        assertEquals(1, userMap.get("Bob").size());
        assertEquals(bob, userMap.get("Bob").get(0));
        assertEquals(rob, userMap.get("Rob").get(0));
        assertEquals(sam, userMap.get("Sam").get(0));
        assertEquals(dan, userMap.get("Dan").get(0));
        assertEquals(uri, userMap.get("Uri").get(0));
        assertEquals(zik, userMap.get("Zik").get(0));
    }

    @Test
    void peekWithFilter() {
        Map<String, User> userMap = users.stream().peek(user -> user.setAge(user.getAge() * 2)).filter(user -> user.getAge() > 18).collect(Collectors.toMap(User::getName, Function.identity()));
        assertEquals(34, userMap.get("Bob").getAge());
        assertEquals(38, userMap.get("Rob").getAge());
        assertEquals(28, userMap.get("Sam").getAge());
        assertEquals(36, userMap.get("Dan").getAge());
        assertEquals(24, userMap.get("Uri").getAge());
        assertEquals(78, userMap.get("Zik").getAge());
    }

    @Test
    void map() {
        Map<String, User> userMap = users.stream().map(user -> {
            user.setAge(user.getAge() + 5);
            return user;
        }).collect(Collectors.toMap(User::getName, Function.identity()));
        assertEquals(22, userMap.get("Bob").getAge());
        assertEquals(24, userMap.get("Rob").getAge());
        assertEquals(19, userMap.get("Sam").getAge());
        assertEquals(23, userMap.get("Dan").getAge());
        assertEquals(17, userMap.get("Uri").getAge());
        assertEquals(44, userMap.get("Zik").getAge());
    }


}