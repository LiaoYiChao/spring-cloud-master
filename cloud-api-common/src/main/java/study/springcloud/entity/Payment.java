package study.springcloud.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/*
 * @description: 订单实体类
 * @author: Liao
 * @date  2020/5/10 14:21
 */
@Data
@Accessors(chain = true)
public class Payment {

    //订单Id
    private Long pkId;

    //订单名称
    private String paymentName;

}
