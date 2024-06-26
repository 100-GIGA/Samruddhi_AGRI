package app.agro.samruddhi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import app.agro.samruddhi.edutech.AgriEdu
import app.agro.samruddhi.edutech.PlantEdu
import app.agro.samruddhi.governmentschemes.GovSchemes
import app.agro.samruddhi.presentation.apnabazaar.ui.FarmerList
import app.agro.samruddhi.presentation.apnabazaar.ui.TransportChoice
import app.agro.samruddhi.presentation.navigation.MainNavController
import app.agro.samruddhi.presentation.rentalservices.RentalServices
import app.agro.samruddhi.ui.theme.SamruddhiTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SamruddhiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainNavController()
//                    FarmerList()
//                    TransportChoice()
//                    RentalServices()
//                    GovSchemes()
//                    AgriEdu()
//                    PlantEdu()
                }

            }
        }
    }
}
