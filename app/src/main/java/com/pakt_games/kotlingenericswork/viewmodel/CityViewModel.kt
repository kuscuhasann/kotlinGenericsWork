package com.pakt_games.kotlingenericswork.viewmodel

import com.pakt_games.kotlingenericswork.base.BaseViewModel
import com.pakt_games.kotlingenericswork.model.City

class CityViewModel: BaseViewModel() {

    private var _cityModelForString: City<String>? = null

    private var _cityModelForInt: City<Int>? = null

    fun returnModelDataForStringValues(cityValueForString: String): City<String>{
        City(cityValueForString).also { cityName ->
            _cityModelForString = cityName
        }
        return _cityModelForString as City<String>
    }

    fun returnModelDataForIntValues(cityValueForInt: Int): City<Int>{
        City(cityValueForInt).also { cityCode ->
            _cityModelForInt = cityCode
        }
        return _cityModelForInt as City<Int>
    }
}