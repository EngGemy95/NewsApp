package com.loc.newsapp.presentation.details.components

sealed class DetailsEvent {
    object SaveArticle : DetailsEvent()
}