package com.concatadapter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlaygroundViewModel : ViewModel() {

    val expandSource: MutableLiveData<List<Items>> = MutableLiveData()

    fun getListSource(): List<Items> {
        return mutableListOf<Items>(
            Items(
                "Jordan", listOf(
                    Items.Item("Petra"),
                    Items.Item("Dead Sea"),
                    Items.Item("Amman"),
                    Items.Item("Magic Bedouin Star")
                )
            ),
            Items(
                "Philippines", listOf(
                    Items.Item("Chocolate hills"),
                    Items.Item("Batad"),
                    Items.Item("Rizal Park")
                )
            ),
            Items(
                "Turkey", listOf(
                    Items.Item("Istanbul"),
                    Items.Item("Cappadocia"),
                    Items.Item("Pamukkale"),
                    Items.Item("Antalya")
                )
            ),
            Items(
                "Austria", listOf(
                    Items.Item("Pertra"),
                    Items.Item("Dead Sea"),
                    Items.Item("Amman"),
                    Items.Item("Magic Bedouin Star")
                )
            ),
            Items(
                "Greece", listOf(
                    Items.Item("Pertra"),
                    Items.Item("Dead Sea"),
                    Items.Item("Amman"),
                    Items.Item("Magic Bedouin Star")
                )
            ),
            Items(
                "Spain", listOf(
                    Items.Item("Pertra"),
                    Items.Item("Dead Sea"),
                    Items.Item("Amman"),
                    Items.Item("Magic Bedouin Star")
                )
            ),
            Items(
                "Australia", listOf(
                    Items.Item("Pertra"),
                    Items.Item("Dead Sea"),
                    Items.Item("Amman"),
                    Items.Item("Magic Bedouin Star")
                )
            )
        )
    }
}