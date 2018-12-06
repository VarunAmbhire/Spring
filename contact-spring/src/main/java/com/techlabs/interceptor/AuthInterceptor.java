package com.techlabs.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AuthInterceptor implements Interceptor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	SessionMap<String, Object> map;
	String log;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub

		Map<String, Object> session = invocation.getInvocationContext().getSession();

		if (session == null || session.get("user") == null) {
			return "Login";
		} else {
			return invocation.invoke();
		}
	}

}
