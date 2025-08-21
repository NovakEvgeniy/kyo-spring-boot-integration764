package com.example.kyotest;
import kyo.KyoApp$;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class KyoSpringBootTestApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(KyoSpringBootTestApplication.class, args);

        // Проверим, что бин KyoApp$ поднялся
        KyoApp$ kyoApp = ctx.getBean(KyoApp$.class);
        System.out.println("=== KyoApp бин успешно зарегистрирован ===");
        System.out.println("KyoApp instance: " + kyoApp);

        // Проверим, что свойства доступны (через Spring Environment)
        String enabled = ctx.getEnvironment().getProperty("kyo.enabled");
        String mode = ctx.getEnvironment().getProperty("kyo.mode");
        System.out.println("kyo.enabled = " + enabled);
        System.out.println("kyo.mode = " + mode);
    }
}

