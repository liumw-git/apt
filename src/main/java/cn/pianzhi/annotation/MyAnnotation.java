package cn.pianzhi.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyAnnotation {
    /**
     * 显式指定表名称
     *
     * @return
     */
    String table() default "";

}
