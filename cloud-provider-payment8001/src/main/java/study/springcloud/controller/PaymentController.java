package study.springcloud.controller;

import org.springframework.web.bind.annotation.*;
import study.springcloud.entity.Payment;
import study.springcloud.service.PaymentService;
import study.springcloud.entity.CommonResult;

import javax.annotation.Resource;

/*
 * @description: payment 控制层
 * @author: Liao
 * @date  2020/5/10 14:24
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        int insert = paymentService.insert(payment);
        return new CommonResult<Integer>(200,"成功", insert);
    }

    @GetMapping("/get/{pkId}")
    public CommonResult<Payment> selectById(@PathVariable("pkId") Long pkId) {
        Payment payment = paymentService.selectById(pkId);
        return new CommonResult<Payment>(200, "成功", payment);
    }

}
