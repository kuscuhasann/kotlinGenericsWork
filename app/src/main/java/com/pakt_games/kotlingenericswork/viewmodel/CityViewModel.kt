package com.pakt_games.kotlingenericswork.viewmodel

import com.pakt_games.kotlingenericswork.base.BaseViewModel
import com.pakt_games.kotlingenericswork.model.City

class CityViewModel: BaseViewModel() {

    private var _cityModelForString: City<String>? = null
    var cityValueForString = _cityModelForString

    private var _cityModelForInt: City<Int>? = null
    var cityModelForInt = _cityModelForInt

    fun returnModelDataForStringValues(cityValueForString: String): City<String>{
        City(cityValueForString).also { _cityModelForString = it }
        return _cityModelForString as City<String>
    }

    fun returnModelDataForIntValues(cityValueForInt: Int): City<Int>{
        City(cityValueForInt).also { _cityModelForInt = it }
        return _cityModelForInt as City<Int>
    }
}