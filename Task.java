public class Task {
    private String title;
    private int steps;
    private String priority;
    private Date dateDue;
    private String note;
    private Date createdDate;
    public Task(String title, String priority, Date dateDue, String note, Date createdDate, int steps) {
        this.title = title;
        this.priority = priority;
        this.dateDue = dateDue;
        this.note = note;
        this.createdDate = createdDate;
        this.steps=steps;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    public Date getDateDue() {
        return dateDue;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setDateDue(Date dateDue) {
        this.dateDue = dateDue;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
