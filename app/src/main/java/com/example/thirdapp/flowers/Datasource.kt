package com.example.thirdapp.flowers

import android.content.Context
import com.example.thirdapp.R

class Datasource(val context: Context) {
    fun getFlowerList(): Array<String> {
        return context.resources.getStringArray(R.array.flower_array)
    }
}