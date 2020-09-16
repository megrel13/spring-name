import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Cream implements Milky {
    @Override
    public double getPercentage() {
        return 3.5;
    }
}
