package com.example.lasalleapp.ui.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.lasalleapp.R
import com.example.lasalleapp.models.User
import com.example.lasalleapp.ui.components.OptionItem
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.ui.theme.poppinsFontFamily
import com.example.lasalleapp.utils.Screens
import com.example.lasalleapp.utils.users

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun SettingsScreen (innerPadding: PaddingValues){
    val user : User = users[0]
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.onPrimary)
            .verticalScroll(
                rememberScrollState()
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box (
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "background",
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
        }
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-120).dp)
                .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))

        ){
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.onPrimary)
                    .padding(top = 30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .width(130.dp)
                        .height(130.dp)
                        .clip(RoundedCornerShape(75.dp))
                        .background(MaterialTheme.colorScheme.primary),
                ) {
                    AsyncImage(
                        model = user.img,
                        contentDescription = "Profile picture",
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentScale = ContentScale.Crop
                    )
                }
                Text (
                    modifier = Modifier
                        .padding(top = 20.dp),
                    text = "${user.name} ${user.lastName} ${user.secondLastName}",
                    fontSize = 20.sp,
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.primary
                )

                OptionItem(user.name, "Nombre del Alumno",icon = Icons.Default.Person)
                OptionItem(user.lastName, "Apellido Paterno",icon = Icons.Default.Person)
                OptionItem(user.secondLastName, "Apellido Materno",icon = Icons.Default.Person)
                OptionItem(user.email, "Correo Electronico",icon = Icons.Default.Email)
                OptionItem(user.birthDay.toString(), "Fecha de nacimiento",icon = Icons.Default.DateRange)
                
                Button(onClick = { /*TODO*/ }) {
                    
                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview (
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SettingsScreenPreview() {
    LaSalleAppTheme {
        SettingsScreen(innerPadding = PaddingValues(0.dp))
    }
}