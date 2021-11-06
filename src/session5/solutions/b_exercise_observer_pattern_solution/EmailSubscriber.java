package session5.solutions.b_exercise_observer_pattern_solution;

public class EmailSubscriber implements Subscriber{
    String emailAddress;

    public EmailSubscriber(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(String news) {
        System.out.println("Sending email to "+emailAddress+" with news: "+news);
    }
}
