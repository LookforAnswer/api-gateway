package com.qxy.zuul.domain.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 分页返回对象
 * @Author: qinxiaoyun001@lianjia.com
 * @Date: 2018/10/15 下午8:26
 * @Version: 1.0
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageInfo<T> implements Serializable {

    private static final long serialVersionUID = -3003839787150809449L;

    /**
     * 当前页
     */
    private int currentPage;

    /**
     * 每页数量
     */
    private int pageSize;

    /**
     * 总数
     */
    private long total;

    /**
     * 总页数
     */
    private long totalPage;

    /**
     * 结果行数
     */
    private List<T> list;

    /**
     * 重写 get 方法
     * @return
     */
    long getTotalPage() {
        long pages = total / pageSize;
        //非整页
        if (0 != total % pageSize) {
            pages++;
        }
        return pages;
    }
}
