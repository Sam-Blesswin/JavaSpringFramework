package com.sam;

import com.sam.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Desktop obj = context.getBean("Beast",Desktop.class);
//        Desktop obj = context.getBean("desktop",Desktop.class);
//        obj.Compile();

        Coder coder = context.getBean(Coder.class);
        coder.Code();
    }
}