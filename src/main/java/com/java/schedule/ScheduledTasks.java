package com.java.schedule;

import com.java.gloable.UserUtil;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    private static final Logger log = Logger.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public static String date ;

    @Scheduled(fixedRate = 3000)
    public void reportCurrentTime() {
		log.info("The time is now {}"  + dateFormat.format(new Date()));
        date = dateFormat.format(new Date());
		UserUtil.user.setName(date);
    }
}