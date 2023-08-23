package uz.ruzibekov.shopping_list.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping-lists")
data class ShoppingListEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String
)