package com.pakt_games.kotlingenericswork.di

import com.pakt_games.kotlingenericswork.viewmodel.FirstFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val firstFragmentModule = module {
    viewModel { FirstFragmentViewModel() }
}