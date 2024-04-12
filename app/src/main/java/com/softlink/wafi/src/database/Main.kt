package com.softlink.wafi.src.database

import android.content.Context
import androidx.room.Database as RDatabase
import androidx.room.Room
import androidx.room.RoomDatabase
import com.softlink.wafi.src.dao.WalletDAO
import com.softlink.wafi.src.models.Wallet

@RDatabase(entities = [Wallet::class], version = 1)
abstract class Database : RoomDatabase() {
    abstract fun walletDao(): WalletDAO


    companion object {
        // volatile makes the var visible in other threads
        @Volatile
        private var INSTANCE: Database? = null
        fun getInstance(context: Context): Database {
            synchronized(this) {
                var instance: Database? = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(context.applicationContext, Database::class.java, "wafi").allowMainThreadQueries().build();

                }
                return instance
            }
        }

    }
}