package com.example.pind;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.google.android.material.navigation.NavigationView;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

//When Message is sent on the contact Activity to PIND, this method helps to display the toast

    public void dispToastMsg(String msg){
        Toast toast=Toast.makeText(this,msg,Toast.LENGTH_LONG);
        toast.show();
    }
    public void dispToastMsg(View view){
        dispToastMsg("Your Message Has been Sent.");
    }

  /*  private ImageSwitcher imageSwitcher;
    Button btnNext;
    int imageids[]={R.drawable.anire, R.drawable.jeff,R.drawable.obafemi,R.drawable.jones};
    int count=imageids.length;
    int current=-1;*/


    public void showBiography(View view){
        ImageView imageView = (ImageView) findViewById(R.id.hover_image1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
    public void dailNumber(View dail) {

        TextView textView = (TextView) findViewById(R.id.textView15);
        String phoneNumber=String.format("tel: %s",textView.getText().toString());
        Intent dailIntent = new Intent(Intent.ACTION_DIAL);
        dailIntent.setData(Uri.parse(phoneNumber));
        if (dailIntent.resolveActivity(getPackageManager())!=null){
            startActivity(dailIntent);
        }else {
            Log.e(TAG, "dailNumber: ");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Main Activity","PIND");

        WebView webView= new WebView(activityContext);
        setContentView(webView);
        webView.loadUrl("www.pindfoundation.org");

     /*   btnNext=(Button)findViewById(R.id.btnext);
        imageSwitcher=(ImageSwitcher)findViewById(R.id.image_switcher2);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView= new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));
            return imageView;
            }
        });
        Animation in= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        imageSwitcher.setInAnimation(in);
        Animation out=AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        imageSwitcher.setOutAnimation(out);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current++;
                if (current==count)
                    current=0;
                imageSwitcher.setImageResource(imageids[current]);
            }
        });
*/
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer=findViewById(R.id.main_layout);
        NavigationView navigationView=findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this, drawer, toolbar,R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        if (savedInstanceState==null){
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,
                new PindbodyActivity()).commit();
        }
    }
    @Override
    public void onBackPressed(){
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else
            super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_who:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,
                       new PindbodyActivity()).commit();
                break;
            case R.id.nav_contact:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,
                        new ContactFragmentActivity()).commit();
                break;
            case R.id.nav_what:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,
                        new ProjectLayoutActivity()).commit();
                break;
            case R.id.nav_impact:
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,
                        new ImpactActivity()).commit();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
