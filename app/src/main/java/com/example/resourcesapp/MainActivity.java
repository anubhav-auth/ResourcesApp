package com.example.resourcesapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
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
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    private static final String CORRECT_PASSWORD = "1234";
    int i=0;
    Toast currentToast2;
    boolean passwordOK = false;
    int a = 0;
    Toast currentToast;
    NavigationView navigationView;


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
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gitRepos, R.id.nav_coding
        )
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        visibility(false);
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

            currentToast = Toast.makeText(getApplicationContext(), b + " steps away from the hiding place", Toast.LENGTH_SHORT);
            currentToast.show();
        }
        if (a == 9){
            currentToast.cancel();
            Toast.makeText(this, "hhahahhaah", Toast.LENGTH_SHORT).show();
//            Intent i = new Intent(getApplicationContext(), password.class);
//            startActivity(i);
            a = 0;
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
                } else {
                    currentToast2 = Toast.makeText(getApplicationContext(), "Incorrect password " + "\n" + "chance remaining : " + (2-i) , Toast.LENGTH_SHORT);
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
            Toast.makeText(getApplicationContext(), "Secrets are handed over to you", Toast.LENGTH_SHORT).show();
            visibility(true);
        }else {
            currentToast.cancel();
            Toast.makeText(getApplicationContext(), "you didn't get in.....SORRY", Toast.LENGTH_SHORT).show();
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

}