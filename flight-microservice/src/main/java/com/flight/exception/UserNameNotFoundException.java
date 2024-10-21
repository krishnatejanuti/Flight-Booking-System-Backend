package com.flight.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNameNotFoundException extends Exception
{
//	public UserNameNotFoundException(String msg)
//	{
//		super(msg);
//	}
}
