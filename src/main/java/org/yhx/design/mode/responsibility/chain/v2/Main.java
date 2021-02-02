package org.yhx.design.mode.responsibility.chain.v2;

import org.yhx.design.mode.responsibility.chain.v1.IRequest;

/**
 * @author bigmoon
 * @date 1/14/21
 * @return
 * @see [相关类/方法]（可选）
 * @since 201126
 */
public class Main {
    public static void main(String[] args) {

        FilterChain filterChain=new FilterChain();
        filterChain.addFilter(new FatherFilter()).addFilter(new WifeFilter());
        IRequest request=new IRequest() {
            @Override
            public String getLevel() {
                return "1000";
            }

            @Override
            public String request() {
                return "我要飞得更高";
            }
        };

        filterChain.doFilter(request);
    }
}
