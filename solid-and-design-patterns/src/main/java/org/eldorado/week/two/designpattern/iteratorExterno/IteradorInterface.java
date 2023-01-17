package org.eldorado.week.two.designpattern.iteratorExterno;

public interface IteradorInterface {
	void first();

	void next();

	boolean isDone();

	Canal currentItem();
}
