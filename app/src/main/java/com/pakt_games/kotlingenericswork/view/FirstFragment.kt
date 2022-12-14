package com.pakt_games.kotlingenericswork.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.pakt_games.kotlingenericswork.R
import com.pakt_games.kotlingenericswork.databinding.FragmentFirstBinding
import com.pakt_games.kotlingenericswork.di.firstFragmentModule
import com.pakt_games.kotlingenericswork.model.City
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dependecyInversion()

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    private fun dependecyInversion() {
        startKoin {
            androidContext(requireActivity())
            modules(firstFragmentModule)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cityCode: City<Int> = City(16)
        val cityName: City<String> = City("Bursa")

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        binding.buttonCityCode.setOnClickListener {
            Toast.makeText(requireContext(), "City Code: $cityCode", Toast.LENGTH_SHORT)
        }
        binding.buttonCityName.setOnClickListener {
            Toast.makeText(requireContext(), "City Name: $cityName", Toast.LENGTH_SHORT)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}