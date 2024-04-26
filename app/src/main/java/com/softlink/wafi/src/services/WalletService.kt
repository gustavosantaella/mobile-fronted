package com.softlink.wafi.src.services

import android.content.Context
import android.util.Log
import com.softlink.wafi.src.database.Database
import com.softlink.wafi.src.models.Wallet

class WalletService(private val context: Context) {

     fun  allWallets(): Array<Wallet> {
         var wallets = arrayOf<Wallet>();
         try {
             wallets = Database.getInstance(context).walletDao().getAll();
         } catch (e: Exception) {
             Log.i("Database", e.message.toString())
         }

         return wallets;
    }


}