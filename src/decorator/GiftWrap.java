package decorator;

public class GiftWrap  extends NotebookDecorator{
    public GiftWrap(Price price) {
        super(price);
    }

    @Override
    public double getCost(){
        return super.getCost() + 200;
    }

    @Override
    public String getCover(){
        return super.getCover() + " +Подарочная упаковка";
    }
}
