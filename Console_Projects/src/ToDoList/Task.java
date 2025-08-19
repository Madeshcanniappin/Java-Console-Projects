

public class Task {
    private String description;
    private boolean done;

    // Constructor for new task (defaults to not done)
    public Task(String description) {
        this.description = description;
        this.done = false;
    }

    // Constructor for loading from file
    public Task(String description, boolean done) {
        this.description = description;
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
