import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationBuilder {
    private RequestSpecification requestSpecification;

    public RequestSpecificationBuilder(String baseUrl) {
        requestSpecification = RestAssured.given().baseUri(baseUrl);
        // Set common configurations like authentication, headers, etc.
    }

    public RequestBuilder createRequestBuilder(String endpoint) {
        return new RequestBuilder(requestSpecification, endpoint);
    }
}
