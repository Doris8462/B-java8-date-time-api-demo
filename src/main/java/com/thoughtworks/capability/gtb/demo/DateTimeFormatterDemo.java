package com.thoughtworks.capability.gtb.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 脑洞会议系统v2.0
 * 当前会议时间从"2020-04-01 14:30:00"格式读入
 * 下个会议时间也以"2020-04-01 14:30:00"格式输出
 *
 * @author itutry
 * @create 2020-05-12_21:59
 */
public class DateTimeFormatterDemo {

  public static void main(String[] args) {
    String timeStr = "2020-04-01 14:30:00";

    // 根据格式创建格式化类
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    // 从字符串解析得到会议时间
    LocalDateTime meetingTime = LocalDateTime.parse(timeStr, formatter);

    LocalDateTime now = LocalDateTime.now();
    if (now.isAfter(meetingTime)) {
      LocalDateTime tomorrow = now.plusDays(1);
      int newDayOfYear = tomorrow.getDayOfYear();
      meetingTime = meetingTime.withDayOfYear(newDayOfYear);

      // 格式化新会议时间
      String showTimeStr = formatter.format(meetingTime);
      System.out.println(showTimeStr);
    } else {
      System.out.println("会议还没开始呢");
    }
  }
}
