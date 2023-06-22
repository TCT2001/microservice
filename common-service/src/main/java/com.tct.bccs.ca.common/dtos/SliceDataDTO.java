package com.tct.bccs.ca.common.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tct.bccs.ca.common.response.CommonResponseCode;
import com.tct.bccs.ca.common.response.ResponseCode;
import com.tct.bccs.ca.common.models.SliceData;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
@Setter
public class SliceDataDTO<T> extends CommonResponseDTO<T> {
    public static final String HAS_NEXT = "hasNext";
    public static final String HAS_PREVIOUS = "hasPrevious";
    private final Map<String, String> meta = new HashMap<>(3);
    private List<T> dataList;

    @Override
    @JsonIgnore
    public T getData() {
        return super.getData();
    }

    public SliceDataDTO() {
        this(CommonResponseCode.SUCCESS);
    }

    public SliceDataDTO(ResponseCode code) {
        super(code);
    }

    public <R> SliceDataDTO(boolean hasNext, boolean hasPrevious, List<R> dataList, Function<? super R, ? extends T> mapper) {
        this();
        this.meta.put(HAS_NEXT, String.valueOf(hasNext));
        this.meta.put(HAS_PREVIOUS, String.valueOf(hasPrevious));
        this.dataList = dataList.stream().map(mapper).collect(Collectors.toList());
    }

    public <R> SliceDataDTO(SliceData<R> sliceData, Function<? super R, ? extends T> mapper) {
        this(sliceData.isHasNext(), sliceData.isHasPrevious(), sliceData.getData(), mapper);
    }
}
