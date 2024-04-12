package com.softlink.wafi.src.services

import android.content.Context
import android.util.Log
import com.softlink.wafi.src.database.Database

class WalletService(private val context: Context) {

     fun  allWallets(){
        try{
            val wallets = Database.getInstance(context).walletDao().getAll()
            Log.i("WALLETS", wallets.count().toString())
        }catch(e: Exception){
            Log.i("Database", e.message.toString())
        }
    }


}