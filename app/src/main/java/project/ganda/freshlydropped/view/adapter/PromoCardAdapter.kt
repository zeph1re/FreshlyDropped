package project.ganda.freshlydropped.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import project.ganda.freshlydropped.R

class PromoCardAdapter() : RecyclerView.Adapter<PromoCardAdapter.ViewHolder>(){

    private var promoList =  listOf(R.drawable.image_1, R.drawable.image_2, R.drawable.image_3,R.drawable.image_4, R.drawable.image_5)


    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val promoImage: ImageView = itemView.findViewById(R.id.promo_card_image)
        val promoCard: View = itemView.findViewById(R.id.promo_card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_promo, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        if (promoList == null) {
            return 0
        }
        return  promoList!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        this.let {
            Glide.with(holder.itemView.context).load(promoList!![position]).into(holder.promoImage)
        }
    }

}