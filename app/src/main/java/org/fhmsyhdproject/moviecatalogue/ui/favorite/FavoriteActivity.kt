package org.fhmsyhdproject.moviecatalogue.ui.favorite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.fhmsyhdproject.moviecatalogue.R
import org.fhmsyhdproject.moviecatalogue.databinding.ActivityFavoriteBinding

class FavoriteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavoriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionFavoriteAdapter = SectionFavoriteAdapter(this, supportFragmentManager)
        binding.viewPager.apply {
            adapter = sectionFavoriteAdapter
            binding.tabs.setupWithViewPager(this)
        }

        supportActionBar?.apply {
            elevation = 0f
            title = getString(R.string.favorite_movies)
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}