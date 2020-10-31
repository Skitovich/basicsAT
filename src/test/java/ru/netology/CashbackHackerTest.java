package ru.netology;

import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class CashbackHackerTest {

    @Test
    public void ShouldShowBuyUnderThousand () {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldShowZero() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowToMuchToBuyOver1000() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(1100);
        int expected = 900;
        assertEquals(expected, actual);
    }

}