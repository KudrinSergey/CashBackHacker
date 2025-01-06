package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(900), 100);
    }

    @Test
    public void testRemainExactly1000() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1000), 1000); // Это тест, который должен упасть
    }

    @Test
    public void testRemainMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1100), 900);
    }
}
