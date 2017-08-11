package com.ulic.core.exception;

/**
 * 服务异常，比如调用核心失败、数据库访问失败、缓存访问失败要记录并且抛出
 */
public class PlatformRuntimeException extends PlatformException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1723355624334958360L;

	// 包含ExceptionCode的构造函数
	public PlatformRuntimeException(ExceptionCode code) {
		super(code);
	}

	public PlatformRuntimeException(ExceptionCode code, Object[] codeArgs) {
		super(code, codeArgs);
	}

	public PlatformRuntimeException(ExceptionCode code, Throwable cause) {
		super(code, cause);
	}

	public PlatformRuntimeException(ExceptionCode code, Throwable cause, Object[] codeArgs) {
		super(code, cause, codeArgs);
	}
}