package trpl.nim234311039.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Hero (
    @StringRes val nameRes : Int,
    @StringRes val descriptionRes : Int,
    @DrawableRes val imageRes : Int,
)