package uz.ruzibekov.shopping_list.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import uz.ruzibekov.shopping_list.data.model.ShoppingListEntity

@Dao
interface ShoppingListDao {

    @Insert
    suspend fun createList(data: ShoppingListEntity): Long

    @Query("SELECT * FROM `shopping-lists`")
    suspend fun getAllShoppingList(): List<ShoppingListEntity>

}