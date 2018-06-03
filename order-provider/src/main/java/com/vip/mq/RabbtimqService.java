package com.vip.mq;

public class RabbtimqService {
    public void listen(String message){
        System.out.println("listen->receive message:"+message);
    }
}
