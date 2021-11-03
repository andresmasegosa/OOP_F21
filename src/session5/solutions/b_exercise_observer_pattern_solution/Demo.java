package session5.solutions.b_exercise_observer_pattern_solution;

public class Demo {

    public static void main(String[] args) {
        NewsFeed feed = new NewsFeed();
        Subscriber emailSubscriber = new EmailSubscriber("arma@cs.aau.dk");
        feed.addSubscriber(emailSubscriber);

        Subscriber appSubscriber = new AppSubscriber(123456);
        feed.addSubscriber(appSubscriber);

        feed.notifySubscribers("The observer pattern is great!");

    }
}
