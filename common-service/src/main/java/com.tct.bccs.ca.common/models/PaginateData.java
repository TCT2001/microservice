package com.tct.bccs.ca.common.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaginateData<T> {
    private long total;
    private List<T> data;

    public PaginateData(List<T> data) {
        this.data = data;
    }
}
