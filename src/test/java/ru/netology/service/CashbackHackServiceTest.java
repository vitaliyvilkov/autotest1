package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void test1() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void test2() {
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void test3() {
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void test4() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void test5() {
        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void test6() {
        int actual = service.remain(450);
        int expected = 550;
        assertEquals(actual, expected);
    }
}