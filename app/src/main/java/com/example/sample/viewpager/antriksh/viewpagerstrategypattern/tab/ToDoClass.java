package com.example.sample.viewpager.antriksh.viewpagerstrategypattern.tab;

import com.example.sample.viewpager.antriksh.viewpagerstrategypattern.tab.impl.ToDoTask;

/**
 * Created by antrikshtiwari on 18/05/16.
 */
public class ToDoClass {

    private ToDoTask task;

    public void selectTabForToDoTask(){
        task.doSomeTask();
    }

    public ToDoTask getTask() {
        return task;
    }

    public void setTask(ToDoTask task) {
        this.task = task;
    }
}
