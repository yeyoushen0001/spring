package com.wang.study.api;

import org.glassfish.jersey.server.ResourceConfig;

public class RestJaxRsApplication extends ResourceConfig {
	public RestJaxRsApplication() {
		register(ApiUserController.class);
	}
}
