package cn.itcast.core.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ReceiveController {
    //监听器
    @JmsListener(destination = "yes")
    public void receiveMessage(Map<String,String> map){
        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
    }
}
