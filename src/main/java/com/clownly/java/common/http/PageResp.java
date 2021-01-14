package com.clownly.java.common.http;

import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.util.List;

/**
 * 文件说明： 分页响应对象
 */
@Data
public class PageResp<T> {

    private int currentPage;

    private int pageSize;

    private long total;

    private List<T> list;

    public PageVo(List<T> list){

        PageInfo<T> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();

        this.total = pageInfo.getTotal();
        this.list = list;
        this.currentPage = pageInfo.getPageNum();
        this.pageSize = pageInfo.getSize();

    }


}
