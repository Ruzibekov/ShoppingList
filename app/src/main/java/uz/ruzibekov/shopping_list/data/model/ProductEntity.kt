package uz.ruzibekov.shopping_list.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class ProductEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo("name") val name: String,
    @ColumnInfo("shopping_list_id") val shoppingListId: Long
)