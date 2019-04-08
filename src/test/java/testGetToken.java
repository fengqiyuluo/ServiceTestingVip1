import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class testGetToken {

    @Test
    void testToken(){
        Wework wework = new Wework();
        String token = wework.getToken();
        assertThat(token, not(equalTo(null)));
    }
}
