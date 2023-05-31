package com.MohammedAlghafri.Corn_Schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    //Problem 1: Write a CRON expression that runs a job every five minutes.
    @Scheduled(cron = "0 */5 * * * *")


    //Problem 2: Write a CRON expression that runs a job every hour.
   // @Scheduled(cron = "0 0 * * * *")

    //Problem 3: Write a CRON expression that runs a job every day at 2:30 PM.

            //Problem 4: Write a CRON expression that runs a job every Monday at 8:00 AM.

            //Problem 5: Write a CRON expression that runs a job every month on the first day of the month at 3:00 AM.

            //Problem 6: Write a CRON expression that runs a job every Sunday at 7:30 PM and 10:30 PM.

            //Problem 7: Write a CRON expression that runs a job every 15 minutes between 8:00 AM and 10:45 PM every day.

    //Problem 8: Write a CRON expression that runs a job every hour on weekdays between 9:00 AM and 5:00 PM.

            //Problem 9: Write a CRON expression that runs a job every day at 3:00 AM.

           // Problem 10: Write a CRON expression that runs a job every hour during the month of January.

           // Problem 11: Write a CRON expression that runs a job every 30 minutes during business hours (8:00 A to 5:00 PM) on weekdays.

    //Problem 12: Write a CRON expression that runs a job every hour on the 15th day of the month.

            //Problem 13: Write a CRON expression that runs a job every day at 6:00 PM during daylight saving ti (DST) in the United States.

    //Problem 14: Write a CRON expression that runs a job every 5 minutes on weekdays and every 15 minutes on weekends.

            //Problem 15: Write a CRON expression that runs a job every 10 minutes but only between 9:00 AM and 6:00 PM on weekdays.

           // Problem 16: Write a CRON expression that runs a job every hour during the first half of the month.

            //Problem 17: Write a CRON expression that runs a job every 5 minutes on weekdays and every 15 minutes on weekends.
            //Problem 18: Write a CRON expression that runs a job at 11:30 PM every Friday the 13th.

           // Problem 19: Write a CRON expression that runs a job every hour but only on even-numbered days of the month.

           // Problem 20: Write a CRON expression that runs a job every 5 minutes but only between 9:00 AM and 6:00 PM on weekends.



public void ScheduleTask(){
        System.out.println("Hello");


}
}