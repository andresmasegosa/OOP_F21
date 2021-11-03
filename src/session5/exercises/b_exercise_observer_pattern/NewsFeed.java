package session5.exercises.b_exercise_observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed {

    private List<Integer> appSubscribers = new ArrayList();
    private List<String> emailSubscribers = new ArrayList();

    public void addAppSubscriber(int phoneId) {
        appSubscribers.add(phoneId);
    }

    public void addEmailSubscriber(String emailAddress) {
        emailSubscribers.add(emailAddress);
    }

    public void notifySubscribers(String news) {
        for(Integer phoneID: appSubscribers) {
            System.out.println("Pushing Notitification to phone ID "+phoneID+" with news: "+news);
        }

        for(String emailAddress: emailSubscribers) {
            System.out.println("Sending email to "+emailAddress+" with news: "+news);
        }

    }
}