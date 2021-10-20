package dev.rhenergy.config.customer;

import io.quarkus.test.junit.QuarkusTest;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class HealthCheckTest {

    @Test
    public void getHealth() {
        given()
                .when().get("/q/health")
                .then()
                .statusCode(200)
                .body("status", Matchers.equalTo("UP"));
    }

    @Test
    public void getDatasourceHealth() {
        given()
                .when().get("/q/health/ready")
                .then()
                .statusCode(200)
                .body("status", Matchers.equalTo("UP"));
    }

}
