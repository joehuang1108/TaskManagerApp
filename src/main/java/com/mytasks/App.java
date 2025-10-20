package com.mytasks;

import com.mytasks.service.TaskManager;
import com.mytasks.ui.ConsoleUI;

public class App {
    public static void main(String[] args) throws Exception {
        // Task task = new Task(1, "Test", "Test task", LocalDateTime.parse("2025-09-11T10:15"), Status.PENDING, Priority.LOW);
        // Task task1 = new Task(2, "Test", "Test task1", LocalDateTime.parse("2025-09-11T10:15"), Status.PENDING, Priority.LOW);
        // System.out.println(task.toString());
        // System.out.println(task1.toString());
        // TaskManager taskManager = new TaskManager();
        // taskManager.addTask(task);
        // taskManager.addTask(task1);
        // taskManager.deleteTask(1);

        // ObjectMapper mapper = new ObjectMapper();
        // List<String> data = mapper.readValue(new File("test.json"));
        // System.out.println("TEST");

        TaskManager taskManager = new TaskManager();
        ConsoleUI ui = new ConsoleUI(taskManager);
        ui.start();





        
    }
}

// 2007-12-03T10:15:30.
// System.out.print("Deadline (yyyy-MM-ddTHH:mm): ");
// String deadlineStr = scanner.nextLine();
// LocalDateTime deadline = LocalDateTime.parse(deadlineStr)


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


// UI --> New task --> TaskManager --> Modify/Updates Json file 