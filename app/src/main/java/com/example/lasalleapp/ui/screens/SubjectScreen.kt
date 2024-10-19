package com.example.lasalleapp.ui.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
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
import com.example.lasalleapp.models.Subject
import com.example.lasalleapp.ui.components.OptionItem
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.utils.subjects
import com.example.lasalleapp.utils.users

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun SubjectScreen (innerPadding : PaddingValues, subjectId : Int){
    val user = users[0]
    val subject = user.major.subjects.first { it.id == subjectId }
    DisplayInfoScreen(innerPadding = innerPadding) {
        Text(
            text = subject.name.uppercase(),
            modifier = Modifier
                .padding(top = 20.dp, start = 20.dp, end = 20.dp),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Text(
            text = "Calificaciones",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 20.dp, top = 40.dp),
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 18.sp,
        )

        OptionItem(info = subject.grade1.toString(), text = "Primer Parcial", icon = if (subject.grade1 >= 7) Icons.Default.CheckCircle else Icons.Default.Warning)
        OptionItem(info = subject.grade2.toString(), text = "Segundo Parcial", icon = if (subject.grade2 >= 7) Icons.Default.CheckCircle else Icons.Default.Warning)
        OptionItem(info = subject.grade3.toString(), text = "Tercer Parcial", icon = if (subject.grade3 >= 7) Icons.Default.CheckCircle else Icons.Default.Warning)
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SubjectScreenPreview() {
    LaSalleAppTheme {
        SubjectScreen(innerPadding = PaddingValues(0.dp), 1)
    }
}