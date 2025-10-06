package com.mytasks;

import java.time.LocalDateTime;

import com.mytasks.model.Priority;
import com.mytasks.model.Status;
import com.mytasks.model.Task;
import com.mytasks.service.TaskManager;

public class App {
    public static void main(String[] args) throws Exception {
        Task task = new Task(1, "Test", "Test task", LocalDateTime.now(), Status.PENDING, Priority.LOW);
        Task task1 = new Task(2, "Test", "Test task", LocalDateTime.now(), Status.PENDING, Priority.LOW);
        // System.out.println(task.toString());
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(task);
        taskManager.deleteTask(1);
        
    }
}

// 2007-12-03T10:15:30.


// taskmanager-app/
// │── src/
// │   └── main/
// │       └── java/
// │           └── com/
// │               └── mytasks/
// │                   ├── App.java
// │                   │
// │                   ├── model/
// │                   │   ├── Task.java
// │                   │   ├── Status.java
// │                   │   └── Priority.java
// │                   │
// │                   ├── service/
// │                   │   ├── TaskManager.java
// │                   │   ├── NotificationMgr.java
// │                   │   └── GoogleCalendarMgr.java
// │                   │
// │                   ├── util/
// │                   │   └── JsonUtil.java
// │                   │
// │                   ├── ui/
// │                   │   └── ConsoleUI.java
// │                   │
// │                   └── storage/
// │                       └── tasks.json   (this is a data file, not code)


