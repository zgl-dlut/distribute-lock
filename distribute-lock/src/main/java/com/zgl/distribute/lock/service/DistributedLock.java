package com.zgl.distribute.lock.service;

/**
 * @author zgl
 * @date 2019/12/31 下午3:05
 */
public interface DistributedLock {

	long TIMEOUT_MILLIS = 30000;

	int RETRY_TIMES = Integer.MAX_VALUE;

	long SLEEP_MILLIS = 500;

	boolean lock(String key);

	boolean lock(String key, int retryTimes);

	boolean lock(String key, int retryTimes, long sleepMillis);

	boolean lock(String key, long expire);

	boolean lock(String key, long expire, int retryTimes);

	boolean lock(String key, long expire, int retryTimes, long sleepMillis);

	boolean releaseLock(String key);
}