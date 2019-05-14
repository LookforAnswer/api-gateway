package com.qxy.zuul;

import com.qxy.zuul.domain.TestTable;
import com.qxy.zuul.domain.query.TestTableQM;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description: 类信息描述
 * @Author: qinxiaoyun001@lianjia.com
 * @Date: 2019/5/14 5:43 PM
 * @Version: 1.0
 */
@Mapper
public interface TestMapper {

    List<TestTable> findList(TestTableQM queryParam);

    Long insert();

    int update(TestTable updateObj);

    Long count(TestTableQM queryParam);
}
