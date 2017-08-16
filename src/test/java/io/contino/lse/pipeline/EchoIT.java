package io.contino.lse.pipeline;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class EchoIT {

    @Test
    public void firstEchoTest() {
        port = 8181;
        get("/echo/hello").then().assertThat().body("message", equalTo("hello"));
    }
}