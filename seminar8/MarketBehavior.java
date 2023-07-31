package seminar8;

import java.util.List;

public interface MarketBehavior {

    public void acceptToMarket(Actor actor);
    public void releaseFromMarket(List<Actor> actors);
    public void update();

}
