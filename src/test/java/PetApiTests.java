import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PetApiTests {

  @BeforeAll
  public static void setup() {
    RestAssured.baseURI = "https://petstore.swagger.io/v2";
  }

  @Test
  public void createPet() {
    String petJson = "{ \"id\": 12345, \"name\": \"doggie\", \"status\": \"available\" }";

    given()
        .contentType(ContentType.JSON)
        .body(petJson)
        .when()
        .post("/pet")
        .then()
        .statusCode(200)
        .body("name", equalTo("doggie"))
        .body("status", equalTo("available"));
  }

  @Test
  public void getPetFindByStatus() {
    given()
        .param("status", "available")
        .when()
        .get("/pet/findByStatus")
        .then()
        .statusCode(200)
        .body("[0].status", equalTo("available"));
  }

  @Test
  public void updatePet() {
    String updatedPetJson = "{ \"id\": 12345, \"name\": \"FluffyUpdated\", \"status\": \"sold\" }";

    given()
        .contentType(ContentType.JSON)
        .body(updatedPetJson)
        .when()
        .put("/pet")
        .then()
        .statusCode(200)
        .body("name", equalTo("FluffyUpdated"))
        .body("status", equalTo("sold"));
  }

  @Test
  public void deletePet() {
    given()
        .when()
        .delete("/pet/12345")
        .then()
        .statusCode(200);
  }

  @Test
  public void createPetNegativeScenario() {
    String invalidPetJson = "{ \"id\": \"abc\", \"name\": \"InvalidPet\", \"status\": \"available\" }";

    given()
        .contentType(ContentType.JSON)
        .body(invalidPetJson)
        .when()
        .post("/pet")
        .then()
        .statusCode(500);
  }
}
