package com.android.nanodegree.udacity.portfolioapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Método responsável por iniciar o projeto Popular movies
     * através da activity MovieActivity
     */
    fun launchPopularMoviesApp(view: View) {
        // :: class.java equivale ao .class em java
        startActivity(Intent(this, MovieActivity::class.java))
    }

    fun launchStockHawkApp(view: View) {
        sendToastMessage("This button will launch my Stock Hanwk App!")
    }

    fun launchBuildItBiggerApp (view: View){
        sendToastMessage("This button will launch my Build It Bigger App!")
    }

    fun launchMakeYourApp (view: View){
        sendToastMessage("This button will launch my Make Your App Material!")
    }

    fun launchGoUbiquitousApp (view: View){
        sendToastMessage("This button will launch my Go Ubiquitous!")
    }

    fun launchCapstoneApp (view: View){
        sendToastMessage("This button will launch my Capstone App!")
    }

    /**
     * Enviando mensagem a partir do Toast
     * @param text
     */

    fun sendToastMessage(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}
