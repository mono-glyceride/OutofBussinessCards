package com.example.gurise.outofbussinesscards

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager
import com.example.gurise.outofbussinesscards.databinding.ActivityEditBinding


class EditActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val  pref = PreferenceManager.getDefaultSharedPreferences(this)
        val company = pref.getString("company","")
        val postal = pref.getString("postal","")
        val address = pref.getString("address","")
        val tel = pref.getString("tel","")
        val fax = pref.getString("fax","")
        val email = pref.getString("email","")
        val url = pref.getString("url","")
        val position = pref.getString("position","")
        val name = pref.getString("name","")

        binding.companyEdit.setText(company)
        binding.postalEdit.setText(postal)
        binding.adressEdit.setText(address)
        binding.telEdit.setText(tel)
        binding.faxEdit.setText(fax)
        binding.emailEdit.setText(email)
        binding.urlEdit.setText(url)
        binding.positionEdit.setText(position)
        binding.nameEdit.setText(name)

        binding.saveBtn.setOnClickListener(){
            saveData()
            finish()
        }
        binding.cancelBtn.setOnClickListener(){
            finish()
        }

    }

    private  fun saveData(){
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()
        editor.putString("company", binding.companyEdit.text.toString())
            .putString("postal", binding.postalEdit.text.toString())
            .putString("address", binding.adressEdit.text.toString())
            .putString("tel", binding.telEdit.text.toString())
            .putString("fax", binding.faxEdit.text.toString())
            .putString("email", binding.emailEdit.text.toString())
            .putString("url", binding.urlEdit.text.toString())
            .putString("position", binding.positionEdit.text.toString())
            .putString("name", binding.nameEdit.text.toString())
            .apply()
    }
}