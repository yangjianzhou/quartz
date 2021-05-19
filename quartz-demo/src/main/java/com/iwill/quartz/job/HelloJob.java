package com.iwill.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job {

    private int age ;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println(context);
        System.out.println(age);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
