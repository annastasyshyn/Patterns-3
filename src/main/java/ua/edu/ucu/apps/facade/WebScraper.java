package ua.edu.ucu.apps.facade;

import org.json.JSONObject;
import java.io.IOException;
import okhttp3.*;

public class WebScraper {
    private static final String OPENAI_API_KEY = "your_openai_api_key_here";
    private static final String OPENAI_API_URL = "https://api.openai.com/v1/completions";
    private static final String MODEL_NAME = "text-davinci-003";

    public JSONObject scrapeCompanyData(String website) throws IOException {
        String scrapedData = scrapeWebsite(website);
        String parsedData = queryChatGPT(scrapedData);
        return new JSONObject(parsedData);
    }

    private String scrapeWebsite(String website) {
        return "Scraped data from " + website;
    }

    private String queryChatGPT(String text) throws IOException {
        OkHttpClient client = new OkHttpClient();

        JSONObject requestBodyJson = new JSONObject()
            .put("model", MODEL_NAME)
            .put("prompt", "Extract company information from the following text:\n" + text)
            .put("max_tokens", 500);

        RequestBody body = RequestBody.create(
            MediaType.parse("application/json; charset=utf-8"),
            requestBodyJson.toString()
        );

        Request request = new Request.Builder()
            .url(OPENAI_API_URL)
            .post(body)
            .addHeader("Authorization", "Bearer " + OPENAI_API_KEY)
            .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected response code: " + response);
            }
            String responseBody = response.body().string();
            JSONObject responseJson = new JSONObject(responseBody);

            return responseJson
                .getJSONArray("choices")
                .getJSONObject(0)
                .getString("text")
                .trim();
        }
    }
}