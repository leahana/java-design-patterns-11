package top.yannyi.designpatterns.observer.spring;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: LeahAna
 * @Date: 2023/6/8 10:11
 * @Desc: 事件类
 */

public class CustomEvent extends ApplicationEvent {

    private final String message;

    public CustomEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
