package com.thoughtworks.capability.gtb.demo;

import org.joda.time.LocalDateTime;

/**
 * jada-time包使用示例
 *
 * @author itutry
 * @create 2020-05-07_19:28
 */
public class JodaTimeDemo {

  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime tomorrow= now.plusDays(1);
    System.out.println(tomorrow);
  }
}
