package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceJUnit4Test {

    @Test
    public void testRemainLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(100, service.remain(900));
    }

    @Test
    public void testRemainExactly1000() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void testRemainMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(900, service.remain(1100));
    }
}
