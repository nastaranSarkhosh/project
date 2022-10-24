public class Task {
    private String title;
    private String steps;
    private String priority;
    private int dateDue;
    private String note;
    private int createdDate;

    public Task(String title, String steps, String priority, int dateDue, String note, int createdDate) {
        this.title = title;
        this.steps = steps;
        this.priority = priority;
        this.dateDue = dateDue;
        this.note = note;
        this.createdDate = createdDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public int getDateDue() {
        return dateDue;
    }

    public void setDateDue(int dateDue) {
        this.dateDue = dateDue;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(int createdDate) {
        this.createdDate = createdDate;
    }
}
