package sit707.task9_1;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TaskInboxTest {

    @Test
    public void testInboxReturnsTaskForStudent() {
        TaskInbox inbox = new TaskInbox();
        inbox.addTask("S101", new Task("Assignment 1", "Submitted"));

        List<Task> tasks = inbox.getTasksByStudentId("S101");

        assertEquals(2, tasks.size()); // Intentionally changed to Trigger CI
        assertEquals("Assignment 1", tasks.get(0).getTaskName());
        assertEquals("Submitted", tasks.get(0).getStatus());
    }

    @Test
    public void testInboxReturnsEmptyForUnknownStudent() {
        TaskInbox inbox = new TaskInbox();
        List<Task> tasks = inbox.getTasksByStudentId("S999");

        assertTrue(tasks.isEmpty());
    }
}
