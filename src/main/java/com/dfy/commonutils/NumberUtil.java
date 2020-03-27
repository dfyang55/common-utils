package com.dfy.commonutils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description: 数字工具类
 * @author: 段辉
 * @time: 2020/3/27 11:43
 */
public class NumberUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(NumberUtil.class);

    /** 判断是否为数字正则表达式 */
    private static final String NUMBER_REGEX = "^[0-9]+\\.{0,1}([0-9]+)?$";

    /** 判断是否为小数正则表达式 */
    private static final String DECIMAL_REGEX = "^[0-9]+\\.([0-9]*[1-9]+[0-9]*)$";

    /**
     * 判断输入字符串是否为一个数字
     * @param numberStr
     * @return
     */
    public static boolean isNumber(String numberStr) {
        return numberStr.matches(NUMBER_REGEX);
    }

    /**
     * 判断输入字符串是否为一个小数
     * @param numberStr
     * @return
     */
    public static boolean isDecimal(String numberStr) {
        if (!isNumber(numberStr)) {
            LOGGER.info("method：isDecimal，input：{}", numberStr);
            return false;
        }
        return numberStr.matches(DECIMAL_REGEX);
    }

}
