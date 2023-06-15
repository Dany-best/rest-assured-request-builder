import io.restassured.specification.RequestSpecification;
import org.springframework.http.HttpMethod;

public class RequestBuilder {
    private final RequestSpecification requestSpecification;
    private final String endpoint;

    public RequestBuilder(RequestSpecification requestSpecification, String endpoint) {
        this.requestSpecification = requestSpecification;
        this.endpoint = endpoint;
    }

    public RequestBuilder withPathParam(String name, String value) {
        // Add path parameter to the request
        // RestAssured supports something like: requestSpecification.pathParam(name, value);
        return this;
    }

    public RequestBuilder withQueryParam(String name, String value) {
        // Add query parameter to the request
        // RestAssured supports something like: requestSpecification.queryParam(name, value);
        return this;
    }

    public RequestBuilder withBody(Object body) {
        // Add request body
        // RestAssured supports something like: requestSpecification.body(body);
        return this;
    }

    public RequestBuilder withHeader(String name, String value) {
        // Add header to the request
        requestSpecification.header(name, value);
        return this;
    }

    public Response sendRequest(HttpMethod method) {
        // Send the request using Rest Assured
        // RestAssured supports methods like: requestSpecification.get(), requestSpecification.post(), etc.
        return new Response(requestSpecification.request(method.name(), endpoint));
    }
}
