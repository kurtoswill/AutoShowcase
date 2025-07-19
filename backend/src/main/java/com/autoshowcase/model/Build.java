import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "builds")
@Data
public class Build {
    @Id
    private String id;
    private String userId;
    private String brand;
    private String model;
    private int year;
    private String engineType;
    private String wheelSize;
    private String suspension;
    private String exterior;
    private String interior;
    private String transimission;
    private String exhaust;
    private String breaks;
    private String others;
}