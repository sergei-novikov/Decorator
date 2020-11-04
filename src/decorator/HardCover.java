package decorator;

public class HardCover extends NotebookDecorator {

    public HardCover(Price price) {
        super(price);
    }

    @Override
    public double getCost(){
        return super.getCost() + 100;
    }

    @Override
    public String getCover(){
        return super.getCover() + " +Твердый переплет";
    }
}
