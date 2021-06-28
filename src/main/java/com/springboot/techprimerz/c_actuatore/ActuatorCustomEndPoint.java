package com.springboot.techprimerz.c_actuatore;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
// http://localhost:8080/actuator/env
// http://localhost:8080/actuator/health,loggers,info,etc...
@Component
public class ActuatorCustomEndPoint implements Endpoint {

    @Override
    public String id() {
        return "ActuatorId";
        // By Any Word that you want to call in the URL
    }

    @Override
    public boolean enableByDefault() {
        return true;
    }

    /**
     * Returns the annotation interface of this annotation.
     *
     * @return the annotation interface of this annotation
     * @apiNote Implementation-dependent classes are used to provide
     * the implementations of annotations. Therefore, calling {@link
     * Object#getClass getClass} on an annotation will return an
     * implementation-dependent class. In contrast, this method will
     * reliably return the annotation interface of the annotation.
     * @see Enum#getDeclaringClass
     */
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
