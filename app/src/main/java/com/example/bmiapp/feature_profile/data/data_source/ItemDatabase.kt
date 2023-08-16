package com.example.bmiapp.feature_profile.data.data_source

import androidx.room.Database
import com.example.bmiapp.feature_profile.domain.model.Item

@Database(
    entities = [Item::class],
    version = 1
)
abstract class ItemDatabase() {
    abstract val itemDao: ItemDao
}