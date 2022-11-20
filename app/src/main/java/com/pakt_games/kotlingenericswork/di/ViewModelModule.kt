package com.pakt_games.kotlingenericswork.di

import com.pakt_games.kotlingenericswork.viewmodel.CityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val cityViewModelModule = module {
    viewModel { CityViewModel() }
}