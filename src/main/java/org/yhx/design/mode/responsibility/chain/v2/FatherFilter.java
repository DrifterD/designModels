package org.yhx.design.mode.responsibility.chain.v2;

import org.yhx.design.mode.responsibility.chain.v1.IRequest;

/**
 * @author bigmoon
 * @date 1/14/21
 * @return
 * @see [相关类/方法]（可选）
 * @since 201126
 */
public class FatherFilter implements Filter {

    @Override
    public int order() {
        return 10;
    }

    @Override
    public void doFilter(IRequest request,FilterChain filterChain) {
        System.out.println("faterFilter start,level="+request.getLevel());
        filterChain.doFilter(request);
        System.out.println("faterFilter end");
    }
}
