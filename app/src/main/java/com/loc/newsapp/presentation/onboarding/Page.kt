package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title : String,
    val description : String,
    @DrawableRes val image : Int,
)

val pages = listOf(
    Page(
        title = "Lorem Ipsum Simply dummy",
        description = "Lorem Ipsum is Simply dummy text of the printing and typesetting industry",
        R.drawable.onboarding1
    ),
    Page(
        title = "Lorem Ipsum Simply dummy",
        description = "Lorem Ipsum is Simply dummy text of the printing and typesetting industry",
        R.drawable.onboarding2
    ),
    Page(
        title = "Lorem Ipsum Simply dummy",
        description = "Lorem Ipsum is Simply dummy text of the printing and typesetting industry",
        R.drawable.onboarding3
    ),
)