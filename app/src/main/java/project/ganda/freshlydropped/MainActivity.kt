package project.ganda.freshlydropped

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import project.ganda.freshlydropped.view.HomePage
import project.ganda.freshlydropped.view.CartPage
import project.ganda.freshlydropped.view.CollectionPage

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavbar : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(HomePage())
        bottomNavbar = findViewById(R.id.bottomNav) as BottomNavigationView
        bottomNavbar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    loadFragment(HomePage())
                    true
                }
                R.id.collection -> {
                    loadFragment(CollectionPage())
                    true
                }
                R.id.cart -> {
                    loadFragment(CartPage())
                    true
                }

                else -> {
                    loadFragment(CartPage())
                    true
                }
            }
        }
    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }
}