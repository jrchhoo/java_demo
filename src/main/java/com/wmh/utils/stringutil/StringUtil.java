package com.wmh.utils.stringutil;

import org.apache.commons.lang3.StringUtils;



import lombok.extern.slf4j.Slf4j;

/**
 * @program: utils
 * @description: String工具
 * @author: Mr.Hou
 * @create: 2021-10-19 10:46
 **/
@Slf4j
public class StringUtil {

    public static void main(String[] args) {
        String number = "aa bb cc dd ee nn";

        String[] strs = new String[4];
        strs[0] = "1";
        strs[1] = "2";
        strs[2] = "3";
        strs[3] = "4";
        log.info(StringUtils.replace(number, " ", ",", -1));


        String number1 = "4680";
        log.info(number1.substring(2,4));
        log.info(number1.substring(1,4));
    }
}
