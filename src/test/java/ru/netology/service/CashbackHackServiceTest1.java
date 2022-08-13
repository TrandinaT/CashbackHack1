package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest1 {

    @Test
    public void remain() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain(200);
        int expected = 800;
        Assert.assertEquals(actual,expected);

    }
}