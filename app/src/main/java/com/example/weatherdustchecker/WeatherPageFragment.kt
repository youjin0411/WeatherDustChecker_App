package com.example.weatherdustchecker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class WeatherPageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater
            .inflate(R.layout.weater_page_fragment,
            container,false)

        //TODO: arguments 값 참조해서 두 개 값 가져오고, 해당하는 뷰에
        // 출력하기
        val statusText = view.findViewById<TextView>(R.id.weather_status_text)
        val temperatureText = view.findViewById<TextView>(R.id.weather_temp_text)
        val weatherImage = view.findViewById<ImageView>(R.id.weather_icon)

        statusText.text = arguments?.getString("status")
        temperatureText.text = arguments?.getDouble("temperature").toString()

        //TODO : ImageView 가져와서 sum 이미지 출력하기
        weatherImage.setImageResource(arguments?.getInt("res_id")!!)
        return view
    }

    companion object{
        fun newInstance(status: String, temperature:Double)
        :WeatherPageFragment {
            val fragment = WeatherPageFragment()

            //번들 객체에 필요한 정보를 저장
            val args = Bundle()
            args.putString("status", status)
            args.putDouble("temperature",temperature)
            args.putInt("res_id", R.drawable.sun)
            fragment.arguments = args

            return fragment
        }
    }
}
