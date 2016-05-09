package com.golive.base.api.memcache;

import net.rubyeye.xmemcached.exception.MemcachedException;

import java.util.concurrent.TimeoutException;

/**
 * packaging memcache common api
 *
 * @author wuzhping
 * @date 2013-11-23
 */
public interface BaseCacheApi {
    /**
     * add object into cache
     *
     * @param key
     * @param obj
     * @param expire expire time  (s)
     * @return
     * @throws MemcachedException
     * @throws TimeoutException
     * @throws InterruptedException
     */
    boolean add(String key, int expire, Object obj) throws MemcachedException, TimeoutException, InterruptedException;

    /**
     * get object from cache
     *
     * @param key
     * @return
     * @throws MemcachedException
     * @throws TimeoutException
     * @throws InterruptedException
     */
    Object get(String key) throws MemcachedException, TimeoutException, InterruptedException;

    /**
     * delete object from cache
     *
     * @param key
     * @return
     * @throws MemcachedException
     * @throws TimeoutException
     * @throws InterruptedException
     */
    boolean delete(String key) throws MemcachedException, TimeoutException, InterruptedException;

    /**
     * replace object from cache
     *
     * @param key
     * @param obj
     * @param expire expire time  (s)
     * @return
     * @throws MemcachedException
     * @throws TimeoutException
     * @throws InterruptedException
     */
    boolean replace(String key, int expire, Object obj) throws MemcachedException, TimeoutException, InterruptedException;

    /**
     * remove all cache object
     */
    void removeAll() throws InterruptedException, MemcachedException, TimeoutException;

    /**
     * get object from cache
     * and update expire time
     *
     * @param key
     * @param expire expire time  (s)
     * @return
     * @throws InterruptedException
     * @throws MemcachedException
     * @throws TimeoutException
     */
    Object getAndTouch(String key, int expire) throws InterruptedException, MemcachedException, TimeoutException;

    /**
     * update cache expire time
     *
     * @param key
     * @param expire expire time  (s)
     * @return
     * @throws InterruptedException
     * @throws MemcachedException
     * @throws TimeoutException
     */
    boolean touch(String key, int expire) throws InterruptedException, MemcachedException, TimeoutException;
}
