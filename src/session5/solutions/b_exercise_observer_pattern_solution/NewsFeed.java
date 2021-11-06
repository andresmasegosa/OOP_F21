package session5.solutions.b_exercise_observer_pattern_solution;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed {
    private List<Subscriber> subscribers = new ArrayList();

    public void addSubscriber(Subscriber customer) {
        subscribers.add(customer);
    }

    public void removeSubscriber(Subscriber customer) {
        subscribers.remove(customer);
    }

    public void notifySubscribers(String news) {
        for(Subscriber subscriber: subscribers) {
            subscriber.update(news);
        }
    }
}