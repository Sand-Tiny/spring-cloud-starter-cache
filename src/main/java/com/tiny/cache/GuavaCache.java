package com.tiny.cache;

import java.util.concurrent.Callable;

import org.springframework.cache.support.AbstractValueAdaptingCache;

public class GuavaCache extends AbstractValueAdaptingCache {

    protected GuavaCache(boolean allowNullValues) {
        super(allowNullValues);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object getNativeCache() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T get(Object key, Callable<T> valueLoader) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void put(Object key, Object value) {
        // TODO Auto-generated method stub

    }

    @Override
    public ValueWrapper putIfAbsent(Object key, Object value) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void evict(Object key) {
        // TODO Auto-generated method stub

    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    protected Object lookup(Object key) {
        // TODO Auto-generated method stub
        return null;
    }

}
