package org.yhx.design.mode.responsibility.chain.v2;

import org.yhx.design.mode.responsibility.chain.v1.IRequest;

/**
 * @author bigmoon
 * @date 1/14/21
 * @return
 * @see [相关类/方法]（可选）
 * @since 201126
 */
public interface Filter {

    int order();

    void doFilter(IRequest request,FilterChain filterChain);
}
