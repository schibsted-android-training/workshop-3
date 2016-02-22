package io.schibsted.workshop3;

/**
 * Created by roger.martinez on 22/2/16.
 */
public class Offer {
    private String title;
    private String companyName;
    private String city;

    public Offer(String title, String companyName, String city) {
        this.title = title;
        this.companyName = companyName;
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String offerTitle) {
        this.title = offerTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
