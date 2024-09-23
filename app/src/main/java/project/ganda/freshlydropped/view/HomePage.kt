package project.ganda.freshlydropped.view

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import project.ganda.freshlydropped.databinding.FragmentHomePageBinding
import project.ganda.freshlydropped.view.adapter.PromoCardAdapter
import project.ganda.freshlydropped.view.adapter.RecipeAdapter


class HomePage : Fragment() {

    private var _binding : FragmentHomePageBinding? = null
    private val binding get() = _binding!!

    private lateinit var promoCardAdapter: PromoCardAdapter
    private lateinit var recipeAdapter : RecipeAdapter



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
       _binding = FragmentHomePageBinding.inflate(inflater,container, false)
        val root : View = binding.root

        val promoCardCarousel = binding.promo
        val popularCardRecipe = binding.popularRecipeCardRv

        promoCardAdapter = PromoCardAdapter()
        setUpViewPager(promoCardCarousel)

        recipeAdapter = RecipeAdapter()
        setUpPopularRecipe()

        return root
    }

    private fun setUpViewPager(promoCardCarousel : ViewPager2) {


        promoCardCarousel.adapter = promoCardAdapter

        //set the orientation of the viewpager using ViewPager2.orientation
        promoCardCarousel.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        //select any page you want as your starting page
        val currentPageIndex = 1
        promoCardCarousel.currentItem = currentPageIndex

        // registering for page change callback
//        promoCardCarousel.registerOnPageChangeCallback(
//            object : ViewPager2.OnPageChangeCallback() {
//
//                override fun onPageSelected(position: Int) {
//                    super.onPageSelected(position)
//
//                    //update the image number textview
//                    binding.imageNumberTV.text = "${position + 1} / 4"
//                }
//            }
//        )


    }

    private fun setUpPopularRecipe() {

    }


}