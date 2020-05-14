package com.thoughtworks.capability.gtb.demo;

import java.time.LocalDateTime;

/**
 * ISO_8601 标准化打印演示
 *
 * @author itutry
 * @create 2020-05-12_16:31
 */
public class Iso8601Demo {

  public static void main(String[] args) {
    LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 1, 12, 30, 0);
    System.out.println(localDateTime);
  }
}
