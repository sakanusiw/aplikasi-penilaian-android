package com.example.aplikasipenilaian

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var etNama: EditText? = null
    var etTugas: EditText? = null
    var etKehadiran: EditText? = null
    var etUTS: EditText? = null
    var etUAS: EditText? = null
    var etAkhir: EditText? = null
    var etHuruf: EditText? = null
    var btHitung: Button? = null
    var tugas: Double? = null
    var kehadiran: Double? = null
    var uts: Double? = null
    var uas: Double? = null
    var akhir: Double? = null
    var huruf: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNama = findViewById<View>(R.id.etNama) as EditText
        etTugas = findViewById<View>(R.id.etTugas) as EditText
        etKehadiran = findViewById<View>(R.id.etKehadiran) as EditText
        etUTS = findViewById<View>(R.id.etUTS) as EditText
        etUAS = findViewById<View>(R.id.etUAS) as EditText
        etAkhir = findViewById<View>(R.id.etAkhir) as EditText
        etHuruf = findViewById<View>(R.id.etHuruf) as EditText
        btHitung = findViewById<View>(R.id.btHitung) as Button
    }

    fun hitung(view: View?) {
        tugas = etTugas!!.text.toString().toDouble()
        kehadiran = etKehadiran!!.text.toString().toDouble()
        uts = etUTS!!.text.toString().toDouble()
        uas = etUAS!!.text.toString().toDouble()
        akhir = 0.15 * kehadiran!! + 0.25 * tugas!! + 0.25 * uts!! + 0.35 * uas!!

        if (akhir!! >= 81 && akhir!! <= 100) {
            huruf = "A"
        } else if (akhir!! >= 61 && akhir!! < 81) {
            huruf = "B"
        } else if (akhir!! >= 41 && akhir!! < 61) {
            huruf = "C"
        } else if (akhir!! >= 21 && akhir!! < 41) {
            huruf = "D"
        } else if (akhir!! >= 0 && akhir!! < 21) {
            huruf = "E"
        } else {
            huruf = "Nilai yang di-input tidak valid!"
        }
        etAkhir!!.setText("" + akhir)
        etHuruf!!.setText("" + huruf)
    }
}