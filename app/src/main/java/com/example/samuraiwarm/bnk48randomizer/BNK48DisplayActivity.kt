package com.example.samuraiwarm.bnk48randomizer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_bnk48_display.*

class BNK48DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bnk48_display)

        val input = intent.getStringExtra("input")
        val choice = intent.getStringExtra("choice")

        val luckyNumber: Int = Math.abs(stringToLuckyNumber(input))
        val index: Int = indexByNumber(luckyNumber, choice)
        val name: String = findNameByIndex(index, choice)
        imageView.setImageResource(R.drawable.placeholder)

        setImageByName(name)
        textViewName.text = name.toUpperCase()


        button2.setOnClickListener {
            finish()
        }
    }

    private fun stringToLuckyNumber(input: String): Int = input.hashCode()

    private fun indexByNumber(number: Int, choice: String): Int {
        when (choice) {
            "allGen" -> return number%allGenName.size
            "firstGen" -> return number%firstGenName.size
            "secondGen" -> return number%secondGenName.size
        }
        return -1
    }

    private fun findNameByIndex(index: Int, choice: String): String {
        when (choice) {
            "allGen" -> return allGenName[index]
            "firstGen" -> return firstGenName[index]
            "secondGen" -> return secondGenName[index]
        }
        return ""
    }

    private fun setImageByName(name: String) {
        when (name) {
            "cherprang" -> imageView.setImageResource(R.drawable.cherprang1)
            "izurina" -> imageView.setImageResource(R.drawable.izurina1)
            "jaa" -> imageView.setImageResource(R.drawable.jaa1)
            "jane" -> imageView.setImageResource(R.drawable.jane1)
            "jennis" -> imageView.setImageResource(R.drawable.jennis1)
            "jib" -> imageView.setImageResource(R.drawable.jib1)
            "kaew" -> imageView.setImageResource(R.drawable.kaew1)
            "kaimook" -> imageView.setImageResource(R.drawable.kaimook1)
            "kate" -> imageView.setImageResource(R.drawable.kate1)
            "korn" -> imageView.setImageResource(R.drawable.korn1)
            "maysa" -> imageView.setImageResource(R.drawable.maysa1)
            "mind" -> imageView.setImageResource(R.drawable.mind1)
            "miori" -> imageView.setImageResource(R.drawable.miori1)
            "mobile" -> imageView.setImageResource(R.drawable.mobile1)
            "music" -> imageView.setImageResource(R.drawable.music1)
            "namneung" -> imageView.setImageResource(R.drawable.namneung1)
            "namsai" -> imageView.setImageResource(R.drawable.namsai1)
            "nink" -> imageView.setImageResource(R.drawable.nink1)
            "noey" -> imageView.setImageResource(R.drawable.noey1)
            "orn" -> imageView.setImageResource(R.drawable.orn1)
            "piam" -> imageView.setImageResource(R.drawable.piam1)
            "pun" -> imageView.setImageResource(R.drawable.pun1)
            "pupe" -> imageView.setImageResource(R.drawable.pupe1)
            "satchan" -> imageView.setImageResource(R.drawable.satchan1)
            "tarwaan" -> imageView.setImageResource(R.drawable.tarwaan1)
            "aom" -> imageView.setImageResource(R.drawable.aom2)
            "bamboo" -> imageView.setImageResource(R.drawable.bamboo2)
            "cake" -> imageView.setImageResource(R.drawable.cake2)
            "deenee" -> imageView.setImageResource(R.drawable.deenee2)
            "faii" -> imageView.setImageResource(R.drawable.faii2)
            "fifa" -> imageView.setImageResource(R.drawable.fifa2)
            "fond" -> imageView.setImageResource(R.drawable.fond2)
            "gygee" -> imageView.setImageResource(R.drawable.gygee2)
            "june" -> imageView.setImageResource(R.drawable.june2)
            "khamin" -> imageView.setImageResource(R.drawable.khamin2)
            "kheng" -> imageView.setImageResource(R.drawable.kheng2)
            "maira" -> imageView.setImageResource(R.drawable.maira2)
            "mewnich" -> imageView.setImageResource(R.drawable.mewnich2)
            "minmin" -> imageView.setImageResource(R.drawable.minmin2)
            "myyu" -> imageView.setImageResource(R.drawable.myyu2)
            "natherine" -> imageView.setImageResource(R.drawable.natherine2)
            "new" -> imageView.setImageResource(R.drawable.new2)
            "niky" -> imageView.setImageResource(R.drawable.niky2)
            "nine" -> imageView.setImageResource(R.drawable.nine2)
            "oom" -> imageView.setImageResource(R.drawable.oom2)
            "pakwan" -> imageView.setImageResource(R.drawable.pakwan2)
            "panda" -> imageView.setImageResource(R.drawable.panda2)
            "phukkhom" -> imageView.setImageResource(R.drawable.phukkhom2)
            "ratah" -> imageView.setImageResource(R.drawable.ratah2)
            "stang" -> imageView.setImageResource(R.drawable.stang2)
            "view" -> imageView.setImageResource(R.drawable.view2)
            "wee" -> imageView.setImageResource(R.drawable.wee2)
        }
    }

    private val firstGenName = mutableListOf(
            "cherprang",
            "izurina",
            "jaa",
            "jane",
            "jennis",
            "jib",
            "kaew",
            "kaimook",
            "kate",
            "korn",
            "maysa",
            "mind",
            "miori",
            "mobile",
            "music",
            "namneung",
            "namsai",
            "nink",
            "noey",
            "orn",
            "piam",
            "pun",
            "pupe",
            "satchan",
            "tarwaan"
    )

    private val secondGenName = mutableListOf(
            "aom",
            "bamboo",
            "cake",
            "deenee",
            "faii",
            "fifa",
            "fond",
            "gygee",
            "june",
            "khamin",
            "kheng",
            "maira",
            "mewnich",
            "minmin",
            "myyu",
            "natherine",
            "new",
            "niky",
            "nine",
            "oom",
            "pakwan",
            "panda",
            "phukkhom",
            "ratah",
            "stang",
            "view",
            "wee"
    )

    private val allGenName = firstGenName + secondGenName
}