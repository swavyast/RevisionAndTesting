package com.ml.revision.multithreading;

class Test extends Thread{
public void run(){
try{
for (int i=1;i<=5;i++){
System.out.println(i);
}
}catch (Exception e){
System.out.println("InterruptedException");
}
}
public static void main(String[] args) {
Test test=new Test();
test.start();
test.interrupt();
}
}