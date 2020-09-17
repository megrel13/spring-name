import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coffee {
    private String type;

    @Override
    public String toString() {
        return type;
    }
}