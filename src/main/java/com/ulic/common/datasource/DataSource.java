package com.ulic.common.datasource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 在多数据源的情况下，使用此注解来进行数据源的切换
 * 用法：在对应service类上或具体方法上加此注解，如@DataSource(name="dataSource2")
 * 配置的默认数据源无需加此注解
 * Created by liutao on 2017/5/26.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DataSource {
    String name();
}
