package com.lihd.java.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @program: lihd-leetcode
 * @description:
 * @author: li_hd
 * @create: 2020-04-03 15:06
 **/
@Target(ElementType.METHOD)
public @interface Type {

    TypeValue[] value();

}
