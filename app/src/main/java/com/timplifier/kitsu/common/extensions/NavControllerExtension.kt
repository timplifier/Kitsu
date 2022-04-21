package com.timplifier.kitsu.common.extensions

import android.text.Layout
import androidx.annotation.IdRes
import androidx.navigation.NavController

fun NavController.safeNavigation(@IdRes actionId: Int) {
    currentDestination?.getAction(actionId)?.let { navigate(actionId) }
}

fun NavController.directionsSafeNavigation(directions: Layout.Directions) {}