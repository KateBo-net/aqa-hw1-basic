package ru.netology.service;

import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceJupiterTest {
    @org.junit.jupiter.api.Test
    public void shouldCalculateAmountLessBoundaryJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateAmountEqualBoundaryJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateAmountMoreBoundaryJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        Assertions.assertEquals(expected, actual);
    }
}
