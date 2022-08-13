package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(10000);
        int expected = 1000;
       assertEquals(actual,expected);
    }
}