package com.example.diplom.dao

import androidx.room.*
import com.example.diplom.model.PowerSupply

@Dao
interface PowerSupplydao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(powerSupply: PowerSupply)

    @Delete
    suspend fun delete(powerSupply: PowerSupply)

    @Update
    suspend fun  update(powerSupply: PowerSupply)

}