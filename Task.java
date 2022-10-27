import java.util.ArrayList;

public class Task {
    private String title;
    private ArrayList<Step> steps=new ArrayList<Step>();
    private String priority;
    private int dateDue;
    private String note;
    private int createdDate;

    public Task(String title, String priority, int dateDue, String note, int createdDate) {
        this.title = title;
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
