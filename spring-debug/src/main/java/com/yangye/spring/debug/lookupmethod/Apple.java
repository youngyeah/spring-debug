package com.yangye.spring.debug.lookupmethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class Apple {

	@Lookup
	public abstract Banana createBanana();

	@Autowired
	private Banana banana;

	public Banana getBanana() {
		return banana;
	}

	public void setBanana(Banana banana) {
		this.banana = banana;
	}
}
