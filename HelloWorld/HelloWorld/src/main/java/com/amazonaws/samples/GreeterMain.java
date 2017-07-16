package com.amazonaws.samples;

public class GreeterMain {

	public static void main(String[] args) {
		GreeterWorkflow greeter = new GreeterWorkflowImpl();
	      greeter.greet();

	}

}
