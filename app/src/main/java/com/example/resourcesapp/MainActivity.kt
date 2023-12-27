package com.example.resourcesapp

import android.os.Bundle
import android.os.Handler
import android.text.InputType
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.ui.AppBarConfiguration.Builder
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.navigateUp
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.resourcesapp.databinding.ActivityMainBinding
import com.example.resourcesapp.views.grid.gridAdapter
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    ////hello this is test for new laptop on 21/8/23 delete this line later
    private var mAppBarConfiguration: AppBarConfiguration? = null
    private var binding: ActivityMainBinding? = null
    var i = 0
    var passwordOK = false
    var a = 0
    var currentToast: Toast? = null
    var currentToast1: Toast? = null
    var currentToast2: Toast? = null
    var navigationView: NavigationView? = null
    var ib: ImageButton? = null
    var tv: TextView? = null
    var hd: Handler? = null
    var ga: gridAdapter? = null
    var rv: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        // Retrieve the saved theme preference
        val isDarkModeEnabled = ThemePreferenceUtil.getSavedThemePreference(this)
        // Apply the saved theme
        if (isDarkModeEnabled) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
        setContentView(binding!!.root)
        setSupportActionBar(binding!!.appBarMain.toolbar)
        val drawer = binding!!.drawerLayout
        navigationView = binding!!.navView
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        mAppBarConfiguration = Builder(
            R.id.nav_home,
            R.id.nav_gitRepos,
            R.id.nav_coding,
            R.id.nav_moreTools,
            R.id.nav_earn,
            R.id.nav_trading,
            R.id.nav_infoGathering,
            R.id.nav_genral,
            R.id.nav_projectIdeas,
            R.id.nav_downloads,
            R.id.nav_contact
        )
            .setOpenableLayout(drawer)
            .build()
        val navController = findNavController(this, R.id.nav_host_fragment_content_main)
        setupActionBarWithNavController(this, navController, mAppBarConfiguration!!)
        setupWithNavController(navigationView!!, navController)
        visibility(false)
        hd = Handler()
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(this, R.id.nav_host_fragment_content_main)
        return (navigateUp(navController, mAppBarConfiguration!!)
                || super.onSupportNavigateUp())
    }

    fun secretClick(view: View?) {
        a = a + 1
        if (a >= 5 && a <= 8) {
            val b = 9 - a
            if (currentToast != null) {
                currentToast!!.cancel() // Cancel the current toast if it is visible
            }
            currentToast = Toast.makeText(
                applicationContext,
                "Striding towards covert repository",
                Toast.LENGTH_SHORT
            )
            currentToast!!.show()
            //          Making strides towards the covert repository, hidden knowledge awaits
        }
        if (a == 9) {
            a = 0
            i = 0
            if (currentToast != null) {
                currentToast!!.cancel() // Cancel the current toast if it is visible
            }
            currentToast1 = Toast.makeText(
                this, """
     Data treasure awaits,
     guarded by an enigma
     """.trimIndent(), Toast.LENGTH_LONG
            )
            currentToast1!!.show()
            //            The hidden treasure of data lies before you" +"\n" + "guarded by a single enigma, daring you to decipher its essence.
//            The hidden data lies here," +"\n" + "guarded by a single enigma
            dialog()
        }
    }

    fun dialog() {
        showPasswordInputDialog()
    }

    private fun showPasswordInputDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Enter Password")
        val passwordInput = EditText(this)
        passwordInput.inputType =
            InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        builder.setView(passwordInput)
        builder.setCancelable(false) // Prevent dialog from being dismissed
        builder.setPositiveButton("OK") { dialog, which ->
            val enteredPassword = passwordInput.text.toString()
            if (enteredPassword == CORRECT_PASSWORD) {
                passwordOK = true
                goBack()
            } else if (i == 2) {
                i++
                retry()
            } else {
                if (currentToast1 != null) {
                    currentToast1!!.cancel() // Cancel the current toast if it is visible
                }
                if (currentToast2 != null) {
                    currentToast2!!.cancel() // Cancel the current toast if it is visible
                }
                currentToast2 = Toast.makeText(
                    applicationContext, """
     the enigma remains intact. 
     chances remaining : ${2 - i}
     """.trimIndent(), Toast.LENGTH_SHORT
                )
                currentToast2!!.show()
                i++
                retry()
            }
        }
        builder.setNegativeButton("Cancel", null)
        val dialog = builder.create()
        dialog.show()
    }

    fun retry() {
        if (i <= 2) {
            dialog()
        } else {
            goBack()
        }
    }

    fun goBack() {
        if (passwordOK) {
            if (currentToast2 != null) {
                currentToast2!!.cancel() // Cancel the current toast if it is visible
            }
            Toast.makeText(
                applicationContext,
                "Persistence rewarded: Covert repository revealed!",
                Toast.LENGTH_LONG
            ).show()
            //          Your persistence pays off! The covert repository is now revealed
//            a = 0;
            visibility(true)
        } else {
            if (currentToast2 != null) {
                currentToast2!!.cancel() // Cancel the current toast if it is visible
            }
            Toast.makeText(
                applicationContext,
                "Elusive puzzle persists, secrets still hidden.",
                Toast.LENGTH_LONG
            ).show()
            //          Alas, the elusive puzzle remains unsolved , keeping its secrets hidden for now
//            a = 0;
            visibility(false)
        }
    }

    fun visibility(a: Boolean) {
        if (a) {
            navigationView!!.menu.setGroupVisible(R.id.hidden, true)
        } else {
            navigationView!!.menu.setGroupVisible(R.id.hidden, false)
        }
    }

    companion object {
        private const val CORRECT_PASSWORD = "1234"
    }
}