package com.softlink.wafi.src.dao

import androidx.room.Dao
import androidx.room.Query
import com.softlink.wafi.src.models.Wallet

@Dao
interface WalletDAO {

    @Query("SELECT * FROM wallets")
    fun getAll(): List<Wallet>;
}