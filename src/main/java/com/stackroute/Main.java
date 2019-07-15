package com.stackroute;

import com.stackroute.domain.Actor;

import com.stackroute.domain.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Main
{
    public static void main( String[] args )
    {
        //Using BeanFactory
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie = beanFactory.getBean("movie", Movie.class);
        movie.displayInformation();

        //Using ApplicationContext
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        movie = applicationContext.getBean("movie", Movie.class);
        movie.displayInformation();
    }

}

