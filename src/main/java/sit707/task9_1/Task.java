package sit707.task9_1;

public class Task {
    private String taskName;
    private String status;

    public Task(String taskName, String status) {
        this.taskName = taskName;
        this.status = status;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getStatus() {
        return status;
    }
}
