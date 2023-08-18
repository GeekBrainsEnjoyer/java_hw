package HW6.Market;

public interface QueueBehavoir {

    public void TakeInQueue(Actor actor);
    public void takeOrder();
    public void giveOrder();
    public void releaseFromQueue();
    

}