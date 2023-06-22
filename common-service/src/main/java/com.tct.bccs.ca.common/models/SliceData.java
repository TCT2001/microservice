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
public class SliceData<T> {
    private boolean hasNext;
    private boolean hasPrevious;
    private List<T> data;

    public SliceData(List<T> data) {
        this.data = data;
    }
}
