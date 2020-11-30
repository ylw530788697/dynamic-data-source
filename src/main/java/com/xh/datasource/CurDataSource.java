package com.xh.datasource;

import java.lang.annotation.*;

/**
 * 多数据源注解
 * <p/>
 * 指定要使用的数据源
 *
 * @author EvanYang
 * @since 2020-11-23
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CurDataSource {

    String name() default "";

}