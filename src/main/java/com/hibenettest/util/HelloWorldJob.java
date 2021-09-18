package com.hibenettest.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

@Component
public class HelloWorldJob{
   // @Scheduled(fixedRate = 500,initialDelay = 1000)
    public void execute()  {
        Date date = Calendar.getInstance().getTime();
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT);
        String currenTime = timeFormatter.format(date);
        System.out.println("This task runs at "+currenTime);
    }


}