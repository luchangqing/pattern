/**
 * 项目名:pattern
 * 包名：com.lcq.hx.test
 * 文件名：Test.java
 * 用途：(这里用一句话描述这个方法的作用)
 * 版本信息：1.0
 * 作者：luzq58
 * 日期：2019-1-23 11:07:07
 * Copyright (c) 2019 东方希望集团-版权所有.
 */
package com.lcq.hx.test;

import com.lcq.hx.person.impl.*;

public class Test {
	public static void main(String[] args) {
		People chinese = new People();
		chinese.setEatBehave(new EatMi());
		chinese.setSpeakBehave(new SpeakChinese());
		People amarican = new People();
		amarican.setEatBehave(new EatMian());
		amarican.setSpeakBehave(new SpeakEnglish());
		chinese.eat();
		chinese.speak();
		chinese.work();
		amarican.eat();
		amarican.speak();
		amarican.work();
	}
}
