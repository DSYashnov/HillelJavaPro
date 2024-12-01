package org.example;

import org.example.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("User validator test")
class UserValidatorTest {

    private User user;

    @BeforeAll
    public static void beforeAll () {
        System.out.println("---> before all method");
    }
    @AfterAll
    public static void afterAll () {
        System.out.println("---> after all method");
    }
    @BeforeEach
    public void beforeEach () {
        user = new User()
                .setName("Stanislav")
                .setAge(30)
                .setEmail("email@test.com")
                .setPhone("+38063....");
        System.out.println("---->> before each method");
    }
    @AfterEach
    public void afterAEach(){
        System.out.println("--->> after each method");
    }

    @DisplayName("correct behaviour")
    @RepeatedTest(10)
    void validate_noException() {
        assertDoesNotThrow(() -> {
            new UserValidator().validate(user);
        });

    }

    @DisplayName("age exception")
    @RepeatedTest(10)
    void validate_AgeException() {
        user.setAge(10);
        assertThrows(AgeException.class, () ->{
            new UserValidator().validate(user);
        });

    }
    @DisplayName("email exception")
    @RepeatedTest(10)
    void validate_EmailException() {
        user.setEmail("10");
        assertThrows(EmailException.class, () ->{
            new UserValidator().validate(user);
        });

    }
    @DisplayName("email exception")
    @RepeatedTest(10)
    void validate_PhoneException() {
        user.setPhone("123123");
        assertThrows(PhoneException.class, () ->{
            new UserValidator().validate(user);
        });

    }

    @Test
    void validate() {
    }

    @Test
    void valid() {
        assertDoesNotThrow(() -> {
            new UserValidator().validate(user);
        });
    }
    @ParameterizedTest
    @MethodSource("generator")
    void exceptionValidation (User user) {
        assertThrows(RuntimeException.class, () -> {
            new UserValidator().validate(user);
        });
    }
    private static Stream<User> generator () {
        return Stream.of (
                new User().setName("Stanislav").setAge(10).setEmail("email@test.com").setPhone("+38063...."),
                new User().setName("Stanislav").setAge(10).setEmail("email@test.com").setPhone("+38063...."),
                new User().setName("Stanislav").setAge(10).setEmail("email@test.com").setPhone("+38063....")
        );
    }
}