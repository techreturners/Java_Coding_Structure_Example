import org.example.Example001;
import org.example.Nintendo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example001Test {

    @Test
    public void checkFavouriteFood() {
        Example001 ex001 = new Example001();

        Nintendo n1 = new Nintendo("Mario", "Mario", "Lasagne", 75);
        Nintendo n2 = new Nintendo("Luigi", "Mario", "Spaghetti", 150);
        assertEquals(true, ex001.favouriteFoodIsSpaghetti(n2));
        assertEquals(false, ex001.favouriteFoodIsSpaghetti(n1));
    }

    @Test
    public void checkCanBuy1UP() {
        Example001 ex001 = new Example001();

        Nintendo n1 = new Nintendo("Mario", "Mario", "Lasagne", 75);
        Nintendo n2 = new Nintendo("Luigi", "Mario", "Spaghetti", 150);

        assertEquals(false, ex001.canBuy1UP(n1, 100));
        assertEquals(true, ex001.canBuy1UP(n2, 100));
    }
}