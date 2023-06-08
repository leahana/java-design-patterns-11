package top.yannyi.designpatterns.observer.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author: LeahAna
 * @Date: 2023/6/8 10:13
 * @Desc: 监听类
 */

@Component
public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("Receive event: " + event.getMessage());
    }
}
