package com.mytasks.util;

// import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

import com.mytasks.model.Task;

public class JsonUtil {
    // private static ObjectMapper mapper = new ObjectMapper();

    public static void saveTasks(String path, List<Task> tasks){
        System.out.println("Task saved");
    }

    public static List<Task> loadTasks(String path){
        return new ArrayList<>();
    }
    
}
