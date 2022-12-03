package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackerServiceTest {

    @Test
    public void remain() {
        CashBackHackerService service = new CashBackHackerService();
        int actual = 900;
        int expected = service.remain(100);

        assertEquals(actual, expected);
    }
    @Test
    public void test1000() {
        CashBackHackerService service = new CashBackHackerService();
        int actual = 1000;
        int expected = service.remain(0);

        assertEquals(actual, expected);
    }
    @Test
    public void testOne() {
        CashBackHackerService service = new CashBackHackerService();
        int actual = 1;
        int expected = service.remain(999);

        assertEquals(actual, expected);
    }
    @Test
    public void testOneThousand() {
        CashBackHackerService service = new CashBackHackerService();
        int actual = 1000;
        int expected = service.remain(0);

        assertEquals(actual, expected);
    }
    @Test
    public void testZero() {
        CashBackHackerService service = new CashBackHackerService();
        int actual = 0;
        int expected = service.remain(0);

        assertEquals(actual, expected);
    }
}