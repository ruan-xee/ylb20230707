package com.rxee.common.util;

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
}
