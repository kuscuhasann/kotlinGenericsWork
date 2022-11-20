package com.pakt_games.kotlingenericswork.utils

import android.widget.Toast
import androidx.fragment.app.Fragment

fun Fragment.showToast(messageToShow : String){
    Toast.makeText(requireContext(), messageToShow, Toast.LENGTH_LONG).show()
}