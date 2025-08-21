package io.getkyo.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Конфигурационные свойства Kyo, доступные через application.yml.
 */
@ConfigurationProperties(prefix = "kyo")
public class KyoProperties {

    /**
     * Включить/выключить интеграцию Kyo.
     */
    private boolean enabled = true;

    /**
     * Режим работы Kyo (например: default, prod, dev).
     */
    private String mode = "default";

    // getters/setters
    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
}

