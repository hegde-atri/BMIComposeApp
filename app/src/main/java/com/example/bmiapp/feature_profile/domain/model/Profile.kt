package com.example.bmiapp.feature_profile.domain.model

import androidx.room.Entity

@Entity
data class Profile (
    val name: String,
    val email: String,
    val pro: Boolean,
)