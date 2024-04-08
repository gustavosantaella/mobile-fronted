package com.softlink.wafi.src.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wallets")
data class Wallet(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "balance") val balance: Float,
    @ColumnInfo(name = "currency") val currency: String,
    )