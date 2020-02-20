package com.example.pind;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class PindProgressActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pind_progress);

/*ImageSwitcher imageSwitcher=(ImageSwitcher) findViewById(R.id.image_switcher2);
imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
    @Override
    public View makeView() {
        ImageView imageView= new ImageView(getApplicationContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));
   return imageView;

    }
});
imageSwitcher.setImageDrawable(getResources().getDrawable(R.drawable.jeff));
imageSwitcher.setImageURI(Uri.parse("android.resource://"+ getPackageName()+"/"+R.raw.jones));
        Animation in= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        imageSwitcher.setInAnimation(in);
        Animation out=AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        imageSwitcher.setOutAnimation(out);
*/
    }
}