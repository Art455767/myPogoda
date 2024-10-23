package com.example.mypogoda.fragments

import android.content.pm.PackageManager
import androidx.fragment.app.Fragment
import androidx.core.content.ContextCompat

fun Fragment.isPermissionGranted(p: String): Boolean {
    return ContextCompat.checkSelfPermission(
        requireActivity(), p) == PackageManager.PERMISSION_GRANTED
}
