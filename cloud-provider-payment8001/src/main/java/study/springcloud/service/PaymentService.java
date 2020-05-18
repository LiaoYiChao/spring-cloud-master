package study.springcloud.service;

import org.apache.ibatis.annotations.Param;
import study.springcloud.entity.Payment;

/*
 * @description: payment
 * @author: Liao
 * @date  2020/5/10 14:30
 */
public interface PaymentService {

    int insert(Payment payment);

    Payment selectById(@Param("pkId") Long pkId);

}
