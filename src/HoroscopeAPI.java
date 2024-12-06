/* 
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class HoroscopeAPI {
    public void fetchHoroscope(String sign, String type, Horoscope horoscope) {

        try {
            // the api params required the sign and type to be lowercase, so this is where it is converted to ensure the api receives it how it wants or itll break 

            String lowerCaseSign = sign.toLowerCase();

            HttpClient client = HttpClient.newHttpClient();

            // this is where i actually built out the link to POST to the API
            HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://aztro.sameerkumar.website/?sign=" + lowerCaseSign + "&day=" + type))
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // this is where the JSON is actually parsed and the message is retrieved from the response

            JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();

            String message = jsonResponse.has("description") 
                ? jsonResponse.get("description").getAsString() 
                : "No horoscope available";

            horoscope.setMessage(message);
        // i added a try catch to catch any exceptions that may occur so i could print them out to the console to see what was going wrong
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/
