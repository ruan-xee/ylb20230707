package com.rxee.front.pageInfo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PageInfo {
    // 当前页码
    private Integer pageNum;
    // 每页大小
    private Integer pageSize;
    // 总页数
    private Integer totalPage;
    // 总记录数
    private Integer totalRecord;

    public PageInfo(Integer pageNum, Integer pageSize, Integer totalRecord) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalRecord = totalRecord;
        this.totalPage = totalRecord / pageSize + (totalRecord % pageSize == 0 ? 0 : 1);

    }
}
