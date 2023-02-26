import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pages.OrderPage;

import java.util.List;


@RunWith(Parameterized.class)
public class OrderPageTest extends BaseTest {
    private final String name;
    private final String surname;
    private final String address;
    private final String station;
    private final String phone;

    private final String date;
    private final String period;
    private final List<String> colors;
    private final String comments;

    public OrderPageTest(String name, String surname, String address, String station, String phone,
                         String date, String period, List<String> colors, String comments) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.station = station;
        this.phone = phone;
        this.date = date;
        this.period = period;
        this.colors = colors;
        this.comments = comments;
    }

    @Parameterized.Parameters
    public static Object[][] parameters(){
        return new Object[][]{
                {"Анна", "Анна", "Москва", "Каховская", "77777777777", "14.02.2023", "4 days", List.of("black", "gray"), "test comments"}
        };
    }


    @Test
    public void testOrderInHeader() {
        OrderPage page = new OrderPage(driver);
        page.clickOrderInHeader();
        page.setName(name);
        page.setSurname(surname);
        page.setAddress(address);
        page.setPhone(phone);
        page.selectMetroStation(station);
        page.clickNext();

        page.setDate(date);
        page.setComments(comments);
        //Assert.assertEquals(expected, answer);
    }


}
