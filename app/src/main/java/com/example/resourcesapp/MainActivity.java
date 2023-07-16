package com.example.resourcesapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.resourcesapp.databinding.ActivityMainBinding;
import com.example.resourcesapp.ui.moreTools.sub.LearnDesignFragment;
import com.example.resourcesapp.views.grid.gridAdapter;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    private static final String CORRECT_PASSWORD = "1234";
    int i=0;
    boolean passwordOK = false;
    int a = 0;
    Toast currentToast;
    Toast currentToast1;
    Toast currentToast2;
    NavigationView navigationView;
    ImageButton ib;
    TextView tv;
    Handler hd;
    gridAdapter ga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        // Retrieve the saved theme preference
        boolean isDarkModeEnabled = ThemePreferenceUtil.getSavedThemePreference(this);
        // Apply the saved theme
        if (isDarkModeEnabled) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home,
                R.id.nav_gitRepos,
                R.id.nav_coding,
                R.id.nav_moreTools,
                R.id.nav_earn,
                R.id.nav_trading,
                R.id.nav_infoGathering,
                R.id.nav_genral,
                R.id.nav_projectIdeas,
                R.id.nav_downloads
        )
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        visibility(false);

        hd = new Handler();
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void secretClick(View view){
        a = a+1;
        if (a >= 5 && a<=8){
            int b = 9 - a;
            if (currentToast != null) {
                currentToast.cancel();  // Cancel the current toast if it is visible
            }

            currentToast = Toast.makeText(getApplicationContext(), "Striding towards covert repository", Toast.LENGTH_SHORT);
            currentToast.show();
//          Making strides towards the covert repository, hidden knowledge awaits
        }
        if (a == 9){
            a = 0;
            i = 0;
            if (currentToast != null) {
                currentToast.cancel();  // Cancel the current toast if it is visible
            }
            currentToast1 =  Toast.makeText(this, "Data treasure awaits,"+"\n"+"guarded by an enigma", Toast.LENGTH_LONG);
            currentToast1.show();
//            The hidden treasure of data lies before you" +"\n" + "guarded by a single enigma, daring you to decipher its essence.
//            The hidden data lies here," +"\n" + "guarded by a single enigma
            dialog();
        }

    }

    public void dialog(){
        showPasswordInputDialog();
    }

    private void showPasswordInputDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Enter Password");

        final EditText passwordInput = new EditText(this);
        passwordInput.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        builder.setView(passwordInput);
        builder.setCancelable(false); // Prevent dialog from being dismissed

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String enteredPassword = passwordInput.getText().toString();

                if (enteredPassword.equals(CORRECT_PASSWORD)) {
                    passwordOK = true;
                    goBack();
                } else if (i == 2) {
                    i++;
                    retry();
                } else {
                    if (currentToast1 != null) {
                        currentToast1.cancel();  // Cancel the current toast if it is visible
                    }
                    if (currentToast2 != null) {
                        currentToast2.cancel();  // Cancel the current toast if it is visible
                    }
                    currentToast2 = Toast.makeText(getApplicationContext(), "the enigma remains intact. " + "\n" + "chances remaining : " + (2-i) , Toast.LENGTH_SHORT);
                    currentToast2.show();
                    i++;
                    retry();
                }


            }
        });

        builder.setNegativeButton("Cancel", null);

        AlertDialog dialog = builder.create();
        dialog.show();
    }
    public void retry(){
        if (i <= 2){
            dialog();
        }else {
            goBack();
        }
    }
    public void goBack(){
        if (passwordOK){
            if (currentToast2 != null) {
                currentToast2.cancel();  // Cancel the current toast if it is visible
            }
            Toast.makeText(getApplicationContext(), "Persistence rewarded: Covert repository revealed!", Toast.LENGTH_LONG).show();
//          Your persistence pays off! The covert repository is now revealed
//            a = 0;
            visibility(true);
        }else {
            if (currentToast2 != null) {
                currentToast2.cancel();  // Cancel the current toast if it is visible
            }
            Toast.makeText(getApplicationContext(), "Elusive puzzle persists, secrets still hidden.", Toast.LENGTH_LONG).show();
//          Alas, the elusive puzzle remains unsolved , keeping its secrets hidden for now
//            a = 0;
            visibility(false);
        }
    }

    public void visibility(boolean a){
        if (a){
            navigationView.getMenu().setGroupVisible(R.id.hidden,true);
        }else {
            navigationView.getMenu().setGroupVisible(R.id.hidden,false);
        }
    }

    public void clicked(View a){
        TextView b = (TextView) a;
        String c = b.getTag().toString();
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(c));
//        i.setData(Uri.parse("https://www.github.com"));
        startActivity(i);
    }


    public void startFragmentCoding(View view) {
        ib = (ImageButton) view;
        String a = ib.getTag().toString();
        hd.postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (a) {
                    case "0" -> {
                        Navigation.findNavController(view).navigate(R.id.action_nav_coding_to_nav_usefullIDEExtensions);
                    }
                    case "1" -> {
                        Navigation.findNavController(view).navigate(R.id.action_nav_coding_to_nav_codingGames);
                    }
                    case "2" -> {

                    }
                }
            }
        },100);

    }

    public void startFragmentMoreTools() {

//        hd.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                switch (a) {
//                    case 1 -> {
//                        Navigation.findNavController(view).navigate(R.id.action_nav_moreTools_to_tools_3d_Fragment);
//                    }
//                    case 2 -> {
//                        Navigation.findNavController(view).navigate(R.id.action_nav_moreTools_to_prototypingFragment);
//                    }
//                    case 3 -> {
//                        Navigation.findNavController(view).navigate(R.id.action_nav_moreTools_to_screenshotFragment);
//                    }
//                    case 4 -> {
//                        Navigation.findNavController(view).navigate(R.id.action_nav_moreTools_to_sketchingFragment);
//                    }
//                    case 5 -> {
//                        Navigation.findNavController(view).navigate(R.id.action_nav_moreTools_to_smm_Fragment);
//                    }
//                    case 6 -> {
//                        Navigation.findNavController(view).navigate(R.id.action_nav_moreTools_to_soundFragment);
//                    }
//                    case 7 -> {
//                        Navigation.findNavController(view).navigate(R.id.action_nav_moreTools_to_stockPhotosFragment);
//                    }
//                    case 8 -> {
//                        Navigation.findNavController(view).navigate(R.id.action_nav_moreTools_to_stockVideoFragment);
//                    }
//                    case 9 -> {
//                        Navigation.findNavController(view).navigate(R.id.action_nav_moreTools_to_learnDesignFragment);
//                    }
//                    case 10 -> {
//                        Navigation.findNavController(view).navigate(R.id.action_nav_moreTools_to_uiFragment);
//                    }
//                    case 11 -> {
//                        Navigation.findNavController(view).navigate(R.id.action_nav_moreTools_to_userFlowFragment);
//                    }
//                    case 12 -> {
//                        Navigation.findNavController(view).navigate(R.id.action_nav_moreTools_to_userResearchFragment);
//                    }
//                    case 13 -> {
//                        Navigation.findNavController(view).navigate(R.id.action_nav_moreTools_to_visualDebuggingFragment);
//                    }
//                    case 14 -> {
//                        Navigation.findNavController(view).navigate(R.id.action_nav_moreTools_to_wireframingFragment);
//                    }
//                }
//            }
//        },100);
    }


}