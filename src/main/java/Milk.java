import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Milk implements Milky {
    @Override
    public double getPercentage() {
        return 2.5;
    }
}
