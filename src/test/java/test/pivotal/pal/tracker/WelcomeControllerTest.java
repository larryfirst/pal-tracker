package test.pivotal.pal.tracker;

import io.pivotal.pal.tracker.WelcomeController;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WelcomeControllerTest {

    @Test
    public void itSaysHello() {
        WelcomeController controller = new WelcomeController("A Welcome msg");

        assertThat(controller.sayHello()).isEqualTo("A Welcome msg");
    }
}
