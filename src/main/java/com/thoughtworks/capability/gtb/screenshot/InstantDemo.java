package com.thoughtworks.capability.gtb.screenshot;

import java.time.Instant;

/**
 * 计算一段代码的执行时间
 *
 * @author itutry
 * @create 2020-05-12_17:21
 */
public class InstantDemo {

  public static void main(String[] args) {
    Instant begin = Instant.now();

    doSomething();

    Instant end = Instant.now();
    long cost = end.toEpochMilli() - begin.toEpochMilli();
    System.out.println(cost);
  }

  private static void doSomething() {
    int sum = 0;
    for (int i = 0; i < 10000000; i++) {
      sum++;
    }
    System.out.println(sum);
  }
}




