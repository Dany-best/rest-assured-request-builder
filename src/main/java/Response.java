public class Response {
    private io.restassured.response.Response response;

    public Response(io.restassured.response.Response response) {
        this.response = response;
    }

    public int getStatusCode() {
        return response.getStatusCode();
    }

    public String getBody() {
        return response.getBody().prettyPrint();
    }

    // Implement methods to extract and work with the response data
}