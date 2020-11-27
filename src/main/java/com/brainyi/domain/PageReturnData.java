package com.brainyi.domain;

import java.util.List;

/**
 * TODO
 *
 * @author ahao 2020-11-27
 */
public class PageReturnData<E> extends Result{

    private Integer count;
    private List<E> data;

    public PageReturnData() {
    }

    public PageReturnData(Integer code, String msg, Integer count, List<E> data) {
        super(code,msg);
        this.count = count;
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<E> getData() {
        return data;
    }

    public void setData(List<E> data) {
        this.data = data;
    }
}
