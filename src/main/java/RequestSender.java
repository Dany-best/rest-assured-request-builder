import org.springframework.http.HttpMethod;

public class RequestSender {
    public Response sendGetRequest(RequestBuilder requestBuilder) {
        return requestBuilder.sendRequest(HttpMethod.GET);
    }

    // Implement methods for other HTTP methods like POST, PUT, DELETE, etc.
}