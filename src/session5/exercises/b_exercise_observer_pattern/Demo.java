package session5.exercises.b_exercise_observer_pattern;


public class Demo {

    public static void main(String[] args) {
        NewsFeed feed = new NewsFeed();
        feed.addEmailSubscriber("arma@cs.aau.dk");
        feed.addAppSubscriber(123456);

        feed.notifySubscribers("The observer pattern is great!");

    }
}
