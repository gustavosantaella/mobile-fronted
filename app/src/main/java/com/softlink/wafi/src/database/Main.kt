package com.softlink.wafi.src.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.softlink.wafi.src.dao.WalletDAO
import com.softlink.wafi.src.models.Wallet

@Database(entities = [Wallet::class], version = 1)
abstract class Database : RoomDatabase() {
    abstract fun walletDao(): WalletDAO
}