package ua.edu.ucu.apps.facade;

import org.json.JSONObject;
import java.io.IOException;

public class CompanyInfoFacade {
    private final PDLReader pdlReader;
    private final WebScraper webScraper;
    private final BrandfetchAPI brandfetchAPI;

    public CompanyInfoFacade() {
        this(new PDLReader(), new WebScraper(), new BrandfetchAPI("your_brandfetch_api_key_here"));
    }

    public CompanyInfoFacade(PDLReader pdlReader, WebScraper webScraper, BrandfetchAPI brandfetchAPI) {
        this.pdlReader = pdlReader;
        this.webScraper = webScraper;
        this.brandfetchAPI = brandfetchAPI;
    }

    public CompanyInfo getCompanyInfo(String website) throws IOException {

        JSONObject pdlData = pdlReader.getCompanyData(website);

        JSONObject webData = webScraper.scrapeCompanyData(website);

        JSONObject brandfetchData = brandfetchAPI.getCompanyData(website);

        CompanyInfo companyInfo = new CompanyInfo(pdlData, webData, brandfetchData);

        return companyInfo;
    }
}