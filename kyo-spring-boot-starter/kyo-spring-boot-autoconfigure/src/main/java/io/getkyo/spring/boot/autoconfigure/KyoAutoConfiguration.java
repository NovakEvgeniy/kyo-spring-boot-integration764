package io.getkyo.spring.boot.autoconfigure;

import kyo.KyoApp$;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Автоконфигурация Kyo для Spring Boot.
 * Регистрирует бин {@link KyoApp$}, то есть Scala object-синглтон.
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnClass(KyoApp$.class)
@EnableConfigurationProperties(KyoProperties.class)
public class KyoAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public KyoApp$ kyoApp() {
        return KyoApp$.MODULE$;
    }
}

