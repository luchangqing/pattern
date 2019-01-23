package com.lcq.hx.person;

/**
 * 项目名:pattern
 * 包名：PACKAGE_NAME
 * 文件名：com.lcq.hx.person.Person.java
 * 用途：(这里用一句话描述这个方法的作用)
 * 版本信息：1.0
 * 作者：luzq58
 * 日期：2019-1-23 10:49:49
 * Copyright (c) 2019 东方希望集团-版权所有.
 */

public interface Person {

	/**
	 * work(工作)
	 * @param []
	 * @return void
	 * @author luzq58
	 * @date 2019-1-23 10:50
	 * @exception
	 *
	 */
	default void work(){
		System.out.println("Person.work");
	}

	/**
	 * speak(讲话)
	 * @param []
	 * @return void
	 * @author luzq58
	 * @date 2019-1-23 10:50
	 * @exception
	 *
	 */
	void speak();

	/**
	 * eat(吃饭)
	 * @param []
	 * @return void
	 * @author luzq58
	 * @date 2019-1-23 10:51
	 * @exception
	 *
	 */
	void eat();

}
