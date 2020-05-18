package study.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @description: 公用返回结果集
 * @author: Liao
 * @date  2020/5/10 14:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    //返回的状态码
    private Integer code;

    //返回的消息
    private String message;

    //返回的数据
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

}
