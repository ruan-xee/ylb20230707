package com.rxee.common.util;

import java.util.Objects;

public class CommonUtil {
    public static int defaultPageNum(Integer pageNum) {
        int pNum = pageNum;
        if (pageNum == null || pageNum < 1) {
            pNum = 1;
        }
        return pNum;
    }

    public static int defaltPageSize(Integer pageSize) {
        int pSize = pageSize;
        if (pageSize == null || pageSize < 1) {
            pSize = 1;
        }
        return pSize;
    }

    /* 手机号脱敏 */
    public static String phoneNumDesensitization(String phone) {
        if (Objects.nonNull(phone) && !"".equals(phone) && phone.length() == 11) {
            return new StringBuilder(phone).replace(3, 9, "******").toString();
        }
        return "***********";
    }
}
