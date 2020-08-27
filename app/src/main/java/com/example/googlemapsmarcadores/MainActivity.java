package com.example.googlemapsmarcadores;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
    }

    public void irAUTEQ(View view){
        CameraUpdate camUpd1 = CameraUpdateFactory.newLatLngZoom(new LatLng(-1.012482, -79.469499), 16);
        map.moveCamera(camUpd1);
        map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        map.getUiSettings().setZoomControlsEnabled(true);
    }

    public void marcadores(View view){
        LatLng punto1 = new LatLng(-1.012869, -79.469336);
        map.addMarker(new MarkerOptions().position(punto1).title("Facultad de Ciencias Agrarias"));
        LatLng punto2 = new LatLng(-1.0126317,-79.4700394);
        map.addMarker(new MarkerOptions().position(punto2).title("Plazoleta"));
        LatLng punto3 = new LatLng(-1.012403, -79.468426);
        map.addMarker(new MarkerOptions().position(punto3).title("Biblioteca"));
        LatLng punto4 = new LatLng(-1.012232, -79.469644);
        map.addMarker(new MarkerOptions().position(punto4).title("Instituto de Informática"));
        LatLng punto5 = new LatLng(-1.012218, -79.470156);
        map.addMarker(new MarkerOptions().position(punto5).title("Facultad de Ciencias Empresariales"));
        LatLng punto6 = new LatLng(-1.012583, -79.470623);
        map.addMarker(new MarkerOptions().position(punto6).title("Facultad de Ciencias de la Ingeniería"));
        LatLng punto7 = new LatLng(-1.012687, -79.471063);
        map.addMarker(new MarkerOptions().position(punto7).title("Facultad de Ciencias Ambientales"));
        LatLng punto8 = new LatLng(-1.012959, -79.467712);
        map.addMarker(new MarkerOptions().position(punto8).title("Auditorio Carlos Cortaza"));
        LatLng punto9 = new LatLng(-1.012948, -79.470000);
        map.addMarker(new MarkerOptions().position(punto9).title("Comedor Universitario"));
        LatLng punto10 = new LatLng(-1.012430, -79.467744);
        map.addMarker(new MarkerOptions().position(punto10).title("Parqueadero principal"));
    }

    public void dibujarPoligono(View View){
        PolylineOptions lineas = new PolylineOptions()
                .add(new LatLng(-1.013349, -79.471864))
                .add(new LatLng(-1.011863, -79.471843))
                .add(new LatLng(-1.011836, -79.467052))
                .add(new LatLng(-1.013413, -79.467144))
                .add(new LatLng(-1.013349, -79.471864));
        lineas.width(8);
        lineas.color(Color.GREEN);
        map.addPolyline(lineas);
    }
}
