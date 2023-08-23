package uz.ruzibekov.shopping_list.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import uz.ruzibekov.shopping_list.data.dao.ProductDao
import uz.ruzibekov.shopping_list.data.dao.ShoppingListDao
import uz.ruzibekov.shopping_list.data.database.AppDatabase

@Module
@InstallIn(SingletonComponent::class)
object LocalDataModule {

    @Provides
    fun provideRoomDatabase(@ApplicationContext context: Context): AppDatabase =
        Room.databaseBuilder(context, AppDatabase::class.java, "shopping-list").build()

    @Provides
    fun provideShoppingListDao(room: AppDatabase): ShoppingListDao = room.shoppingListDao()

    @Provides
    fun provideProductDao(room: AppDatabase): ProductDao = room.productDao()

}