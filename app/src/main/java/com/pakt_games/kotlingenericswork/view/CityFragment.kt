package com.pakt_games.kotlingenericswork.view


import android.content.res.loader.ResourcesProvider
import com.pakt_games.kotlingenericswork.R
import com.pakt_games.kotlingenericswork.base.BaseFragment
import com.pakt_games.kotlingenericswork.databinding.FragmentCityBinding
import com.pakt_games.kotlingenericswork.di.cityViewModelModule
import com.pakt_games.kotlingenericswork.utils.showToast
import com.pakt_games.kotlingenericswork.viewmodel.CityViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.startKoin

class CityFragment : BaseFragment<CityViewModel, FragmentCityBinding>() {

    override val viewModel: CityViewModel by viewModel()

    companion object {
        private const val BURSA_CITY_CODE = 16
    }

    override fun getLayoutID() = R.layout.fragment_city
    override fun observeItems() {
        buttonClickActions()
    }

    private fun buttonClickActions() {
        dataBinding.buttonCityName.setOnClickListener {
            showToast(viewModel.returnModelDataForStringValues(
                resources.getString(R.string.city_fragment_bursa_city_name)).value)
        }
        dataBinding.buttonCityCode.setOnClickListener {
            showToast(viewModel.returnModelDataForIntValues(
                BURSA_CITY_CODE).value.toString())
        }
    }

    override fun actionEvents() {
        startKoin {
            androidContext(requireActivity())
            modules(cityViewModelModule)
        }
    }
}