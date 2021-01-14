package com.clownly.java.common.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author clownly
 * @create 2021-01-14 15:04
 */


@Data
//转json的时候 只转 值不为null的
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReflactionUtils {



}
