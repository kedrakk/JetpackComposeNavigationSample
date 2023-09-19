package com.example.jetpackcomposenavigationsample.data

import com.example.jetpackcomposenavigationsample.R

object BottomBarItemsData {
    val allBottomBarItems: List<BottomBarItems> = listOf(
        BottomBarItems(icon = R.drawable.baseline_home_24, label = "Home", index = 1, destination = ROUTES.HOME_CONTENT,),
        BottomBarItems(icon = R.drawable.baseline_account_circle_24, label = "Account", index = 2, destination = ROUTES.ACCOUNT,)
    )
}