package top.yannyi.designpatterns.observer.spring;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @Author: LeahAna
 * @Date: 2023/6/8 10:15
 * @Desc:
 */
@Component
public class EventPublisherBean {
    private ApplicationEventPublisher publisher;

    public EventPublisherBean(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void sendCustomEvent(final String message) {
        System.out.println("Publishing custom event. ");
        CustomEvent customEvent = new CustomEvent(this, message);
        publisher.publishEvent(customEvent);
    }
}
