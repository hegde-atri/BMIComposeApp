package com.example.bmiapp.feature_profile.data.repository

import com.example.bmiapp.feature_profile.data.data_source.ItemDao
import com.example.bmiapp.feature_profile.domain.model.Item
import com.example.bmiapp.feature_profile.domain.repository.ItemRepository
import kotlinx.coroutines.flow.Flow

class ItemRepositoryImpl(
    private val dao: ItemDao
) : ItemRepository {
    override fun getItems(): Flow<List<Item>> {
        return dao.getItems()
    }

    override suspend fun getItemById(id: Int): Item? {
        return dao.getItemById(id)
    }

    override suspend fun insertItem(item: Item) {
        dao.insertItem(item)
    }

    override suspend fun deleteItem(item: Item) {
        dao.deleteItem(item)
    }
}