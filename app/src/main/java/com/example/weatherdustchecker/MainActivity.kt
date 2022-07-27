package com.example.weatherdustchecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //상단 앱 제목 표시줄 숨기기
        supportActionBar?.hide()

        //TODO : WeatherPageFragment 표시하기 (FrameLayout에 넣어주기)
        val transaction = supportFragmentManager.beginTransaction()
        //TODO : newInstance 클래스 메서드 정의해서 status값(문자열),
        // temperature 값(DOuble) 전달할 수 있도록 해 주기
        // 해당 값은 모두 프래그먼트의 번들 객체에 저장되어야 함
        transaction.add(R.id.fragment_container,WeatherPageFragment.newInstance("화창", 10.0))
        transaction.commit()
    }
}