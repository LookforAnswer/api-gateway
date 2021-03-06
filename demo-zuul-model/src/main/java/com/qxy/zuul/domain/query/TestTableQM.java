package com.qxy.zuul.domain.query;

import com.qxy.zuul.domain.base.BaseQM;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: 类信息描述
 * @Author: qinxiaoyun001@lianjia.com
 * @Date: 2019/5/14 6:15 PM
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestTableQM extends BaseQM implements Serializable {

    private static final long serialVersionUID = 7055879160056784671L;

    private Long id;

    private String path;
}
