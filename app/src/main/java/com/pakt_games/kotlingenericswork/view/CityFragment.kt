package com.pakt_games.kotlingenericswork.view


import com.pakt_games.kotlingenericswork.R
import com.pakt_games.kotlingenericswork.base.BaseFragment
import com.pakt_games.kotlingenericswork.databinding.FragmentCityBinding
import com.pakt_games.kotlingenericswork.di.cityViewModelModule
import com.pakt_games.kotlingenericswork.viewmodel.CityViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.startKoin

class CityFragment : BaseFragment<CityViewModel, FragmentCityBinding>() {

    override val viewModel: CityViewModel by viewModel()

    override fun getLayoutID() = R.layout.fragment_city
    override fun observeItems() {

    }

    override fun actionEvents() {
        startKoin {
            androidContext(requireActivity())
            modules(cityViewModelModule)
        }
    }
}