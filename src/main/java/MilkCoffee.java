import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class MilkCoffee {
    private Milky milky;

    public MilkCoffee(Milky milky) {
        this.milky = milky;
    }

    public MilkCoffee() {
        System.out.println("MilkCoffee empty constructor");
    }

    public void setMilky (Milky milky) {
        System.out.println("Setter");
        this.milky = milky;
    }
}
