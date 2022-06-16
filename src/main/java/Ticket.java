import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "origin",
        "origin_name",
        "destination",
        "destination_name",
        "departure_date",
        "departure_time",
        "arrival_date",
        "arrival_time",
        "carrier",
        "stops",
        "price"
})
@Generated("jsonschema2pojo")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ticket {

    @JsonProperty("origin")
    private String origin;
    @JsonProperty("origin_name")
    private String originName;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("destination_name")
    private String destinationName;
    @JsonProperty("departure_date")
    private String departureDate;
    @JsonProperty("departure_time")
    private String departureTime;
    @JsonProperty("arrival_date")
    private String arrivalDate;
    @JsonProperty("arrival_time")
    private String arrivalTime;
    @JsonProperty("carrier")
    private String carrier;
    @JsonProperty("stops")
    private Integer stops;
    @JsonProperty("price")
    private Integer price;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ticket.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("origin");
        sb.append('=');
        sb.append(((this.origin == null)?"<null>":this.origin));
        sb.append(',');
        sb.append("originName");
        sb.append('=');
        sb.append(((this.originName == null)?"<null>":this.originName));
        sb.append(',');
        sb.append("destination");
        sb.append('=');
        sb.append(((this.destination == null)?"<null>":this.destination));
        sb.append(',');
        sb.append("destinationName");
        sb.append('=');
        sb.append(((this.destinationName == null)?"<null>":this.destinationName));
        sb.append(',');
        sb.append("departureDate");
        sb.append('=');
        sb.append(((this.departureDate == null)?"<null>":this.departureDate));
        sb.append(',');
        sb.append("departureTime");
        sb.append('=');
        sb.append(((this.departureTime == null)?"<null>":this.departureTime));
        sb.append(',');
        sb.append("arrivalDate");
        sb.append('=');
        sb.append(((this.arrivalDate == null)?"<null>":this.arrivalDate));
        sb.append(',');
        sb.append("arrivalTime");
        sb.append('=');
        sb.append(((this.arrivalTime == null)?"<null>":this.arrivalTime));
        sb.append(',');
        sb.append("carrier");
        sb.append('=');
        sb.append(((this.carrier == null)?"<null>":this.carrier));
        sb.append(',');
        sb.append("stops");
        sb.append('=');
        sb.append(((this.stops == null)?"<null>":this.stops));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }


}