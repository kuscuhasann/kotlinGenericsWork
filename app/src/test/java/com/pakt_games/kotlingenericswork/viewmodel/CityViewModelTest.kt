package com.pakt_games.kotlingenericswork.viewmodel

import com.google.common.truth.Truth
import com.pakt_games.kotlingenericswork.model.City
import kotlinx.coroutines.cancel
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class CityViewModelTest {

    private lateinit var viewModel: CityViewModel

    @Before
    fun setUp() {
        viewModel = CityViewModel()
    }

    @After
    fun tearDown() {
        viewModel.cancel()
    }

    @Test
    fun returnModelDataForStringValues_isValueFill_returnedSameModelOfValue() {
        // given
        val cityName = "Bursa"
        val resultModel: City<String>?
        // when
        resultModel = viewModel.returnModelDataForStringValues(cityName)

        // then
        Truth.assertThat(resultModel.value).isEqualTo(cityName)
    }

    @Test
    fun returnModelDataForIntValues_isValueFill_returnedSameModelOfValue() {
        // given
        val cityCode = 16
        val resultModel: City<Int>?
        // when
        resultModel = viewModel.returnModelDataForIntValues(cityCode)

        // then
        Truth.assertThat(resultModel.value).isEqualTo(cityCode)
    }
}