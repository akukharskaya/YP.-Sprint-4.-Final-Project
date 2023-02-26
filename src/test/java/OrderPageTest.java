import org.junit.Test;
import pages.OrderPage;


public class OrderPageTest extends BaseTest {

    @Test
    public void testOrder() {
        OrderPage page = new OrderPage(driver);
        page.clickOrderButtonHeader();
        page.setName("Аня");

        page.selectMetroStation("Каховская");
        //Assert.assertEquals(expected, answer);
    }

}
