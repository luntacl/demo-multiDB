package com.ulic.core.exception;


/**
 * 调用接口传递的参数异常，该异常日志里面不需要抛出exception
 * 
 *
 */
public class PlatformIllegalArgumentException extends PlatformException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3245258783983511058L;


	public PlatformIllegalArgumentException(ExceptionCode code)
	{
		super(code);
	}

	public PlatformIllegalArgumentException(ExceptionCode code, Object[] codeArgs)
	{
		super(code,codeArgs);
	}

	public PlatformIllegalArgumentException(ExceptionCode code, Throwable cause)
	{
		super(code,cause);
	}

	public PlatformIllegalArgumentException(ExceptionCode code, Throwable cause, Object[] codeArgs)
	{
		super(code,cause,codeArgs);
	}
}
