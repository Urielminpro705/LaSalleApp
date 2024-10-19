package com.example.lasalleapp.utils

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.lasalleapp.models.Community
import com.example.lasalleapp.models.Major
import com.example.lasalleapp.models.News
import com.example.lasalleapp.models.Subject
import com.example.lasalleapp.models.User
import java.time.LocalDate

val newsList = listOf(
    News(
        id = 1,
        title = "Evento de Construcción de la Paz",
        description = "La Salle Bajío realiza un foro para fomentar la construcción de la paz en la comunidad estudiantil.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_1.jpg"
    ),
    News(
        id = 2,
        title = "Conferencia de Liderazgo",
        description = "Una conferencia que destaca la importancia del liderazgo en la comunidad universitaria.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_2.jpg"
    ),
    News(
        id = 3,
        title = "Semana Cultural 2024",
        description = "Celebración anual de la Semana Cultural con diversas actividades artísticas y deportivas.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_3.jpg"
    )
)

val communities = listOf(
    Community(
        1,
        "https://www.lasallebajio.edu.mx/comunidad/images/tile_documentos_inspiradores.jpg"
    ),
    Community(2, "https://www.lasallebajio.edu.mx/comunidad/images/tile_boletin.jpg"),
    Community(3, "https://www.lasallebajio.edu.mx/comunidad/images/tile_cat_souv_22.jpg  "),
    Community(4, "https://www.lasallebajio.edu.mx/comunidad/images/tile_tramites.jpg"),
    Community(5, "https://www.lasallebajio.edu.mx/comunidad/images/tile_blog.jpg"),
)

val subjects = listOf(
    Subject(1,"Administración de Proyectos Tecnologicos",9.1,0.0,0.0),
    Subject(2,"Modelos Abstractos para el Desarrollo de Software",10.0,0.0,0.0),
    Subject(3,"Taller de Desarrollo Móvil para Plataforma Android",10.0,0.0,0.0),
    Subject(4,"Modelado y Procesamiento de Imágenes",10.0,0.0,0.0),
    Subject(5,"Conmutacion de Redes en Área Local",10.0,0.0,0.0),
    Subject(6,"Administración de Bases de Datos",10.0,0.0,0.0),
    Subject(7,"El Mundo Desde la Perspectiva Cristiana",10.0,0.0,0.0),
    Subject(8,"Metodología de la Investigación",10.0,0.0,0.0)
)

val majors = listOf(
    Major("Ingenieria de Software y Sistemas Computacionales", subjects)
)

@RequiresApi(Build.VERSION_CODES.O)
val users = listOf(
    User(76907,"Uriel","Mata","Castellanos", LocalDate.of(2004, 8, 26), "urielmata37@hotmail.com","12345678", "https://i.redd.it/tvkjwzeb50f41.jpg", majors[0], 5)
)