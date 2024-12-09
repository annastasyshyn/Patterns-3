package ua.edu.ucu.apps.facade;

import org.json.JSONObject;
import java.io.IOException;
import okhttp3.*;

public class BrandfetchAPI {
    private final String apiKey;

    public BrandfetchAPI(String apiKey) {
        this.apiKey = apiKey;
    }

    public JSONObject getCompanyData(String website) throws IOException {
        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
            .scheme("https")
            .host("api.brandfetch.io")
            .addPathSegment("v2")
            .addPathSegment("brands")
            .addQueryParameter("domain", website)
            .build();

        Request request = new Request.Builder()
            .url(url)
            .get()
            .addHeader("Authorization", "Bearer " + apiKey)
            .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected response code: " + response);
            }
            String responseBody = response.body().string();
            return new JSONObject(responseBody);
        }
    }
}