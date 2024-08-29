package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
public class CashbackHackServiceTest {


    CashbackHackService service = new CashbackHackService();

    @Test
    public void test1() {
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        int actual = service.remain(1);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test3() {
        int actual = service.remain(999);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test4() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test5() {
        int actual = service.remain(1001);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test6() {
        int actual = service.remain(450);
        int expected = 550;
        Assert.assertEquals(actual, expected);
    }
}