package com.example.bmiapp.feature_profile.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.bmiapp.feature_profile.domain.model.Item
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {

    @Query("SELECT * FROM item")
    fun getItems(): Flow<List<Item>>

    @Query("SELECT * FROM item WHERE id = :id")
    suspend fun getItemById(id: Int): Item?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: Item)

    @Delete
    suspend fun deleteItem(item: Item)
}