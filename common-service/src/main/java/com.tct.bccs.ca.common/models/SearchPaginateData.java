package com.tct.bccs.ca.common.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchPaginateData<T> extends PaginateData<T> {
    private Map<Integer, Long> categoryFacet;

    public SearchPaginateData(long total, List<T> data, Map<Integer, Long> categoryFacet) {
        super(total, data);
        this.categoryFacet = categoryFacet;
    }
}

