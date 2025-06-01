package lessons.les_24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BasicHttpClient {
    private static final String BASE_URL = "https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5";
//    private static final String BASE_URL = "http://127.0.0.1:4567/hello";
//    private static final String BASE_URL = "http://127.0.0.1:4567/students";
//    private static final String BASE_URL = "http://localhost:999/api/v1/students";

    public static void main(String[] args) throws IOException, InterruptedException {
        try{
            URL url = new URL(BASE_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            if (connection.getResponseCode() != 200) {
                throw new RuntimeException("Field : HTTP error code : " + connection.getResponseCode());
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String output;
            System.out.println("Output from Server ....\n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("---------------");

//
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://google-translete1.p.rapidapi.com/language/translate/v2"))
//                .header("content-type", "application/x-www-from-urlencoded")
//                .header("Accept-Encoding", "application/gzip")
//                .header("X-RapidAPI-Key", "SIGN-UP-FOR-KEY")
//                .header("X-RapidAPI-Host", "google-translate.p.rapidapi.com")
//                .method("POST", HttpRequest.BodyPublishers.ofString("q=Hello%2C%20world!&target=ua&source=en"))
//                .build();
//        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());

    }
}
