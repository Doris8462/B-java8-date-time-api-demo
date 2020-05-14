package com.thoughtworks.capability.gtb.screenshot;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 脑洞会议系统v4.0
 * 用Period来实现下个会议时间的计算
 *
 * @author itutry
 * @create 2020-05-12_23:17
 */
public class PeriodDemo {

  public static void main(String[] args) {
    String timeStr = "2020-04-01 14:30:00";
    DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    LocalDateTime londonLocal =
        LocalDateTime.parse(timeStr, formatter);
    ZonedDateTime londonZoned =
        ZonedDateTime.of(londonLocal, ZoneId.of("Europe/London"));

    ZonedDateTime beijingZoned =
        londonZoned.withZoneSameInstant(ZoneId.systemDefault());
    LocalDateTime meetingTime = beijingZoned.toLocalDateTime();

    LocalDateTime now = LocalDateTime.now();
    if (now.isAfter(meetingTime)) {
      Period period =
          Period.between(meetingTime.toLocalDate(), now.toLocalDate());
      Period newPeriod = period.plusDays(1);
      meetingTime = meetingTime.plus(newPeriod);

      String showTimeStr = formatter.format(meetingTime);
      System.out.println(showTimeStr);
    } else {
      System.out.println("会议还没开始呢");
    }
  }
}

