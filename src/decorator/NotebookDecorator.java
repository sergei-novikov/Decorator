package decorator;

public abstract class NotebookDecorator implements Price{
    private Price price;

    public NotebookDecorator(Price price){
        this.price = price;
    }

    @Override
    public double getCost(){
         return price.getCost();
    }

    @Override
    public String getCover(){
        return price.getCover();
    }

}
