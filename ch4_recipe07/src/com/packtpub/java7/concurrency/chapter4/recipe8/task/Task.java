package com.packtpub.java7.concurrency.chapter4.recipe8.task;

import java.util.Date;

/**
 * This class implements the task of the example. Writes a message to the
 * console with the actual date.
 * 
 * Is used to explain the utilization of an scheduled executor to execute tasks
 * periodically
 *
 */
public class Task implements Runnable {

	private String name;

	public Task(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.printf("%s: Executed at: %s\n", name, new Date());
	}

}
