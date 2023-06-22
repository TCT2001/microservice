package com.tct.bccs.ca.common.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PaginateParam {
    public static final int DEFAULT_PAGE_SIZE = 5;
    public static final int MAX_PAGE = 150;

    private int page = 0;
    private int size = DEFAULT_PAGE_SIZE;
    private String sortField;
    private boolean sortAscending;
    private String filter;

    public void setSortAscending(String sortAscending) {
        this.sortAscending = Boolean.parseBoolean(sortAscending);
    }

    public void setPage(int page) {
        if (page >= 0 && page < MAX_PAGE) {
            this.page = page;
        }
    }

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        }
    }
}
