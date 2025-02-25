package moc.compose.kmm.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import moc.compose.kmm.Platform

@Composable
fun AboutScreen(){
    LazyColumn(modifier = Modifier.fillMaxSize()){
        items(getPlatformDetails()){ item ->
            AboutComponent(item.first, item.second)
        }
    }
}


@Composable
fun AboutComponent(
    title: String,
    subtitle: String
){
    Column(modifier = Modifier.padding(16.dp)){
        Text(
            text = title,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = subtitle,
            color = Color.Black
        )
    }

    HorizontalDivider()
}

private fun getPlatformDetails(): List<Pair<String, String>>{
    val platform = Platform()
    return listOf(
        Pair("Sistema Operacional: ", "${platform.osName} ${platform.osVersion}"),
        Pair("Dispositivo: ", platform.deviceModel)
    )
}