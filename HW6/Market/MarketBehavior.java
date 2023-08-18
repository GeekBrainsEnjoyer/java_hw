package HW6.Market;

import java.util.List;

public interface MarketBehavior {

    public void acceptToMarket(Actor actor);
    public void releaseFromMarket(List<Actor> actors);
    public void update();

}
