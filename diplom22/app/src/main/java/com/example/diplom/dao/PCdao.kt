package com.example.diplom.dao

import androidx.room.*
import com.example.diplom.model.PC

@Dao
interface PCdao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(pc: PC)

    @Delete
    suspend fun delete(pc: PC)

    @Update
    suspend fun  update(pc: PC)

}