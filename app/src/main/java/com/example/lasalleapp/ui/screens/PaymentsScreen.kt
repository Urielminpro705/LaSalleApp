package com.example.lasalleapp.ui.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lasalleapp.models.User
import com.example.lasalleapp.ui.components.OptionItem
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.utils.users

@Composable
fun PaymentsScreen (innerPadding : PaddingValues, user : User) {
    DisplayInfoScreen(innerPadding = innerPadding) {
        Text(
            text = "PAGOS",
            modifier = Modifier
                .padding(top = 20.dp, start = 20.dp, end = 20.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = MaterialTheme.colorScheme.primary
        )
        user.payments.forEach { payment ->
            OptionItem(info = "$${payment.amount}", text = payment.month, icon = if (payment.isPaid) Icons.Default.CheckCircle else Icons.Default.Warning)
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PaymentsScreenPreview () {
    LaSalleAppTheme {
        PaymentsScreen(innerPadding = PaddingValues(0.dp), users[0])
    }
}