package com.mapper;

import java.util.List;

import com.modelAndDomain.ItemData;

public interface ItemDataMapper {
	 List<ItemData> getAll();
     ItemData getOne(Long id);
     void insert(ItemData item);
     void delete(Long id);
     void update(ItemData item);

}
