package app.samruddhi.smartagro.presentation.navigation

sealed class Screens(val route: String) {
    data object Login : Screens("login")
    data object SelectCrop : Screens("selectCrop")
    data object Home : Screens("home")
    data object ApnaBazaar : Screens("apnaBazaar")
    data object ScanML : Screens("scanML")
    data object Profile : Screens("profile")
    data object Weather : Screens("weather")
}