package com.nt.test;

public class MyThread extends Thread {
@Override
public void run() {
System.out.println("run is executed"+Thread.currentThread().getName());
}
}
