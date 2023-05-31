package com.MohammedAlghafri.Corn_Schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    //Problem 1: Write a CRON expression that runs a job every five minutes.
    @Scheduled(cron = "0 */5 * * * *")


    //Problem 2: Write a CRON expression that runs a job every hour.
   @Scheduled(cron = "0 0 * * * *")

    //Problem 3: Write a CRON expression that runs a job every day at 2:30 PM.
    @Scheduled(cron = "0 30 14 * * *")

            //Problem 4: Write a CRON expression that runs a job every Monday at 8:00 AM.
    @Scheduled(cron = "0 0 8 ? * MON")

            //Problem 5: Write a CRON expression that runs a job every month on the first day of the month at 3:00 AM.
    @Scheduled(cron = "0 0 3 1 * *")

            //Problem 6: Write a CRON expression that runs a job every Sunday at 7:30 PM and 10:30 PM.
    @Scheduled(cron = "0 30 19,22 * * SUN")

            //Problem 7: Write a CRON expression that runs a job every 15 minutes between 8:00 AM and 10:45 PM every day.
    @Scheduled(cron = "0 0/15 8-22 * * *")

    //Problem 8: Write a CRON expression that runs a job every hour on weekdays between 9:00 AM and 5:00 PM.
    @Scheduled(cron = "0 0 9-17 * * MON-FRI")

            //Problem 9: Write a CRON expression that runs a job every day at 3:00 AM.
    @Scheduled(cron = "0 0 3 * * *")

           // Problem 10: Write a CRON expression that runs a job every hour during the month of January.
    @Scheduled(cron = "0 0 * 1 * *")

           // Problem 11: Write a CRON expression that runs a job every 30 minutes during business hours (8:00 A to 5:00 PM) on weekdays.
    @Scheduled(cron = "0 0/30 8-17 * * MON-FRI")

    //Problem 12: Write a CRON expression that runs a job every hour on the 15th day of the month.
    @Scheduled(cron = "0 0 * 15 * *")

            //Problem 13: Write a CRON expression that runs a job every day at 6:00 PM during daylight saving ti (DST) in the United States.
    @Scheduled(cron = "0 0 18 * * *")

    //Problem 14: Write a CRON expression that runs a job every 5 minutes on weekdays and every 15 minutes on weekends.
    @Scheduled(cron = "0 0/5 * * * MON-FRI")
    @Scheduled(cron = "0 0/15 * * * SAT,SUN")
            //Problem 15: Write a CRON expression that runs a job every 10 minutes but only between 9:00 AM and 6:00 PM on weekdays.
    @Scheduled(cron = "0 0/10 9-17 * * MON-FRI")

           // Problem 16: Write a CRON expression that runs a job every hour during the first half of the month.
    @Scheduled(cron = "0 0 * 1-15 * *")

            //Problem 17: Write a CRON expression that runs a job every 5 minutes on weekdays and every 15 minutes on weekends.
    @Scheduled(cron = "0 */5 * * * MON-FRI")
    @Scheduled(cron = "0 0/15 * * * SAT,SUN")
            //Problem 18: Write a CRON expression that runs a job at 11:30 PM every Friday the 13th.
    @Scheduled(cron = "0 30 23 ? * FRI")

           // Problem 19: Write a CRON expression that runs a job every hour but only on even-numbered days of the month.
    @Scheduled(cron = "0 0 * */2 * *")

           // Problem 20: Write a CRON expression that runs a job every 5 minutes but only between 9:00 AM and 6:00 PM on weekends.
    @Scheduled(cron = "0 */5 9-18 * * SAT,SUN")

 //Problem 21: Write a CRON expression that runs a job at 3:30 AM every day except Saturday and Sunday.
    @Scheduled(cron = "0 30 3 * * MON-FRI")

         //Problem 22: Write a CRON expression that runs a job at the top of every hour between 9:00 AM and 5:00 PM on the 15th day of the month.
    @Scheduled(cron = "0 0 9-17 15 * *")

        // Problem 23: Write a CRON expression that runs a job at 8:15 AM every weekday except Friday.
    @Scheduled(cron = "0 15 8 * * MON-THU")

         //Problem 24: Write a CRON expression that runs a job at 10:00 PM every day in the month of December.
    @Scheduled(cron = "0 0 22 * 12 *")

 //Problem 25: Write a CRON expression that runs a job at the bottom of every hour (i.e., at :00 and :30 minutes past the hour) between 6:00 PM and midnight on weekdays.
    @Scheduled(cron = "0 0,30 18-23 * * MON-FRI")

         //Problem 26: Write a CRON expression that runs a job at 4:30 PM on the 1st and 15th days of every month.
    @Scheduled(cron = "0 30 16 1,15 * *")

         //Problem 27: Write a CRON expression that runs a job every 10 minutes on weekdays between 9:00 AM and 5:00 PM.
    @Scheduled(cron = "0 */10 9-17 * * MON-FRI")

        // Problem 28: Write a CRON expression that runs a job at 12:00 PM on the 3rd Wednesday of every month.
    @Scheduled(cron = "0 0 12 ? * 4#3")

        // Problem 29: Write a CRON expression that runs a job at 10:00 PM every Sunday in the months of July, August, and September.
    @Scheduled(cron = "0 0 22 ? 7-9 SUN")

 //Problem 30: Write a CRON expression that runs a job at 12:00 PM every day except Sunday in the month of July.
    @Scheduled(cron = "0 0 12 ? 7 MON-SAT")


 //Problem 31: Write a CRON expression that runs a job at 11:30 PM every Friday.
    @Scheduled(cron = "0 30 23 ? * FRI")

         //Problem 32: Write a CRON expression that runs a job at 3:15 AM every day.
    @Scheduled(cron = "0 15 3 * * ?")

        // Problem 33: Write a CRON expression that runs a job every hour from 6:00 AM to 8:00 PM on weekdays.
    @Scheduled(cron = "0 0 6-20 ? * MON-FRI")

         //Problem 34: Write a CRON expression that runs a job every 30 minutes on the 15th and 30th day o every month.
    @Scheduled(cron = "0 0/30 * 15,30 * ?")

 //Problem 35: Write a CRON expression that runs a job every 5 minutes on the 1st day of every month.
    @Scheduled(cron = "0 0/5 * 1 * ?")

         //Problem 36: Write a CRON expression that runs a job every hour on the hour from 9:00 AM to 5:00 PM on weekdays.
    @Scheduled(cron = "0 0 9-17 ? * MON-FRI")

 //Problem 37: Write a CRON expression that runs a job every 15 minutes from 2:00 PM to 10:00 PM on weekends.

    @Scheduled(cron = "0 0/15 14-22 ? * SAT,SUN")

        // Problem 38: Write a CRON expression that runs a job every 10 minutes on weekdays between 8:00 AM and 3:00 PM.
    @Scheduled(cron = "0 0/10 8-15 ? * MON-FRI")

         //Problem 39: Write a CRON expression that runs a job at 11:00 PM every day of the year.
    @Scheduled(cron = "0 0 23 * * ?")

 //Problem 40: Write a CRON expression that runs a job every 30 minutes on the 15th and last day of every month.
    @Scheduled(cron = "0 0/30 * 15,L * ?")


 //Problem 41: Write a CRON expression that runs a job at 12:00 PM on the first Monday of every month.
    @Scheduled(cron = "0 0 12 ? * 2#1")

 //Problem 42: Write a CRON expression that runs a job every 5 minutes on the first 10 days of January.
    @Scheduled(cron = "0 0/5 * 1 1-10 ?")

        // Problem 43: Write a CRON expression that runs a job at 4:30 PM on weekdays in July and August.
    @Scheduled(cron = "0 30 16 ? 7,8 MON-FRI")

        // Problem 44: Write a CRON expression that runs a job at 12:00 AM on the first day of every quarter (January, April, July, and October).
    @Scheduled(cron = "0 0 0 1 1,4,7,10 ?")

 //Problem 45: Write a CRON expression that runs a job at 8:00 AM every day, except for the last day of the month.
    @Scheduled(cron = "0 0 8 1-30 * ?")

         //Problem 46: Write a CRON expression that runs a job every 2 hours between 10:00 PM and 6:00 AM.
    @Scheduled(cron = "0 0 22-23,0-6/2 * * ?")

        // Problem 47: Write a CRON expression that runs a job at 1:30 PM on the second to last Friday of every month.
    @Scheduled(cron = "0 30 13 ? * 6")

       //  Problem 48: Write a CRON expression that runs a job at 5:30 PM on the first day of every month.
    @Scheduled(cron = "0 30 17 1 * ?")

 //Problem 49: Write a CRON expression that runs a job at 3:00 AM on weekdays in the month of November.
    @Scheduled(cron = "0 0 3 ? 11 MON-FRI")

        // Problem 50: Write a CRON expression that runs a job every 10 minutes between 9:00 AM and 5:00 PM on weekdays.
    @Scheduled(cron = "0 0/10 9-16 ? * MON-FRI")




 public void ScheduleTask(){
        System.out.println("Hello");


}
}