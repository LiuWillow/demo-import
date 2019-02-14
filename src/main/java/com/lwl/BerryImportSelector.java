package com.lwl;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author lwl
 * @date 2019/2/14 14:29
 * @description
 */
public class BerryImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.lwl.Berry"};
    }
}