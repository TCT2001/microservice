package com.tct.bccs.ca.common.dtos;

import com.tct.bccs.ca.common.response.CommonResponseCode;
import com.tct.bccs.ca.common.response.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class CommonResponseDTO<T> {
    private ResponseCode code;
    private String description;
    private T data;

    public CommonResponseDTO() {
        this(CommonResponseCode.SUCCESS, null, null);
    }

    public CommonResponseDTO(ResponseCode responseCode) {
        this(responseCode, null, null);
    }

    public CommonResponseDTO(T data) {
        this(CommonResponseCode.SUCCESS, null, data);
    }

    public CommonResponseDTO(ResponseCode status, String description) {
        this.code = status;
        this.description = description;
        this.data = null;
    }
}
