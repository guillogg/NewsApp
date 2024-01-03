package com.proyecto.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.proyecto.newsapp.R

data class Page(
    val title:String,
    val description:String,
    @DrawableRes val image: Int
)

val pages= listOf(
    Page(title = "bla bla bla",
    description = "ojio123kjh12jkl3kl1j2 k3lj1kl2j3 l1k23 kl1j2l3kj1kl231",
    image = R.drawable.presentation1),
    Page(title = "bla bla bla",
        description = "ojio123kjh12jkl3kl1j2 k3lj1kl2j3 l1k23 kl1j2l3kj1kl231",
        image = R.drawable.presentation2),
    Page(title = "bla bla bla",
        description = "ojio123kjh12jkl3kl1j2 k3lj1kl2j3 l1k23 kl1j2l3kj1kl231",
        image = R.drawable.presentation3)
)
