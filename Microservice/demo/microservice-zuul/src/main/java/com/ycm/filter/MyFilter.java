package com.ycm.filter;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

/**
 * 过滤器拓展
 *
 * @author cman
 * Dec 8, 2019-5:27:43 PM
 */
public class MyFilter extends ZuulFilter {

    @Override
    public Object run() throws ZuulException {
        // to do something
        return null;
    }

    /**
     * 是否过滤，默认false
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤的顺序，默认0
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 过滤器类型，pre 路由之前、routing 路由之时、post 路由之后、error 错误调用时
     * 更多Filter相关常量看@FilterConstants
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

}
