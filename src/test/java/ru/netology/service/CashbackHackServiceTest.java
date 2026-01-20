package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain_900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals("Для суммы 900 остаток должен быть 100", expected, actual);
    }



    @Test
    public void testRemain_1500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1500);
        int expected = 500;
        Assert.assertEquals("Для суммы 1500 остаток должен быть 500", expected, actual);
    }

    @Test
    public void testRemain_0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        Assert.assertEquals("Для суммы 0 остаток должен быть 1000", expected, actual);
    }
}
