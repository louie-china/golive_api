package com.golive.base.api.mapper;



import com.golive.base.api.model.ClientType;

import java.util.List;

public interface BaseDataMapper {

    List<ClientType> findClientTypeList() throws Exception;

    ClientType findClientTypeByCode(String code) throws Exception;

}
