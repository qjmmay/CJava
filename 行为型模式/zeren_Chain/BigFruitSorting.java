package com.qjm.zeren_Chain;

public class BigFruitSorting extends AbstractFruitSort{

	public BigFruitSorting(int weight) {
		super(weight);
		// TODO 自动生成的构造函数存根
	}

	@Override
	protected void pushBox(String fruit) {
		// TODO 自动生成的方法存根
		fruitBox.add("超市："+fruit);
	}

}
