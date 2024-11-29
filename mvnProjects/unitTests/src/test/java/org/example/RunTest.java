package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

    class RunTest {

        @BeforeAll
        static void initClass(){
            System.out.println("---> run before test class");
        }
        @AfterAll
        static void closeClass() {
            System.out.println("---> run after test class");
        }

        @BeforeEach
        void initTest(){
            System.out.println("------> run before test case");
        }
        @AfterEach
        void closeTest() {
            System.out.println("------> run after test case");
        }

        @Test
        void firstTest(){
            System.out.println("----> first test");
        }@Test
        void secondTest(){
            System.out.println("-----> second test");
        }

}