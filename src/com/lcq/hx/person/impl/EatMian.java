/**
 * 项目名:pattern
 * 包名：com.lcq.hx.person.impl
 * 文件名：EatMian.java
 * 用途：(这里用一句话描述这个方法的作用)
 * 版本信息：1.0
 * 作者：luzq58
 * 日期：2019-1-23 11:04:04
 * Copyright (c) 2019 东方希望集团-版权所有.
 */
package com.lcq.hx.person.impl;

import com.lcq.hx.person.EatBehave;

public class EatMian implements EatBehave {
	@Override
	public void doeat() {
		System.out.println("EatMian.doeat");
	}
}
