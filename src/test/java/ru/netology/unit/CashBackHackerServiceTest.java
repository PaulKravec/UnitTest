package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerServiceTest {

    @Test
    public void testRemain() {
        CashBackHackerService service = new CashBackHackerService();
        int actual = 500;
        int expected = service.remain(500);

        assertEquals(actual, expected);
    }
    @Test
    public void testOverThousand() {
        CashBackHackerService service = new CashBackHackerService();
        int actual = 1200;
        int expected = service.remain(0);

        assertEquals(actual, expected);
    }
    @Test
    public void testNearZero() {
        CashBackHackerService service = new CashBackHackerService();
        int actual = 1;
        int expected = service.remain(999);

        assertEquals(actual, expected);
    }
}