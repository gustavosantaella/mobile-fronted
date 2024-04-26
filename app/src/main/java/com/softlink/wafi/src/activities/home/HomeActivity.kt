package com.softlink.wafi.src.activities.home

import androidx.compose.foundation.layout.*
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.softlink.wafi.src.constants.DEFAULT_PADDING
import com.softlink.wafi.ui.theme.WafiTheme
import com.softlink.wafi.ui.theme.default
import com.softlink.wafi.src.navigation.main.Nav
import com.softlink.wafi.src.services.WalletService
import com.softlink.wafi.ui.theme.MainBlueColor

class HomeActivity: ComponentActivity() {

    private val open = mutableStateOf(false)
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val service = WalletService(applicationContext)
        val wallets = service.allWallets()
        setContent() {
            WafiTheme(mainBlueColor = true) {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = default()) {

                    Scaffold(
                        topBar = {
                            Box (
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(0.dp)
                                    .background(MainBlueColor),

                            ){
                                Row(modifier = Modifier
                                    .padding(10.dp)
                                    .fillMaxWidth(),  horizontalArrangement = Arrangement.SpaceBetween){
                                    Column() {

                                        Text(text = "Hi",  color = Color.White, fontSize = 30.sp, fontWeight = FontWeight.Bold)
                                        Text(text = "Welcome to WAFI",  color = Color.White, fontSize = 30.sp, fontWeight = FontWeight.Bold)
                                    }

                                    IconButton(
                                        modifier = Modifier.size(50.dp),
                                        onClick = { /*TODO*/ }) {
                                        Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "Go to profile",  modifier = Modifier.size(1000.dp)  )
                                    }
                                }
                            }
                        },
                        bottomBar = { Nav() },
                        floatingActionButton = {
                            IconButton(onClick = {
                                    open.value = true
                            }) {
                                Icon(imageVector = Icons.Outlined.AddCircle, contentDescription = "Go to profile", tint = MainBlueColor, modifier = Modifier.size(1000.dp) )
                            }
                        },

                    ) { initialPadding ->

                        if(open.value){
                            ModalBottomSheet(onDismissRequest = { open.value = false }) {
                                Text(text = "hola")
                            }
                        }

                         Box(modifier = Modifier.padding(initialPadding)){
                             Column() {
                                 Box(modifier = Modifier
                                     .background(MainBlueColor)
                                     .height(200.dp)
                                     .fillMaxWidth()){
                                     Box(modifier = Modifier.padding(DEFAULT_PADDING)){
                                         Row(
                                             modifier = Modifier.fillMaxSize(),
                                         ) {
                                             Text(text = "USD", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                                         }
                                         Row(
                                             modifier = Modifier.fillMaxSize(),
                                             verticalAlignment = Alignment.CenterVertically,
                                             horizontalArrangement= Arrangement.Center,
                                         ) {
                                             Text(text = "8750,43$", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                                         }
                                     }

                                 }


                                 Box(){
                                     Text(text = "HEllO")
                                 }
                             }

                         }
                    }

                }
            }
        }
    }
}






