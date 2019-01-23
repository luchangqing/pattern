/**
 * 项目名:pattern
 * 包名：com.lcq.hx.person.impl
 * 文件名：People.java
 * 用途：(这里用一句话描述这个方法的作用)
 * 版本信息：1.0
 * 作者：luzq58
 * 日期：2019-1-23 10:53:53
 * Copyright (c) 2019 东方希望集团-版权所有.
 */
package com.lcq.hx.person.impl;

import com.lcq.hx.person.EatBehave;
import com.lcq.hx.person.Person;
import com.lcq.hx.person.SpeakBehave;

public class People implements Person {
	private EatBehave eatBehave;
	private SpeakBehave speakBehave;

	/**
	 * speak(讲话)
	 *
	 * @return void
	 * @throws
	 * @author luzq58
	 * @date 2019-1-23 10:50
	 */
	@Override
	public void speak() {
		speakBehave.doSpeak();
	}

	/**
	 * eat(吃饭)
	 *
	 * @return void
	 * @throws
	 * @author luzq58
	 * @date 2019-1-23 10:51
	 */
	@Override
	public void eat() {
		eatBehave.doeat();
	}
	public void setEatBehave(EatBehave eatBehave) {
		this.eatBehave = eatBehave;
	}

	public void setSpeakBehave(SpeakBehave speakBehave) {
		this.speakBehave = speakBehave;
	}

}
