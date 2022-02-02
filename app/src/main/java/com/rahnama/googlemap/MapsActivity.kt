package com.rahnama.googlemap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.rahnama.googlemap.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)
/***********************************************************/
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
/***********************************************************/
    }
/*********************************************************/
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera

        val location = LatLng(37.1065302,58.5135146)
        mMap.addMarker(MarkerOptions().position(location).title("قوچان - خیابان  شهید داوودی-چهارراه اول-فرهیختگان"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(location))
      //  mMap.mapType = GoogleMap.MAP_TYPE_TERRAIN
      //  mMap.mapType = GoogleMap.MAP_TYPE_HYBRID
       mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
       // mMap.mapType = GoogleMap.MAP_TYPE_SATELLITE
        mMap.uiSettings.isZoomGesturesEnabled = true

    }
    /******************************************************/
}