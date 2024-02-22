package com.jcdesign.shoppinglist.presentation

import android.app.Application
import com.jcdesign.shoppinglist.di.DaggerApplicationComponent

class ShopListApp: Application() {

    val component by lazy{
        DaggerApplicationComponent.factory().create(this)
    }
}