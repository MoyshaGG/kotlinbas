package com.example.diplom.dao

import androidx.room.*
import com.example.diplom.model.RamMemory

@Dao
interface RamMemorydao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(ramMemory: RamMemory)

    @Delete
    suspend fun delete(ramMemory: RamMemory)

    @Update
    suspend fun  update(ramMemory: RamMemory)
}