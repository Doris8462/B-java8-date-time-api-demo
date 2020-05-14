package com.thoughtworks.capability.gtb.blank;

import java.time.LocalDateTime;

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
    // 从字符串解析得到会议时间
    LocalDateTime meetingTime =
        LocalDateTime.of(2020, 4, 1, 14, 30, 0);

    LocalDateTime now = LocalDateTime.now();
    if (now.isAfter(meetingTime)) {
      LocalDateTime tomorrow = now.plusDays(1);
      int newDayOfYear = tomorrow.getDayOfYear();
      meetingTime = meetingTime.withDayOfYear(newDayOfYear);

      // 格式化新会议时间
      meetingTime = meetingTime.withDayOfYear(newDayOfYear);
      System.out.println(meetingTime);
    } else {
      System.out.println("会议还没开始呢");
    }
  }
}
