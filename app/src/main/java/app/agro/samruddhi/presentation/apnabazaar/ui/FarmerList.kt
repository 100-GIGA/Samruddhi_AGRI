package app.agro.samruddhi.presentation.apnabazaar.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Whatsapp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import app.agro.samruddhi.R
import app.agro.samruddhi.presentation.login.ui.Select
import app.agro.samruddhi.presentation.navigation.Screens
import app.agro.samruddhi.presentation.utils.AnimatedCounter

@Composable
fun FarmerList(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(
                MaterialTheme.colorScheme.onPrimary
            )
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(id = R.string.wheat),
                fontSize = 25.sp,
                modifier = Modifier.padding(top = 30.dp),
                color = MaterialTheme.colorScheme.surfaceTint
            )
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.wheat_preview),
                contentDescription = "",
                modifier = Modifier.padding(top = 20.dp, start = 35.dp, end = 35.dp),
            )
        }
        Row(
            modifier = Modifier
                .padding(horizontal = 30.dp)
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = R.string.quantity),
                fontSize = 18.sp,
                modifier = Modifier,
                color = MaterialTheme.colorScheme.surfaceTint
            )
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Text(
                    text = stringResource(R.string._25_kg),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.surfaceTint
                )
            }
//            Icon(
//                imageVector = Icons.Outlined.KeyboardArrowDown,
//                contentDescription = "",
//                tint = MaterialTheme.colorScheme.surfaceTint,
//                modifier = Modifier
//                    .padding(start = 40.dp, top = 15.dp)
//                    .size(30.dp)
//            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, start = 35.dp, end = 35.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
        ) {
            var count by remember { mutableIntStateOf(100) }
            Image(
                painter = painterResource(id = R.drawable.plus),
                contentDescription = "",
                modifier = Modifier
                    .size(50.dp)
                    .clickable {
                        count++
                    }

            )
            AnimatedCounter(count = count)
            Image(
                painter = painterResource(id = R.drawable.minus),
                contentDescription = "",
                modifier = Modifier
                    .size(50.dp)
                    .clickable {
                        count--
                    }

            )
        }

        Row(
            modifier = Modifier
                .padding(horizontal = 30.dp)
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = R.string.bidprice),
                fontSize = 18.sp,
                modifier = Modifier,
                color = MaterialTheme.colorScheme.surfaceTint
            )
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Text(
                    text = stringResource(R.string._30rupee),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.surfaceTint
                )
            }
//            Icon(
//                imageVector = Icons.Outlined.KeyboardArrowDown,
//                contentDescription = "",
//                tint = MaterialTheme.colorScheme.surfaceTint,
//                modifier = Modifier
//                    .padding(start = 40.dp, top = 15.dp)
//                    .size(30.dp)
//            )
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)) {
            var textState by remember { mutableStateOf(TextFieldValue()) }

            TextField(
                value = textState,
                onValueChange = {
                    textState = it
                },
                label = { Text("Enter bid(rupees/kg)") },
                modifier = Modifier.padding(16.dp)
            )
        }


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp, start = 25.dp, end = 25.dp, bottom = 10.dp)
                .clip(RoundedCornerShape(15.dp)),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
            ),
            shape = RoundedCornerShape(15.dp),
            elevation = CardDefaults.cardElevation(10.dp),
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Icon(
                    painter = painterResource(R.drawable.group),
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(5.dp),
                    tint = MaterialTheme.colorScheme.surfaceTint
                )
                Column(modifier = Modifier.fillMaxWidth()) {
                    Row {

                        Text(
                            text = stringResource(R.string.abc),
                            fontSize = 22.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.surfaceTint,
                            modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 2.dp)
                        )

                    }
                    Row {

                        LazyRow {
                            items(5) { listItem ->
                                Icon(
                                    imageVector = Icons.Filled.Star,
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.surfaceTint,
                                    modifier = Modifier
                                        .padding(start = 6.dp, top = 10.dp)
                                        .size(26.dp)
                                )
                            }
                        }

                    }


                }
            }
        }
        Contact(Icon = Icons.Outlined.Phone, text = stringResource(R.string.contact_farmer))
        Contact(Icon = Icons.Outlined.Whatsapp, text = stringResource(R.string.chat_on_whatsapp))
        Select(text = stringResource(R.string.continue_button)){
navController.navigate(Screens.TransportChoice.route)
        }

    }
}


@Composable
fun Contact(Icon: ImageVector, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp)
    ) {
        Icon(
            imageVector = Icon,
            contentDescription = "",
            tint = MaterialTheme.colorScheme.surfaceTint,
            modifier = Modifier
                .padding(start = 6.dp, top = 10.dp)
                .size(26.dp)
        )
        Text(
            text = text,
            fontSize = 22.sp,
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colorScheme.surfaceTint,
            modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 2.dp)
        )

    }
}