package project.ganda.freshlydropped.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import project.ganda.freshlydropped.R

class RecipeAdapter() : RecyclerView.Adapter<RecipeAdapter.ViewHolder>(){


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val recipeCard: View = itemView.findViewById(R.id.recipe_card)
        val recipeImage: ImageView = itemView.findViewById(R.id.recipe_image)
        val recipeTitle : TextView = itemView.findViewById(R.id.recipe_title)
        val recipePrice : TextView = itemView.findViewById(R.id.recipe_price)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_recipe, parent, false)
        return RecipeAdapter.ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecipeAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
//        if (promoList == null) {
//            return 0
//        }
//        return  promoList!!.size
        return TODO("Provide the return value")
    }
}