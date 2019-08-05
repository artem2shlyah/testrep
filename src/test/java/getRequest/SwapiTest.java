package getRequest;
import Parameters.EndPoints;
import io.restassured.*;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SwapiTest {

    @Test(testName = "GetPlanetCount")
    public void SwapiGetPlanetCount() {
      int response = RestAssured.given().get(EndPoints.swapiURL+"/planets").
              then().contentType(ContentType.JSON).
              extract().path("count");
      Assert.assertEquals(61, response);
    }

    @Test(testName = "GetFirstPlanetURL")
    public void SwapiGetFirstPlanetURL() {
        ArrayList PlanetsURL = RestAssured.given().get(EndPoints.swapiURL+"/planets/").
                then().contentType(ContentType.JSON).
                extract().path("results.url");
        String firstPlanetURL = PlanetsURL.get(0).toString();
        RestAssured.given().get(firstPlanetURL).then().statusCode(200);
    }

    @Test(testName = "FilmTitles")
    public void FilmTitles() {
        ArrayList allFilms = RestAssured.given().get(EndPoints.swapiURL+"/films/").
                then().contentType(ContentType.JSON).
                extract().path("results.title");
        for (Object s : allFilms) {System.out.println(s);}
    }
}
