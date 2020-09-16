import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MilkCoffee {
    private Coffee coffee;
    private Milky milky;

    @Override
    public String toString() {
        return coffee + " + " + milky.getClass().toString().split("\\.")[0];
    }

}
