package com.example.newsapp.models

import java.io.Serializable

data class News(
    val title: String,
    val createdAr: Long
) : Serializable
