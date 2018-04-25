package com.wilder.power_supply.dto;

import lombok.*;

/**
 * Created by K Lin
 * Date: 2018/4/25.
 * Time: 15:52
 * Remember to sow in the spring.
 * Description : power_supply
 */
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor
@Data
public class ResultInfo<T>{
    public static final Integer OK = 0;
    public static final Integer ERROR = 500;
    /**
     * 状态码
     */
    @NonNull private int state;
    /**
     * 数据
     */
    private T data;
}
