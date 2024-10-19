package com.example.lasalleapp.utils

sealed class Screens(val route : String) {
    data object Home : Screens("home")
    data object Grades : Screens("grades")
    data object Calendar : Screens("calendar")
    data object  Settings : Screens("settings")
    data object NewsDetail : Screens("newsDetail")
    data object ChangePassword : Screens("changePassword")
    data object ChangeTheme : Screens("changeTheme")
    data object Subject : Screens("subject")
}