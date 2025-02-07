package com.egovframework.javaservice.treeframework.excel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelFieldAnnotation {

    int columnIndex();
    String formmating() default  "";

    String headerName() default "";

}
