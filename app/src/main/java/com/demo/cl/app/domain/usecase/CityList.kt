package com.demo.cl.app.domain.usecase

import com.demo.cl.app.domain.entity.City
import com.demo.cl.app.domain.entity.protocol.DataResource
import com.demo.cl.app.domain.entity.protocol.LiveDataEntity
import com.demo.cl.app.domain.repo.CityRepository
import javax.inject.Inject

class GetDividedCityList @Inject constructor(private val cityRepository: CityRepository) : UseCaseLiveData<Nothing, Array<List<City>>>() {
    override fun getLiveData(params: Nothing?): LiveDataEntity<DataResource<Array<List<City>>>> {
       return cityRepository.getDividedCityList()
    }
}

class GetTitle @Inject constructor(private val cityRepository: CityRepository) : UseCaseLiveData<Nothing, String>() {
    override fun getLiveData(params: Nothing?): LiveDataEntity<DataResource<String>> {
        return cityRepository.getTitle()
    }
}