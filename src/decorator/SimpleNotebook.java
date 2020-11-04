package decorator;

public class SimpleNotebook implements Price {
    @Override
    public double getCost() {
        return 200;
    }

    @Override
    public String getCover() {
        return "Блокнот";
    }
}
