package sit707.task9_1;

import java.util.*;

public class TaskInbox {
    private Map<String, List<Task>> inboxMap = new HashMap<>();

    public void addTask(String studentId, Task task) {
        inboxMap.computeIfAbsent(studentId, k -> new ArrayList<>()).add(task);
    }

    public List<Task> getTasksByStudentId(String studentId) {
        return inboxMap.getOrDefault(studentId, Collections.emptyList());
    }
}
