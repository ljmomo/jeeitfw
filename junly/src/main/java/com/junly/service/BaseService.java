package com.junly.service;

import java.util.List;

public interface BaseService<K,V> {
	public int save(V v);
	public int update(V v);
	public int delete(K k);
	public V selectById(K k);
	public List<V> selectList();
}
