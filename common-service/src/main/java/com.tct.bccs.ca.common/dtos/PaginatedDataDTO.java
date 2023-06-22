package com.tct.bccs.ca.common.dtos;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tct.bccs.ca.common.response.CommonResponseCode;
import com.tct.bccs.ca.common.models.PaginateData;
import com.tct.bccs.ca.common.response.ResponseCode;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
@Setter
public class PaginatedDataDTO<T> extends CommonResponseDTO<T> {
    public static final String TOTAL_META = "total";
    private final Map<String, String> meta = new HashMap<>(2);
    private List<T> dataList;

    @JsonIgnore
    @Override
    public T getData() {
        return super.getData();
    }

    public PaginatedDataDTO() {
        this(CommonResponseCode.SUCCESS);
    }

    public PaginatedDataDTO(ResponseCode code) {
        super(code);
    }

    public PaginatedDataDTO(long total, List<T> data) {
        super(CommonResponseCode.SUCCESS);
        this.meta.put(TOTAL_META, String.valueOf(total));
        this.dataList = data;
    }

    public <R> PaginatedDataDTO(long total, List<R> dataList, Function<? super R, ? extends T> mapper) {
        this();
        this.meta.put(TOTAL_META, String.valueOf(total));
        this.dataList = dataList.stream().map(mapper).collect(Collectors.toList());
    }

    public <R> PaginatedDataDTO(PaginateData<R> paginateData, Function<? super R, ? extends T> mapper) {
        this(paginateData.getTotal(), paginateData.getData(), mapper);
    }
}


