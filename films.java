import java.util.Date;
public class films {
    private Date releasedate;
    private String producer;
    private String name;
    private String country;
    private String genre;
    private int agelimit;

    public Date getReleaseDate() {
        return releasedate;
    }

    public void setReleaseDate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAgeLimit() {
        return agelimit;
    }

    public void setAgeLimit(int agelimit) {
        this.agelimit = agelimit;
    }
}
