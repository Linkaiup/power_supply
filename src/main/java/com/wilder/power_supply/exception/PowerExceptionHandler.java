package com.wilder.power_supply.exception;

import com.wilder.power_supply.dto.ResultInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by K Lin
 * Date: 2018/4/25.
 * Time: 15:36
 * Remember to sow in the spring.
 * Description : power_supply
 */
@ControllerAdvice
public class PowerExceptionHandler {

//    @ExceptionHandler(value = Exception.class)
//    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", e);
//        mav.addObject("url", req.getRequestURL());
//        mav.setViewName("error");
//        return mav;
//    }

    @ExceptionHandler(value = PowerException.class)
    @ResponseBody
    public ResultInfo<String> jsonErrorHandler(HttpServletRequest req, PowerException e) throws Exception {
        ResultInfo<String> r = new ResultInfo<>(ResultInfo.ERROR,e.getMessage());
        return r;
    }

}
