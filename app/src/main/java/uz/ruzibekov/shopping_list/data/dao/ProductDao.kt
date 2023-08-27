package uz.ruzibekov.shopping_list.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import uz.ruzibekov.shopping_list.data.model.ProductEntity

@Dao
interface ProductDao {

    @Insert
    suspend fun createProduct(entity: ProductEntity)

    @Query("SELECT * FROM products WHERE shopping_list_id =:id")
    suspend fun getProductsByListId(id: Long): List<ProductEntity>

    @Query("DELETE FROM products WHERE shopping_list_id =:id")
    suspend fun removeProductById(id: Long)
}