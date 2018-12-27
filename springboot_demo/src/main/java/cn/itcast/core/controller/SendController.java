package cn.itcast.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("send")
public class SendController {

    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("sendMessage")
    public String sendMessage(String name){
        Map<String,String> map = new HashMap<>();
        map.put("name",name);
        map.put("age","20");
        //发消息
        jmsMessagingTemplate.convertAndSend("yes",map);
        return "ok";
    }
}
