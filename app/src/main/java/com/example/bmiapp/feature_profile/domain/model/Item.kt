package com.example.bmiapp.feature_profile.domain.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity
data class Item (
    val title: String,
    val value: String,
    @PrimaryKey val id: Int? = null
)