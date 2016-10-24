package maps.indonesia.model;

/**
 * Created by yusuf on 24/10/16.
 */
public class District {
    private Integer id;
    private Integer regency_id;
    private String name;
    private String alt_name;
    private String latitude;
    private String longitude;

    public Integer getId() { return id; }

    public Integer getRegencyId() { return regency_id; }

    public String getName() { return name; }

    public String getAltName() { return alt_name; }

    public String getLatitude() { return latitude; }

    public String getLongitude() { return longitude; }

    public String toString() {
        return "{id: " + getId().toString() +
                ", regency_id: " + getRegencyId() +
                ", name: " + getName() +
                ", alt_name: " + getAltName() +
                ", latitude: " + getLatitude() +
                ", longitute: " + getLongitude() +
                "}";
    }
}