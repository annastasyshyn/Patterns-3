package ua.edu.ucu.apps.facade;

import org.json.JSONObject;

public class CompanyInfo {
    private final JSONObject pdlData;
    private final JSONObject webData;
    private final JSONObject brandfetchData;

    public CompanyInfo(JSONObject pdlData, JSONObject webData, JSONObject brandfetchData) {
        this.pdlData = pdlData;
        this.webData = webData;
        this.brandfetchData = brandfetchData;
    }

    public JSONObject getPdlData() {
        return pdlData;
    }

    public JSONObject getWebData() {
        return webData;
    }

    public JSONObject getBrandfetchData() {
        return brandfetchData;
    }

    @Override
    public String toString() {
        return "CompanyInfo{" +
                "pdlData=" + pdlData +
                ", webData=" + webData +
                ", brandfetchData=" + brandfetchData +
                '}';
    }
}