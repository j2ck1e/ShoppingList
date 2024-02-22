package com.jcdesign.shoppinglist.di

import android.app.Application
import com.jcdesign.shoppinglist.data.AppDatabase
import com.jcdesign.shoppinglist.data.ShopListDao
import com.jcdesign.shoppinglist.data.ShopListRepositoryImpl
import com.jcdesign.shoppinglist.domain.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {
        @ApplicationScope
        @Provides
        fun provideShopListDao(application: Application): ShopListDao {
            return AppDatabase.getInstance(application).shopListDao()
        }
    }
}