package uz.ruzibekov.shopping_list.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import uz.ruzibekov.shopping_list.data.dao.ShoppingListDao
import uz.ruzibekov.shopping_list.data.model.ShoppingListEntity

@Database(entities = [ShoppingListEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun shoppingListDao(): ShoppingListDao
}