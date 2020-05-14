package com.thoughtworks.capability.gtb.demo;

import org.threeten.bp.LocalDateTime;

/**
 * threetenbp包使用示例
 *
 * @author itutry
 * @create 2020-05-07_19:24
 */
public class ThreeTenBpDemo {

  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime tomorrow = now.plusDays(1);
    System.out.println(tomorrow);
  }
}
