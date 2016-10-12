package logici.shot;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends TabActivity {
    Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.mytoolbar);
        toolbar.setLogo(R.drawable.ic_shot);
        //toolbar.setTitle("\t\t#Shot");
        //toolbar.setTitleTextColor(0xFF3D00);


        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost(); // The activity TabHost
        TabHost.TabSpec spec; // Reusable TabSpec for each tab
        Intent intent; // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, HomeActivity.class);
        spec = tabHost.newTabSpec("home")
                .setIndicator("", res.getDrawable(R.drawable.ic_timeline))
                .setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs

        intent = new Intent().setClass(this, UploadActivity.class);
        spec = tabHost.newTabSpec("upload")
                .setIndicator("", res.getDrawable(R.drawable.ic_upload))
                .setContent(intent);
        tabHost.addTab(spec);


        intent = new Intent().setClass(this, LikesActivity.class);
        spec = tabHost
                .newTabSpec("likes")
                .setIndicator("", res.getDrawable(R.drawable.ic_likes))
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, ProfileActivity.class);
        spec = tabHost
                .newTabSpec("profile")
                .setIndicator("", res.getDrawable(R.drawable.ic_profile))
                .setContent(intent);
        tabHost.addTab(spec);

        //set tab which one you want open first time 0 or 1 or 2
        tabHost.setCurrentTab(0);


        /*toolbar.inflateMenu(R.menu.menu_main);//changed
        //toolbar2 menu items CallBack listener
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
                                               @Override
                                               public boolean onMenuItemClick (MenuItem arg0){
                                                   if (arg0.getItemId() == R.id.action_settings) {

                                                   }
                                                   return false;
                                               }
                                           }

        );*/

    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                //TODO show settings activity
                break;
        }

        return super.onOptionsItemSelected(item);
    }*/


}