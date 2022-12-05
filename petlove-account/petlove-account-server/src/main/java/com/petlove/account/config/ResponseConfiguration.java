package com.petlove.account.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.DispatcherServlet;
import top.tangyh.basic.boot.handler.AbstractGlobalResponseBodyAdvice;

import javax.servlet.Servlet;

/**
 * 全局统一返回值 包装器
 *
 * @author zuihou
 * @date 2020/12/30 2:48 下午
 */
@Configuration
@ConditionalOnClass({Servlet.class, DispatcherServlet.class})
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
@RestControllerAdvice(basePackages = {"com.petlove"})
public class ResponseConfiguration extends AbstractGlobalResponseBodyAdvice {
}
