package automatizacion_w3shool.utils_and_hooks;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Compatibility annotation to allow use of @DefaultUrl when Serenity's artifact/version
 * does not provide the annotation in the classpath.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DefaultUrl {
    String value();
}

