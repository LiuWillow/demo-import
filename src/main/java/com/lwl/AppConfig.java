package com.lwl;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author lwl
 * @date 2019/2/14 14:23
 * @description
 */
@Configuration
@Import({Apple.class, Banana.class, TomatoRegistrar.class})
@EnableBerry
public class AppConfig {
}