package com.thoughtworks.capability.gtb.blank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 脑洞会议系统v3.0
 * 读入的字符串是伦敦的本地时间
 * 输出的字符串是北京的本地时间
 *
 * @author itutry
 * @create 2020-05-12_22:35
 */
public class ZonedDateTimeDemo {

  public static void main(String[] args) {
    String timeStr = "2020-04-01 14:30:00";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    LocalDateTime meetingTime = LocalDateTime.of(2020, 4, 1, 14, 30, 0);

    // 将读进来的本地时间转成带伦敦时区的时间
    // 将伦敦时区的时间转成北京时区的时间
    // 从北京时区的时间获取北京的本地时间

    LocalDateTime now = LocalDateTime.now();
    if (now.isAfter(meetingTime)) {
      LocalDateTime tomorrow = now.plusDays(1);
      int newDayOfYear = tomorrow.getDayOfYear();
      meetingTime = meetingTime.withDayOfYear(newDayOfYear);

      String showTimeStr = formatter.format(meetingTime);
      System.out.println(showTimeStr);
    } else {
      System.out.println("会议还没开始呢");
    }
  }
}
