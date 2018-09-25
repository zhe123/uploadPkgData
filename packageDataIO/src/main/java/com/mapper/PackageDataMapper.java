package com.mapper;

import java.util.List;

import com.modelAndDomain.PackageData;

public interface PackageDataMapper {
        List<PackageData> getAll();
        PackageData getOne(Long id);
        void insert(PackageData pkg);
        void delete(Long id);
        void update(PackageData pkg);
}
