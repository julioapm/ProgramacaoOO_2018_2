public class AdditionController {
    private AdditionModel model;

    public AdditionController(AdditionModel model) {
        this.model = model;
    }

    public void upadteX(String x) {
        model.setX(convertStringToInt(x));
    }

    public void upadteY(String y) {
        model.setY(convertStringToInt(y));
    }

    public int getSum() {
        return model.getSum();
    }

    private int convertStringToInt(String s) {
        if (s == null || s.isEmpty()) {
            return 0 ;
        }
        if ("-".equals(s)) {
            return 0 ;
        }
        return Integer.parseInt(s);
    }
}
