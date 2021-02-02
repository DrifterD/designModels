package org.yhx.design.mode.responsibility.chain.v2;

import javafx.collections.transformation.SortedList;
import org.yhx.design.mode.responsibility.chain.v1.IRequest;

import java.util.*;

/**
 * @author bigmoon
 * @date 1/14/21
 * @return
 * @see [相关类/方法]（可选）
 * @since 201126
 */
public class FilterChain {

    Comparator<Filter> comparator=(f1,f2)->{
       return f1.order()-f2.order();
    };

    List<Filter> filterList=new ArrayList<>();
    private int index=0;

    public FilterChain addFilter(Filter filter){
        if(null!=filter){
            this.filterList.add(filter);
        }

        this.filterList.sort(comparator);

        return this;
    }


    void doFilter(IRequest request){

        if(filterList.size()==index){
            System.out.println("已经越界咯");
            return;
        }

       Filter filter= filterList.get(this.index);

        if(null!=filter){
            this.index++;
            filter.doFilter(request,this);
        }
    }
}
