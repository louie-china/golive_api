package com.golive.base.api.memcache.impl;


import com.golive.base.api.memcache.BaseCacheApi;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeoutException;

@Component
public class BaseCacheApiImpl implements BaseCacheApi {

    @Resource(name = "memcachedClient")
    private MemcachedClient memcachedClient;


    public boolean add(String key, int expire, Object obj) throws MemcachedException, TimeoutException, InterruptedException {
        return memcachedClient.set(key, expire, obj);
    }


    public Object get(String key) throws MemcachedException, TimeoutException, InterruptedException {
        return memcachedClient.get(key);
    }


    public boolean delete(String key) throws MemcachedException, TimeoutException, InterruptedException {
        return memcachedClient.delete(key);
    }


    public boolean replace(String key, int expire, Object obj) throws MemcachedException, TimeoutException, InterruptedException {
        return memcachedClient.replace(key, expire, obj);
    }


    public void removeAll() throws InterruptedException, MemcachedException, TimeoutException {
        memcachedClient.flushAll();
    }


    public Object getAndTouch(String key, int expire) throws InterruptedException, MemcachedException, TimeoutException {
        return memcachedClient.getAndTouch(key, expire);
    }


    public boolean touch(String key, int expire) throws InterruptedException, MemcachedException, TimeoutException {
        return memcachedClient.touch(key, expire);
    }
}
