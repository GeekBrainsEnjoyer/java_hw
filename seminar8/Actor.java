package seminar8;

public abstract class Actor implements ActorBehavoir{
    
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name, boolean isMakeOrder, boolean isTakeOrder){
        this.name = name;
        this.isMakeOrder = isMakeOrder;
        this.isTakeOrder = isTakeOrder;
    }

    public Actor(String name){
        this.name = name;
        this.isMakeOrder = true;
        this.isTakeOrder = false;
    }

}
