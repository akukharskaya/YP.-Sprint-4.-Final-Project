import org.junit.Test;
import pages.OrderPage;


    public class OrderPageTest extends BaseTest {
    //private final String expected;


    @Test
    public void testOrder() {
        OrderPage page = new OrderPage(driver);
        page.clickOrderButtonHeader();
        page.setInputName("Аня");

        //Assert.assertEquals(expected, answer);
    }

}
