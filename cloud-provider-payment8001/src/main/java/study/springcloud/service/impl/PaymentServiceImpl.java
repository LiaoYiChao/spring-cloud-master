package study.springcloud.service.impl;

import org.springframework.stereotype.Service;
import study.springcloud.entity.Payment;
import study.springcloud.mapper.PaymentMapper;
import study.springcloud.service.PaymentService;

import javax.annotation.Resource;

/*
 * @description: payment 实现类
 * @author: Liao
 * @date  2020/5/10 14:45
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    /**
     * -- @Resource 和 @Autowired 之间的区别
     * --     前者默认为 byName 进行注入
     *           支持多种，可以byName，可以byType，如果两者都指定，则从spring上下文中找寻唯一的bean，没有就抛出异常
     * --     后者默认为 byType 进行注入
     *           后者如果需要byName 进行注入，则需要在添加注解：
     *              -- @Qualifier(name = "")
     */
    @Resource
    PaymentMapper paymentMapper;

    public int insert(Payment payment) {
        return paymentMapper.insert(payment);
    }

    public Payment selectById(Long pkId) {
        return paymentMapper.selectById(pkId);
    }

}
