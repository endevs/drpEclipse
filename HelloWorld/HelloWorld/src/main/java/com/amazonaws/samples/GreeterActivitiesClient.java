package com.amazonaws.samples;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;

public interface GreeterActivitiesClient {

	Promise<String> getName();

	Promise<String> getGreeting(Promise<String> name);

	void say(Promise<String> greeting);

}
