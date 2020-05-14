package com.thoughtworks.capability.gtb.screenshot;

import java.time.LocalDateTime;

/**
 * 脑洞会议系统v1.0
 * 检查当前会议是否开始，如果开始就约下一个会议
 * 下一个会议的时间为明天的同一时间
 *
 * @author itutry
 * @create 2020-05-07_17:35
 */
public class LocalDateTimeDemo {

  public static void main(String[] args) {
    LocalDateTime meetingTime =
        LocalDateTime.of(2020, 4, 1, 14, 30, 0);
    LocalDateTime now = LocalDateTime.now();

    if (now.isAfter(meetingTime)) {
      LocalDateTime tomorrow = now.plusDays(1);
      int newDayOfYear = tomorrow.getDayOfYear();

      meetingTime = meetingTime.withDayOfYear(newDayOfYear);
      System.out.println(meetingTime);
    } else {
      System.out.println("会议还没开始呢");
    }
  }
}

