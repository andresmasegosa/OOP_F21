package session5.solutions.b_exercise_observer_pattern_solution;

public class AppSubscriber implements Subscriber{

    long phoneID;

    public AppSubscriber(long phoneID) {
        this.phoneID = phoneID;
    }

    @Override
    public void update(String news) {
        System.out.println("Pushing Notitification to phone ID "+phoneID+" with news: "+news);
    }
}
