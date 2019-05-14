package com.qxy.zuul.domain.base;

import lombok.Data;
import lombok.ToString;


/**
 * 基础的查询模型
 */
@Data
@ToString
public class BaseQM {

	private Long id;                                  //id

	private Boolean isDesc;                           //是不是降序

	private Page page;                                //分页

	private Integer status;                           //状态

	private OrderByOperation orderByOperation;        //order by 相关操作，支持多个字段
	
	public static final String COL_ID = "id";

	public static final String COL_UPDATE_TIME = "update_time";

	public static final String COL_CREATE_TIME = "create_time";

	/**
	 * 添加排序
	 * @param orderColumn
	 */
	public void addOrderAsc(String orderColumn){

		if(orderByOperation == null){
			orderByOperation = new OrderByOperation();
		}

		orderByOperation.addOrderItem(orderColumn, OrderByOperation.ORDER_OPERATOR_ASC);
	}

	public void addOrderDesc(String orderColumn){

		if(orderByOperation == null){
			orderByOperation = new OrderByOperation();
		}

		orderByOperation.addOrderItem(orderColumn, OrderByOperation.ORDER_OPERATOR_DESC);
	}

}
