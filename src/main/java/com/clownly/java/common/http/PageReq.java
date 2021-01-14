package com.clownly.java.common.http;

import lombok.Data;

/**
 * @author clownly
 * @create 2021-01-14 22:30
 */

@Data
public class PageReq {
    private int currentPage = 1;

    private int pageSize = 10;

//    排序字段
    private String sortField = "";

    private String sort = "";

    private String keyword = "";

    public PageReq(){
        super();
    }


    public PageReq(int currentPage, int pageSize, String sortField, String sort, String keyword) {
        super();
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.sortField = sortField;
        this.sort = sort;
        this.keyword = keyword;
    }



}
