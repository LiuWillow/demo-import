package com.lwl;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author lwl
 * @date 2019/2/14 14:43
 * @description
 */
@Retention(RetentionPolicy.RUNTIME)
@Import({BerryImportSelector.class})
public @interface EnableBerry {
}