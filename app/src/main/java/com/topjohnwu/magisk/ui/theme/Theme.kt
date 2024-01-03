package com.topjohnwu.magisk.ui.theme

import com.topjohnwu.magisk.R
import com.topjohnwu.magisk.core.Config

enum class Theme(
    val themeName: String,
    val themeRes: Int
) {

    Dynamic(
        themeName = "Dynamic",
        themeRes = R.style.Theme_Foundation_Dynamic
    ),
    DynamicBlack(
        themeName = "Dynamic Black",
        themeRes = R.style.Theme_Foundation_Dynamic_Black
    ),
    Piplup(
        themeName = "Piplup",
        themeRes = R.style.Theme_Foundation_Piplup
    ),
    PiplupAmoled(
        themeName = "AMOLED",
        themeRes = R.style.Theme_Foundation_Piplup_Amoled
    ),
    Rayquaza(
        themeName = "Rayquaza",
        themeRes = R.style.Theme_Foundation_Rayquaza
    ),
    Zapdos(
        themeName = "Zapdos",
        themeRes = R.style.Theme_Foundation_Zapdos
    ),
    Charmeleon(
        themeName = "Charmeleon",
        themeRes = R.style.Theme_Foundation_Charmeleon
    ),
    Mew(
        themeName = "Mew",
        themeRes = R.style.Theme_Foundation_Mew
    ),
    Salamence(
        themeName = "Salamence",
        themeRes = R.style.Theme_Foundation_Salamence
    ),
    Fraxure(
        themeName = "Fraxure (Legacy)",
        themeRes = R.style.Theme_Foundation_Fraxure
    );

    val isSelected get() = Config.themeOrdinal == ordinal

    fun select() {
        Config.themeOrdinal = ordinal
    }

    companion object {
        val selected get() = values().getOrNull(Config.themeOrdinal) ?: Piplup
    }

}
