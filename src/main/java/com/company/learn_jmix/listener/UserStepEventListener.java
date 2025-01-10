package com.company.learn_jmix.listener;

import com.company.learn_jmix.entity.UserStep;
import io.jmix.core.event.EntityChangedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserStepEventListener {

    @EventListener
    public void onUserStepChangedBeforeCommit(final EntityChangedEvent<UserStep> event) {

    }
}