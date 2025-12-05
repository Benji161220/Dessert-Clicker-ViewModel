package com.example.dessertclicker.ui

import com.example.dessertclicker.data.Datasource
import com.example.dessertclicker.model.Dessert

const val CURRENT_DESSERT_INDEX = 0
data class DessertUIState (
    val revenue: Int = 0,
    val dessertsSold: Int = 0,
    val currentDessertPrice :Int = Datasource.dessertList[CURRENT_DESSERT_INDEX].price,
    val currentDessertImageId :Int = Datasource.dessertList[CURRENT_DESSERT_INDEX].imageId
)

