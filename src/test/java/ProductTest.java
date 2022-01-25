import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ProductTest {

    @Test
    void productNameTest() {
        Product product = new Product(0, "Call Of Duty Modern Warfare", 19.27, false);

        assertThat(product.getName(), equalTo("Call Of Duty Modern Warfare"));
    }
}
