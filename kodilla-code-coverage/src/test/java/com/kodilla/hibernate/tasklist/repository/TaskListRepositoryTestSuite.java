package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String LISTNAME = "FIRST LIST";
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskListRepositorySave() {
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, LISTNAME);

        //When
        taskListRepository.save(taskList);

        //Then
        int id = taskList.getId();
        Optional<TaskList> readTaskList = taskListRepository.findById(id);
        Assert.assertTrue(readTaskList.isPresent());

        //CleanUp
        taskListRepository.deleteById(id);
    }

    @Test
    public void testTaskListRepositoryFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasks = taskListRepository.findByListName(listName);

        //Then
        Assert.assertEquals("FIRST LIST", readTasks.get(0).getListName());

        //CleanUp
        int id = readTasks.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
