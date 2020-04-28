package com.jamessu712.redis.spring.boot.annotation;

import com.jamessu712.redis.spring.boot.autoconfigure.RedisBootConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @date: Created in 2020/04/28 01:00
 *
 * @author jamessu
 * @since JDK 1.8
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({RedisBootConfiguration.class})
public @interface EnableRedisBoot {
}
