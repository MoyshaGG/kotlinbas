package com.example.diplom.dao


import androidx.room.*
import com.example.diplom.model.CPU
import com.example.diplom.model.Motherboard


@Dao
interface MotherboardDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(motherboard: Motherboard)

    @Delete
    suspend fun delete(motherboard: Motherboard)

    @Update
    suspend fun  update(motherboard: Motherboard)

}