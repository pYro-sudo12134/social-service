package by.losik.apigateway.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Loggable {
    boolean logArgs() default true;
    boolean logResult() default false;
    Level level() default Level.INFO;

    enum Level {
        DEBUG, INFO, WARN, ERROR
    }
}