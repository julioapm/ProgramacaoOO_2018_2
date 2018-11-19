import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.SimpleIntegerProperty;

public class AdditionModel {
    private IntegerProperty x;
    private IntegerProperty y;
    private ReadOnlyIntegerWrapper sum;

    public AdditionModel() {
        x = new SimpleIntegerProperty();
        y = new SimpleIntegerProperty();
        sum = new ReadOnlyIntegerWrapper();
        sum.bind(x.add(y));
    }

    public IntegerProperty xProperty() {
        return x;
    }

    public int getX() {
        return x.get();
    }

    public void setX(int x) {
        this.x.set(x);
    }

    public IntegerProperty yProperty() {
        return y;
    }

    public int getY() {
        return y.get();
    }

    public void setY(int y) {

        this.y.set(y);
    }

    public ReadOnlyIntegerProperty sumProperty() {
        return sum.getReadOnlyProperty();
    }

    public int getSum() {

        return sum.get();
    }
}
