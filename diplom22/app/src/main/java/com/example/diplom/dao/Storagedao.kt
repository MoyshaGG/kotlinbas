package com.example.diplom.dao

import androidx.room.*
import com.example.diplom.model.Storage


@Dao
interface Storagedao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(storage: Storage)

    @Delete
    suspend fun delete(storage: Storage )

    @Update
    suspend fun  update(storage: Storage)
}