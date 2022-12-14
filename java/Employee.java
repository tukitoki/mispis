public abstract class Employee {

    private String name;
    private String email;
    private int jobTitle;
    private int counter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(int jobTitle) {
        this.jobTitle = jobTitle;
    }
}