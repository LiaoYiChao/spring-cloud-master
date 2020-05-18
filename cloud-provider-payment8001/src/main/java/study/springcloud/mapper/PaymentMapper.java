package study.springcloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import study.springcloud.entity.Payment;

/*
 * @description: payment mapper
 * @author: Liao
 * @date  2020/5/10 14:40
 */
@Mapper
public interface PaymentMapper {

    int insert(Payment payment);

    Payment selectById(@Param("pkId") Long pkId);

}
