package com.kodilla.beanlifecycle;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor {
    private final Logger logger = LoggerFactory.getLogger(PostProcessor.class);

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("A bean named {} has just been created!", beanName);
        return bean;
    }

}
